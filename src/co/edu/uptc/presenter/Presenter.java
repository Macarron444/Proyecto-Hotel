package co.edu.uptc.presenter;

import co.edu.uptc.model.Hotel;
import co.edu.uptc.pojo.Reserve;
import co.edu.uptc.pojo.User;
import co.edu.uptc.view.baseView.HotelFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;

public class Presenter implements ActionListener {
    private HotelFrame hotelFrame;
    private Hotel hotel;
        int pos = 10;

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
                pos = prints(e);
                System.out.println(pos + " me la pela");
                System.out.println(hotel.roomInfo(prints(e)));
                hotelFrame.getReserveDialogButton().setName(printString(e));
                hotelFrame.showUserRDialog();
            }
            case "cancelRoom" -> System.out.println("Cancellation");
            case "infoRoom" -> {
                hotelFrame.setInfoDialogText(hotel.roomInfo(prints(e)));
                pos=prints(e);
                System.out.println(pos + "me la pela");
            }
            case "search" -> System.out.println("buscar");
            case "DoReserve" -> {
                System.out.println(pos);
                System.out.println("asdsg "+hotel.getRoomNumber(this.pos));
                hotel.addReserve(createReserve(hotel.getRoomNumber(this.pos), createRDate(), createUser()));
            }
            case "exit" -> {
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
        Reserve reserve = null;
        System.out.println(roomNumber + "createReserve");
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
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            String name = button.getName();
            System.out.println(name + " metodo prints");
            pos = Integer.parseInt(name);
        }
        return pos;
    }

    public String printString(ActionEvent e){
        if (e.getSource() instanceof JButton){
            JButton button = (JButton) e.getSource();
            return button.getName();
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        new Presenter();
    }

    public Hotel getHotel() {
        return hotel;
    }
}