package co.edu.uptc.model;

import co.edu.uptc.pojo.Reserve;
import co.edu.uptc.pojo.Room;
import co.edu.uptc.pojo.User;

import java.util.ArrayList;
import java.util.Date;

public class Hotel {
    private ArrayList<Room> rooms;
    private ArrayList<Reserve> reserves;

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void reserveRoom(int roomNumber, Date reservation, User user){

    }
    public void cancelReservation(int roomNumber, Date reservation){

    }

    public ArrayList showRooms(Date roomsDate){
        ArrayList<Room> reservedRooms = new ArrayList<>();
        for (int i = 0; i < reserves.size(); i++) {
            if (reserves.get(i).getReserveStart().compareTo(roomsDate) == 0){
                Room reservedRoom = reserves.get(i).getReservedRoom();
                reservedRooms.add(reservedRoom);
            }
        }
        return reservedRooms;
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
