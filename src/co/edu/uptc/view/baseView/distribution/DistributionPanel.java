package co.edu.uptc.view.baseView.distribution;

import co.edu.uptc.view.configView.InfoRoomLabel;

import javax.swing.*;
import java.awt.*;

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

    public DistributionPanel() {
        setSize(700, 400);
        initComponents();
    }

    public void initComponents() {
        distribution = new JLabel("Distribucion de habitaciones por piso");
        distribution.setBounds(107,70,1021,78);
        distribution.setFont(new Font("Arial", Font.BOLD, 32));
        add(distribution);
        single1 = new InfoRoomLabel("Sencilla", 1, 1, "$150.000");
        add(single1);
        single2 = new InfoRoomLabel("Sencilla", 1, 1, "$150.000");
        add(single2);
        single3 = new InfoRoomLabel("Sencilla", 1, 1, "$150.000");
        add(single3);
        double1 = new InfoRoomLabel("Doble", 2, 1, "$200.000");
        add(double1);
        double2 = new InfoRoomLabel("Doble", 2, 1, "$200.000");
        add(double2);
        marital = new InfoRoomLabel("Matrimonial", 1, 2, "$250.000");
        add(marital);
        suite = new InfoRoomLabel("Suite", 2, 2, "$400.000");
        add(suite);


    }
}
