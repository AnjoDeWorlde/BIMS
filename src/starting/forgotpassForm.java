package starting;

import com.formdev.flatlaf.FlatLightLaf;
import config.dbConnector;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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

    Color origColor = new Color(255,255,255);
    Color enterColor = new Color(204,204,255);
    
    private boolean checkUsernameAndContactNumber(String username, String cNum, String usernameDB, long contactNumberDB) {
        if (!cNum.equals(String.valueOf(contactNumberDB))) {
            System.out.println("Nonexistent Contact Number!");
            lblmessage3.setText("Nonexistent Contact Number!");
            txtcontactnumber.setText("");
            return false;
        }
        if (!username.equals(usernameDB)) {
            System.out.println("Nonexistent Username!");
            lblmessage2.setText("Nonexistent Username!");
            txtusername.setText("");
            return false;
        } 
        return true;
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel background = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        lblreset1 = new javax.swing.JLabel();
        lblmessage1 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        lblmessage2 = new javax.swing.JLabel();
        txtcontactnumber = new javax.swing.JTextField();
        lblcontactnumber = new javax.swing.JLabel();
        lblmessage3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lblusername = new javax.swing.JLabel();
        reset = new javax.swing.JPanel();
        lblreset2 = new javax.swing.JLabel();
        lblmessage4 = new javax.swing.JLabel();
        lblmessage5 = new javax.swing.JLabel();
        lblbackground = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        diagonal1 = new javax.swing.JLabel();
        diagonal2 = new javax.swing.JLabel();
        diagonal3 = new javax.swing.JLabel();
        diagonal4 = new javax.swing.JLabel();
        bubble7 = new javax.swing.JLabel();
        bubble2 = new javax.swing.JLabel();
        bubble3 = new javax.swing.JLabel();
        bubble1 = new javax.swing.JLabel();
        bubble9 = new javax.swing.JLabel();
        bubble10 = new javax.swing.JLabel();
        bubble11 = new javax.swing.JLabel();
        rlogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        background.setLayout(null);

        form.setBackground(new java.awt.Color(255, 255, 255));
        form.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblreset1.setFont(new java.awt.Font("Candara", 1, 50)); // NOI18N
        lblreset1.setForeground(new java.awt.Color(46, 49, 146));
        lblreset1.setText("eset");
        form.add(lblreset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, -1));

        lblmessage1.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage1.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 170, 30));

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtemail.setForeground(new java.awt.Color(46, 49, 146));
        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        form.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 330, 30));

        lblemail.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        lblemail.setForeground(new java.awt.Color(46, 49, 146));
        lblemail.setText("E-mail:");
        form.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 50, 30));

        lblmessage2.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage2.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 170, 30));

        txtcontactnumber.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtcontactnumber.setForeground(new java.awt.Color(46, 49, 146));
        txtcontactnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactnumberActionPerformed(evt);
            }
        });
        form.add(txtcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 330, 30));

        lblcontactnumber.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        lblcontactnumber.setForeground(new java.awt.Color(46, 49, 146));
        lblcontactnumber.setText("Contact Number:");
        form.add(lblcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

        lblmessage3.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage3.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 170, 30));

        txtusername.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtusername.setForeground(new java.awt.Color(46, 49, 146));
        txtusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        form.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 330, 30));

        lblusername.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        lblusername.setForeground(new java.awt.Color(46, 49, 146));
        lblusername.setText("Username:");
        form.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 120, 30));

        reset.setBackground(new java.awt.Color(255, 255, 255));
        reset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
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

        lblreset2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        lblreset2.setForeground(new java.awt.Color(46, 49, 146));
        lblreset2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblreset2.setText("R  E  S  E  T");
        reset.add(lblreset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        form.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 140, 40));

        lblmessage4.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage4.setForeground(new java.awt.Color(255, 0, 0));
        form.add(lblmessage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 130, 30));

        lblmessage5.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage5.setForeground(new java.awt.Color(255, 0, 0));
        form.add(lblmessage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 130, 30));

        lblbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        lblbackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        form.add(lblbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 460));

        background.add(form);
        form.setBounds(120, 50, 570, 460);

        back.setFont(new java.awt.Font("Candara", 1, 10)); // NOI18N
        back.setForeground(new java.awt.Color(46, 49, 146));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("BACK");
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        background.add(back);
        back.setBounds(20, 20, 40, 30);

        diagonal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        background.add(diagonal1);
        diagonal1.setBounds(80, 30, 100, 110);

        diagonal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        background.add(diagonal2);
        diagonal2.setBounds(-10, 430, 100, 100);

        diagonal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        background.add(diagonal3);
        diagonal3.setBounds(-70, 150, 100, 100);

        diagonal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        background.add(diagonal4);
        diagonal4.setBounds(80, 300, 100, 100);

        bubble7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 35.png"))); // NOI18N
        background.add(bubble7);
        bubble7.setBounds(70, 180, 50, 40);

        bubble2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        background.add(bubble2);
        bubble2.setBounds(100, 410, 50, 40);

        bubble3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        background.add(bubble3);
        bubble3.setBounds(20, 300, 50, 40);

        bubble1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 50.png"))); // NOI18N
        background.add(bubble1);
        bubble1.setBounds(0, 50, 50, 50);

        bubble9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        background.add(bubble9);
        bubble9.setBounds(440, 10, 25, 25);

        bubble10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        background.add(bubble10);
        bubble10.setBounds(570, 10, 25, 25);

        bubble11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        background.add(bubble11);
        bubble11.setBounds(300, 10, 25, 25);

        rlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo1_orig25.jpg"))); // NOI18N
        background.add(rlogo);
        rlogo.setBounds(10, 60, 120, 100);

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
            System.out.println("All fields are required!");
            lblmessage1.setText("***");
            lblmessage2.setText("***");
            lblmessage3.setText("***");
        } else {
            dbConnector dbc = new dbConnector();
            try {
                String query = "SELECT * FROM tbl_user WHERE u_email = ?";
                PreparedStatement statement = dbc.prepareStatement(query);
                statement.setString(1, txtemail.getText());
                ResultSet emailResultSet = statement.executeQuery();
                if (emailResultSet.next()) {     
                    long contactNumberDB = emailResultSet.getLong("u_contactnumber");
                    String usernameDB = emailResultSet.getString("u_username");
                    if (checkUsernameAndContactNumber(txtusername.getText(), cNum, usernameDB, contactNumberDB)) {
                        String updateQuery = "UPDATE tbl_user SET u_status = 'Reset' WHERE u_email = ?";
                        PreparedStatement updateStatement = dbc.prepareStatement(updateQuery);
                        updateStatement.setString(1, txtemail.getText());
                        updateStatement.executeUpdate();
                        System.out.println("Account's Password Reset!");
                        loginForm lgf = new loginForm();
                        lgf.setVisible(true);
                        this.dispose();
                    }
                } else {
                    System.out.println("Nonexistent Email!");
                    txtemail.setText("");
                    txtcontactnumber.setText("");
                    txtusername.setText("");
                    lblmessage1.setText("Nonexistent Email!");
                }
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_resetMouseClicked

    private void resetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseEntered
        reset.setBackground(enterColor);
    }//GEN-LAST:event_resetMouseEntered

    private void resetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseExited
        reset.setBackground(origColor);
    }//GEN-LAST:event_resetMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        System.out.println("Go Back!");
        loginForm lgf = new loginForm();
        lgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( UnsupportedLookAndFeelException ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new forgotpassForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel bubble1;
    private javax.swing.JLabel bubble10;
    private javax.swing.JLabel bubble11;
    private javax.swing.JLabel bubble2;
    private javax.swing.JLabel bubble3;
    private javax.swing.JLabel bubble7;
    private javax.swing.JLabel bubble9;
    private javax.swing.JLabel diagonal1;
    private javax.swing.JLabel diagonal2;
    private javax.swing.JLabel diagonal3;
    private javax.swing.JLabel diagonal4;
    private javax.swing.JPanel form;
    private javax.swing.JLabel lblbackground;
    private javax.swing.JLabel lblcontactnumber;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblmessage1;
    private javax.swing.JLabel lblmessage2;
    private javax.swing.JLabel lblmessage3;
    private javax.swing.JLabel lblmessage4;
    private javax.swing.JLabel lblmessage5;
    private javax.swing.JLabel lblreset1;
    private javax.swing.JLabel lblreset2;
    private javax.swing.JLabel lblusername;
    private javax.swing.JPanel reset;
    private javax.swing.JLabel rlogo;
    private javax.swing.JTextField txtcontactnumber;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}