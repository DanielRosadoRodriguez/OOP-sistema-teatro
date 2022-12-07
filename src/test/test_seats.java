package test;

import model.SeatCoordinate;

public class test_seats {

    public static void main(String[] args) {
        SeatCoordinate coor = new SeatCoordinate(1, 2, 'a');
        System.out.println(coor.getColumn());
        System.out.println(coor.getRow());
        System.out.println(coor.getZone());
    }
}
