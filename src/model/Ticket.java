package model;

import java.util.ArrayList;
import model.Funcion;
import model.Seat;

public class Ticket {

    private static final String nombreTeatro = "Teatro Chachita";
    private static int numVenta;
    private Funcion funcion;
    private String nombreFuncion;
    private int cantBoletosVendidos;
    private ArrayList<Seat> seats = new ArrayList<>();
    private Double precioFuncion;
    private Double total;

    public Ticket(ArrayList<Seat> asientos, Funcion Funcion) {
        this.seats = asientos;
        setFuncion(Funcion);
        setNombreFuncion(Funcion.getObra().getNombre());
        this.cantBoletosVendidos = asientos.size();
        numVenta = numVenta + 1;
        this.precioFuncion = funcion.getObra().getPrecio();
        setTotal(calcularTotal(obtenerPrecioAsientos()));
    }

    public Ticket() {

    }


    public ArrayList<Double> obtenerPrecioAsientos() {
        ArrayList<Double> precioAsientos = new ArrayList<>();
        for (Seat seat : this.getSeats()) {
            precioAsientos.add(seat.getPrice());
            System.out.println("precio arreglo asientos " + seat.getPrice());
        }
        return precioAsientos;
    }

    public Double calcularTotal(ArrayList<Double> precios) {
        Double totalDeLaVenta = 0.0;
        Double precioBase = this.precioFuncion;
        for (Double precio: precios) {
            totalDeLaVenta += precio * precioBase;
            System.out.println("precio: " + precio + " precio base: " + precioBase);
        }
        return totalDeLaVenta;
    }

    public String getNombreTeatro() {
        return nombreTeatro;
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVentas) {
        numVenta = numVentas;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public int getBoletosVendidos() {
        return cantBoletosVendidos;
    }

    public void setBoletosVendidos(int boletosVendidos) {
        this.cantBoletosVendidos = boletosVendidos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getNombreFuncion() {
        return nombreFuncion;
    }

    public void setNombreFuncion(String nombreFuncion) {
        this.nombreFuncion = nombreFuncion;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

}