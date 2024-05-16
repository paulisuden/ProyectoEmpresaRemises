/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uncuyo.proyecto.view;

import com.uncuyo.proyecto.controller.ClienteController;
import com.uncuyo.proyecto.controller.ReservaController;
import com.uncuyo.proyecto.model.Cliente;
import com.uncuyo.proyecto.model.Reserva;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author spaul
 */
public class ReservaFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public ReservaFrame(MainFrame mainframe) {
        initComponents();
        this.mainframe = mainframe;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        mendozaRemis = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        txtDniC = new javax.swing.JTextField();
        txtCelularC = new javax.swing.JTextField();
        txtUbicacionC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFechaR = new javax.swing.JTextField();
        txtHoraR = new javax.swing.JTextField();
        txtDestinoR = new javax.swing.JTextField();
        btFinalizarReserva = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        jLabel6.setText("Destino:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mendozaRemis.setText("MENDOZA REMIS");

        jLabel1.setText("Realizá tu reserva aquí");

        jLabel2.setText("Nombre y apelido:");

        jLabel3.setText("DNI:");

        jLabel4.setText("Celular:");

        jLabel5.setText("Origen");

        txtNombreC.setText("Ingresa tu nombre");
        txtNombreC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreCMouseClicked(evt);
            }
        });
        txtNombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCActionPerformed(evt);
            }
        });

        txtDniC.setText("Ingresa tu DNI");
        txtDniC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDniCMouseClicked(evt);
            }
        });

        txtCelularC.setText("Ingresa tu celular");
        txtCelularC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCelularCMouseClicked(evt);
            }
        });
        txtCelularC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularCActionPerformed(evt);
            }
        });

        txtUbicacionC.setText("Ingresa tu ubicación origen");
        txtUbicacionC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUbicacionCMouseClicked(evt);
            }
        });
        txtUbicacionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionCActionPerformed(evt);
            }
        });

        jLabel7.setText("Destino:");

        jLabel8.setText("Fecha:");

        jLabel9.setText("Hora:");

        txtFechaR.setText("AAAA/MM/DD");
        txtFechaR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaRMouseClicked(evt);
            }
        });
        txtFechaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaRActionPerformed(evt);
            }
        });

        txtHoraR.setText("HH:MM");
        txtHoraR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHoraRMouseClicked(evt);
            }
        });
        txtHoraR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraRActionPerformed(evt);
            }
        });

        txtDestinoR.setText("Ingresa el destino");
        txtDestinoR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDestinoRMouseClicked(evt);
            }
        });
        txtDestinoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinoRActionPerformed(evt);
            }
        });

        btFinalizarReserva.setText("Finalizar reserva");
        btFinalizarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFinalizarReservaMouseClicked(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(mendozaRemis, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDniC)
                                    .addComponent(txtNombreC)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCelularC)
                                    .addComponent(txtUbicacionC)
                                    .addComponent(txtDestinoR)
                                    .addComponent(txtFechaR)
                                    .addComponent(txtHoraR))))))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(btFinalizarReserva)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mendozaRemis)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDniC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCelularC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUbicacionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDestinoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txtFechaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtHoraR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFinalizarReserva)
                    .addComponent(btCancelar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCActionPerformed

    private void txtCelularCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularCActionPerformed

    private void txtUbicacionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionCActionPerformed

    private void txtDestinoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinoRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinoRActionPerformed

    private void txtFechaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaRActionPerformed

    private void txtHoraRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraRActionPerformed

    private void btFinalizarReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFinalizarReservaMouseClicked

        String nombre = txtNombreC.getText();
        String dni = txtDniC.getText();
        String ubicacion = txtUbicacionC.getText();
        String celular = txtCelularC.getText();
        String destino = txtDestinoR.getText();
        String fecha = txtFechaR.getText();
        String hora = txtHoraR.getText();
        

        long cod_cliente = reservactrl.ultimoCodReserva();
        long cod_reserva = clientectrl.ultimoCodCliente();
        
        Cliente cliente = mainframe.setDatosCliente(nombre, dni, celular, ubicacion,cod_cliente);
        mainframe.setDatosReserva(destino, fecha, hora, cod_reserva, cod_cliente, cliente);
        //System.out.println("Reserva finalizada! Su codigo es: );
        
        this.dispose();
    }//GEN-LAST:event_btFinalizarReservaMouseClicked

    private void btCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseClicked
        this.dispose(); 
    }//GEN-LAST:event_btCancelarMouseClicked

    private void txtNombreCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreCMouseClicked
        txtNombreC.setText("");
    }//GEN-LAST:event_txtNombreCMouseClicked

    private void txtDniCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDniCMouseClicked
        txtDniC.setText("");
    }//GEN-LAST:event_txtDniCMouseClicked

    private void txtHoraRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHoraRMouseClicked
        txtHoraR.setText("");
    }//GEN-LAST:event_txtHoraRMouseClicked

    private void txtFechaRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaRMouseClicked
        txtFechaR.setText("");
    }//GEN-LAST:event_txtFechaRMouseClicked

    private void txtDestinoRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDestinoRMouseClicked
        txtDestinoR.setText("");
    }//GEN-LAST:event_txtDestinoRMouseClicked

    private void txtUbicacionCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUbicacionCMouseClicked
        txtUbicacionC.setText("");
    }//GEN-LAST:event_txtUbicacionCMouseClicked

    private void txtCelularCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCelularCMouseClicked
        txtCelularC.setText("");
    }//GEN-LAST:event_txtCelularCMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame mainFrame = new MainFrame();
                ReservaFrame reserva = new ReservaFrame(mainFrame);
                reserva.setVisible(true);
                reserva.setLocationRelativeTo(null);
            }
        });
    }
    
    private final ReservaController reservactrl = new ReservaController();
    private final ClienteController clientectrl= new ClienteController();
    private MainFrame mainframe;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFinalizarReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mendozaRemis;
    private javax.swing.JTextField txtCelularC;
    private javax.swing.JTextField txtDestinoR;
    private javax.swing.JTextField txtDniC;
    private javax.swing.JTextField txtFechaR;
    private javax.swing.JTextField txtHoraR;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtUbicacionC;
    // End of variables declaration//GEN-END:variables
}
