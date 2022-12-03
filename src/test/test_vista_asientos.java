package test;

import controler.ControlVistaAsientos;
import java.util.ArrayList;
import model.Seat;
import view.VistaAsientos;

public class test_vista_asientos {

    public static void main(String[] args) {
        VistaAsientos vista = new VistaAsientos();
        ArrayList<Seat> seats = new ArrayList<>();
        for(int i =0; i <= 26; i++){
            Seat seat = new Seat();
            seats.add(seat);
        }

        ControlVistaAsientos control = new ControlVistaAsientos(vista, seats);
        vista.setVisible(true);
    }

}
