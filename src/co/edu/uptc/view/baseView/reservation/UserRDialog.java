package co.edu.uptc.view.baseView.reservation;

import co.edu.uptc.view.baseView.HotelFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class UserRDialog extends JDialog {
    private JLabel nameLabel;
    private JLabel idLabel;
    private JLabel phoneLabel;
    private JTextField nameText;
    private JTextField idText;
    private JTextField phoneText;
    private JButton reserveButton;
    private JButton exitButton;

    public UserRDialog(HotelFrame view, boolean modal, ActionListener listener){
        super(view, modal);
        setSize(400, 300);
        initComponents(listener);
        setLocationRelativeTo(null);
    }

    public void initComponents(ActionListener listener) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        nameLabel = new JLabel("Nombre:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nameLabel,gbc);

        nameText = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(nameText, gbc);

        idLabel = new JLabel("Identificacion:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(idLabel, gbc);

        idText = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(idText, gbc);

        phoneLabel = new JLabel("Telefono:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(phoneLabel, gbc);

        phoneText = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(phoneText, gbc);

        reserveButton = new JButton("Reservar");
        reserveButton.setActionCommand("DoReserve");
        reserveButton.addActionListener(listener);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(reserveButton, gbc);

        exitButton = new JButton("Exit");
        exitButton.setActionCommand("exit");
        exitButton.addActionListener(listener);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(exitButton, gbc);
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
