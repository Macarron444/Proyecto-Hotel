package co.edu.uptc.presenter;

import co.edu.uptc.model.Hotel;
import co.edu.uptc.pojo.Reserve;
import co.edu.uptc.pojo.User;
import co.edu.uptc.properties.PropertiesManager;
import co.edu.uptc.view.baseView.HotelFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;

public class Presenter implements ActionListener {
    private HotelFrame hotelFrame;
    private Hotel hotel;
    private PropertiesManager properties;
    private int pos;

    public Presenter() throws IOException {
        hotelFrame = new HotelFrame(this);
        hotel = new Hotel();
        propertiesManager();

    }

    public void propertiesManager() throws IOException {
        properties = new PropertiesManager();
        properties.loader();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "HOME" -> hotelFrame.changePanel(hotelFrame.getWelcomePanel());
            case "RESERVE" -> hotelFrame.changePanel(hotelFrame.getReservationPanel());
            case "CANCEL" -> hotelFrame.changePanel(hotelFrame.getCancelPanel());
            case "INFO_PANEL" -> hotelFrame.changePanel(hotelFrame.getInfoPanel());
            case "DISTRIBUTION" -> hotelFrame.changePanel(hotelFrame.getDistributionPanel());
            case "RESERVE_ROOM" -> {
                pos = prints(e);
                hotelFrame.showUserRDialog();
            }
            case "INFO_ROOM" -> {
                hotelFrame.setInfoDialogText(hotel.roomInfo(prints(e)));
                pos=prints(e);
            }
            case "DO_RESERVE" -> hotel.addReserve(createReserve(hotel.getRooms().get(this.pos).getNumber(), createRDate(), createUser()));
            case "EXIT" -> {
                hotelFrame.closeDialog();
                try {
                    hotel.saveData();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }

    public Reserve createReserve(int roomNumber, Date date, User user){
        Reserve reserve;
        reserve = hotel.reserveRoom(roomNumber, date, user);
        return reserve;
    }

    public User createUser(){
        String name = hotelFrame.getNameText();
        String phone = hotelFrame.getPhoneText();
        int id = Integer.parseInt(hotelFrame.getIdText());
        return hotel.createUser(name, phone, id);
    }

    public Date createRDate(){
        int day = Integer.parseInt(hotelFrame.getRDayText());
        int month = Integer.parseInt(hotelFrame.getRMonthText());
        int year = Integer.parseInt(hotelFrame.getRYearText());
        return hotel.createDate(day, month, year);
    }



    public int prints(ActionEvent e) {
        int pos = 0;
        if (e.getSource() instanceof JButton button) {
            String name = button.getName();
            pos = Integer.parseInt(name);
        }
        return pos;
    }

    public static void main(String[] args) throws IOException {
        new Presenter();
    }
}