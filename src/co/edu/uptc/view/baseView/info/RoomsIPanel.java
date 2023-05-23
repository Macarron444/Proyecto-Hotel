package co.edu.uptc.view.baseView.info;

import co.edu.uptc.pojo.Room;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class RoomsIPanel extends JPanel {
    private List<Room> rooms;
    public RoomsIPanel() {
        rooms = new LinkedList<>();
        setLayout(new GridBagLayout());
        setMinimumSize(new Dimension(877, 565));
        setMaximumSize(new Dimension(877, 565));
        setPreferredSize(new Dimension(877, 565));
        setBackground(Color.white);
        initComponents();
    }

    public void initComponents() {
        rooms = generate70Rooms();
        generateButtons();
    }

    private List<Room> generate70Rooms() {
        List<Room> rooms = new LinkedList<>();
        for (int i = 0; i < 70; i++) {
            rooms.add(new Room(101,"Simple", false));
        }
        return rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void generateButtons() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 28-2-2-2-2-2;
        gbc.ipady = 10 + 1 + 1 + 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        for (Room room : rooms) {
            JButton roomButton = new JButton("Room " + room.getNumber());
            roomButton.setActionCommand("info");
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
