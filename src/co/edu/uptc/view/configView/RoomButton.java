package co.edu.uptc.view.configView;

import javax.swing.*;
import java.awt.*;

public class RoomButton extends JButton {
    public RoomButton(String text){
        super(text);
        setSize(52,45);
        setBackground(new Color(0x91DE8F));
        setBorderPainted(false);
        setFocusPainted(false);
        setActionCommand("info");
    }
}
