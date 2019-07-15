package gui;

import datos.Categoria;
import datos.Publicacion;
import datos.Usuario;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.Controlador;
import modelos.Estetica;

public class PanelPublicacionUsuario extends javax.swing.JPanel {

        Date fecha = new Date();
    Usuario user = (new Usuario("a", "a", "a", "a", true));
    Publicacion pub = new Publicacion((new Categoria("Tutoria", 01)), user,
            fecha, "Tengo que pasar el parcial de calculo", "Tas tas tas");

    public PanelPublicacionUsuario(Publicacion publicacion) {
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
        jSeparator2 = new javax.swing.JSeparator();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

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

        btnEditar.setBackground(new java.awt.Color(51, 153, 255));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(51, 153, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCategoria)
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFecha)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(414, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(28, 28, 28))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        GuiCrearPublicacion editar = new GuiCrearPublicacion(pub);
        editar.llamaEditarPublicacion();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        user.eliminar(pub);
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void datosPublicacion(Publicacion pub) {
        String titulo = pub.getTitulo();
        lblTitulo.setText(titulo);
        String categoria = pub.getCategoria().getNombre();
        lblCategoria.setText(categoria);
        String fecha = pub.getFecha().toString();
        lblFecha.setText(fecha);
        //Estetica.formatoFechaPublicacion(lblFecha,);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
