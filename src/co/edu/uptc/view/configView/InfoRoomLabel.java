package co.edu.uptc.view.configView;

import javax.swing.*;
import java.awt.*;

public class InfoRoomLabel extends JLabel {
    public InfoRoomLabel(String type, int beds, int bathrooms, String price) {
        super();
        this.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        this.setForeground(Color.BLACK);
        this.setText("<html>" +
                "<body>" +
                "<p><b>Tipo de habitacion: </b>" + type + "</p>" +
                "<p><b># Camas: </b>" + beds + "</p>" +
                "<p><b># Baños: </b>" + bathrooms + "</p>" +
                "<p><b>Precio x noche: </b>$" + price + "</p>" +
                "<p><br></p>" +
                "</body>" +
                "</html>"
        );
    }
}
