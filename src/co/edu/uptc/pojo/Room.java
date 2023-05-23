package co.edu.uptc.pojo;

public class Room {
    private int number;
    private String roomType;
    private boolean isReserved;

    public Room (){
        number = -1;
        roomType = "";
        isReserved = false;
    }
    public Room(int number, String roomType, boolean isReserved) {
        this.number = number;
        this.roomType = roomType;
        this.isReserved = isReserved;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
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
