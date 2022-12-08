package controler;

import java.awt.event.ActionEvent;
import model.Ticket;
import view.VistaResumen;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Seat;
import view.AdminMainWindow;
import view.EmpleadoMainWindow;
import view.VistaAsientos;

public class ControlResumen implements ActionListener {

    private VistaResumen vistaResumen;
    private Ticket modeloTicket;
    private boolean esAdmin;

    public ControlResumen(Ticket modeloTicket, VistaResumen vistaResumen, boolean esAdmin) {
        this.vistaResumen = vistaResumen;
        this.modeloTicket = modeloTicket;
        this.vistaResumen.getRegresarBtn1().addActionListener(this);
        this.vistaResumen.getConfirmarBtn().addActionListener(this);
        this.esAdmin = esAdmin;
        fillTextFields();

    }

    public void actionPerformed(ActionEvent evento) {
        if (this.vistaResumen.getConfirmarBtn() == evento.getSource()) {
            if (this.esAdmin == true) {
            AdminMainWindow ventana_main_admin = new AdminMainWindow();
            ControlAdminMainView control_admin = new ControlAdminMainView(ventana_main_admin);
            ventana_main_admin.setVisible(true);
            ventana_main_admin.setLocationRelativeTo(null);
            this.vistaResumen.setVisible(false);
            } 
            else {
            EmpleadoMainWindow ventana_main_empleado = new EmpleadoMainWindow();
            ventana_main_empleado.setVisible(true);
            ventana_main_empleado.setLocationRelativeTo(null);
            this.vistaResumen.setVisible(false);
            ControlEmpleadoMainWindow control = new ControlEmpleadoMainWindow(ventana_main_empleado);
            }
        }
        if(this.vistaResumen.getRegresarBtn1() == evento.getSource()){
            initializeSeatView();
            this.vistaResumen.setVisible(false);
        }
        
    }

    public void fillTextFields() {
        this.vistaResumen.getFuncionTxtField().setText(this.modeloTicket.getNombreFuncion());
        this.vistaResumen.getHorarioTxtField().setText(this.modeloTicket.getFuncion().getHora_presentacion());
        this.vistaResumen.getTotalTxtField().setText(this.modeloTicket.getTotal().toString());
        this.vistaResumen.getAsientosTxtField().setText(getFormattedSeats());
    }
    
    public String getFormattedSeats(){
        String formattedSeats = "";
        for(Seat seat: this.modeloTicket.getSeats()){
            formattedSeats += "-" + seat.getFormattedCoordinatesAsString() + "-";
        }
        return formattedSeats;
    }
    
     private void initializeSeatView() {
        if(this.esAdmin == true){
            VistaAsientos seatView = new VistaAsientos();
            ArrayList<Seat> seats = new ArrayList<>();
            for (int i = 0; i <= 26; i++) {
            Seat seat = new Seat();
            seats.add(seat);
        }
        ControlVistaAsientos control = new ControlVistaAsientos(seatView, seats, this.esAdmin);
        setupNewView(seatView);
        }
        else {
            VistaAsientos seatView = new VistaAsientos();
            ArrayList<Seat> seats = new ArrayList<>();
            for (int i = 0; i <= 26; i++) {
            Seat seat = new Seat();
            seats.add(seat);
        }
        ControlVistaAsientos control = new ControlVistaAsientos(seatView, seats, this.esAdmin);
        setupNewView(seatView);
        }
        
    }
    
    private void setupNewView(javax.swing.JFrame vista) {
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
}