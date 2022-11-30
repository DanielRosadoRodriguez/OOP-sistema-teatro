package DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.Funcion;
import model.Obra;

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
    
    public void addFuncion(Funcion funcion){
        
    }

    
    public void buscarFuncion(String nombreFuncion){
        
    }
    
    public void eliminarFuncion(Funcion funcion){
        
    }
    
    public void modificarFuncion(Funcion funcion){
        
    }
    
    public void readFile() throws FileNotFoundException, IOException {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(PERFORMANCES_TEXT_FILE));
        while ((line = reader.readLine()) != null) {
            String[] performanceData = line.split(",");
            DAOObras daoObras = new DAOObras();
            Obra obra = daoObras.consultar(performanceData[0]);
            Funcion funcion = new Funcion(obra,performanceData[1],performanceData[2]);
            this.funciones.add(funcion);
        }
    }

    public void writeFile(String funcionAGuardar) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(PERFORMANCES_TEXT_FILE));
            writer.write(funcionAGuardar);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Funcion> getPerformances() {
        return this.funciones;
    }
    
    public ArrayList<String> gerPerformancesName(){
        ArrayList<String> nombreFunciones = new ArrayList<>();
        for(Funcion funcion: this.funciones){
            nombreFunciones.add(funcion.getObra().getNombre());
        }
        return nombreFunciones;
    }
}
