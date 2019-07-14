/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import datos.Categoria;
import datos.Publicacion;
import datos.Usuario;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelos.Estetica;
import modelos.TextPrompt;

public class GuiCrearPublicacion extends javax.swing.JFrame {

    Date fecha = new Date();
    Usuario user = (new Usuario("a", "a", "a", "a", true));
    Publicacion pub = new Publicacion((new Categoria("Tutoria", 01)), user,
            fecha, "Tengo que pasar el parcial de calculo", "Tas tas tas");
    boolean pop = false;

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

    public GuiCrearPublicacion(Publicacion pub) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        lblTituloPanel.setText("Editar publicación");
        txtDescripcion.setLineWrap(true);
        btnAdjuntar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/adjuntar1.png")));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/recursos/img/logoremit.png")).getImage());
        txtTitulo.setText(pub.getTitulo());
        txtDescripcion.setText(pub.getDescripcion());
        if (pub.getCategoria().getNombre().equals("Tutoría") || pub.getCategoria().getNombre().equals("Tutoria")) {
            rbtTutoria.setSelected(true);
        } else if (pub.getCategoria().getNombre().equals(rbtEventoE.getText())) {
            rbtEventoE.setSelected(true);
        } else if (pub.getCategoria().getNombre().equals(rbtGrupoEstudio.getText())) {
            rbtGrupoEstudio.setSelected(true);
        } else if (pub.getCategoria().getNombre().equals(rbtVentaServicio.getText())) {
            rbtVentaServicio.setSelected(true);
        }
    }

    public void deshabilitar() {
        this.btnAdjuntar.setEnabled(false);
        this.btnRemit.setEnabled(false);
        this.txtDescripcion.setEnabled(false);
        this.txtTitulo.setEnabled(false);
        this.jPanelRemit.setBackground(Color.LIGHT_GRAY);
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
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblTituloPanel = new javax.swing.JLabel();
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
        lblArchivo = new javax.swing.JLabel();
        jPanelRemit = new javax.swing.JPanel();
        btnRemit = new javax.swing.JButton();
        jPanelCancelar = new javax.swing.JPanel();
        btnCancelar1 = new javax.swing.JButton();
        jPanelCancelar1 = new javax.swing.JPanel();
        btnAdjuntar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Remit");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(4, 154, 201));

        lblTituloPanel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloPanel.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloPanel.setText("Crear publicación");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloPanel)
                .addGap(279, 279, 279))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloPanel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Selecciona la categoría:");

        btngBotones.add(rbtTutoria);
        rbtTutoria.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rbtTutoria.setText("Tutoría");
        rbtTutoria.setContentAreaFilled(false);
        rbtTutoria.setFocusPainted(false);
        rbtTutoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtTutoriaActionPerformed(evt);
            }
        });

        btngBotones.add(rbtGrupoEstudio);
        rbtGrupoEstudio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rbtGrupoEstudio.setText("Grupo de estudio autonomo");
        rbtGrupoEstudio.setContentAreaFilled(false);
        rbtGrupoEstudio.setFocusPainted(false);
        rbtGrupoEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtGrupoEstudioActionPerformed(evt);
            }
        });

        btngBotones.add(rbtEventoE);
        rbtEventoE.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rbtEventoE.setText("Evento Estudiantil");
        rbtEventoE.setContentAreaFilled(false);
        rbtEventoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtEventoEActionPerformed(evt);
            }
        });

        btngBotones.add(rbtVentaServicio);
        rbtVentaServicio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rbtVentaServicio.setText("Venta y/o Servicio");
        rbtVentaServicio.setContentAreaFilled(false);
        rbtVentaServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtVentaServicioActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        jPanelRemit.setBackground(new java.awt.Color(237, 191, 23));
        jPanelRemit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelRemit.setPreferredSize(new java.awt.Dimension(63, 25));
        jPanelRemit.setLayout(null);

        btnRemit.setBackground(new java.awt.Color(255, 204, 0));
        btnRemit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnRemit.setText("Remit");
        btnRemit.setBorderPainted(false);
        btnRemit.setContentAreaFilled(false);
        btnRemit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemit.setFocusPainted(false);
        btnRemit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRemitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRemitMouseReleased(evt);
            }
        });
        btnRemit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemitActionPerformed(evt);
            }
        });
        jPanelRemit.add(btnRemit);
        btnRemit.setBounds(0, 0, 63, 24);

        jPanelCancelar.setBackground(new java.awt.Color(86, 198, 229));
        jPanelCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelCancelar.setPreferredSize(new java.awt.Dimension(79, 25));
        jPanelCancelar.setLayout(null);

        btnCancelar1.setBackground(new java.awt.Color(109, 207, 252));
        btnCancelar1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCancelar1.setText("Cancelar");
        btnCancelar1.setBorderPainted(false);
        btnCancelar1.setContentAreaFilled(false);
        btnCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar1.setFocusPainted(false);
        btnCancelar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelar1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelar1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelar1MouseReleased(evt);
            }
        });
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        jPanelCancelar.add(btnCancelar1);
        btnCancelar1.setBounds(0, 0, 78, 24);

        jPanelCancelar1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCancelar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelCancelar1.setPreferredSize(new java.awt.Dimension(130, 30));
        jPanelCancelar1.setLayout(null);

        btnAdjuntar.setBackground(new java.awt.Color(0, 0, 0));
        btnAdjuntar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAdjuntar.setText("   Adjuntar imagen");
        btnAdjuntar.setBorderPainted(false);
        btnAdjuntar.setContentAreaFilled(false);
        btnAdjuntar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdjuntar.setFocusPainted(false);
        btnAdjuntar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdjuntarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdjuntarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAdjuntarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAdjuntarMouseReleased(evt);
            }
        });
        btnAdjuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarActionPerformed(evt);
            }
        });
        jPanelCancelar1.add(btnAdjuntar);
        btnAdjuntar.setBounds(0, 0, 160, 40);

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
                        .addGap(10, 10, 10)
                        .addComponent(jPanelCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelRemit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rbtTutoria)
                        .addGap(74, 74, 74)
                        .addComponent(rbtGrupoEstudio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
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
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanelRemit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelCancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanelCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
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
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG, JPEG, PNG & GIF", "png",
                "jpeg", "jpg", "gif");
        escogerArch.setFileFilter(filtro);
        escogerArch.setDialogTitle("Selecciona una imagen");
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
                escritor = new FileOutputStream("./src/recursos/imgpublicaciones/" + guardar);
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

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Estetica.habDeshabComponentes(Estetica.componentesEntrantes, true);
    }//GEN-LAST:event_formWindowClosed

    private void btnRemitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemitActionPerformed
        if ((txtTitulo.getText()).equals("") || (txtDescripcion.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacíos", "Error",
                    JOptionPane.ERROR_MESSAGE, (new ImageIcon(getClass().getResource("/recursos/img/x.png"))));
        } else {
            Date fecha = new Date();
            Usuario usuario = new Usuario("a", "a", "a", "a", true);
            if (lblArchivo.getText().equals("")) {
                usuario.agregar(setCategoria(), usuario, fecha, txtTitulo.getText(),
                        txtDescripcion.getText());
                this.dispose();
            } else {
                usuario.agregar(setCategoria(), usuario, fecha, txtTitulo.getText(),
                        txtDescripcion.getText(), lblArchivo.getText());
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnRemitActionPerformed

    private void btnRemitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemitMouseEntered
        if (pop) {
            jPanelRemit.setBackground(new java.awt.Color(237, 179, 14));
        }
    }//GEN-LAST:event_btnRemitMouseEntered

    private void btnRemitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemitMouseExited
        if (pop) {
            jPanelRemit.setBackground(new java.awt.Color(237, 191, 23));
        }
    }//GEN-LAST:event_btnRemitMouseExited

    private void btnRemitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemitMousePressed
        if (pop) {
            Estetica.botonMousePresionado(jPanelRemit, btnRemit, 255, 255, 255, 0, 0, 0);
        }
    }//GEN-LAST:event_btnRemitMousePressed

    private void btnRemitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemitMouseReleased
        if (pop) {
            Estetica.botonMousePresionado(jPanelRemit, btnRemit, 237, 191, 23, 0, 0, 0);
        }
    }//GEN-LAST:event_btnRemitMouseReleased

    private void btnCancelar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar1MouseEntered
        jPanelCancelar.setBackground(new java.awt.Color(86, 173, 220));
    }//GEN-LAST:event_btnCancelar1MouseEntered

    private void btnCancelar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar1MouseExited
        jPanelCancelar.setBackground(new java.awt.Color(86, 198, 229));
    }//GEN-LAST:event_btnCancelar1MouseExited

    private void btnCancelar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar1MousePressed
        Estetica.botonMousePresionado(jPanelCancelar, btnCancelar1, 255, 255, 255, 0, 0, 0);
    }//GEN-LAST:event_btnCancelar1MousePressed

    private void btnCancelar1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar1MouseReleased
        Estetica.botonMousePresionado(jPanelCancelar, btnCancelar1, 86, 198, 229, 0, 0, 0);
    }//GEN-LAST:event_btnCancelar1MouseReleased

    private void btnAdjuntarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdjuntarMouseEntered
        if (pop) {
            jPanelCancelar1.setBackground(new java.awt.Color(217, 217, 217));
        }
    }//GEN-LAST:event_btnAdjuntarMouseEntered

    private void btnAdjuntarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdjuntarMouseExited
        if (pop) {
            jPanelCancelar1.setBackground(Color.white);
        }
    }//GEN-LAST:event_btnAdjuntarMouseExited

    private void btnAdjuntarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdjuntarMousePressed
        if (pop) {
            Estetica.botonMousePresionado(jPanelCancelar1, btnAdjuntar, 200, 200, 200, 0, 0, 0); 
        }
    }//GEN-LAST:event_btnAdjuntarMousePressed

    private void btnAdjuntarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdjuntarMouseReleased
        if (pop) {
            Estetica.botonMousePresionado(jPanelCancelar1, btnAdjuntar, 255, 255, 255, 0, 0, 0);
        }
    }//GEN-LAST:event_btnAdjuntarMouseReleased
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
        this.jPanelRemit.setBackground(new java.awt.Color(237, 191, 23));
        pop = true;
    }

    /**
     * @param args the command line arguments
     */
    public static void llamaCrearPublicacion() {
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

    public void llamaEditarPublicacion() {
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
            java.util.logging.Logger.getLogger(GuiCrearPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCrearPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCrearPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCrearPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new GuiCrearPublicacion(pub).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdjuntar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnRemit;
    private javax.swing.ButtonGroup btngBotones;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelCancelar;
    private javax.swing.JPanel jPanelCancelar1;
    private javax.swing.JPanel jPanelRemit;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblArchivo;
    private javax.swing.JLabel lblTituloPanel;
    private javax.swing.JRadioButton rbtEventoE;
    private javax.swing.JRadioButton rbtGrupoEstudio;
    private javax.swing.JRadioButton rbtTutoria;
    private javax.swing.JRadioButton rbtVentaServicio;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
