/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uncuyo.proyecto.view;

import com.uncuyo.proyecto.controller.ClienteController;
import com.uncuyo.proyecto.controller.ReservaController;
import com.uncuyo.proyecto.model.Cliente;
import com.uncuyo.proyecto.model.Reserva;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author spaul
 */
public class ModificarReserva extends javax.swing.JFrame {

    /**
     * Creates new form ModificarReserva
     */
    public ModificarReserva() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFechaR = new javax.swing.JTextField();
        txtCelularC = new javax.swing.JTextField();
        txtCodR = new javax.swing.JTextField();
        txtDniC = new javax.swing.JTextField();
        txtNombreC = new javax.swing.JTextField();
        txtHoraR = new javax.swing.JTextField();
        txtDestinoR = new javax.swing.JTextField();
        txtUbicacionC = new javax.swing.JTextField();
        btFinalizar = new javax.swing.JButton();
        btAutocompletar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel10.setText("jLabel10");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Modificación de reserva");

        jLabel2.setText("Ingrese el código de reserva:");

        jLabel3.setText("Nombre y apellido:");

        jLabel4.setText("DNI:");

        jLabel5.setText("Celular:");

        jLabel6.setText("Origen:");

        jLabel7.setText("Destino:");

        jLabel8.setText("Fecha:");

        jLabel9.setText("Hora:");

        txtFechaR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaRMouseClicked(evt);
            }
        });

        txtCelularC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCelularCMouseClicked(evt);
            }
        });

        txtCodR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodRMouseClicked(evt);
            }
        });

        txtDniC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDniCMouseClicked(evt);
            }
        });

        txtNombreC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreCMouseClicked(evt);
            }
        });

        txtHoraR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHoraRMouseClicked(evt);
            }
        });

        txtDestinoR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDestinoRMouseClicked(evt);
            }
        });

        txtUbicacionC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUbicacionCMouseClicked(evt);
            }
        });

        btFinalizar.setText("Finalizar");
        btFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFinalizarMouseClicked(evt);
            }
        });

        btAutocompletar.setText("Autocompletar datos");
        btAutocompletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAutocompletarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoraR, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(txtFechaR)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDestinoR)
                            .addComponent(txtUbicacionC)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCelularC)
                            .addComponent(txtDniC)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodR)
                            .addComponent(txtNombreC))))
                .addGap(26, 26, 26)
                .addComponent(btAutocompletar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(btFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(244, 244, 244))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAutocompletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtDniC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCelularC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUbicacionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDestinoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtFechaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtHoraR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btFinalizar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFinalizarMouseClicked
        //buscar si existe el codigo de reserva, y sino, mandar un mensaje
        String cod_reservaS = txtCodR.getText();
        String nombre = txtNombreC.getText();
        String dni = txtDniC.getText();
        String ubicacion = txtUbicacionC.getText();
        String celular = txtCelularC.getText();
        String destino = txtDestinoR.getText();
        String fecha = txtFechaR.getText();
        String hora = txtHoraR.getText();
        
        //Cambiar a su tipo:
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaReserva = LocalDate.parse(fecha, dateFormatter);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaReserva = LocalTime.parse(hora, timeFormatter);
        
        long cod_reserva = Long.parseLong(cod_reservaS);
        
        Reserva reserva = new Reserva(cod_reserva, destino, fechaReserva, horaReserva);
        Cliente cliente;
        cliente = reservactrl.modificarReserva(reserva);
        
        cliente.setCelular(celular);
        cliente.setNombre(nombre);
        cliente.setDni(dni);
        cliente.setUbicacion(ubicacion);
        clientectrl.modificarCliente(cliente);

        this.dispose();
    }//GEN-LAST:event_btFinalizarMouseClicked

    private void txtCodRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodRMouseClicked

    private void txtNombreCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCMouseClicked

    private void txtDniCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDniCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniCMouseClicked

    private void txtCelularCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCelularCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularCMouseClicked

    private void txtUbicacionCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUbicacionCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionCMouseClicked

    private void txtDestinoRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDestinoRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinoRMouseClicked

    private void txtFechaRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaRMouseClicked

    private void txtHoraRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHoraRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraRMouseClicked

    private void btAutocompletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAutocompletarMouseClicked
        //String cod_reservaS = txtCodR.getText();
        //verificarExistencia(cod_reservaS);
    }//GEN-LAST:event_btAutocompletarMouseClicked

    //public Boolean verificarExistencia(cod_reservaS) {} 
    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarReserva().setVisible(true);
            }
        });
    }

    private final ReservaController reservactrl = new ReservaController();
    private final ClienteController clientectrl= new ClienteController();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAutocompletar;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtCelularC;
    private javax.swing.JTextField txtCodR;
    private javax.swing.JTextField txtDestinoR;
    private javax.swing.JTextField txtDniC;
    private javax.swing.JTextField txtFechaR;
    private javax.swing.JTextField txtHoraR;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtUbicacionC;
    // End of variables declaration//GEN-END:variables
}
