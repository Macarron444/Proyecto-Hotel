package co.edu.uptc.persistence;

import co.edu.uptc.pojo.Reserve;
import co.edu.uptc.pojo.Room;
import co.edu.uptc.properties.PropertiesManager;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.List;

public class Persistence {
    private List<Room> jsonRooms;
    private List<Reserve> jsonReserves;
    private PropertiesManager properties;

    public Persistence() throws IOException {
        properties = new PropertiesManager();
        properties.loader();
        jsonRooms = List.of(new Gson().fromJson(new BufferedReader(new FileReader(properties.hotelRoute())), Room[].class));
        jsonReserves = List.of(new Gson().fromJson(new BufferedReader(new FileReader(properties.reservesRoute())), Reserve[].class));
    }

    public PropertiesManager getProperties() {
        return properties;
    }

    public List<Room> getJsonRooms() {
        return jsonRooms;
    }

    public List<Reserve> getJsonReserves() {
        return jsonReserves;
    }
 
    public void saveData(List<Reserve> reserves) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter reserveWriter = new FileWriter(properties.reservesRoute());
        reserveWriter.write(gson.toJson(reserves));
        reserveWriter.close();
    }
}
