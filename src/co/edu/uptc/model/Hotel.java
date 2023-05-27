package co.edu.uptc.model;

import co.edu.uptc.persistence.Persistence;
import co.edu.uptc.pojo.Reserve;
import co.edu.uptc.pojo.Room;
import co.edu.uptc.pojo.User;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Hotel {
    private List<Room> rooms;
    private List<Reserve> reserves;
    private Persistence persistence;

    public Hotel() throws IOException {
        persistence = new Persistence();
        rooms = new ArrayList<>(persistence.getJsonRooms());
        reserves = new ArrayList<>(persistence.getJsonReserves());
    }
    public List<Room> getRooms() {
        return rooms;
    }

    public List<Reserve> getReserves() {
        return reserves;
    }

    public void addReserve(Reserve reserve){
        reserves.add(reserve);
    }

    public Reserve reserveRoom(int roomNumber, Date reservation, User user){
        int day = dateToDay(reservation);
        int month = dateToMonth(reservation);
        int year = dateToYear(reservation);
        return new Reserve(day,month,year, getRoom(roomNumber), user);
    }
    public Date createDate(int dia, int mes, int anio) {
        Date fecha = null;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaString = String.format("%02d/%02d/%04d", dia, mes, anio);
        try {
            fecha = formatoFecha.parse(fechaString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fecha;
    }

    public User createUser(String name, String phoneNumber, int id){
        User user;
        user = new User(name, phoneNumber, id);
        return user;
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
        String info;
        info = getRoomInfo(roomNumber);
        return info;
    }

    public void saveData() throws IOException {
        new Persistence().saveData(reserves);
    }

    public String getRoomInfo(int pos){
        return rooms.get(pos).toString();
    }
}
