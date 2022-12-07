package controler;

import java.awt.event.ActionEvent;
import model.Ticket;
import view.VistaResumen;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Seat;
import view.VistaAsientos;

public class ControlResumen implements ActionListener {

    private VistaResumen vistaResumen;
    private Ticket modeloTicket;

    public ControlResumen(Ticket modeloTicket, VistaResumen vistaResumen) {
        this.vistaResumen = vistaResumen;
        this.modeloTicket = modeloTicket;
        this.vistaResumen.getRegresarBtn1().addActionListener(this);
        this.vistaResumen.getConfirmarBtn().addActionListener(this);
        fillTextFields();

    }

    public void actionPerformed(ActionEvent evento) {
        if (this.vistaResumen.getConfirmarBtn() == evento.getSource()) {
            //TODO: hacer que te regrese a la vista de vender boletos
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