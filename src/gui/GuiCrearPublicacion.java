/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import datos.Categoria;
import datos.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import modelos.Estetica;
import modelos.TextPrompt;

public class GuiCrearPublicacion extends javax.swing.JFrame {

    public GuiCrearPublicacion() {
        initComponents();
        deshabilitar();
        setLocationRelativeTo(null);
        setResizable(false);
        txtDescripcion.setLineWrap(true);

        TextPrompt placeHolder1 = new TextPrompt("Título de la publicación", txtTitulo);
        TextPrompt placeHolder2 = new TextPrompt("Descripción de la publicación", txtDescripcion);
        btnAdjuntar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/adjuntar1.png")));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/recursos/img/logoremit.png")).getImage());
    }

    public void deshabilitar() {
        this.btnAdjuntar.setEnabled(false);
        this.btnRemit.setEnabled(false);
        this.txtDescripcion.setEnabled(false);
        this.txtTitulo.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngBotones = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rbtTutoria = new javax.swing.JRadioButton();
        rbtGrupoEstudio = new javax.swing.JRadioButton();
        rbtEventoE = new javax.swing.JRadioButton();
        rbtVentaServicio = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnAdjuntar = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        btnRemit = new javax.swing.JButton();
        lblArchivo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Remit");

        jPanel3.setBackground(new java.awt.Color(4, 154, 201));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Crear publicación");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(308, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(271, 271, 271))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Selecciona la categoría:");

        btngBotones.add(rbtTutoria);
        rbtTutoria.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rbtTutoria.setText("Tutoría");
        rbtTutoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtTutoriaActionPerformed(evt);
            }
        });

        btngBotones.add(rbtGrupoEstudio);
        rbtGrupoEstudio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rbtGrupoEstudio.setText("Grupo de estudio autonomo");
        rbtGrupoEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtGrupoEstudioActionPerformed(evt);
            }
        });

        btngBotones.add(rbtEventoE);
        rbtEventoE.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rbtEventoE.setText("Evento Estudiantil");
        rbtEventoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtEventoEActionPerformed(evt);
            }
        });

        btngBotones.add(rbtVentaServicio);
        rbtVentaServicio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rbtVentaServicio.setText("Venta y/o Servicio");
        rbtVentaServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtVentaServicioActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        btnAdjuntar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAdjuntar.setText("   Adjuntar imagen");
        btnAdjuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarActionPerformed(evt);
            }
        });

        btnCancelar1.setBackground(new java.awt.Color(51, 153, 255));
        btnCancelar1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        btnRemit.setBackground(new java.awt.Color(255, 204, 0));
        btnRemit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnRemit.setText("Remit");
        btnRemit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitulo)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAdjuntar)
                        .addGap(386, 386, 386)
                        .addComponent(lblArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCancelar1)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemit)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rbtTutoria)
                        .addGap(74, 74, 74)
                        .addComponent(rbtGrupoEstudio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtEventoE)
                        .addGap(81, 81, 81)
                        .addComponent(rbtVentaServicio)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtTutoria)
                    .addComponent(rbtGrupoEstudio)
                    .addComponent(rbtEventoE)
                    .addComponent(rbtVentaServicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemit)
                            .addComponent(btnCancelar1)
                            .addComponent(btnAdjuntar))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemitActionPerformed
        if ((txtTitulo.getText()).equals("") || (txtDescripcion.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacíos", "Error",
                JOptionPane.ERROR_MESSAGE, (new ImageIcon(getClass().getResource("/recursos/img/x.png"))));
        } else {
            Date fecha = new Date();
            Usuario usuario = new Usuario("a", "a", "a", true);
            if (lblArchivo.getText().equals("")) {
                usuario.agregar(setCategoria(), usuario, fecha, txtTitulo.getText(),
                    txtDescripcion.getText());
            } else {
                usuario.agregarPubImg(setCategoria(), usuario, fecha, txtTitulo.getText(),
                    txtDescripcion.getText(), lblArchivo.getText());
            }
        }
    }//GEN-LAST:event_btnRemitActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        String[] opciones = {"Si", "No"};
        int opcion = JOptionPane.showOptionDialog(null, "¿Estás seguro de cancelar la publicación?"
            + "\nTodos los datos insertados en los campos serán eliminados", "Cancelar publicación", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
            (new ImageIcon("x.png")), opciones, opciones[0]);
        if (opcion == 0) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnAdjuntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarActionPerformed
        JFileChooser escogerArch = new JFileChooser();
        escogerArch.setDialogTitle("Selecciona una imagen");
        escogerArch.setDragEnabled(false);
        escogerArch.setMultiSelectionEnabled(false);
        int retorno = escogerArch.showSaveDialog(escogerArch);
        File archivo = escogerArch.getSelectedFile();
        if (retorno == JFileChooser.APPROVE_OPTION) {
            lblArchivo.setText(archivo.getName());
            File guardar = new File(archivo.getName());
            FileOutputStream escritor = null;
            FileInputStream lector = null;
            try {
                lector = new FileInputStream(archivo);
                escritor = new FileOutputStream(guardar);
                byte[] almacenadorBytes = new byte[1024];
                int lectorBytes;
                while ((lectorBytes = lector.read(almacenadorBytes)) > 0) {
                    escritor.write(almacenadorBytes, 0, lectorBytes);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GuiCrearPublicacion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GuiCrearPublicacion.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    lector.close();
                    escritor.close();
                } catch (IOException ex) {
                    Logger.getLogger(GuiCrearPublicacion.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_btnAdjuntarActionPerformed

    private void rbtVentaServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtVentaServicioActionPerformed
        habilitar();
    }//GEN-LAST:event_rbtVentaServicioActionPerformed

    private void rbtEventoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEventoEActionPerformed
        habilitar();
    }//GEN-LAST:event_rbtEventoEActionPerformed

    private void rbtGrupoEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtGrupoEstudioActionPerformed
        habilitar();
    }//GEN-LAST:event_rbtGrupoEstudioActionPerformed

    private void rbtTutoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtTutoriaActionPerformed
        habilitar();
    }//GEN-LAST:event_rbtTutoriaActionPerformed
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

    public void habilitar() {
        this.btnAdjuntar.setEnabled(true);
        this.btnRemit.setEnabled(true);
        this.txtDescripcion.setEnabled(true);
        this.txtTitulo.setEnabled(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        Estetica.lookAndFeel();
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiCrearPublicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdjuntar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnRemit;
    private javax.swing.ButtonGroup btngBotones;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblArchivo;
    private javax.swing.JRadioButton rbtEventoE;
    private javax.swing.JRadioButton rbtGrupoEstudio;
    private javax.swing.JRadioButton rbtTutoria;
    private javax.swing.JRadioButton rbtVentaServicio;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
