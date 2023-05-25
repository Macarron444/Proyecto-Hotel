package co.edu.uptc.persistence;

import co.edu.uptc.pojo.Reserve;
import co.edu.uptc.pojo.Room;
import co.edu.uptc.properties.PropertiesManager;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Persistence {
    private JsonReader hotelReader;
    private JsonReader reservesReader;
    private List<Room> jsonRooms;
    private List<Reserve> jsonReserves;
    private PropertiesManager properties;

    public Persistence() throws IOException {
        properties = new PropertiesManager();
        properties.loader();
        reservesReader = new Gson().newJsonReader(new FileReader(properties.reservesRoute()));
        jsonRooms = List.of(new Gson().fromJson(new BufferedReader(new FileReader(properties.hotelRoute())), Room[].class));
        jsonReserves = new Gson().fromJson(reservesReader, Reserve[].class);
    }

    public PropertiesManager getProperties() {
        return properties;
    }

    public List<Room> getJsonRooms() {
        return jsonRooms;
    }

    public void setJsonRooms(List<Room> jsonRooms) {
        this.jsonRooms = jsonRooms;
    }

    public List<Reserve> getJsonReserves() {
        return jsonReserves;
    }

    public void setJsonReserves(List<Reserve> jsonReserves) {
        this.jsonReserves = jsonReserves;
    }

    public void writeReserves(Reserve reserve) throws FileNotFoundException {
        String json = new Gson().toJson(reserve);
        PrintWriter print = new PrintWriter(properties.reservesRoute());
        print.write(json);
        print.close();
    }
}
