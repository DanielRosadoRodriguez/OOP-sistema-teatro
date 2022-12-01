
package test;

import DAO.DAOFunciones;
import DAO.DAOObras;
import model.Funcion;
import model.Obra;


public class test_10_dao_funciones {

    public static void main(String[] args) {

        DAOFunciones dao = new DAOFunciones();
        DAOObras dao_obras = new DAOObras();
        Obra obra = dao_obras.consultar("heathers");
        Funcion funcion = new Funcion(obra, "fecha_nueva", "hora_nueva");
        dao.modificarFuncion(funcion);
    }
}
