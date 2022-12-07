package test;

import controler.ControlFunciones;
import model.Funcion;
import view.AdminCRUDFuncion;

public class AplicacionModificarFunciones {

    public static void main(String[] args) {
        Funcion modeloFuncion = new Funcion();
        AdminCRUDFuncion adminCRUDFunciones = new AdminCRUDFuncion();
        //ControlFunciones controlFunciones = new ControlFunciones(modeloFuncion, adminCRUDFunciones);
        //controlador.iniciarVista();
        adminCRUDFunciones.setVisible(true);
    
}
}

    
