package controler;

import controler.ControlObras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Funcion;
import model.Obra;
import model.Seat;
import model.Usuario;
import view.AdminCRUDFuncion;
import view.EmpleadoMainWindow;
import view.AdminCRUDObras;
import view.VistaAsientos;
import view.VistaLogIn;

public class ControlEmpleadoMainWindow implements ActionListener {

    EmpleadoMainWindow vista;

    public ControlEmpleadoMainWindow(EmpleadoMainWindow vista) {
        this.vista = vista;
        this.vista.getModificarObra().addActionListener(this);
        this.vista.getModificarFuncion().addActionListener(this);
        this.vista.getVenderBoleto().addActionListener(this);
        this.vista.getCerrarSesion().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean esAdmin = false;
        if (this.vista.getModificarObra() == e.getSource()) {
            System.out.println("modificar obras");
            Obra modeloObras = new Obra();
            AdminCRUDObras adminCRUDObras = new AdminCRUDObras();
            ControlObras controlObras = new ControlObras(modeloObras, adminCRUDObras, esAdmin);
            //controlador.iniciarVista();
            adminCRUDObras.setVisible(true);
            adminCRUDObras.setLocationRelativeTo(null);
            this.vista.setVisible(false);
        }  
        else if (this.vista.getModificarFuncion()== e.getSource()){
            System.out.println("modificar funciones");
            Funcion modeloFuncion = new Funcion();
            Obra modeloObras = new Obra();
            AdminCRUDFuncion adminCRUDFuncion = new AdminCRUDFuncion();
            ControlFunciones controlFuncion = new ControlFunciones(modeloFuncion, modeloObras, adminCRUDFuncion, esAdmin);
            adminCRUDFuncion.setVisible(true);
            adminCRUDFuncion.setLocationRelativeTo(null);
            this.vista.setVisible(false);   
        }
        else if (this.vista.getVenderBoleto()== e.getSource()){
                initializeSeatView();
                
        }else if(this.vista.getCerrarSesion() == e.getSource()){
            System.out.println("Cerrando sesión");
            Usuario modeloUsuario = new Usuario();
            VistaLogIn vista_log_in = new VistaLogIn();
            ControlInicioSesion control_log_in = new ControlInicioSesion(modeloUsuario, vista_log_in);
            vista_log_in.setVisible(true);
            vista_log_in.setLocationRelativeTo(null);
            this.vista.setVisible(false);
        }
    }
    
    private void initializeSeatView() {
        VistaAsientos seatView = new VistaAsientos();
        ArrayList<Seat> seats = new ArrayList<>();
        for (int i = 0; i <= 26; i++) {
            Seat seat = new Seat();
            seats.add(seat);
        }
        ControlVistaAsientos control = new ControlVistaAsientos(seatView, seats);
        setupNewView(seatView);
    }
    
    private void setupNewView(javax.swing.JFrame vista) {
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

}
