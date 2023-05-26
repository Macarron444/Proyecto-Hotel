package co.edu.uptc.view.baseView.cancelation;

import co.edu.uptc.persistence.Persistence;
import co.edu.uptc.pojo.Room;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class RoomsCPanel extends JPanel {
    private List<Room> rooms;
    private Persistence persistence;
    public RoomsCPanel(ActionListener listener) throws IOException {
        persistence = new Persistence();
        rooms = persistence.getJsonRooms();
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
            JButton roomButton = new JButton("Room " + room.getNumber());
            roomButton.setActionCommand("cancelRoom");
            roomButton.setName(String.valueOf(rooms.indexOf(room)));
            roomButton.addActionListener(listener);
            roomButton.setBackground(new Color(0x91DE8F));
            add(roomButton, gbc);
            gbc.gridx++;
            if ((rooms.indexOf(room) + 1) % 7 == 0) {
                gbc.gridy++;
                gbc.gridx = 0;
            }
        }
    }
}
