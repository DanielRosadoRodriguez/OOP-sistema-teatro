package model;

import java.awt.Color;

public class Seat {

    private final double priceMultiplierSectionA = 0.5;
    private final double priceMultiplierSectionB = 1;
    private final double priceMultiplierSectionV = 2;

    private String status;
    private Color statusColor;
    private String id;
    private char section;
    private int price;

    public Seat(String id) {
        this.status = "available";
        this.id = id;
        setStatusColor();
        generateSection();
        generatePrice();
    }

    public Seat(String id, String status) {
        this.status = status;
        this.id = id;
        setStatusColor();
        generateSection();
        generatePrice();
    }

    public Seat() {
        this.status = "available";
        setStatusColor();
    }

    public void setStatusColor() {
        if (this.status.equals("available")) {
            setStatusColor(Color.blue);
        } else if (this.status.equals("selected")) {
            setStatusColor(Color.yellow);
        } else {
            setStatusColor(Color.gray);
        }
    }

    public void generateSection() {
        this.section = this.id.charAt(0);
    }

    public void generatePrice() {
        //TODO
        if (this.section == 'a') {
            System.out.println("this is section a");
        }
    }

    public void setStatusColor(Color statusColor) {
        this.statusColor = statusColor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        setStatusColor();
    }

    public Color getStatusColor() {
        return statusColor;
    }
}
