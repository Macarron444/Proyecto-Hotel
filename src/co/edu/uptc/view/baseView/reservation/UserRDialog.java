package co.edu.uptc.view.baseView.reservation;

import co.edu.uptc.properties.PropertiesManager;
import co.edu.uptc.view.baseView.HotelFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

public class UserRDialog extends JDialog {
    private JLabel nameLabel;
    private JLabel idLabel;
    private JLabel phoneLabel;
    private JTextField nameText;
    private JTextField idText;
    private JTextField phoneText;
    private JButton reserveButton;
    private JButton exitButton;
    private PropertiesManager properties;

    public UserRDialog(HotelFrame view, boolean modal, ActionListener listener) throws IOException {
        super(view, modal);
        properties = new PropertiesManager();
        properties.loader();
        setSize(400, 300);
        initComponents(listener);
        setLocationRelativeTo(null);
    }

    public void initComponents(ActionListener listener) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        nameLabel = new JLabel(properties.nameLabelText());
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nameLabel,gbc);

        nameText = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(nameText, gbc);

        idLabel = new JLabel(properties.idLabelText());
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(idLabel, gbc);

        idText = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(idText, gbc);

        phoneLabel = new JLabel(properties.phoneLabelText());
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(phoneLabel, gbc);

        phoneText = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(phoneText, gbc);

        reserveButton = new JButton(properties.reserveButtonText());
        reserveButton.setActionCommand(properties.reserveButtonActionCommand());
        reserveButton.addActionListener(listener);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(reserveButton, gbc);

        exitButton = new JButton(properties.exitButtonText());
        exitButton.setActionCommand(properties.exitButtonActionCommand());
        exitButton.addActionListener(listener);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(exitButton, gbc);
    }

    public JButton getReserveButton() {
        return reserveButton;
    }

    public String getNameText(){
        return nameText.getText();
    }

    public String getIdText(){
        return idText.getText();
    }

    public String getPhoneText(){
        return phoneText.getText();
    }
}
