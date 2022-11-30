package controler;

import DAO.DAOFunciones;
import DAO.DAOFunciones;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import model.Funcion;
import model.Seat;
import view.VistaAsientos;

public class ControlVistaAsientos implements ActionListener {

    private VistaAsientos view;
    private Seat seat;

    public ControlVistaAsientos(VistaAsientos view, Seat asiento) {
        this.view = view;
        this.seat = asiento;
        this.view.getjButton1().addActionListener(this);
        this.view.getjComboBox1().addActionListener(this);
        setSeatColor();
        configureComboBox();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.view.getjButton1() == e.getSource()) {
            changeSeatStatus();
            setSeatColor();
        }
    }

    public void changeSeatStatus() {
        String seatState = this.seat.getStatus();
        if (seatState.equals("available")) {
            this.seat.setStatus("selected");
        } else if (seatState.equals("selected")) {
            this.seat.setStatus("available");
        }
    }

    public void setSeatColor() {
        Color color = this.seat.getStatusColor();
        this.view.getjButton1().setBackground(color);
    }

    public void configureComboBox() {
        DefaultComboBoxModel<String> model = generateComboBoxModel();
        this.view.getjComboBox1().setModel(model);
    }

    public DefaultComboBoxModel<String> generateComboBoxModel() {
        ArrayList<String> raw_performances = requestPerformancesName();
        String[] performances = raw_performances.toArray(new String[0]);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(performances);
        return model;
    }

    public ArrayList<String> requestPerformancesName() {
        DAOFunciones dao = new DAOFunciones();
        return dao.gerPerformancesName();
    }

}
