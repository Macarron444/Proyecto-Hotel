package co.edu.uptc.view.baseView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class WelcomePanel extends JPanel {
    private JLabel welcomeLabel;
    private JButton reservationButton;
    private JButton cancelButton;
    private JButton infoButton;
    private JButton distributionButton;

    public WelcomePanel(ActionListener listener){
        setMinimumSize(new Dimension(1235,565));
        setMaximumSize(new Dimension(1235,565));
        setPreferredSize(new Dimension(1235,565));

        initComponents(listener);
    }

    public void initComponents(ActionListener listener) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        welcomeLabel = new JLabel(
                "<html>" +
                        "<body>" +
                        "<h2>Bienvenido al hotel UPTC <br> En que podemos ayudarte?</h2>" +
                        "</body>" +
                        "</html>");
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(welcomeLabel, gbc);

        reservationButton = new JButton("Reservations");
        reservationButton.setActionCommand("reserve");
        reservationButton.addActionListener(listener);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(reservationButton, gbc);

        cancelButton = new JButton("Cancel Reservation");
        cancelButton.setActionCommand("cancel");
        cancelButton.addActionListener(listener);
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(cancelButton, gbc);

        infoButton = new JButton("Rooms info");
        infoButton.setActionCommand("infoPanel");
        infoButton.addActionListener(listener);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(infoButton, gbc);

        distributionButton = new JButton("Floor Distribution");
        distributionButton.setActionCommand("distribution");
        distributionButton.addActionListener(listener);
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(distributionButton, gbc);
    }
}
