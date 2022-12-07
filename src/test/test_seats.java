package test;

import model.CoordenateSeat;

public class test_seats {

    public static void main(String[] args) {
        CoordenateSeat coor = new CoordenateSeat(1, 2, 'a');
        System.out.println(coor.getColumn());
        System.out.println(coor.getRow());
        System.out.println(coor.getZone());
    }
}
