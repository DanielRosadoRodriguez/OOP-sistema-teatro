package controler;

import DAO.DAOFunciones;
import DAO.DAOFunciones;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import model.Funcion;
import model.Seat;
import view.VistaAsientos;

public class ControlVistaAsientos implements ActionListener {

    private VistaAsientos view;
    private Seat seat;
    private ArrayList<Seat> seats = new ArrayList<>();
    private ArrayList<JButton> buttons = new ArrayList<>();

    public ControlVistaAsientos(VistaAsientos view, ArrayList<Seat> seats) {
        this.view = view;
        this.seats = seats;
        this.view.getjButton1().addActionListener(this);
        this.view.getjComboBox1().addActionListener(this);
        initButtons();
        setSeatColor();
        configureComboBox();
        addActionListenersToButtons();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i <= this.buttons.size(); i++) {
            try {
                if (this.buttons.get(i) == e.getSource()) {
                    changeSeatStatus(seats.get(i));
                    setSeatColor();
                }
            } catch (IndexOutOfBoundsException er) {}
        }
    }

    public void changeSeatStatus(Seat seat) {
        String seatState = seat.getStatus();
        if (seatState.equals("available")) {
            seat.setStatus("selected");
        } else if (seatState.equals("selected")) {
            seat.setStatus("available");
        }
    }

    public void setSeatColor() {
        try {
            for (int i = 0; i <= this.buttons.size(); i++) {
                JButton currentButton = this.buttons.get(i);
                Color currentColor = this.seats.get(i).getStatusColor();
                currentButton.setBackground(currentColor);
            }
        } catch (IndexOutOfBoundsException e) {
        }
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

    public void initButtons() {
        //LOS BOTONES 28, 29 y 30 no son asientos. No inicializar.
        this.buttons = new ArrayList<>(
                Arrays.asList(
                        this.view.getjButton3(),
                        this.view.getjButton4(),
                        this.view.getjButton5(),
                        this.view.getjButton6(),
                        this.view.getjButton7(),
                        this.view.getjButton8(),
                        this.view.getjButton9(),
                        this.view.getjButton10(),
                        this.view.getjButton11(),
                        this.view.getjButton12(),
                        this.view.getjButton13(),
                        this.view.getjButton14(),
                        this.view.getjButton15(),
                        this.view.getjButton16(),
                        this.view.getjButton17(),
                        this.view.getjButton18(),
                        this.view.getjButton19(),
                        this.view.getjButton20(),
                        this.view.getjButton21(),
                        this.view.getjButton22(),
                        this.view.getjButton23(),
                        this.view.getjButton24(),
                        this.view.getjButton25(),
                        this.view.getjButton26(),
                        this.view.getjButton27()
                ));
    }

    public void addActionListenersToButtons() {
        for (JButton button : this.buttons) {
            button.addActionListener(this);
        }
    }

}
