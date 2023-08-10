package co.edu.uptc.view.baseView;

import co.edu.uptc.properties.PropertiesManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

public class WelcomePanel extends JPanel {
    private JLabel welcomeLabel;
    private JButton reservationButton;
    private ImageIcon reserveIcon;
    private JLabel reservationLabel;
    private JButton cancelButton;
    private ImageIcon cancelIcon;
    private JLabel cancelLabel;
    private JButton infoButton;
    private ImageIcon infoIcon;
    private JLabel infoLabel;
    private JButton distributionButton;
    private ImageIcon distributionIcon;
    private JLabel distributionLabel;
    private JButton statsButton;
    private ImageIcon statsIcon;
    private JLabel statsLabel;
    private PropertiesManager properties;

    public WelcomePanel(ActionListener listener) throws IOException {
        properties = new PropertiesManager();
        properties.loader();
        setBackground(new Color(0xD0B7B8));
        setMinimumSize(new Dimension(1235,565));
        setMaximumSize(new Dimension(1235,565));
        setPreferredSize(new Dimension(1235,565));

        initComponents(listener);
    }

    public void initComponents(ActionListener listener) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        welcomeLabel = new JLabel(properties.welcomeLabelText());
        welcomeLabel.setForeground(Color.black);
        welcomeLabel.setFont(new Font("Segoe UI", Font.BOLD, 32));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        add(welcomeLabel, gbc);

        reserveIcon = createImage("images/reservation.png",120, 90);
        cancelIcon = createImage("images/cancel.png", 90,90);
        infoIcon = createImage("images/info.png", 90,90);
        distributionIcon = createImage("images/distribution.png",90,90);
        statsIcon = createImage("images/stats.png", 90,90);

        reservationButton = new JButton();
        reservationButton.setActionCommand(properties.reservationButtonActionCommand());
        reservationButton.addActionListener(listener);
        reservationButton.setIcon(reserveIcon);
        reservationButton.setBackground(new Color(191, 155, 153));
        reservationButton.setFocusPainted(false);
        reservationButton.setBorderPainted(false);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(70,50,0,50);
        add(reservationButton, gbc);

        reservationLabel = new JLabel(properties.reservationButtonText());
        reservationLabel.setForeground(Color.black);
        reservationLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(0,50,0,50);
        add(reservationLabel, gbc);

        cancelButton = new JButton();
        cancelButton.setActionCommand(properties.cancelButtonActionCommand());
        cancelButton.addActionListener(listener);
        cancelButton.setIcon(cancelIcon);
        cancelButton.setBackground(new Color(191, 155, 153));
        cancelButton.setFocusPainted(false);
        cancelButton.setBorderPainted(false);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.insets = new Insets(70,50,0,50);
        add(cancelButton, gbc);

        cancelLabel = new JLabel(properties.cancelButtonText());
        cancelLabel.setForeground(Color.black);
        cancelLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.insets = new Insets(0,50,0,50);
        add(cancelLabel, gbc);

        infoButton = new JButton();
        infoButton.setActionCommand(properties.infoButtonActionCommand());
        infoButton.addActionListener(listener);
        infoButton.setIcon(infoIcon);
        infoButton.setBackground(new Color(191, 155, 153));
        infoButton.setFocusPainted(false);
        infoButton.setBorderPainted(false);
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.insets = new Insets(70,50,0,50);
        add(infoButton, gbc);

        infoLabel = new JLabel(properties.infoButtonText());
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.insets = new Insets(0,50,0,50);
        add(infoLabel, gbc);

        distributionButton = new JButton();
        distributionButton.setActionCommand(properties.distributionButtonActionCommand());
        distributionButton.addActionListener(listener);
        distributionButton.setIcon(distributionIcon);
        distributionButton.setBackground(new Color(191, 155, 153));
        distributionButton.setFocusPainted(false);
        distributionButton.setBorderPainted(false);
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.insets = new Insets(70,50,0,50);
        add(distributionButton, gbc);

        distributionLabel = new JLabel(properties.distributionButtonText());
        distributionLabel.setForeground(Color.BLACK);
        distributionLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.insets = new Insets(0,50,0,50);
        add(distributionLabel, gbc);

        statsButton = new JButton();
        statsButton.setActionCommand("STATS");
        statsButton.addActionListener(listener);
        statsButton.setIcon(statsIcon);
        statsButton.setBackground(new Color(191, 155, 153));
        statsButton.setFocusPainted(false);
        statsButton.setBorderPainted(false);
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.insets = new Insets(70,50,0,50);
        add(statsButton, gbc);

        statsLabel = new JLabel("Stats");
        statsLabel.setForeground(Color.BLACK);
        statsLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.insets = new Insets(0,50,0,50);
        add(statsLabel, gbc);
    }

    public ImageIcon createImage(String fileName, int width, int height){
        ImageIcon icon = new ImageIcon(fileName);
        Image image = icon.getImage();
        Image newimg = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newimg);
        return icon;
    }
}
