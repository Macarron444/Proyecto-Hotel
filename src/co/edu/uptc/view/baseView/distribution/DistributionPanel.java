package co.edu.uptc.view.baseView.distribution;

import co.edu.uptc.properties.PropertiesManager;
import co.edu.uptc.view.configView.InfoRoomLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

public class DistributionPanel extends JPanel {
    private JLabel distribution;
    private InfoRoomLabel single1;
    private InfoRoomLabel single2;
    private InfoRoomLabel single3;
    private InfoRoomLabel double1;
    private InfoRoomLabel double2;
    private InfoRoomLabel marital;
    private InfoRoomLabel suite;
    private JButton home;
    private PropertiesManager properties;

    public DistributionPanel(ActionListener listener) throws IOException {
        properties = new PropertiesManager();
        properties.loader();
        setSize(700, 400);
        initComponents(listener);
    }

    public void initComponents(ActionListener listener) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        distribution = new JLabel(properties.distributionLabelText());
        distribution.setFont(new Font("Arial", Font.BOLD, 32));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(distribution, gbc);

        single1 = new InfoRoomLabel(properties.roomTypeSingle(), 1, 1, properties.roomPriceSingle());
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        add(single1, gbc);

        single2 = new InfoRoomLabel(properties.roomTypeSingle(), 1, 1, properties.roomPriceSingle());
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(single2, gbc);

        single3 = new InfoRoomLabel(properties.roomTypeSingle(), 1, 1, properties.roomPriceSingle());
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(single3, gbc);

        double1 = new InfoRoomLabel(properties.roomTypeDouble(), 2, 1, properties.roomPriceDouble());
        gbc.gridx = 3;
        gbc.gridy = 1;
        add(double1, gbc);

        double2 = new InfoRoomLabel(properties.roomTypeDouble(), 2, 1, properties.roomPriceDouble());
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(double2, gbc);

        marital = new InfoRoomLabel(properties.roomTypeMarital(), 1, 2, properties.roomPriceMarital());
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(marital, gbc);

        suite = new InfoRoomLabel(properties.roomTypeSuite(), 2, 2, properties.roomPriceSuite());
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(suite, gbc);

        home = new JButton(properties.homeButtonText());
        gbc.gridx = 4;
        gbc.gridy = 2;
        home.setActionCommand(properties.homeButtonActionCommand());
        home.addActionListener(listener);
        add(home, gbc);
    }
}
