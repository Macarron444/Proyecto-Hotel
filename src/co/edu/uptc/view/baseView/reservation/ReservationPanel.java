package co.edu.uptc.view.baseView.reservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ReservationPanel extends JPanel {
    private DateRPanel dateRPanel;
    private RoomsRPanel roomsRPanel;
    public ReservationPanel(ActionListener listener) throws IOException {
        setMinimumSize(new Dimension(1235, 565));
        setMaximumSize(new Dimension(1235, 565));
        setPreferredSize(new Dimension(1235, 565));
        setVisible(false);
        initComponents(listener);
    }

    public void initComponents(ActionListener listener) throws IOException {
        setLayout(new BorderLayout());
        dateRPanel = new DateRPanel(listener);
        add(dateRPanel, BorderLayout.WEST);
        roomsRPanel = new RoomsRPanel(listener);
        JScrollPane scroll = new JScrollPane(roomsRPanel);
        add(scroll, BorderLayout.CENTER);
    }

    public String getDayText(){
        return dateRPanel.getDayText();
    }

    public String getMonthText(){
        return dateRPanel.getMonthText();
    }

    public String getYearText(){
        return dateRPanel.getYearText();
    }
}
