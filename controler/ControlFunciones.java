package controler;

import DAO.DAOFunciones;
import DAO.DAOObras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Funcion;
import controler.ControlObras;
import errores.NotFoundPerformanceException;
import errores.ObraNoEncontradaException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import model.Obra;
import view.AdminCRUDFuncion;
import view.AdminMainWindow;
import view.EmpleadoMainWindow;

public class ControlFunciones implements ActionListener {

    private Obra modeloObras;
    private AdminCRUDFuncion vistaCRUDFuncion;
    private boolean esAdmin;
    private Funcion modeloFuncion;

    ControlFunciones(Funcion modeloFuncion, Obra modeloObras, AdminCRUDFuncion adminCRUDFuncion, boolean esAdmin) {
        this.modeloFuncion = modeloFuncion;
        this.modeloObras = modeloObras;
        this.vistaCRUDFuncion = adminCRUDFuncion;
        this.esAdmin = esAdmin;
        this.vistaCRUDFuncion.getAniadirFuncion().addActionListener(this);
        this.vistaCRUDFuncion.getModificarFuncion().addActionListener(this);
        this.vistaCRUDFuncion.getBuscarFuncion().addActionListener(this);
        this.vistaCRUDFuncion.getEliminarFuncion().addActionListener(this);
        this.vistaCRUDFuncion.getRegresarBtn().addActionListener(this);
        configureComboBox();
    }

    public Obra buscarObras(String nombre_obra) throws ObraNoEncontradaException {
        ControlObras control_obra = new ControlObras(modeloObras);
        Obra obra;
        DAOObras dao_obras = new DAOObras();
        obra = dao_obras.getObra(nombre_obra);
        return obra;

    }

    public void actionPerformed(ActionEvent evento) {
        this.modeloFuncion = new Funcion();
        if (vistaCRUDFuncion.getAniadirFuncion() == evento.getSource()) {
            try {
                Obra obra = buscarObras(vistaCRUDFuncion.getTxtNombreObra().getText());
                this.modeloFuncion.setObra(obra);

                Date fecha = vistaCRUDFuncion.getDataChooserFecha().getDate();
                long d = fecha.getTime();
                java.sql.Date formattedFecha = new java.sql.Date(d);

                modeloFuncion.setFecha_presentacion(formattedFecha.toString());
                modeloFuncion.setHora_presentacion(vistaCRUDFuncion.getHoraComboBox().getSelectedItem().toString());
                DAOFunciones daoFuncion = new DAOFunciones();

                try {
                    daoFuncion.addFuncion(modeloFuncion);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (ObraNoEncontradaException e) {
                e.getMessage();
            }

        }
        if (vistaCRUDFuncion.getBuscarFuncion() == evento.getSource()) {
            int idFuncion = vistaCRUDFuncion.getBuscarComboBox().getSelectedIndex();
            try {
                DAOFunciones daoFunciones = new DAOFunciones();
                Funcion funcion = daoFunciones.buscarFuncion(idFuncion);
                if (funcion != null) {
                    vistaCRUDFuncion.getTxtNombreObra().setText(funcion.getObra().getNombre());
                    vistaCRUDFuncion.getFechaTxtprovisional().setText(funcion.getFecha_presentacion());
                    vistaCRUDFuncion.getHoraComboBox().setSelectedItem(funcion.getHora_presentacion());

                }

            } catch (NotFoundPerformanceException ex) {
                Logger.getLogger(ControlFunciones.class.getName()).log(Level.SEVERE, null, ex);
            }

        
    }

    if (vistaCRUDFuncion.getModificarFuncion() == evento.getSource()) {
        int idFuncion = vistaCRUDFuncion.getBuscarComboBox().getSelectedIndex();    
        try {
                DAOFunciones dao_funcion = new DAOFunciones();
                Funcion funcion = dao_funcion.buscarFuncion(idFuncion);
                this.modeloFuncion = funcion;
                Date fecha = vistaCRUDFuncion.getDataChooserFecha().getDate();
                long d = fecha.getTime();
                java.sql.Date formattedFecha = new java.sql.Date(d);
                modeloFuncion.setFecha_presentacion(formattedFecha.toString());
                modeloFuncion.setHora_presentacion(vistaCRUDFuncion.getHoraComboBox().getSelectedItem().toString());
                DAOObras daoObras = new DAOObras();
                Obra obra = daoObras.getObra(vistaCRUDFuncion.getTxtNombreObra().getText());
                modeloFuncion.setObra(obra);
                DAOFunciones daoFunciones = new DAOFunciones();
                try {
                    daoFunciones.modificarFuncion(modeloFuncion);
                    configureComboBox();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (ObraNoEncontradaException ex) {
                Logger.getLogger(ControlFunciones.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotFoundPerformanceException ex) {
                Logger.getLogger(ControlFunciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
 
    if (vistaCRUDFuncion.getEliminarFuncion() == evento.getSource()) {
        int idFuncion = vistaCRUDFuncion.getBuscarComboBox().getSelectedIndex();
        DAOFunciones dao_funcion = new DAOFunciones();
        try {
            Funcion funcion = dao_funcion.buscarFuncion(idFuncion);

            if (funcion != null) {
                dao_funcion.eliminarFuncion(funcion);
            } else {
                System.out.println("No se puede eliminar, no existe la obra");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    if (this.vistaCRUDFuncion.getRegresarBtn() == evento.getSource()) {
            if (this.esAdmin == true) {
            AdminMainWindow ventana_main_admin = new AdminMainWindow();
            ControlAdminMainView control_admin = new ControlAdminMainView(ventana_main_admin);
            ventana_main_admin.setVisible(true);
            ventana_main_admin.setLocationRelativeTo(null);
            this.vistaCRUDFuncion.setVisible(false);
        } else {
            EmpleadoMainWindow ventana_main_empleado = new EmpleadoMainWindow();
            ventana_main_empleado.setVisible(true);
            ventana_main_empleado.setLocationRelativeTo(null);
            this.vistaCRUDFuncion.setVisible(false);
            ControlEmpleadoMainWindow control = new ControlEmpleadoMainWindow(ventana_main_empleado);
        }
    }

}

    public void configureComboBox() {
        DefaultComboBoxModel<String> model = generateComboBoxModel();
        this.vistaCRUDFuncion.getBuscarComboBox().setModel(model);
        
    }
    
 
     public DefaultComboBoxModel<String> generateComboBoxModel() {
        ArrayList<String> raw_performances = gerFormattedPerformancesInformation();
        String[] performances = raw_performances.toArray(new String[0]);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(performances);
        return model;
    }
     
     public ArrayList<String> gerFormattedPerformancesInformation() {
        DAOFunciones dao = new DAOFunciones();
        return dao.gerFormattedPerformancesInformation();
    }
}
