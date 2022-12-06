package model;

import java.util.ArrayList;
import java.util.UUID;
import model.Obra;

public class Funcion {

    private Obra obra;
    private String fecha_presentacion;
    private String hora_presentacion;
    private ArrayList<Seat> seats = new ArrayList<>();
    private Double price;
    private String id;

    public Funcion(String id, Obra obra, String fecha_presentacion, String hora_presentacion) {
        this.obra = obra;
        this.fecha_presentacion = fecha_presentacion;
        this.hora_presentacion = hora_presentacion;
        //TODO: generar asientos
        initSeats();
        this.id = generarId();
    }

    public Funcion() {
        initSeats();
    }

    public Funcion(String id, Obra obra, String fecha_presentacion, String hora_presentacion, ArrayList<Seat> seats) {
        this.obra = obra;
        this.fecha_presentacion = fecha_presentacion;
        this.hora_presentacion = hora_presentacion;
        //TODO: generar asientos
        this.seats = seats;
        this.id = generarId();
    }

    public String generarId() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public void initSeats() {
        for (int i = 0; i <= 24; i++) {
            
            Seat seat = new Seat();
            System.out.println(i + " "+ seat);
            this.seats.add(seat);
        }
    }

    public Obra getObra() {
        return this.obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public String getFecha_presentacion() {
        return fecha_presentacion;
    }

    public void setFecha_presentacion(String fecha_presentacion) {
        this.fecha_presentacion = fecha_presentacion;
    }

    public String getHora_presentacion() {
        return hora_presentacion;
    }

    public void setHora_presentacion(String hora_presentacion) {
        this.hora_presentacion = hora_presentacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
