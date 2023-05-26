package co.edu.uptc.presenter;

import co.edu.uptc.model.Hotel;
import co.edu.uptc.view.baseView.HotelFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Presenter implements ActionListener {
    private HotelFrame hotelFrame;
    private Hotel hotel;

    public Presenter() throws IOException {
        hotelFrame = new HotelFrame(this);
        hotel = new Hotel();

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
                System.out.println("reservation");
                hotelFrame.showUserRDialog();
            }
            case "cancelRoom" -> {
                System.out.println("Cancellation");
            }
            case "infoRoom" -> {
                System.out.println(hotel.roomInfo(prints(e)));
                hotelFrame.setInfoDialogText(hotel.roomInfo(prints(e)));
            }
            case "search" -> {
                System.out.println("buscar");
            }
            case "DoReserve" -> {

            }
            case "exit" -> hotelFrame.closeDialog();
        }
    }



    private int prints(ActionEvent e) {
        int pos = 0;
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            String name = button.getName();
            pos = Integer.parseInt(name);
        }
        return pos;
    }

    public static void main(String[] args) throws IOException {
        new Presenter();
    }

    public Hotel getHotel() {
        return hotel;
    }
}