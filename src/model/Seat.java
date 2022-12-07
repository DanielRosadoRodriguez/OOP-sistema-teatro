package model;

import java.awt.Color;

public class Seat {

    private final double priceMultiplierSectionA = 0.5;
    private final double priceMultiplierSectionB = 1;
    private final double priceMultiplierSectionV = 2;

    private String status;
    private Color statusColor;
    private String id;
    private double price;
    private CoordenateSeat coordenate;

    public Seat(String id) {
        this.status = "available";
        this.id = id;
        setStatusColor();
        generatePrice();
    }

    public Seat(String id, String status) {
        this.status = status;
        this.id = id;
        setStatusColor();
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

    public void generatePrice() {
        this.price = 5;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
