
package modelos;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Estetica {
    public static int nuevoTextPub(JPanel publicacion, int y) {
        JPanel panelPublicacion = new JPanel();
        panelPublicacion.setSize(600, 300);
        panelPublicacion.setLocation(150, y);
        //panelPublicacion.setBackground(color);
        int locY = (int) panelPublicacion.getY() + panelPublicacion.getHeight() + 10;

        publicacion.setPreferredSize(new Dimension(publicacion.getWidth(),
                locY));
        publicacion.add(panelPublicacion);

        System.out.println(locY);
        return locY;
    }
    
}