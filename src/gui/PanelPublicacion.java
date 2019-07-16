package gui;

import datos.Publicacion;
import datos.Usuario;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import logica.Controlador;
import modelos.Estetica;

public class PanelPublicacion extends javax.swing.JPanel {

    public static int tamañoPanel = 0;

    public PanelPublicacion(int tipo, int ancho, int alto, Publicacion publicacion) {
        initComponents();
        if (tipo == 1) {
            tamañoPanel = 120;
        } else if (tipo == 2) {
            tamañoPanel = 330;
        } else {
            if (alto < 350) {
                tamañoPanel = 150 + alto;
            } else {
                tamañoPanel = 500;
            }
        }
        ArrayList<JLabel> labels = datosPublicacion(publicacion);
        for (JLabel label : labels) {
            this.add(label);
        }

        if (tipo != 1) {
            this.add(pintaFoto(tipo, ancho, alto, publicacion));
        }

        JPanel jPanelTexto = pintaDescripcion(tipo, publicacion);
        this.add(jPanelTexto);
        if (tipo == 3) {
            if (jPanelTexto.getHeight() > tamañoPanel - 100) {
                tamañoPanel += (jPanelTexto.getHeight() - (tamañoPanel - 100));
            }
        } else {
            tamañoPanel += jPanelTexto.getHeight();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private JLabel pintaFoto(int tipo, int width, int height, Publicacion pub) {
        int ancho = width, alto = height, x = 100, y = 100;
        if (tipo == 2) {//mas ancha que larga
            if (width > 400) {
                ancho = 400;
            }
            if (height > 200) {
                alto = 200;
            }
            x = 100 + ((400 - ancho) / 2);
            y = 100;
        } else {// mas larga que ancha
            if (width > 200) {
                ancho = 200;
            }
            if (height > 350) {
                alto = 350;
            }
            x = 35 + ((200 - ancho) / 2);
            y = 100;
        }
        JLabel foto = new JLabel();
        foto.setSize(ancho, alto);
        foto.setLocation(x, y);
        foto.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        Estetica logo = new Estetica();
        logo.logoImagen(foto, "imgpublicaciones/" + pub.getNombreImagen());
        return foto;
    }

    private JPanel pintaDescripcion(int tipo, Publicacion pub) {
        String descripcion = pub.getDescripcion();
        JPanel texto = new JPanel();
        ArrayList<JLabel> labels = new ArrayList<>();
        int cantidad = descripcion.length();
        int inicio = 0, fin;
        if (tipo != 3) {
            texto.setSize(550, 1);
            texto.setLocation(25, 300);
            if (tipo == 1) {
                texto.setLocation(25, 100);
            }
            fin = 80;
            while (cantidad > 80 && fin > 0) {
                if (descripcion.charAt(fin - 1) != ' ') {
                    fin -= 1;
                } else {
                    labels.add(new JLabel(descripcion.substring(inicio, fin)));
                    texto.setSize(texto.getWidth(), texto.getHeight() + 29);
                    cantidad -= (fin - inicio);
                    inicio = fin;
                    fin += 80;
                }
            }
            if (cantidad > 70 && fin == 0) {
                inicio = 0;
                fin = 70;
                while (cantidad > 70 && fin > 0) {
                    labels.add(new JLabel(descripcion.substring(inicio, fin)));
                    texto.setSize(texto.getWidth(), texto.getHeight() + 29);
                    cantidad -= (fin - inicio);
                    inicio = fin;
                    fin += 70;
                }
            }
            if (cantidad < 80 && cantidad>0) {
                labels.add(new JLabel(descripcion.substring(inicio)));
                texto.setSize(texto.getWidth(), texto.getHeight() + 29);
            }
        } else {
            texto.setSize(340, 1);
            texto.setLocation(250, 90);
            fin = 49;
            while (cantidad > 49 && fin > 0) {
                if (descripcion.charAt(fin - 1) != ' ') {
                    fin -= 1;
                } else {
                    labels.add(new JLabel(descripcion.substring(inicio, fin)));
                    texto.setSize(texto.getWidth(), texto.getHeight() + 29);
                    cantidad -= (fin - inicio);
                    inicio = fin;
                    fin += 49;
                }
            }
            if (cantidad > 40 && fin == 0) {
                inicio = 0;
                fin = 40;
                while (cantidad > 40 && fin > 0) {
                    labels.add(new JLabel(descripcion.substring(inicio, fin)));
                    texto.setSize(texto.getWidth(), texto.getHeight() + 29);
                    cantidad -= (fin - inicio);
                    inicio = fin;
                    fin += 40;
                }
            }
            labels.add(new JLabel(descripcion.substring(inicio)));
            if (inicio == 0) {
                texto.setSize(texto.getWidth(), texto.getHeight() + 29);
            }
        }
        texto.setBackground(Color.white);
        for (JLabel label : labels) {
            label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            texto.add(label); //Añade los labels al panel
        }
        return texto;
    }

    private ArrayList<JLabel> datosPublicacion(Publicacion pub) {
        ArrayList<JLabel> labels = new ArrayList<>();
        String titulo = pub.getTitulo();
        JLabel lblTitulo = new JLabel();
        if (titulo.length() > 70) {
            lblTitulo.setText(titulo.substring(0, 70));
        } else {
            lblTitulo.setText(titulo);
        }
        String categoria = pub.getCategoria().getNombre();
        JLabel lblCategoria = new JLabel(categoria);
        Date fecha = pub.getFecha();
        JLabel lblFecha = new JLabel();
        Estetica.formatoFechaPublicacion(lblFecha, fecha);
        JLabel lblAutor = new JLabel("SUBIDO POR: @" + pub.getUsuario().getUsuario());
        lblAutor.setSize(200, 22);
        lblAutor.setLocation(300, 5);
        lblAutor.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblAutor.setForeground(new java.awt.Color(175, 175, 175));
        
        lblFecha.setSize(500, 22);
        lblFecha.setLocation(300, 20);
        lblFecha.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblFecha.setForeground(new java.awt.Color(175, 175, 175));

        lblTitulo.setSize(520, 22);
        lblTitulo.setLocation(35, 37);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 16));

        lblCategoria.setSize(500, 22);
        lblCategoria.setLocation(35, 60);
        lblCategoria.setFont(new Font("Segoe UI", Font.ITALIC, 16));
        lblCategoria.setForeground(new java.awt.Color(237, 191, 23));
        
        labels.add(lblAutor);
        labels.add(lblFecha);
        labels.add(lblTitulo);
        labels.add(lblCategoria);
        return labels;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
