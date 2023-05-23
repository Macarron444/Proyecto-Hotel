package co.edu.uptc.view.configView;

import javax.swing.*;
import java.awt.*;

public class RoomInfoButton extends JButton {
    public RoomInfoButton(String text){
        super(text);
        setBackground(new Color(0x91DE8F));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        setFocusPainted(false);
        setActionCommand("info");
    }
}
