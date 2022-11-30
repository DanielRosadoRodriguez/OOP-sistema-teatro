package controler;

import controler.ControlObras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Admin;
import model.Empleado;
import model.Funcion;
import model.Obra;
import model.Seat;
import model.Usuario;
import view.AdminCRUDFuncion;
import view.AdminMainWindow;
import view.AdminUsuarioCRUDWindow;
import view.AdminCRUDObras;
import view.VistaAsientos;
import view.VistaLogIn;

public class ControlAdminMainView implements ActionListener {

    AdminMainWindow vista = new AdminMainWindow();

    public ControlAdminMainView(AdminMainWindow vista) {
        this.vista = vista;
        this.vista.getModificar_usuarios().addActionListener(this);
        this.vista.getModificarObra().addActionListener(this);
        this.vista.getModificar_funciones().addActionListener(this);
        this.vista.getCerrarSesion().addActionListener(this);
        this.vista.getVenderBoleto().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vista.getModificar_usuarios() == e.getSource()) {
            initializeModifyUserView();
        } else if (this.vista.getModificarObra() == e.getSource()) {
            initializeModifyPlayView();
        } else if (this.vista.getModificar_funciones() == e.getSource()) {
            initializeModifyPerformanceView();
        } else if (this.vista.getCerrarSesion() == e.getSource()) {
            initializeLogInView();
        } else if (this.vista.getVenderBoleto() == e.getSource()) {
            initializeSeatView();
        }
        this.vista.setVisible(false);
    }

    private void initializeModifyPlayView() {
        boolean esAdmin = true;
        Obra modeloObras = new Obra();
        AdminCRUDObras modifyPlayView = new AdminCRUDObras();
        ControlObras controlObras = new ControlObras(modeloObras, modifyPlayView, esAdmin);
        setupNewView(modifyPlayView);
    }

    private void initializeModifyPerformanceView() {
        boolean esAdmin = true;
        Funcion modeloFuncion = new Funcion();
        Obra modeloObras = new Obra();
        AdminCRUDFuncion modifyPerformanceView = new AdminCRUDFuncion();
        ControlFunciones controlFuncion = new ControlFunciones(modeloFuncion, modeloObras, modifyPerformanceView, esAdmin);
        setupNewView(modifyPerformanceView);
    }

    private void initializeModifyUserView() {
        AdminUsuarioCRUDWindow modifyUserView = new AdminUsuarioCRUDWindow();
        Admin modelo_admin = new Admin();
        Empleado modelo_empleado = new Empleado();
        ControlModificarUsuarios ctrl_usuario_CRUD = new ControlModificarUsuarios(modelo_admin, modelo_empleado, modifyUserView);
        setupNewView(modifyUserView);
    }

    private void initializeLogInView() {
        Usuario modeloUsuario = new Usuario();
        VistaLogIn logInView = new VistaLogIn();
        ControlInicioSesion control_log_in = new ControlInicioSesion(modeloUsuario, logInView);
        setupNewView(logInView);
    }

    private void initializeSeatView() {
        VistaAsientos seatView = new VistaAsientos();
        Seat seat = new Seat();
        ControlVistaAsientos control = new ControlVistaAsientos(seatView, seat);
        setupNewView(seatView);
    }

    private void setupNewView(javax.swing.JFrame vista) {
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

}
