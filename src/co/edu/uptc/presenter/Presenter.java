package co.edu.uptc.presenter;

import co.edu.uptc.view.baseView.HotelFrame;

import javax.swing.*;
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
            case "Home" -> hotelFrame.changePanel(hotelFrame.getWelcomePanel());
            case "reserve" -> hotelFrame.changePanel(hotelFrame.getReservationPanel());
            case "cancel" -> hotelFrame.changePanel(hotelFrame.getCancelPanel());
            case "infoPanel" -> hotelFrame.changePanel(hotelFrame.getInfoPanel());
            case "distribution" -> hotelFrame.changePanel(hotelFrame.getDistributionPanel());
            case "reserveRoom" -> {
                prints(e);
                System.out.println("reservation");
            }
            case "cancelRoom" ->{
                prints(e);
                System.out.println("Cancellation");
            }
            case "infoRoom" -> {
                prints(e);
                System.out.println("Information");
            }
        }
    }

    private void prints(ActionEvent e) {
        if (e.getSource() instanceof JButton){
            System.out.println(((JButton) e.getSource()).getName());
        }
    }


    public static void main(String[] args) {
        new Presenter();
    }
}