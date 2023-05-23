package co.edu.uptc.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {
    private Properties messages;
    public PropertiesManager(){
        messages = new Properties();
    }

    public void loader() throws IOException {
        messages.load(new FileReader("data/messages.properties"));
    }

    public String hotelRoute(){
        return messages.getProperty("hotelRoute");
    }

    public String reservesRoute(){
        return messages.getProperty("reservesRoute");
    }
}
