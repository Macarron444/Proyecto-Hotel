package co.edu.uptc.view.baseView;

import co.edu.uptc.properties.PropertiesManager;
import co.edu.uptc.view.baseView.cancelation.CancelPanel;
import co.edu.uptc.view.baseView.distribution.DistributionPanel;
import co.edu.uptc.view.baseView.info.InfoDialog;
import co.edu.uptc.view.baseView.info.InfoPanel;
import co.edu.uptc.view.baseView.reservation.ReservationPanel;
import co.edu.uptc.view.baseView.reservation.UserRDialog;
import co.edu.uptc.view.baseView.stats.StatsDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

public class HotelFrame extends JFrame {
    private WelcomePanel welcomePanel;
    private ReservationPanel reservationPanel;
    private CancelPanel cancelPanel;
    private InfoPanel infoPanel;
    private DistributionPanel distributionPanel;
    private UserRDialog userRDialog;
    private InfoDialog infoDialog;
    private StatsDialog statsDialog;
    private PropertiesManager properties;
    public HotelFrame(ActionListener listener) throws IOException {
        properties = new PropertiesManager();
        properties.loader();
        setTitle(properties.hotelFrameTitle());
        setSize(1235,565);
        initComponents(listener);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void initComponents(ActionListener listener) throws IOException {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        welcomePanel = new WelcomePanel(listener);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(welcomePanel,gbc);
        reservationPanel = new ReservationPanel(listener);
        add(reservationPanel,gbc);
        cancelPanel = new CancelPanel(listener);
        add(cancelPanel,gbc);
        infoPanel = new InfoPanel(listener);
        add(infoPanel,gbc);
        distributionPanel = new DistributionPanel(listener);
        add(distributionPanel,gbc);
        userRDialog = new UserRDialog(this, true, listener);
        infoDialog = new InfoDialog(this,true);
        statsDialog = new StatsDialog(this, true, listener);
    }

    public void changePanel(JPanel panel){
        welcomePanel.setVisible(false);
        reservationPanel.setVisible(false);
        cancelPanel.setVisible(false);
        infoPanel.setVisible(false);
        distributionPanel.setVisible(false);
        panel.setVisible(true);
    }

    public WelcomePanel getWelcomePanel() {
        return welcomePanel;
    }

    public ReservationPanel getReservationPanel() {
        return reservationPanel;
    }

    public CancelPanel getCancelPanel() {
        return cancelPanel;
    }

    public InfoPanel getInfoPanel() {
        return infoPanel;
    }

    public DistributionPanel getDistributionPanel() {
        return distributionPanel;
    }

    public String getRDayText(){
        return reservationPanel.getDayText();
    }

    public String getRMonthText(){
        return reservationPanel.getMonthText();
    }

    public String getRYearText(){
        return reservationPanel.getYearText();
    }

    public void showUserRDialog(){
        userRDialog.setVisible(true);
    }

    public void closeDialog() {
        userRDialog.setVisible(false);
    }

    public String getNameText(){
        return userRDialog.getNameText();
    }

    public String getIdText(){
        return userRDialog.getIdText();
    }

    public String getPhoneText(){
        return userRDialog.getPhoneText();
    }
    public void setInfoDialogText(String info){
        infoDialog.setRoomInfo(info);
        infoDialog.setVisible(true);
    }

    public void showStatsDialog(){
        statsDialog.setVisible(true);
    }

    public void setStatsText(String available, String reserved){
        statsDialog.setAvailableText(available);
        statsDialog.setReservedRoomsText(reserved);
    }

    public String getSDayText(){
        return statsDialog.getDayText();
    }

    public String getSMonthText(){
        return statsDialog.getMonthText();
    }

    public String getSYearText(){
        return statsDialog.getYearText();
    }
}
