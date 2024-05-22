/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cabsharingcj;

import hib.dto.EmployeeFeedbackForm;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author HP
 */
public class FeedbackWindow extends javax.swing.JFrame {

    /**
     * Creates new form HomeEmployeeWindow
     */
    public FeedbackWindow() {
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

        jOptionPane1 = new javax.swing.JOptionPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLab2 = new javax.swing.JLabel();
        jLab6 = new javax.swing.JLabel();
        jLab1 = new javax.swing.JLabel();
        jLab3 = new javax.swing.JLabel();
        jLab4 = new javax.swing.JLabel();
        jLab5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLab2.setBackground(new java.awt.Color(255, 255, 255));
        jLab2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_user_25px.png"))); // NOI18N
        jLab2.setText("Profile");
        jLab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab2MouseClicked(evt);
            }
        });
        jPanel2.add(jLab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 140, 50));

        jLab6.setBackground(new java.awt.Color(255, 255, 255));
        jLab6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout_25px.png"))); // NOI18N
        jLab6.setText("Exit");
        jLab6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab6MouseClicked(evt);
            }
        });
        jPanel2.add(jLab6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 140, 50));

        jLab1.setBackground(new java.awt.Color(255, 255, 255));
        jLab1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_25px.png"))); // NOI18N
        jLab1.setText("Home");
        jLab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab1MouseClicked(evt);
            }
        });
        jPanel2.add(jLab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, 50));

        jLab3.setBackground(new java.awt.Color(255, 255, 255));
        jLab3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phone_25px.png"))); // NOI18N
        jLab3.setText("Contact");
        jLab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab3MouseClicked(evt);
            }
        });
        jPanel2.add(jLab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 140, 50));

        jLab4.setBackground(new java.awt.Color(255, 255, 255));
        jLab4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form_25px.png"))); // NOI18N
        jLab4.setText("Feedback");
        jLab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab4MouseClicked(evt);
            }
        });
        jPanel2.add(jLab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, 50));

        jLab5.setBackground(new java.awt.Color(255, 255, 255));
        jLab5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complaint_25px.png"))); // NOI18N
        jLab5.setText("Complain");
        jLab5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab5MouseClicked(evt);
            }
        });
        jPanel2.add(jLab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 140, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 480));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Employee Id / CabID");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, -1));

        jLabel10.setText("Feedback");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 66, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 240, 30));

        jRadioButton1.setText("POOR");
        jPanel5.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jRadioButton2.setText("Average");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 70, -1));

        jRadioButton3.setText("Excellent");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, 40));

        jRadioButton4.setText("jRadioButton4");
        jPanel5.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        jRadioButton5.setText("GOOD");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 70, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Send");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 100, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 240, 30));

        jLabel13.setText("Full Name");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 66, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 550, 340));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("We value your feedback");

        jLabel2.setText("please complete form below .");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close_20px.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 110));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 700, 34));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 690, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab1MouseClicked
      new  HomeEmployeeWindow().setVisible(true);
      dispose();
    }//GEN-LAST:event_jLab1MouseClicked

    private void jLab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab2MouseClicked
      new ProfileEmployeeWindow().setVisible(true);
      dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_jLab2MouseClicked

    private void jLab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab3MouseClicked
      new ContactWindow().setVisible(true);
      dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jLab3MouseClicked

    private void jLab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab4MouseClicked
      new FeedbackWindow().setVisible(true);
      dispose();
       // TODO add your handling code here:
    }//GEN-LAST:event_jLab4MouseClicked

    private void jLab6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab6MouseClicked
      new LoginWindow2().setVisible(true);
      dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLab6MouseClicked

    private void jLab5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab5MouseClicked
           new ComplainWindow().setVisible(true);    
           dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLab5MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    
  JOptionPane.showMessageDialog(null,"DONE!!");
   new HomeEmployeeWindow().setVisible(true);
        //     JOptionPane.showMessageDialog(null, "Invalid id/password");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            
         String eid = jTextField3.getText();
         String fname = jTextField5.getText();
         String radio = " ";
         if(jRadioButton1.isSelected())
             radio = "POOR";
         if(jRadioButton2.isSelected())
             radio = "Average";     
         if(jRadioButton5.isSelected())
             radio = "Good";
         if(jRadioButton3.isSelected())
             radio = "Excellent";  
         ButtonGroup bg = new ButtonGroup();
         bg.add(jRadioButton1);      
         bg.add(jRadioButton2);       
         bg.add(jRadioButton5);        
         bg.add(jRadioButton3);
         SessionFactory sf = new Configuration().configure().buildSessionFactory() ;
         Session session=sf.openSession();
         Transaction tx=session.beginTransaction();
         EmployeeFeedbackForm eff = new EmployeeFeedbackForm(eid, fname, radio);
         session.save(eff);
         tx.commit();
         
  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FeedbackWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedbackWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedbackWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedbackWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FeedbackWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLab1;
    private javax.swing.JLabel jLab2;
    private javax.swing.JLabel jLab3;
    private javax.swing.JLabel jLab4;
    private javax.swing.JLabel jLab5;
    private javax.swing.JLabel jLab6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
