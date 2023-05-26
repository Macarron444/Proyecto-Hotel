package co.edu.uptc.view.baseView.cancelation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

public class CancelPanel extends JPanel {
    private DateCPanel dateCPanel;
    private RoomsCPanel roomsCPanel;
    public CancelPanel(ActionListener listener) throws IOException {
        setMinimumSize(new Dimension(1235,565));
        setMaximumSize(new Dimension(1235,565));
        setPreferredSize(new Dimension(1235,565));
        setVisible(false);
        initComponents(listener);
    }

    public void initComponents(ActionListener listener) throws IOException {
        setLayout(new BorderLayout());
        dateCPanel = new DateCPanel(listener);
        add(dateCPanel, BorderLayout.WEST);
        roomsCPanel = new RoomsCPanel(listener);
        JScrollPane scroll = new JScrollPane(roomsCPanel);
        add(scroll, BorderLayout.CENTER);
    }

    public String getDayText(){
        return dateCPanel.getDayText();
    }

    public String getMonthText(){
        return dateCPanel.getMonthText();
    }

    public String getYearText(){
        return dateCPanel.getYearText();
    }
}
