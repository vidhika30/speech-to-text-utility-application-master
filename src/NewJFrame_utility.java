
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

//import VoiceLauncher.java;
public class NewJFrame_utility extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame_utility
     */
    public NewJFrame_utility() {
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

        btn_calci = new javax.swing.JButton();
        btn_db = new javax.swing.JButton();
        btn_app = new javax.swing.JButton();
        lbl_welcome = new javax.swing.JLabel();
        lbl_human = new javax.swing.JLabel();
        lbl_siri = new javax.swing.JLabel();
        lbl_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 0));
        setForeground(new java.awt.Color(255, 204, 255));
        getContentPane().setLayout(null);

        btn_calci.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_calci.setForeground(new java.awt.Color(255, 0, 0));
        btn_calci.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\utility\\calculator-icon_small2.jpg")); // NOI18N
        btn_calci.setText(" Calculator");
        btn_calci.setBorder(null);
        btn_calci.setBorderPainted(false);
        btn_calci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calciActionPerformed(evt);
            }
        });
        getContentPane().add(btn_calci);
        btn_calci.setBounds(140, 340, 519, 61);

        btn_db.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_db.setForeground(new java.awt.Color(255, 0, 0));
        btn_db.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\utility\\Database_icon_small2.jpg")); // NOI18N
        btn_db.setText("Fetching from Database");
        btn_db.setMaximumSize(new java.awt.Dimension(519, 61));
        btn_db.setMinimumSize(new java.awt.Dimension(519, 61));
        btn_db.setPreferredSize(new java.awt.Dimension(519, 61));
        btn_db.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dbActionPerformed(evt);
            }
        });
        getContentPane().add(btn_db);
        btn_db.setBounds(144, 256, 519, 61);

        btn_app.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_app.setForeground(new java.awt.Color(255, 0, 0));
        btn_app.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\utility\\application_icon_small1.jpg")); // NOI18N
        btn_app.setText(" Open/close apps");
        btn_app.setMaximumSize(new java.awt.Dimension(519, 61));
        btn_app.setMinimumSize(new java.awt.Dimension(519, 61));
        btn_app.setPreferredSize(new java.awt.Dimension(519, 61));
        btn_app.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_appActionPerformed(evt);
            }
        });
        getContentPane().add(btn_app);
        btn_app.setBounds(140, 170, 519, 61);

        lbl_welcome.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbl_welcome.setText("Welcome to Utility application..!!");
        getContentPane().add(lbl_welcome);
        lbl_welcome.setBounds(144, 34, 957, 44);

        lbl_human.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\utility\\Webp.net-resizeimage (1).png")); // NOI18N
        getContentPane().add(lbl_human);
        lbl_human.setBounds(840, 170, 230, 330);

        lbl_siri.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\utility\\Webp.net-resizeimage (2).png")); // NOI18N
        getContentPane().add(lbl_siri);
        lbl_siri.setBounds(1090, 180, 190, 330);

        lbl_background.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\Color-Codes-Background.jpg")); // NOI18N
        getContentPane().add(lbl_background);
        lbl_background.setBounds(-20, -20, 1420, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dbActionPerformed
        Database db=new Database();
        try {
            db.func();
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame_utility.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_dbActionPerformed

    private void btn_calciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calciActionPerformed
        Calculator c=new Calculator();
        try {
            c.calc();
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame_utility.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_calciActionPerformed

    private void btn_appActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_appActionPerformed
      
        //System.out.println("coming");
        /*app_frame app=new app_frame();
        try {
            app.run();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(NewJFrame_utility.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        VoiceLauncher v=new VoiceLauncher();
        try {
            v.func();
            System.gc();
            
            //NewJFrame_utility.
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame_utility.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_appActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame_utility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame_utility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame_utility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame_utility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame_utility().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_app;
    private javax.swing.JButton btn_calci;
    private javax.swing.JButton btn_db;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_human;
    private javax.swing.JLabel lbl_siri;
    private javax.swing.JLabel lbl_welcome;
    // End of variables declaration//GEN-END:variables
}
