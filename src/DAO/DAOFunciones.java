package DAO;

import errores.NotFoundPerformanceException;
import errores.ObraNoEncontradaException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.Funcion;
import model.Obra;
import model.Seat;

public class DAOFunciones {

    private ArrayList<Funcion> funciones = new ArrayList<>();
    private static final String PERFORMANCES_TEXT_FILE = "./src/DAO/funciones_n.txt";

    public DAOFunciones() {
        loadFileData();
    }

    public void loadFileData() {
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile() throws FileNotFoundException, IOException {
        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(PERFORMANCES_TEXT_FILE));
            while ((line = reader.readLine()) != null) {
                String[] performanceData = line.split(";");
                String basicInfo = performanceData[0];
                String seatsInfo = performanceData[1];

                String[] splitBasicInfo = basicInfo.split(",");
                String[] splitSeatInfo = seatsInfo.split(",");
                ArrayList<Seat> performanceSeats = new ArrayList<>();
                for (String seatInfo : splitSeatInfo) {
                    String[] currentSeatInfo = seatInfo.split("-");
                    String id = currentSeatInfo[0];
                    String status = currentSeatInfo[1];
                    Seat currentSeat = new Seat(id, status);
                    performanceSeats.add(currentSeat);
                }

                DAOObras daoObras = new DAOObras();
                String id = splitBasicInfo[0];
                Obra obra = daoObras.getObra(splitBasicInfo[1]);
                String fecha = splitBasicInfo[2];
                String hora = splitBasicInfo[3];
                Funcion funcion = new Funcion(id, obra, fecha, hora, performanceSeats);
                this.funciones.add(funcion);
            }
        } catch (ObraNoEncontradaException e) {
            e.getMessage();
        }
    }

    public void addFuncion(Funcion funcion) {
        System.out.println(funcion.getId());
        this.funciones.add(funcion);
        updateDBFile();
    }

    public void eliminarFuncion(String idFuncion) {
        try {
            Funcion funcion = buscarFuncion(idFuncion);
            eliminarFuncion(funcion);
        } catch (NotFoundPerformanceException e) {
            System.out.print(e.getMessage());
        }
    }

    public void eliminarFuncion(Funcion funcion) {
        this.funciones.remove(funcion);
        updateDBFile();
    }

    public void modificarFuncion(Funcion funcion) {
        try {
            String idFuncion = funcion.getId();
            System.out.println("funcion entrada: " + funcion.getId());
            Funcion funcion_a_modificar = buscarFuncion(idFuncion);
            System.out.println("funcion salida: " + funcion_a_modificar.getId());
            int index = getPerformanceIndex(funcion_a_modificar);
            this.funciones.set(index, funcion);
        } catch (NotFoundPerformanceException ex) {
            ex.printStackTrace();
        }
        updateDBFile();
    }

    public Funcion buscarFuncion(int index) throws NotFoundPerformanceException {
        try {
            return this.funciones.get(index);
        } catch (Exception e) {
        }
        throw new NotFoundPerformanceException("No se encontro la funcion");
    }

    public Funcion buscarFuncion(String id) throws NotFoundPerformanceException {
        for (Funcion funcion : this.funciones) {
            if (funcion.getId().equals(id)) {
                System.out.println("id " + id);
                System.out.println("funcion id " + funcion.getId());
                return funcion;
            }
        }
        throw new NotFoundPerformanceException("No se encontro la funcion");
    }

    public int getPerformanceIndex(Funcion funciion) {
        return this.funciones.indexOf(funciion);
    }

    public int getPerformanceIndex(String id) throws NotFoundPerformanceException {
        Funcion funcion = buscarFuncion(id);
        return this.funciones.indexOf(funcion);
    }

    public void updateDBFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(PERFORMANCES_TEXT_FILE));
            for (Funcion funcion : this.funciones) {
                ArrayList<Seat> seats = funcion.getSeats();
                String seatsInformation = new String();
                for (int i = 0; i < seats.size(); i++) {
                    seatsInformation = seatsInformation + (i + "-" + seats.get(i).getStatus() + ",");
                }
                writer.write(funcion.getId() + "," + funcion.getObra().getNombre() + "," + funcion.getFecha_presentacion() + "," + funcion.getHora_presentacion()
                        + ";" + seatsInformation + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Funcion> getPerformances() {
        return this.funciones;
    }

    public ArrayList<String> gerFormattedPerformancesInformation() {
        ArrayList<String> formattedPerformancesInformation = new ArrayList<>();
        for (Funcion funcion : this.funciones) {
            String formattedPerformance = funcion.getObra().getNombre() + "-" + funcion.getFecha_presentacion() + "-" + funcion.getHora_presentacion();
            formattedPerformancesInformation.add(formattedPerformance);
        }
        return formattedPerformancesInformation;
    }

    public void eliminarFuncionesDeUnaObra(Obra obra) {
        ArrayList<Funcion> nuevas_funciones = new ArrayList<>();
        for (Funcion funcion : this.funciones) {
            if (funcion.getObra().getNombre().equals(obra.getNombre())) {
                continue;
            } else {
                nuevas_funciones.add(funcion);
            }
        }
        this.funciones = nuevas_funciones;
        updateDBFile();
    }
}
