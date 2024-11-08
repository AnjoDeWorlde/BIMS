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
            txtcontactnumber.setText("Nonexistent Contact Number!");
            return false;
        }
        if (!username.equals(usernameDB)) {
            System.out.println("Nonexistent Username!");
            txtusername.setText("Nonexistent Username!");
            return false;
        } 
        return true;
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel background = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
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
        logo = new javax.swing.JLabel();
        lblbackground = new javax.swing.JLabel();
        side = new javax.swing.JPanel();
        diagonal1 = new javax.swing.JLabel();
        diagonal4 = new javax.swing.JLabel();
        bubble1 = new javax.swing.JLabel();
        diagonal2 = new javax.swing.JLabel();
        bubble3 = new javax.swing.JLabel();
        bubble5 = new javax.swing.JLabel();
        bubble6 = new javax.swing.JLabel();
        bubble8 = new javax.swing.JLabel();
        diagonal6 = new javax.swing.JLabel();
        bubble12 = new javax.swing.JLabel();
        bubble13 = new javax.swing.JLabel();
        bubble14 = new javax.swing.JLabel();
        bubble15 = new javax.swing.JLabel();
        diagonal3 = new javax.swing.JLabel();
        diagoonal4 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        top = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        bubble9 = new javax.swing.JLabel();
        bubble10 = new javax.swing.JLabel();
        bubble16 = new javax.swing.JLabel();
        bubble17 = new javax.swing.JLabel();
        bubble18 = new javax.swing.JLabel();
        bubble19 = new javax.swing.JLabel();
        bubble20 = new javax.swing.JLabel();
        bubble21 = new javax.swing.JLabel();
        diagoonal5 = new javax.swing.JLabel();
        diagoonal6 = new javax.swing.JLabel();
        diagoonal7 = new javax.swing.JLabel();
        diagoonal8 = new javax.swing.JLabel();
        diagoonal9 = new javax.swing.JLabel();
        diagoonal10 = new javax.swing.JLabel();
        bubble11 = new javax.swing.JLabel();
        bubble22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        background.setLayout(null);

        form.setBackground(new java.awt.Color(255, 255, 255));
        form.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblmessage1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage1.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 160, 40));

        txtemail.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtemail.setForeground(new java.awt.Color(46, 49, 146));
        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        form.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 330, 40));

        lblemail.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblemail.setForeground(new java.awt.Color(46, 49, 146));
        lblemail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblemail.setText("E-mail:");
        form.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 170, 40));

        lblmessage2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage2.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 160, 40));

        txtcontactnumber.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtcontactnumber.setForeground(new java.awt.Color(46, 49, 146));
        txtcontactnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactnumberActionPerformed(evt);
            }
        });
        form.add(txtcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 330, 40));

        lblcontactnumber.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblcontactnumber.setForeground(new java.awt.Color(46, 49, 146));
        lblcontactnumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblcontactnumber.setText("Contact Number:");
        form.add(lblcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 280, 170, 40));

        lblmessage3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage3.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 160, 40));

        txtusername.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtusername.setForeground(new java.awt.Color(46, 49, 146));
        txtusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        form.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 330, 40));

        lblusername.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblusername.setForeground(new java.awt.Color(46, 49, 146));
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblusername.setText("Username:");
        form.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 170, 40));

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

        lblreset2.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        lblreset2.setForeground(new java.awt.Color(46, 49, 146));
        lblreset2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblreset2.setText("R  E  S  E  T");
        reset.add(lblreset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 20));

        form.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 150, 40));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logooo4.png"))); // NOI18N
        form.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 180));

        lblbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        lblbackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        form.add(lblbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-510, -320, 1310, 890));

        background.add(form);
        form.setBounds(160, 100, 800, 570);

        side.setBackground(new java.awt.Color(255, 255, 255));
        side.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        side.setLayout(null);

        diagonal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        side.add(diagonal1);
        diagonal1.setBounds(80, 130, 100, 100);

        diagonal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        side.add(diagonal4);
        diagonal4.setBounds(90, 590, 100, 100);

        bubble1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 50.png"))); // NOI18N
        side.add(bubble1);
        bubble1.setBounds(0, 350, 50, 50);

        diagonal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        side.add(diagonal2);
        diagonal2.setBounds(-40, -30, 100, 100);

        bubble3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 35.png"))); // NOI18N
        side.add(bubble3);
        bubble3.setBounds(60, 60, 40, 40);

        bubble5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        side.add(bubble5);
        bubble5.setBounds(120, 20, 30, 30);

        bubble6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 50.png"))); // NOI18N
        side.add(bubble6);
        bubble6.setBounds(0, 120, 50, 50);

        bubble8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 50.png"))); // NOI18N
        side.add(bubble8);
        bubble8.setBounds(0, 580, 50, 50);

        diagonal6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        side.add(diagonal6);
        diagonal6.setBounds(-40, 440, 100, 100);

        bubble12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 35.png"))); // NOI18N
        side.add(bubble12);
        bubble12.setBounds(70, 530, 40, 40);

        bubble13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 35.png"))); // NOI18N
        side.add(bubble13);
        bubble13.setBounds(70, 290, 40, 40);

        bubble14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        side.add(bubble14);
        bubble14.setBounds(140, 470, 30, 30);

        bubble15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        side.add(bubble15);
        bubble15.setBounds(130, 250, 30, 30);

        diagonal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        side.add(diagonal3);
        diagonal3.setBounds(-40, 200, 100, 100);

        diagoonal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        side.add(diagoonal4);
        diagoonal4.setBounds(90, 360, 100, 100);

        back.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        back.setForeground(new java.awt.Color(46, 49, 146));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("BACK");
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        side.add(back);
        back.setBounds(50, 10, 70, 40);

        background.add(side);
        side.setBounds(0, 0, 160, 670);

        top.setBackground(new java.awt.Color(255, 255, 255));
        top.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        x.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/X.png"))); // NOI18N
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
        });
        top.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 30, 30));

        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Minimize.png"))); // NOI18N
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });
        top.add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, 30));

        bubble9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        top.add(bubble9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        bubble10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        top.add(bubble10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        bubble16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        top.add(bubble16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        bubble17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        top.add(bubble17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        bubble18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        top.add(bubble18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        bubble19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        top.add(bubble19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        bubble20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        top.add(bubble20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        bubble21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        top.add(bubble21, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        diagoonal5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        top.add(diagoonal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 90, 80));

        diagoonal6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        top.add(diagoonal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 90, 80));

        diagoonal7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        top.add(diagoonal7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 90, 80));

        diagoonal8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        top.add(diagoonal8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 90, 80));

        diagoonal9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        top.add(diagoonal9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 90, 80));

        diagoonal10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        top.add(diagoonal10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 90, 80));

        bubble11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        top.add(bubble11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        bubble22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        top.add(bubble22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        background.add(top);
        top.setBounds(150, 0, 810, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        System.out.println("Go Back!");
        loginForm lgf = new loginForm();
        lgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void resetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseExited
        reset.setBackground(origColor);
    }//GEN-LAST:event_resetMouseExited

    private void resetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseEntered
        reset.setBackground(enterColor);
    }//GEN-LAST:event_resetMouseEntered

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        String cNum = txtcontactnumber.getText();
        if(txtemail.getText().isEmpty() || txtusername.getText().isEmpty() || cNum.isEmpty()) {
            System.out.println("All fields are required!");
            lblmessage1.setText("***");
            lblmessage2.setText("***");
            lblmessage3.setText("***");
        }else if(!cNum.matches("\\d+")) {
            System.out.println("Contact number must be numeric!");
            lblmessage3.setText("Contact number must be numeric!");
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
                    txtemail.setText("Nonexistent Email!");
                    System.out.println("Nonexistent Email!");
                    txtcontactnumber.setText("");
                    txtusername.setText("");
                }
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_resetMouseClicked

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtcontactnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactnumberActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        System.out.println("System Ends!");
        this.dispose();
    }//GEN-LAST:event_xMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        System.out.println("System Minimizes!");
        this.setExtendedState(loginForm.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBackground(enterColor);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBackground(origColor);
    }//GEN-LAST:event_backMouseExited

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
    private javax.swing.JLabel bubble12;
    private javax.swing.JLabel bubble13;
    private javax.swing.JLabel bubble14;
    private javax.swing.JLabel bubble15;
    private javax.swing.JLabel bubble16;
    private javax.swing.JLabel bubble17;
    private javax.swing.JLabel bubble18;
    private javax.swing.JLabel bubble19;
    private javax.swing.JLabel bubble20;
    private javax.swing.JLabel bubble21;
    private javax.swing.JLabel bubble22;
    private javax.swing.JLabel bubble3;
    private javax.swing.JLabel bubble5;
    private javax.swing.JLabel bubble6;
    private javax.swing.JLabel bubble8;
    private javax.swing.JLabel bubble9;
    private javax.swing.JLabel diagonal1;
    private javax.swing.JLabel diagonal2;
    private javax.swing.JLabel diagonal3;
    private javax.swing.JLabel diagonal4;
    private javax.swing.JLabel diagonal6;
    private javax.swing.JLabel diagoonal10;
    private javax.swing.JLabel diagoonal4;
    private javax.swing.JLabel diagoonal5;
    private javax.swing.JLabel diagoonal6;
    private javax.swing.JLabel diagoonal7;
    private javax.swing.JLabel diagoonal8;
    private javax.swing.JLabel diagoonal9;
    private javax.swing.JPanel form;
    private javax.swing.JLabel lblbackground;
    private javax.swing.JLabel lblcontactnumber;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblmessage1;
    private javax.swing.JLabel lblmessage2;
    private javax.swing.JLabel lblmessage3;
    private javax.swing.JLabel lblreset2;
    private javax.swing.JLabel lblusername;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mini;
    private javax.swing.JPanel reset;
    private javax.swing.JPanel side;
    private javax.swing.JPanel top;
    private javax.swing.JTextField txtcontactnumber;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtusername;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}