package co.edu.uptc.view.baseView.cancelation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DateCPanel extends JPanel {
    private JLabel introLabel;
    private JLabel dayLabel;
    private JLabel monthLabel;
    private JLabel yearLabel;
    private JTextField dayText;
    private JTextField monthText;
    private JTextField yearText;
    private JSeparator separator;
    private JButton homeButton;

    public DateCPanel(ActionListener listener){
        setMinimumSize(new Dimension(358,565));
        setMaximumSize(new Dimension(358,565));
        setPreferredSize(new Dimension(358,565));
        setBackground(new Color(0x9A9A9A));
        initComponents(listener);
    }

    public void initComponents(ActionListener listener) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        introLabel = new JLabel("<html> <body>Seleccione una <br> fecha de reserva");
        introLabel.setFont(new Font("Regular", Font.PLAIN, 32));
        introLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        add(introLabel, gbc);

        dayLabel = new JLabel("Day: ");
        dayLabel.setFont(new Font("Regular", Font.PLAIN, 32));
        dayLabel.setForeground(Color.white);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        add(dayLabel, gbc);

        dayText = new JTextField(10);
        dayText.setBackground(new Color(0xD9D9D9));
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(dayText, gbc);

        monthLabel = new JLabel("Month: ");
        monthLabel.setFont(new Font("Regular", Font.PLAIN, 32));
        monthLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(monthLabel, gbc);

        monthText = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(monthText,gbc);

        yearLabel = new JLabel("Year: ");
        yearLabel.setFont(new Font("Regular", Font.PLAIN, 32));
        yearLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(yearLabel, gbc);

        yearText = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(yearText, gbc);

        separator = new JSeparator(SwingConstants.VERTICAL);
        separator.setMinimumSize(new Dimension(10,153));
        separator.setMaximumSize(new Dimension(10,153));
        separator.setPreferredSize(new Dimension(10,153));
        separator.setBackground(new Color(253, 253, 253, 0));
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(separator, gbc);

        homeButton = new JButton("Home");
        homeButton.setBorderPainted(false);
        homeButton.setFocusPainted(false);
        homeButton.setActionCommand("Home");
        homeButton.addActionListener(listener);
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(homeButton, gbc);
    }
}
