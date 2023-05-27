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

    public String introLabelCancel(){
        return messages.getProperty("introLabelCancel");
    }

    public String dayLabelText(){
        return messages.getProperty("dayLabelText");
    }

    public String monthLabelText(){
        return messages.getProperty("monthLabelText");
    }

    public String yearLabelText(){
        return messages.getProperty("yearLabelText");
    }

    public String homeButtonText(){
        return messages.getProperty("homeButtonText");
    }

    public String homeButtonActionCommand(){
        return messages.getProperty("homeButtonActionCommand");
    }

    public String roomButtonText(){
        return messages.getProperty("roomButtonText");
    }

    public String roomButtonCancelActionCommand(){
        return messages.getProperty("roomButtonCancelActionCommand");
    }

    public String distributionLabelText(){
        return messages.getProperty("distributionLabelText");
    }

    public String roomTypeSingle(){
        return messages.getProperty("roomTypeSingle");
    }

    public String roomTypeDouble(){
        return messages.getProperty("roomTypeDouble");
    }

    public String roomTypeMarital(){
        return messages.getProperty("roomTypeMarital");
    }

    public String roomTypeSuite(){
        return messages.getProperty("roomTypeSuite");
    }

    public String roomPriceSingle(){return messages.getProperty("roomPriceSingle");}
    public String roomPriceDouble(){return messages.getProperty("roomPriceDouble");}
    public String roomPriceMarital(){return messages.getProperty("roomPriceMarital");}
    public String roomPriceSuite(){return messages.getProperty("roomPriceSuite");}

    public String introLabelInfo(){
        return messages.getProperty("introLabelInfo");
    }
    public String roomButtonInfoActionCommand(){
        return messages.getProperty("roomButtonInfoActionCommand");
    }

    public String introLabelReserve(){
        return messages.getProperty("introLabelReserve");
    }

    public String roomButtonReserveActionCommand(){
        return messages.getProperty("roomButtonReserveActionCommand");
    }

    public String nameLabelText(){
        return messages.getProperty("nameLabelText");
    }

    public String idLabelText(){
        return messages.getProperty("idLabelText");
    }

    public String phoneLabelText(){
        return messages.getProperty("phoneLabelText");
    }

    public String reserveButtonText(){
        return messages.getProperty("reserveButtonText");
    }

    public String reserveButtonActionCommand(){
        return messages.getProperty("reserveButtonActionCommand");
    }

    public String exitButtonText(){
        return messages.getProperty("exitButtonText");
    }

    public String exitButtonActionCommand(){
        return messages.getProperty("exitButtonActionCommand");
    }

    public String hotelFrameTitle(){
        return messages.getProperty("hotelFrameTitle");
    }

    public String welcomeLabelText(){
        return messages.getProperty("welcomeLabelText");
    }

    public String reservationButtonText(){
        return messages.getProperty("reservationButtonText");
    }

    public String reservationButtonActionCommand(){
        return messages.getProperty("reservationButtonActionCommand");
    }

    public String cancelButtonText(){
        return messages.getProperty("cancelButtonText");
    }

    public String cancelButtonActionCommand(){
        return messages.getProperty("cancelButtonActionCommand");
    }

    public String infoButtonText(){
        return messages.getProperty("infoButtonText");
    }

    public String infoButtonActionCommand(){
        return messages.getProperty("infoButtonActionCommand");
    }

    public String distributionButtonText(){
        return messages.getProperty("distributionButtonText");
    }

    public String distributionButtonActionCommand(){
        return messages.getProperty("distributionButtonActionCommand");
    }
}