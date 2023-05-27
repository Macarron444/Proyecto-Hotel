package co.edu.uptc.view.baseView;

import co.edu.uptc.properties.PropertiesManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

public class WelcomePanel extends JPanel {
    private JLabel welcomeLabel;
    private JButton reservationButton;
    private JButton cancelButton;
    private JButton infoButton;
    private JButton distributionButton;
    private PropertiesManager properties;

    public WelcomePanel(ActionListener listener) throws IOException {
        properties = new PropertiesManager();
        properties.loader();
        setMinimumSize(new Dimension(1235,565));
        setMaximumSize(new Dimension(1235,565));
        setPreferredSize(new Dimension(1235,565));

        initComponents(listener);
    }

    public void initComponents(ActionListener listener) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        welcomeLabel = new JLabel(properties.welcomeLabelText());
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(welcomeLabel, gbc);

        reservationButton = new JButton(properties.reservationButtonText());
        reservationButton.setActionCommand(properties.reservationButtonActionCommand());
        reservationButton.addActionListener(listener);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(reservationButton, gbc);

        cancelButton = new JButton(properties.cancelButtonText());
        cancelButton.setActionCommand(properties.cancelButtonActionCommand());
        cancelButton.addActionListener(listener);
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(cancelButton, gbc);

        infoButton = new JButton(properties.infoButtonText());
        infoButton.setActionCommand(properties.infoButtonActionCommand());
        infoButton.addActionListener(listener);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(infoButton, gbc);

        distributionButton = new JButton(properties.distributionButtonText());
        distributionButton.setActionCommand(properties.distributionButtonActionCommand());
        distributionButton.addActionListener(listener);
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(distributionButton, gbc);
    }
}
