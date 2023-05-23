package co.edu.uptc.presenter;

import co.edu.uptc.model.Hotel;
import co.edu.uptc.pojo.User;
import co.edu.uptc.view.baseView.HotelFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Presenter implements ActionListener {
    private HotelFrame hotelFrame;
    private Hotel hotel;

    public Presenter() {
        hotelFrame = new HotelFrame(this);
        hotel = new Hotel();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int reservationYear = Integer.parseInt(hotelFrame.getRYearText());
        int reservationMonth = Integer.parseInt(hotelFrame.getRMonthText());
        int reservationDay = Integer.parseInt(hotelFrame.getRDayText());
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
                prints(e);
                System.out.println("Information");
            }
            case "search" -> {
                Date reservationDate = createRDate(reservationDay, reservationMonth, reservationYear);

                System.out.println("buscar");
            }
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

    private void prints(ActionEvent e) {
        if (e.getSource() instanceof JButton) {

            System.out.println(((JButton) e.getSource()).getName());
        }
    }

    public static void main(String[] args) {
        new Presenter();
    }

    public Hotel getHotel() {
        return hotel;
    }
}