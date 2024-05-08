package starting;

import config.dbConnector;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DERECHO
 */
public class forgotpassForm extends javax.swing.JFrame {

    /**
     * Creates new form forgotpassForm
     */
    public forgotpassForm() {
        initComponents();
    }

    Color navColor = new Color(204,204,204);
    Color enterColor = new Color(46,49,146);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel background = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        lblreset1 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtcontactnumber = new javax.swing.JTextField();
        lblcontactnumber = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lblusername = new javax.swing.JLabel();
        reset = new javax.swing.JPanel();
        lblreset2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(0, 174, 239));
        background.setLayout(null);

        form.setBackground(new java.awt.Color(255, 255, 255));
        form.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 3));
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblreset1.setFont(new java.awt.Font("Candara", 1, 50)); // NOI18N
        lblreset1.setForeground(new java.awt.Color(46, 49, 146));
        lblreset1.setText("Reset");
        form.add(lblreset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 130, 60));

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        form.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 230, 30));

        lblemail.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblemail.setText("E-mail:");
        form.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 110, 30));

        txtcontactnumber.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtcontactnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactnumberActionPerformed(evt);
            }
        });
        form.add(txtcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 230, 30));

        lblcontactnumber.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblcontactnumber.setText("Contact Number:");
        form.add(lblcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 110, 30));

        txtusername.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        form.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 230, 30));

        lblusername.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblusername.setText("Username:");
        form.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 110, 30));

        reset.setBackground(new java.awt.Color(255, 255, 255));
        reset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetMouseExited(evt);
            }
        });
        reset.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblreset2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblreset2.setForeground(new java.awt.Color(46, 49, 146));
        lblreset2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblreset2.setText("R  E  S  E  T");
        reset.add(lblreset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        form.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 140, 40));

        back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back.setForeground(new java.awt.Color(46, 49, 146));
        back.setText("BACK");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        form.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo1_orig.jpg"))); // NOI18N
        form.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 440, 270));

        background.add(form);
        form.setBounds(80, 60, 550, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtcontactnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactnumberActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        String cNum = txtcontactnumber.getText();
        if(txtemail.getText().isEmpty() || txtusername.getText().isEmpty() || cNum.isEmpty()) {
            System.out.println("Empty Text Field!");
            JOptionPane.showMessageDialog(null, "All fields are required!");
        } else {
            dbConnector dbc = new dbConnector();
            try {
                String query = "SELECT * FROM tbl_user WHERE u_email = ?";
                PreparedStatement statement = dbc.prepareStatement(query);
                statement.setString(1, txtemail.getText());
                ResultSet emailResultSet = statement.executeQuery();
                if (emailResultSet.next()) {
                    String usernameDB = emailResultSet.getString("u_username");
                    long contactNumberDB = emailResultSet.getLong("u_contactnumber");
                    if (txtusername.getText().equals(usernameDB) && cNum.equals(String.valueOf(contactNumberDB))) {
                        String updateQuery = "UPDATE tbl_user SET u_status = 'Reset' WHERE u_email = ?";
                        PreparedStatement updateStatement = dbc.prepareStatement(updateQuery);
                        updateStatement.setString(1, txtemail.getText());
                        updateStatement.executeUpdate();
                        System.out.println("Account's Password Reset!");
                        JOptionPane.showMessageDialog(null, "Reset Successfully, wait for the admin to approve!");
                        loginForm lgf = new loginForm();
                        lgf.setVisible(true);
                        this.dispose();
                    } else {
                        System.out.println("Information Mismatch!");
                        JOptionPane.showMessageDialog(null, "Information does not match existing records!");
                    }
                } else {
                    System.out.println("Email does not exist in the database!");
                    JOptionPane.showMessageDialog(null, "Email does not exist in the database!");
                }
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_resetMouseClicked

    private void resetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseEntered
        reset.setBackground(enterColor);
    }//GEN-LAST:event_resetMouseEntered

    private void resetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseExited
        reset.setBackground(navColor);
    }//GEN-LAST:event_resetMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        System.out.println("Login Returned!");
        loginForm lgf = new loginForm();
        lgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotpassForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new forgotpassForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel form;
    private javax.swing.JLabel lblcontactnumber;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblreset1;
    private javax.swing.JLabel lblreset2;
    private javax.swing.JLabel lblusername;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel reset;
    private javax.swing.JTextField txtcontactnumber;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}