package test;

import controler.ControlVistaAsientos;
import model.Seat;
import view.VistaAsientos;

public class test_vista_asientos {

    public static void main(String[] args) {
        VistaAsientos vista = new VistaAsientos();
        Seat asiento = new Seat();

        ControlVistaAsientos control = new ControlVistaAsientos(vista, asiento);
        vista.setVisible(true);
    }

}
