package co.edu.uptc.presenter;

import co.edu.uptc.model.Hotel;
import co.edu.uptc.pojo.User;
import co.edu.uptc.view.baseView.HotelFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
                prints(e);
                System.out.println("reservation");
            }
            case "cancelRoom" -> {
                prints(e);
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
                doReservation();
            }
            case "exit" -> hotelFrame.closeDialog();
        }
    }

    public Date createRDate(int dia, int mes, int anio) {
        Date fecha = null;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaString = String.format("%02d/%02d/%04d", dia, mes, anio);
        try {
            fecha = formatoFecha.parse(fechaString);
            System.out.println(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fecha;
    }
    public void doReservation() {
        User user = new User("jorge", "981724", 34);
        //hotel.reserveRoom();
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