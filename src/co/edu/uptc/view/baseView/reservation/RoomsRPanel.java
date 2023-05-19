package co.edu.uptc.view.baseView.reservation;

import co.edu.uptc.view.configView.RoomButton;

import javax.swing.*;
import java.awt.*;

public class RoomsRPanel extends JPanel {
    private JScrollPane scroll;
    public RoomsRPanel(){
        setMinimumSize(new Dimension(877, 565));
        setMaximumSize(new Dimension(877, 565));
        setPreferredSize(new Dimension(877, 565));
        setBackground(new Color(0xd9d9d9));
        initComponents();
    }

    public void initComponents() {
        generateButtons();
    }

    public void generateButtons(){
        setLayout(new GridLayout(7,10));
        for (int i = 0; i < 70; i++) {
            RoomButton button = new RoomButton("Room" + i);
            add(button);
        }
    }


}
