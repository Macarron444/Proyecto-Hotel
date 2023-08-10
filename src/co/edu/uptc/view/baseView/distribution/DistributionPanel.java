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
        setMinimumSize(new Dimension(1235, 565));
        setMaximumSize(new Dimension(1235, 565));
        setPreferredSize(new Dimension(1235, 565));
        initComponents(listener);
        setBackground(new Color(0xD0B7B8));
    }

    public void initComponents(ActionListener listener) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        distribution = new JLabel(properties.distributionLabelText());
        distribution.setFont(new Font("Segoe UI", Font.BOLD, 32));
        distribution.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        add(distribution, gbc);

        single1 = new InfoRoomLabel(properties.roomTypeSingle(), 1, 1, properties.roomPriceSingle());
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(40,10,20,10);
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
        gbc.insets = new Insets(40,20,20,20);
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
        home.setActionCommand(properties.homeButtonActionCommand());
        home.addActionListener(listener);
        home.setBorderPainted(false);
        home.setFocusPainted(false);
        home.setBackground(Color.white);
        home.setMinimumSize(new Dimension(140,40));
        home.setMaximumSize(new Dimension(140,40));
        home.setPreferredSize(new Dimension(140,40));

        gbc.insets = new Insets(0,0,0,0);
        gbc.gridx = 5;
        gbc.gridy = 3;
        add(home, gbc);
    }
}
