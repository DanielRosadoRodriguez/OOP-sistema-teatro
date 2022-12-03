
package test;

import DAO.DAOFunciones;
import DAO.DAOObras;
import model.Funcion;
import model.Obra;


public class test_10_dao_funciones {

    public static void main(String[] args) {

        DAOFunciones dao = new DAOFunciones();
        DAOObras dao_obras = new DAOObras();
        Obra obra = new Obra("Blancanieves","Florence Pugh","MrBeast","helicoptero apache","Zapatillas de vidrio",6.0,5);
        dao_obras.insertar(obra);
        Funcion funcion = new Funcion(obra, "fecha chisyosa", "hora chisyosa");
        dao.addFuncion(funcion);
        dao.modificarFuncion(funcion);
    }
}
