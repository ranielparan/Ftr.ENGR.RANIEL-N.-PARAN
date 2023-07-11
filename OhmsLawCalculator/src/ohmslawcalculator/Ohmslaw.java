/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ohmslawcalculator;

/**
 *
 * @author User
 */
public class Ohmslaw extends javax.swing.JFrame {

    /**
     * Creates new form Ohmslaw
     */
    public Ohmslaw() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        field1 = new javax.swing.JTextField();
        field2 = new javax.swing.JTextField();
        field3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setText("Voltage[V]");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        label2.setText("Current[I]");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        label3.setText("Resistance[Ω}");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field1ActionPerformed(evt);
            }
        });
        getContentPane().add(field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 70, -1));

        field2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field2ActionPerformed(evt);
            }
        });
        getContentPane().add(field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 70, -1));

        field3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field3ActionPerformed(evt);
            }
        });
        getContentPane().add(field3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 70, -1));

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field1ActionPerformed

    private void field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field2ActionPerformed

    private void field3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        calculation cal = new calculation();
        
        if (!field1.getText().equals("") && !field2.getText().equals("")) {
            field3.setText("" +  cal.resistance(field1.getText(), field2.getText(), field3.getText()));
            
        } else if (!field1.getText().equals("") && !field3.getText().equals("")) {
            field2.setText("" +  cal.current(field1.getText(), field2.getText(), field3.getText()));
            
        } else if (!field3.getText().equals("") && !field2.getText().equals("")) {
            field1.setText("" + cal.voltage(field1.getText(), field2.getText(), field3.getText()));
        } else {
            System.out.println("yiuiu");
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
            java.util.logging.Logger.getLogger(Ohmslaw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ohmslaw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ohmslaw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ohmslaw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ohmslaw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField field1;
    public javax.swing.JTextField field2;
    public javax.swing.JTextField field3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    // End of variables declaration//GEN-END:variables
}