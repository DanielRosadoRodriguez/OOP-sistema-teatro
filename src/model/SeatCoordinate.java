package model;

public class SeatCoordinate {

    private int row;
    private int column;
    private int zone;

    public SeatCoordinate(int row, int column, int zone) {
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

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

}
