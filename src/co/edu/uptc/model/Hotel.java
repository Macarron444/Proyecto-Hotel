package co.edu.uptc.model;

import co.edu.uptc.persistence.Persistence;
import co.edu.uptc.pojo.Reserve;
import co.edu.uptc.pojo.Room;
import co.edu.uptc.pojo.User;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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

    public Reserve reserveRoom(int roomNumber, Date reservation, User user){
        int day = dateToDay(reservation);
        int month = dateToMonth(reservation);
        int year = dateToYear(reservation);
        return new Reserve(day,month,year, getRoom(roomNumber), user);
    }
    public void cancelReservation(int roomNumber, Date reservation){

    }
    public Date createDate(int dia, int mes, int anio) {
        Date fecha = null;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaString = String.format("%02d/%02d/%04d", dia, mes, anio);
        try {
            fecha = formatoFecha.parse(fechaString);
            System.out.println(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fecha;
    }

    public Date reserveIntToDate(int day, int month, int year){
        Date date = null;
        for (Reserve reserve : reserves) {
            day = reserve.getDay();
            month = reserve.getMonth();
            year = reserve.getYear();

            date = createDate(day, month, year);
        }
        return date;
    }

    public Room getRoom(int roomNumber){
        for (Room room:rooms){
            if (room.getNumber() == roomNumber){
                return room;
            }
        }
        return null;
    }

    public int dateToDay(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public int dateToMonth(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) + 1;
    }

    public int dateToYear(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
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
