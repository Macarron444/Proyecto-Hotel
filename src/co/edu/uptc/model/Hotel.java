package co.edu.uptc.model;

import java.util.ArrayList;
import java.util.Date;

public class Hotel {
    private ArrayList<Room> rooms;

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void reserveRoom(int roomNumber, Date reservation){

    }

    public void cancelReservation(int roomNumber, Date reservation){

    }

    public int roomsReserved(){
        int reserved = 0;
        for (Room room : rooms) {
            if (room.isReserved()) {
                reserved++;
            }
        }
        return reserved;
    }

    public String roomInfo(int roomNumber){
        String info = "";
        for (Room room : rooms) {
            info = room.toString();
        }
        return info;
    }


}
