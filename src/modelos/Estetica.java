package modelos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Estetica {

    public static ArrayList<Component> componentesEntrantes;
    public static ArrayList<Component> botonesMostrar;
    public static ArrayList<Component> botonesOcultar;
    
    public void logoVentana (JFrame ventana){
        ventana.setIconImage(new ImageIcon(getClass().getResource("/recursos/img/logoremit.png")).getImage());
        ventana.setTitle("Remit");
    }

    public static void habDeshabComponentes(ArrayList<Component> componentes, boolean estado) {
        componentesEntrantes = componentes;
        for (Component comp : componentesEntrantes) {
            comp.setEnabled(estado);
        }
    }
    
    public static ImageIcon mensajeCheck (){
        String [] boton = {"Ok"};
        ImageIcon icono = new ImageIcon("./src/recursos/img/check.png");
        JOptionPane.showMessageDialog(null, "Publicación creada éxitosamente", "Publicación creada", 
                JOptionPane.DEFAULT_OPTION,icono);
        return icono;
    }
    
    public static ImageIcon mensajeCamposVacios (){
        String [] boton = {"Ok"};
        ImageIcon icono = new ImageIcon("./src/recursos/img/x.png");
        JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacíos", "Error",
                    JOptionPane.ERROR_MESSAGE, icono);
        return icono;
    }
    
    
    public void logoImagen (JLabel label,String imagen){
        ImageIcon foto = new ImageIcon(getClass().getResource("/./recursos/"+imagen));
        Icon icono = new ImageIcon(foto.getImage().getScaledInstance(label.getWidth(),
                label.getHeight(), Image.SCALE_SMOOTH));
        label.setIcon(icono);
    }

    public static void mostrarOcultarBotones(boolean opcion) {
        ArrayList<Component> componentes = botonesOcultar;
        boolean estado = false;
        if (opcion) {
            componentes = botonesMostrar;
            estado = true;
        }
        for (Component comp : componentes) {
            comp.setVisible(estado);
        }
    }

    public static void mostrarOcultarBotones(ArrayList<Component> componentes1, ArrayList<Component> componentes2) {
        for (Component comp : componentes1) {
            comp.setVisible(true);
        }
        for (Component comp : componentes2) {
            comp.setVisible(false);
        }
    }
    public static void mostrarOcultarComponente(Component componente, boolean estado){
        componente.setVisible(estado);
    }
    public static JLabel labelTemp= null;
    public static void mostrarOcultarComponente(JLabel componente,String texto, boolean estado){
        labelTemp = componente;
        componente.setText(texto);
        componente.setVisible(estado);
    }
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
        boton.setBorderPainted(false);
        panel.setBorder(BorderFactory.createLineBorder(color2, 1));
    }

    public static void botonMouseSuelto(JPanel panel, JButton boton, int r1, int g1, int b1, int r2, int g2, int b2) {
        Color color1 = new java.awt.Color(r1, g1, b1);
        Color color2 = new java.awt.Color(r2, g2, b2);
        panel.setBackground(color1);
        boton.setForeground(color2);
        boton.setBorderPainted(false);
    }

    public static void formatoFechaVentana(JLabel label) {
        Date fecha = new Date();
        SimpleDateFormat formatoEs = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy", new Locale("ES", "MX"));
        label.setText(formatoEs.format(fecha).toUpperCase());
    }

    public static void formatoFechaPublicacion(JLabel label, Date fecha) {
        SimpleDateFormat formatoEs = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy 'a las' HH:mm a", new Locale("ES", "MX"));
        label.setText(formatoEs.format(fecha).toUpperCase());
    }

}
