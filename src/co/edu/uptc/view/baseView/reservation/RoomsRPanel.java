package co.edu.uptc.view.baseView.reservation;


import co.edu.uptc.pojo.Room;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.LinkedList;

public class RoomsRPanel extends JPanel {
    private List<Room> rooms;
    public RoomsRPanel(ActionListener listener) {
        rooms = new LinkedList<>();
        setLayout(new GridBagLayout());
        setMinimumSize(new Dimension(877, 565));
        setMaximumSize(new Dimension(877, 565));
        setPreferredSize(new Dimension(877, 565));
        setBackground(Color.white);
        initComponents(listener);
    }

    public void initComponents(ActionListener listener) {
        rooms = generate70Rooms();
        generateButtons(listener);
    }

    private List<Room> generate70Rooms() {
        List<Room> rooms = new LinkedList<>();
        for (int i = 0; i < 70; i++) {
            rooms.add(new Room(101,"Simple", i % 4 == 0));
        }
        return rooms;
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
            JButton roomButton = new JButton("Room " + room.getNumber());
            roomButton.setActionCommand("reserveRoom");
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
