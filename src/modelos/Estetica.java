package modelos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jvnet.substance.SubstanceLookAndFeel;

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

    public static void lookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Estetica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void botonMousePresionado(JPanel panel, JButton boton, int r1, int g1, int b1, int r2, int g2, int b2) {
        Color color1 = new java.awt.Color(r1, g1, b1);
        Color color2 = new java.awt.Color(r2, g2, b2);
        panel.setBackground(color1);
        boton.setForeground(color2);
        boton.setBorderPainted(true);
        boton.setBorder(BorderFactory.createLineBorder(new java.awt.Color(1, 126, 179), 1));
    }

    public static void botonMouseSuelto(JPanel panel, JButton boton, int r1, int g1, int b1, int r2, int g2, int b2) {
        Color color1 = new java.awt.Color(r1, g1, b1);
        Color color2 = new java.awt.Color(r2, g2, b2);
        panel.setBackground(color1);
        boton.setForeground(color2);
        boton.setBorderPainted(false);
    }
    
    public static void formatoFechaVentana (JLabel label){
        Date fecha = new Date();
        SimpleDateFormat formatoEs = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy", new Locale("ES", "MX"));
        label.setText(formatoEs.format(fecha).toUpperCase());
    }
    
    public static void formatoFechaPublicacion (JLabel label){
        Date fecha = new Date();
        SimpleDateFormat formatoEs = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy 'a las' HH:MM", new Locale("ES", "MX"));
        label.setText(formatoEs.format(fecha).toUpperCase());
    }

}
