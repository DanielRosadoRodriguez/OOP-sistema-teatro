/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import DAO.DAOAdmin;
import DAO.DAOEmpleado;
import model.Admin;
import model.Empleado;

public class TestDAOAdmin {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Daniel", "Rosado", "b", "si", "ccc");
        DAOEmpleado dao_empleado = new DAOEmpleado();
        dao_empleado.agregar_empleado(empleado);
        
        Empleado empleado2 = new Empleado("Joselito", "El admin", "xd", "si", "bsdfh");
        
        
        dao_empleado.modificar_empleado(empleado2);
        
    }
    
}
