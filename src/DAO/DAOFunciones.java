package DAO;

import errores.NotFoundPerformanceException;
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
            String id = performanceData[0];
            Obra obra = daoObras.getObra(performanceData[1]);
            String fecha = performanceData[2];
            String hora = performanceData[3];
            Funcion funcion = new Funcion(id, obra, fecha, hora, performanceSeats);
            this.funciones.add(funcion);
        }
    }

    public void addFuncion(Funcion funcion) {
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
            Funcion db_funcion = buscarFuncion(funcion.getId());
            int index = getPerformanceIndex(db_funcion);
            this.funciones.set(index, funcion);
        } catch (NotFoundPerformanceException e) {
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
        try {
            for (Funcion funcion : this.funciones) {
                if (funcion.getId().equals(id));
                return funcion;
            }
        } catch (Exception e) {
        }
        throw new NotFoundPerformanceException("No se encontro la funcion");
    }

    public int getPerformanceIndex(Funcion funciion) {
        return this.funciones.indexOf(funciion);
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
                writer.write(funcion.getObra().getNombre() + "," + funcion.getFecha_presentacion() + "," + funcion.getHora_presentacion()
                        +";"+ seatsInformation + "\n");
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
