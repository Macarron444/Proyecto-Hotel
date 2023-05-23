package co.edu.uptc.persistence;

import co.edu.uptc.pojo.Room;
import co.edu.uptc.properties.PropertiesManager;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Persistence {
    private JsonReader hotelReader;
    private JsonReader reservesReader;
    private Room[] jsonRooms;
    private PropertiesManager properties;

    public Persistence() throws FileNotFoundException {
        hotelReader = new Gson().newJsonReader(new FileReader(properties.hotelRoute()));
        reservesReader = new Gson().newJsonReader(new FileReader(properties.reservesRoute()));
        jsonRooms = new Gson().fromJson(hotelReader, Room[].class);
    }

    public void readRooms(){

    }
}
