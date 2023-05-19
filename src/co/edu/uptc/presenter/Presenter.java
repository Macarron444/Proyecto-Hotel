package co.edu.uptc.presenter;

import co.edu.uptc.view.baseView.HotelFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter implements ActionListener {
    private HotelFrame hotelFrame;
    public Presenter(){
        hotelFrame = new HotelFrame(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "reserve" -> hotelFrame.changePanel(hotelFrame.getReservationPanel());
            case "cancel" -> hotelFrame.changePanel(hotelFrame.getCancelPanel());
            case "infoPanel" -> hotelFrame.changePanel(hotelFrame.getInfoPanel());
            case "distribution" -> hotelFrame.changePanel(hotelFrame.getDistributionPanel());
        }
    }

    public static void main(String[] args) {
        new Presenter();
    }
}