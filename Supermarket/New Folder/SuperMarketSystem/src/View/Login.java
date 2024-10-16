/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LoginController;

/**
 *
 * @author Agnar
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        LabelUname = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        Pwtf = new javax.swing.JPasswordField();
        UsernameTF = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NewULabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userpanel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AdminLlabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(null);

        LabelUname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelUname.setText("Username:");
        jPanel1.add(LabelUname);
        LabelUname.setBounds(157, 173, 110, 30);

        LabelPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LabelPassword.setText("Password:");
        jPanel1.add(LabelPassword);
        LabelPassword.setBounds(157, 223, 110, 28);
        jPanel1.add(Pwtf);
        Pwtf.setBounds(277, 225, 270, 28);

        UsernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTFActionPerformed(evt);
            }
        });
        jPanel1.add(UsernameTF);
        UsernameTF.setBounds(277, 175, 270, 30);

        LoginBtn.setBackground(new java.awt.Color(0, 153, 153));
        LoginBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        LoginBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginBtnKeyPressed(evt);
            }
        });
        jPanel1.add(LoginBtn);
        LoginBtn.setBounds(275, 322, 100, 40);

        CancelBtn.setBackground(new java.awt.Color(0, 153, 153));
        CancelBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CancelBtn);
        CancelBtn.setBounds(411, 322, 100, 40);

        jLabel1.setText("Forget Password ?");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(350, 270, 120, 14);

        NewULabel.setText("Create New Account");
        NewULabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewULabelMouseClicked(evt);
            }
        });
        jPanel1.add(NewULabel);
        NewULabel.setBounds(275, 392, 115, 22);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(393, 322, 0, 0);

        userpanel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        userpanel.setText("User Login");
        jPanel1.add(userpanel);
        userpanel.setBounds(340, 80, 130, 60);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(447, 451, 111, 0);

        AdminLlabel.setText("Admin login");
        AdminLlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminLlabelMouseClicked(evt);
            }
        });
        jPanel1.add(AdminLlabel);
        AdminLlabel.setBounds(275, 425, 115, 22);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\101.jpg")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 750, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        // TODO add your handling code here:
        super.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void LoginBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginBtnKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_LoginBtnKeyPressed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
        LoginController.login(UsernameTF.getText(), Pwtf.getText());
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void UsernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTFActionPerformed

    private void NewULabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewULabelMouseClicked
       AddCashier add  = new AddCashier();
       add.setVisible(true);
       super.dispose();
        
    }//GEN-LAST:event_NewULabelMouseClicked

    private void AdminLlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminLlabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminLlabelMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLlabel;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUname;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel NewULabel;
    private javax.swing.JPasswordField Pwtf;
    private javax.swing.JTextField UsernameTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel userpanel;
    // End of variables declaration//GEN-END:variables
}
