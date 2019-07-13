package gui;

import datos.Publicacion;
import logica.Controlador;
import modelos.Estetica;

public class PanelPublicacion extends javax.swing.JPanel {

    public PanelPublicacion(Publicacion publicacion) {
        initComponents();
        datosPublicacion(publicacion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo.setText("Título");

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(237, 191, 23));
        lblCategoria.setText("Etiqueta");

        lblFecha.setBackground(new java.awt.Color(255, 255, 255));
        lblFecha.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(175, 175, 175));
        lblFecha.setText("Fecha");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCategoria)
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFecha))
                    .addComponent(lblTitulo))
                .addContainerGap(416, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lblCategoria)
                    .addComponent(jSeparator1))
                .addContainerGap(173, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void datosPublicacion(Publicacion pub) {
        String titulo = pub.getTitulo();
        lblTitulo.setText(titulo);
        String categoria = pub.getCategoria().getNombre();
        lblCategoria.setText(categoria);
        String fecha = pub.getFecha().toString();
        lblFecha.setText(fecha);
        Estetica.formatoFechaPublicacion(lblFecha);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
