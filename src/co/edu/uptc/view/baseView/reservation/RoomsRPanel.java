package co.edu.uptc.view.baseView.reservation;


import co.edu.uptc.persistence.Persistence;
import co.edu.uptc.pojo.Room;
import co.edu.uptc.properties.PropertiesManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoomsRPanel extends JPanel {
    private List<Room> rooms;
    private Persistence persistence;
    private PropertiesManager properties;
    public RoomsRPanel(ActionListener listener) throws IOException {
        properties = new PropertiesManager();
        properties.loader();
        persistence = new Persistence();
        rooms = new ArrayList<>(persistence.getJsonRooms());
        setLayout(new GridBagLayout());
        setMinimumSize(new Dimension(877, 565));
        setMaximumSize(new Dimension(877, 565));
        setPreferredSize(new Dimension(877, 565));
        setBackground(Color.white);
        initComponents(listener);
    }

    public void initComponents(ActionListener listener) {
        generateButtons(listener);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void generateButtons(ActionListener listener) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 28-2-2-2-2-2;
        gbc.ipady = 10 + 1 + 1 + 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        for (Room room : rooms) {
            JButton roomButton = new JButton(properties.roomButtonText() + room.getNumber());
            roomButton.setActionCommand(properties.roomButtonReserveActionCommand());
            roomButton.setName(String.valueOf(rooms.indexOf(room)));
            roomButton.addActionListener(listener);
            if (room.isReserved()) {
                roomButton.setForeground(Color.white);
                roomButton.setBackground(new Color(0xF44336));
            } else {
                roomButton.setForeground(Color.black);
                roomButton.setBackground(new Color(0x91DE8F));
            }
            add(roomButton, gbc);
            gbc.gridx++;
            if ((rooms.indexOf(room) + 1) % 7 == 0) {
                gbc.gridy++;
                gbc.gridx = 0;
            }
        }
    }
}
