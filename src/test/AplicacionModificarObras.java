/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import controler.ControlObras;
import model.Obra;
import view.AdminCRUDObras;
import view.AdminCRUDObras;

public class AplicacionModificarObras {

    public static void main(String[] args) {
        Obra modeloObras = new Obra();
        AdminCRUDObras adminCRUDObras = new AdminCRUDObras();
        //ControlObras controlObras = new ControlObras(modeloObras, adminCRUDObras);
        //controlador.iniciarVista();
        adminCRUDObras.setVisible(true);
    
}
}

    
