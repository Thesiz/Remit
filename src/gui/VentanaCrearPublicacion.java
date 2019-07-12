package gui;

import datos.Categoria;
import datos.Publicacion;
import datos.Usuario;
import java.io.File;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import logica.Controlador;
import modelos.TextPrompt;

public class VentanaCrearPublicacion extends javax.swing.JFrame {

    public VentanaCrearPublicacion() {
        initComponents();
        deshabilitar();
        setLocationRelativeTo(null);
        setResizable(false);
        
        TextPrompt placeHolder1 = new TextPrompt ("Título de la publicación", txtTitulo);
        TextPrompt placeHolder2 = new TextPrompt ("Descripción de la publicación", txtDescripcion);

        //setIconImage (new ImageIcon (getClass().getResource("logoremit.png")).getImage());
    }

    public void deshabilitar() {
        this.btnAdjuntar.setEnabled(false);
        this.btnRemit.setEnabled(false);
        this.txtDescripcion.setEnabled(false);
        this.txtTitulo.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtgBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbtEventoE = new javax.swing.JRadioButton();
        rbtTutoria = new javax.swing.JRadioButton();
        rbtGrupoEstudio = new javax.swing.JRadioButton();
        rbtVentaServicio = new javax.swing.JRadioButton();
        txtTitulo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnAdjuntar = new javax.swing.JButton();
        btnRemit = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Remit");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear una publicación", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 17))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Selecciona la categoría: ");

        rbtgBotones.add(rbtEventoE);
        rbtEventoE.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        rbtEventoE.setText("Evento estudiantil");
        rbtEventoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtEventoEActionPerformed(evt);
            }
        });

        rbtgBotones.add(rbtTutoria);
        rbtTutoria.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        rbtTutoria.setText("Tutoría");
        rbtTutoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtTutoriaActionPerformed(evt);
            }
        });

        rbtgBotones.add(rbtGrupoEstudio);
        rbtGrupoEstudio.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        rbtGrupoEstudio.setText("Grupo de estudio autonomo");
        rbtGrupoEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtGrupoEstudioActionPerformed(evt);
            }
        });

        rbtgBotones.add(rbtVentaServicio);
        rbtVentaServicio.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        rbtVentaServicio.setText("Venta y/o servicio");
        rbtVentaServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtVentaServicioActionPerformed(evt);
            }
        });

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        btnAdjuntar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iu/adjuntar1.png"))); // NOI18N
        btnAdjuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarActionPerformed(evt);
            }
        });

        btnRemit.setBackground(new java.awt.Color(4, 126, 179));
        btnRemit.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnRemit.setForeground(new java.awt.Color(255, 255, 255));
        btnRemit.setText("Remit");
        btnRemit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemitActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(237, 191, 23));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDescripcion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtTutoria)
                                .addGap(58, 58, 58)
                                .addComponent(rbtEventoE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(rbtGrupoEstudio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtVentaServicio))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdjuntar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(449, 449, 449)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemit))
                    .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(117, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtGrupoEstudio)
                        .addComponent(rbtVentaServicio))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtEventoE)
                        .addComponent(rbtTutoria)))
                .addGap(12, 12, 12)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdjuntar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRemit)
                                    .addComponent(btnCancelar))))))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(214, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        String[] opciones = {"Si", "No"};
        int opcion = JOptionPane.showOptionDialog(null, "¿Estás seguro de cancelar la publicación?"
            + "\nTodos los datos insertados en los campos serán eliminados", "Cancelar publicación", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
            (new ImageIcon("x.png")), opciones, opciones[0]);
        if (opcion == 0) {
            this.setVisible(false);
        }

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRemitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemitActionPerformed
        Date fecha = new Date();
        Publicacion publicacion = new Publicacion(setCategoria(), usuarioAct(null), fecha, txtTitulo.getText(),
            txtDescripcion.getText());
        Controlador.listaPublicaciones.add(publicacion);
        System.out.println(Controlador.listaPublicaciones);
    }//GEN-LAST:event_btnRemitActionPerformed

    private void btnAdjuntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarActionPerformed
        JFileChooser escogerArch = new JFileChooser();
        JPanel panelArch = new JPanel();
        int seleccion = escogerArch.showOpenDialog(panelArch);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(".jpg", ".png", ".gif", ".jpeg");
        escogerArch.setFileFilter(filtro);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = escogerArch.getSelectedFile();
        }
    }//GEN-LAST:event_btnAdjuntarActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void rbtVentaServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtVentaServicioActionPerformed
        this.btnAdjuntar.setEnabled(true);
        this.btnRemit.setEnabled(true);
        this.txtDescripcion.setEnabled(true);
        this.txtTitulo.setEnabled(true);
    }//GEN-LAST:event_rbtVentaServicioActionPerformed

    private void rbtGrupoEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtGrupoEstudioActionPerformed
        this.btnAdjuntar.setEnabled(true);
        this.btnRemit.setEnabled(true);
        this.txtDescripcion.setEnabled(true);
        this.txtTitulo.setEnabled(true);
    }//GEN-LAST:event_rbtGrupoEstudioActionPerformed

    private void rbtTutoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtTutoriaActionPerformed
        this.btnAdjuntar.setEnabled(true);
        this.btnRemit.setEnabled(true);
        this.txtDescripcion.setEnabled(true);
        this.txtTitulo.setEnabled(true);
    }//GEN-LAST:event_rbtTutoriaActionPerformed

    private void rbtEventoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEventoEActionPerformed
        this.btnAdjuntar.setEnabled(true);
        this.btnRemit.setEnabled(true);
        this.txtDescripcion.setEnabled(true);
        this.txtTitulo.setEnabled(true);
    }//GEN-LAST:event_rbtEventoEActionPerformed

    public Categoria setCategoria() {
        Categoria categoria = null;
        if (rbtEventoE.isSelected()) {
            categoria = new Categoria(this.rbtEventoE.getText(), 03);
        } else if (rbtTutoria.isSelected()) {
            categoria = new Categoria("Evento Estudiantil", 01);
        } else if (rbtGrupoEstudio.isSelected()) {
            categoria = new Categoria("Grupo de estudio autonomo", 04);
        } else if (rbtVentaServicio.isSelected()) {
            categoria = new Categoria("Venta y/o servicio", 05);
        }
        return categoria;
    }

    public Usuario usuarioAct(Usuario usuario) {
        return usuario;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCrearPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrearPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrearPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrearPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCrearPublicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdjuntar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRemit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rbtEventoE;
    private javax.swing.JRadioButton rbtGrupoEstudio;
    private javax.swing.JRadioButton rbtTutoria;
    private javax.swing.JRadioButton rbtVentaServicio;
    private javax.swing.ButtonGroup rbtgBotones;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
