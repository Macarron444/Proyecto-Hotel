package co.edu.uptc.view.baseView.reservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DateRPanel extends JPanel{
    private JLabel introLabel;
    private JLabel dayLabel;
    private JLabel monthLabel;
    private JLabel yearLabel;
    private JTextField dayText;
    private JTextField monthText;
    private JTextField yearText;
    private JSeparator separator;
    private JButton searchButton;
    private JButton homeButton;

    public DateRPanel(ActionListener listener){
        setMinimumSize(new Dimension(358,565));
        setMaximumSize(new Dimension(358,565));
        setPreferredSize(new Dimension(358,565));
        setBackground(new Color(0x9A9A9A));
        initComponents(listener);
    }

    public void initComponents(ActionListener listener) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        introLabel = new JLabel("<html> <body> Seleccione una <br> fecha de reserva </body> </html>");
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

        searchButton = new JButton("Search");
        searchButton.setActionCommand("search");
        searchButton.addActionListener(listener);
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(searchButton, gbc);

        separator = new JSeparator(SwingConstants.VERTICAL);
        separator.setMinimumSize(new Dimension(10,153));
        separator.setMaximumSize(new Dimension(10,153));
        separator.setPreferredSize(new Dimension(10,153));
        separator.setBackground(new Color(253, 253, 253, 0));
        separator.setForeground(new Color(0,0,0,0));
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(separator, gbc);

        homeButton = new JButton("Home");
        homeButton.setBorderPainted(false);
        homeButton.setFocusPainted(false);
        homeButton.setActionCommand("Home");
        homeButton.addActionListener(listener);
        gbc.gridx = 0;
        gbc.gridy = 6;
        add(homeButton, gbc);
    }

    public String getDayText(){
        return dayText.getText();
    }

    public String getMonthText(){
        return monthText.getText();
    }

    public String getYearText(){
        return yearText.getText();
    }
}
