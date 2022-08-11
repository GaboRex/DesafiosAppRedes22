/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.aplicationsockets1.desafio2;

import java.io.DataOutputStream;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gabon
 */
public class Client extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form ServerPantalla
     */
    public Client() {
        initComponents();
         Thread hilo = new Thread(this);
        hilo.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        verde_btn = new javax.swing.JButton();
        azul_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        negro_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("MENU");

        verde_btn.setBackground(new java.awt.Color(0, 102, 0));
        verde_btn.setForeground(new java.awt.Color(255, 255, 255));
        verde_btn.setText("VERDE");
        verde_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verde_btnMouseClicked(evt);
            }
        });
        verde_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verde_btnActionPerformed(evt);
            }
        });

        azul_btn.setBackground(new java.awt.Color(0, 0, 51));
        azul_btn.setForeground(new java.awt.Color(255, 255, 255));
        azul_btn.setText("AZUL");
        azul_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                azul_btnMouseClicked(evt);
            }
        });
        azul_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azul_btnActionPerformed(evt);
            }
        });

        jLabel2.setText("¿Cual te gusta mas?");

        negro_btn.setBackground(new java.awt.Color(0, 0, 0));
        negro_btn.setForeground(new java.awt.Color(255, 255, 255));
        negro_btn.setText("NEGRO");
        negro_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                negro_btnMouseClicked(evt);
            }
        });
        negro_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negro_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(verde_btn)
                .addGap(68, 68, 68)
                .addComponent(negro_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(azul_btn)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verde_btn)
                    .addComponent(azul_btn)
                    .addComponent(negro_btn))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verde_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verde_btnMouseClicked
        try{
            Socket socket = new Socket("127.0.0.1", 6666);
            // clase para poder enviar datos
            DataOutputStream enviarColor = new DataOutputStream(socket.getOutputStream());
            
            enviarColor.writeUTF("verde");
            
            socket.close();
                    
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_verde_btnMouseClicked

    private void verde_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verde_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verde_btnActionPerformed

    private void azul_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azul_btnActionPerformed

    }//GEN-LAST:event_azul_btnActionPerformed

    private void azul_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_azul_btnMouseClicked
          try{
            Socket socket = new Socket("127.0.0.1", 6666);
            // clase para poder enviar datos
            DataOutputStream enviarColor = new DataOutputStream(socket.getOutputStream());
            
            enviarColor.writeUTF("azul");
            
            socket.close();
                    
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_azul_btnMouseClicked

    private void negro_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negro_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_negro_btnActionPerformed

    private void negro_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_negro_btnMouseClicked
        try{
            Socket socket = new Socket("127.0.0.1", 6666);
            // clase para poder enviar datos
            DataOutputStream enviarColor = new DataOutputStream(socket.getOutputStream());
            
            enviarColor.writeUTF("negro");
            
            socket.close();
                    
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_negro_btnMouseClicked

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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton azul_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton negro_btn;
    private javax.swing.JButton verde_btn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
