package model;

public class CoordenateSeat {

    private int row;
    private int column;
    private char zone;

    public CoordenateSeat(int row, int column, char zone) {
        this.row = row;
        this.column = column;
        this.zone = zone;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public char getZone() {
        return zone;
    }

    public void setZone(char zone) {
        this.zone = zone;
    }

}
