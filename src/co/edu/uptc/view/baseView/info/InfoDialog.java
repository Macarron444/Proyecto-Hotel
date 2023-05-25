package co.edu.uptc.view.baseView.info;

import co.edu.uptc.view.baseView.HotelFrame;

import javax.swing.*;

public class InfoDialog extends JDialog {
    private JLabel roomInfo;

    public InfoDialog(HotelFrame view, boolean modal){
        super(view, modal);
        setSize(600,100);
        initComponents();
        setLocationRelativeTo(null);
    }

    public void initComponents() {
        roomInfo = new JLabel();
        add(roomInfo);
    }

    public void setRoomInfo(String info){
        roomInfo.setText(info);
    }
}
