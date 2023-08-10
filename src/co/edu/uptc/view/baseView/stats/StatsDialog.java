package co.edu.uptc.view.baseView.stats;

import co.edu.uptc.view.baseView.HotelFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StatsDialog extends JDialog{
    private JLabel dayLabel;
    private JLabel monthLabel;
    private JLabel yearLabel;
    private JTextField dayText;
    private JTextField monthText;
    private JTextField yearText;
    private JButton searchButton;
    private JLabel available;
    private JLabel reservedRooms;
    public StatsDialog(HotelFrame view, boolean modal, ActionListener listener){
        super(view, modal);
        setBackground(new Color(0xD0B7B8));
        setMinimumSize(new Dimension(500,300));
        setMaximumSize(new Dimension(500,300));
        setPreferredSize(new Dimension(500,300));
        setLocationRelativeTo(null);
        initComponents(listener);
    }

    private void initComponents(ActionListener listener) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        dayLabel = new JLabel("Day:");
        dayLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(dayLabel,gbc);

        dayText = new JTextField(5);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(dayText, gbc);

        monthLabel = new JLabel("Month:");
        monthLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(monthLabel,gbc);

        monthText = new JTextField(5);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(monthText, gbc);

        yearLabel = new JLabel("Year:");
        yearLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(yearLabel, gbc);

        yearText = new JTextField(5);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(yearText, gbc);

        searchButton = new JButton("Search");
        searchButton.setActionCommand("SEARCH");
        searchButton.addActionListener(listener);
        searchButton.setBorderPainted(false);
        searchButton.setFocusPainted(false);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        add(searchButton, gbc);

        available = new JLabel();
        available.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(available, gbc);

        reservedRooms = new JLabel();
        reservedRooms.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(reservedRooms, gbc);
    }

    public void setAvailableText(String availableRooms){
        this.available.setText("Cantidad de habitaciones disponibles: " + availableRooms);
    }

    public void setReservedRoomsText(String reservedRooms){
        this.reservedRooms.setText("Cantidad de habitaciones reservadas: " + reservedRooms);
    }

    public String getDayText(){
        return dayText.getText();
    }

    public String getMonthText(){
        return monthText.getText();
    }

    public String getYearText(){
        return yearText.getText();
    }
}
