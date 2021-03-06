/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import datenverwaltung.Register;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Rinoy Manavalan
 */
public class Registrieren extends javax.swing.JFrame {

    /**
     * Creates new form Registrieren
     */
    private Register register;

    public Registrieren() throws ClassNotFoundException, SQLException {
        initComponents();
        register = new Register();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel2 = new javax.swing.JLabel();
        jTFUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFVorname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFJahrenachgeburt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFAdresse = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTFName = new javax.swing.JTextField();
        jPFPasswort = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Username:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel2, gridBagConstraints);

        jTFUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUsernameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.1;
        gridBagConstraints.weighty = 1.1;
        getContentPane().add(jTFUsername, gridBagConstraints);

        jLabel3.setText("Vorname:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.1;
        gridBagConstraints.weighty = 1.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 1, 1);
        getContentPane().add(jTFVorname, gridBagConstraints);

        jLabel4.setText("Alter:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.1;
        gridBagConstraints.weighty = 1.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 1, 1);
        getContentPane().add(jTFJahrenachgeburt, gridBagConstraints);

        jLabel5.setText("Adresse:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.1;
        gridBagConstraints.weighty = 1.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 1, 1);
        getContentPane().add(jTFAdresse, gridBagConstraints);

        jLabel6.setText("Passwort:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jLabel6, gridBagConstraints);

        jButton1.setText("Registrieren");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        getContentPane().add(jButton1, gridBagConstraints);

        jLabel1.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel1, gridBagConstraints);

        jTFName.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.1;
        gridBagConstraints.weighty = 1.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 1, 1);
        getContentPane().add(jTFName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.1;
        gridBagConstraints.weighty = 1.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 1, 1);
        getContentPane().add(jPFPasswort, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUsernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            String pwd = new String(jPFPasswort.getPassword());
            int alter = Integer.parseInt(jTFJahrenachgeburt.getText());
            register.doRegister(jTFUsername.getText(), jTFName.getText(), jTFVorname.getText(), alter, jTFAdresse.getText(), pwd);
            LoginGUI login = new LoginGUI();
            login.setTitle("Login");
            login.setVisible(true);
            login.setBounds(500, 500, 400, 250);
            login.setResizable(false);
            login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registrieren.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("FAIL 1");
        } catch (SQLException ex) {
            System.out.println("FAIL 2");
            Logger.getLogger(Registrieren.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registrieren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrieren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrieren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrieren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Registrieren().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Registrieren.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Registrieren.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPFPasswort;
    private javax.swing.JTextField jTFAdresse;
    private javax.swing.JTextField jTFJahrenachgeburt;
    private javax.swing.JTextField jTFName;
    private javax.swing.JTextField jTFUsername;
    private javax.swing.JTextField jTFVorname;
    // End of variables declaration//GEN-END:variables
}
