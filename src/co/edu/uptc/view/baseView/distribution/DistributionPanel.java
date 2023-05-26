package co.edu.uptc.view.baseView.distribution;

import co.edu.uptc.view.configView.InfoRoomLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

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

    public DistributionPanel(ActionListener listener) {
        setSize(700, 400);
        initComponents(listener);
    }

    public void initComponents(ActionListener listener) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        distribution = new JLabel("Distribucion de habitaciones por piso");
        distribution.setFont(new Font("Arial", Font.BOLD, 32));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(distribution, gbc);

        single1 = new InfoRoomLabel("Sencilla", 1, 1, "$150.000");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        add(single1, gbc);

        single2 = new InfoRoomLabel("Sencilla", 1, 1, "$150.000");
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(single2, gbc);

        single3 = new InfoRoomLabel("Sencilla", 1, 1, "$150.000");
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(single3, gbc);

        double1 = new InfoRoomLabel("Doble", 2, 1, "$200.000");
        gbc.gridx = 3;
        gbc.gridy = 1;
        add(double1, gbc);

        double2 = new InfoRoomLabel("Doble", 2, 1, "$200.000");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(double2, gbc);

        marital = new InfoRoomLabel("Matrimonial", 1, 2, "$250.000");
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(marital, gbc);

        suite = new InfoRoomLabel("Suite", 2, 2, "$400.000");
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(suite, gbc);

        home = new JButton("Home");
        gbc.gridx = 4;
        gbc.gridy = 2;
        home.setActionCommand("Home");
        home.addActionListener(listener);
        add(home, gbc);
    }
}
