package model;

import java.awt.Color;

public class Seat {

    private final double priceMultiplierSectionA = 1;
    private final double priceMultiplierSectionB = 10;
    private final double priceMultiplierSectionC = 100;

    private String status;
    private Color statusColor;
    private String id;
    private double price;
    private SeatCoordinate coordinate;

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
        try {
            switch (this.coordinate.getZone()) {
                case 1:
                    this.price = 1;
                    break;
                case 2:
                    this.price = 1.2;
                    break;
                case 3:
                    this.price = 1.5;
                    break;
                default:
                    this.price = 1;
                    break;
            }
        } catch (NullPointerException ex) {

        }

    }

    public String getFormattedCoordinatesAsString() {
        String coordinatesAsString = Integer.toString(this.coordinate.getRow()) + Integer.toString(this.coordinate.getColumn()) + changeSeatZoneFromIntToLetter(this.coordinate.getZone());
        return coordinatesAsString;
    }

    public String changeSeatZoneFromIntToLetter(int zoneAsInt) {
        String zoneAsString = "";
        switch (zoneAsInt) {
            case 1:
                zoneAsString = "A";
                break;
            case 2:
                zoneAsString = "B";
                break;
            case 3:
                zoneAsString = "C";
                break;
        }
        return zoneAsString;
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

    public SeatCoordinate getCoordenate() {
        generatePrice();
        return coordinate;
    }

    public void setCoordenate(SeatCoordinate coordenate) {
        this.coordinate = coordenate;
    }

}