package co.edu.uptc.view.baseView.reservation;

import javax.swing.*;
import java.awt.*;

public class ReservationPanel extends JPanel {

    private DateRPanel dateRPanel;
    private RoomsRPanel roomsRPanel;

    public ReservationPanel(){
        setMinimumSize(new Dimension(1235,565));
        setMaximumSize(new Dimension(1235,565));
        setPreferredSize(new Dimension(1235,565));
        setVisible(false);
        initComponents();
    }

    public void initComponents(){
        setLayout(new BorderLayout());
        dateRPanel = new DateRPanel();
        add(dateRPanel, BorderLayout.WEST);
        roomsRPanel = new RoomsRPanel();
        add(roomsRPanel, BorderLayout.CENTER);
    }
}
