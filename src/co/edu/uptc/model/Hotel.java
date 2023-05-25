package co.edu.uptc.model;

import co.edu.uptc.persistence.Persistence;
import co.edu.uptc.pojo.Reserve;
import co.edu.uptc.pojo.Room;
import co.edu.uptc.pojo.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel {
    private List<Room> rooms;
    private List<Reserve> reserves;
    private Persistence persistence;

    public Hotel() throws IOException {
        persistence = new Persistence();
        rooms = persistence.getJsonRooms();
        reserves = new ArrayList<>();
    }
    public List<Room> getRooms() {
        return rooms;
    }

    public void reserveRoom(int roomNumber, Date reservation, User user){

    }
    public void cancelReservation(int roomNumber, Date reservation){

    }

    public List<Room> showRooms(Date roomsDate){
        List<Room> reservedRooms = new ArrayList<>();
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
        info = getRoomInfo(roomNumber);
        return info;
    }

    public int getSearchedRoom(int roomNumber){
        for (Room room :rooms) {
            if (room.getNumber()==roomNumber) return rooms.indexOf(room);
        }
        int pos = -1;
        Room searchedRoom;
        int i = 0;
        while (pos == -1 && i<rooms.size()){
            searchedRoom = rooms.get(i);
            if (searchedRoom.getNumber() == roomNumber){
                pos = rooms.indexOf(searchedRoom);
            }
            i++;
        }
        return pos;
    }

    public String getRoomInfo(int pos){
        return rooms.get(pos).toString();
    }
}
