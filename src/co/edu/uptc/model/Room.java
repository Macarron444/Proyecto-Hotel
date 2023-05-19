package co.edu.uptc.model;

public class Room {
    private int number;
    private String roomType;
    private boolean isReserved;

    public boolean isReserved() {
        return isReserved;
    }

    public Room(int number, String roomType, boolean isReserved) {
        this.number = number;
        this.roomType = roomType;
        this.isReserved = isReserved;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", roomType='" + roomType + '\'' +
                ", isReserved=" + isReserved +
                '}';
    }
}
