/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    
