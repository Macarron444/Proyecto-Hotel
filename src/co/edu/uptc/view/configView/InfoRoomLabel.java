package co.edu.uptc.view.configView;

import javax.swing.*;

public class InfoRoomLabel extends JLabel {
    public InfoRoomLabel(String type, int beds, int bathrooms, String price) {
        super();
        this.setText("<html>" +
                "<body>" +
                "<p>Tipo de habitacion: " + type + "</p>" +
                "<p># Camas: " + beds + "</p>" +
                "<p># Banos: " + bathrooms + "</p>" +
                "<p>Precio x noche: $" + price + "</p>" +
                "<p><br></p>" +
                "</body>" +
                "</html>"
        );
    }
}
