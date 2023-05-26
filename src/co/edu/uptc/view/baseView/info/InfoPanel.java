package co.edu.uptc.view.baseView.info;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

public class InfoPanel extends JPanel {
    private DateIPanel dateIPanel;
    private RoomsIPanel roomsIPanel;
    public InfoPanel(){
        setSize(1280,670);
    }

    public InfoPanel(ActionListener listener) throws IOException {
        setMinimumSize(new Dimension(1235, 565));
        setMaximumSize(new Dimension(1235, 565));
        setPreferredSize(new Dimension(1235, 565));
        setVisible(false);
        initComponents(listener);
    }

    public void initComponents(ActionListener listener) throws IOException {
        setLayout(new BorderLayout());
        dateIPanel = new DateIPanel(listener);
        add(dateIPanel, BorderLayout.WEST);
        roomsIPanel = new RoomsIPanel(listener);
        JScrollPane scroll = new JScrollPane(roomsIPanel);
        add(scroll, BorderLayout.CENTER);
    }

    public String getDayText(){
        return dateIPanel.getDayText();
    }

    public String getMonthText(){
        return dateIPanel.getMonthText();
    }

    public String getYearText(){
        return dateIPanel.getYearText();
    }
}
