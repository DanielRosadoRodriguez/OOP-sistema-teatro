
package test;

import DAO.DAOFunciones;
import DAO.DAOObras;
import model.Obra;

public class test_eliminarFuncionesDeUnaObra {


    public static void main(String[] args) {
        
        DAOFunciones dao = new DAOFunciones();
        DAOObras dao_o = new DAOObras();
        Obra obra = dao_o.getObra("heathers");
        dao.eliminarFuncionesDeUnaObra(obra);
        
    }
}
