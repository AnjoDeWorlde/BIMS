package starting;

import admin.adminForm;
import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import user.userForm;

/**
 *
 * @author DERECHO
 */
public class loginForm extends javax.swing.JFrame {

    /**
     * Creates new form loginForm
     */
    public loginForm() {
        initComponents();
        System.out.println("System Starts!");
    }
    
    public static String  lname, username, password, status ,type;
    
    Color lowColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);
    
    public static boolean equalPass(String storedHash, String inputHash) {
        return storedHash.equals(inputHash);
    }
    
    public static String loginAcc(String username, String password) {
        dbConnector connector = new dbConnector();
        try {
            String userQuery = "SELECT * FROM tbl_user WHERE u_username = ?";
            PreparedStatement userPreparedStatement = connector.prepareStatement(userQuery);
            userPreparedStatement.setString(1, username);
            ResultSet userResultSet = userPreparedStatement.executeQuery();

            if (!userResultSet.next()) {
                return "Nonexistent Account!";
            }

            status = userResultSet.getString("u_status");
            if (!status.equals("Active")) {
                return "Inactive Account!";
            }
            
            String storedPassword = userResultSet.getString("u_password");
            String passhash = passwordHasher.hashPassword(password);
            if (!equalPass(storedPassword, passhash)) {
                return "Invalid Password!";
            }
            
            lname = userResultSet.getString("u_lname");
            type = userResultSet.getString("u_type");
            Session shesh = Session.getInstance();
            shesh.setUid(userResultSet.getInt("u_id"));
            shesh.setFname(userResultSet.getString("u_fname"));
            shesh.setLname(userResultSet.getString("u_lname"));
            shesh.setEmail(userResultSet.getString("u_email"));
            shesh.setContactnumber(userResultSet.getLong("u_contactnumber"));
            shesh.setUsername(userResultSet.getString("u_username"));
            shesh.setType(userResultSet.getString("u_type"));
            shesh.setStatus(userResultSet.getString("u_status"));

            if (type.equals("Admin") || type.equals("User")) {
                return "Login Successfully!";
            } 
        } catch (SQLException | NoSuchAlgorithmException ex) {
            return "An error occurred: " + ex.getMessage();
        }
        return null;
    }
    
    public void clear(){
        txtusername.setText("");
        txtpassword.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        lowbar = new javax.swing.JPanel();
        lblmessage = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        createaccount = new javax.swing.JLabel();
        exit = new javax.swing.JPanel();
        lblexit = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        lbllogin = new javax.swing.JLabel();
        forgotpassword = new javax.swing.JLabel();
        check = new javax.swing.JCheckBox();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        lowbar.setBackground(new java.awt.Color(0, 174, 239));
        lowbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        lowbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblmessage.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblmessage.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lowbar.add(lblmessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 130, 20));

        lblusername.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        lblusername.setText("USERNAME: ");
        lowbar.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 90, 20));

        txtusername.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        lowbar.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 190, 40));

        lblpassword.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        lblpassword.setText("PASSWORD: ");
        lowbar.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, 20));

        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        lowbar.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 190, 40));

        createaccount.setFont(new java.awt.Font("Myanmar Text", 2, 11)); // NOI18N
        createaccount.setForeground(new java.awt.Color(255, 51, 51));
        createaccount.setText("Create Account?");
        createaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createaccountMouseClicked(evt);
            }
        });
        lowbar.add(createaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 90, 20));

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblexit.setBackground(new java.awt.Color(255, 255, 255));
        lblexit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblexit.setText("E X I T");
        exit.add(lblexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 11, -1, -1));

        lowbar.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 80, 40));

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbllogin.setBackground(new java.awt.Color(255, 255, 255));
        lbllogin.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbllogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogin.setText("L O G I N");
        login.add(lbllogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 11, 80, -1));

        lowbar.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 100, 40));

        forgotpassword.setFont(new java.awt.Font("Myanmar Text", 2, 11)); // NOI18N
        forgotpassword.setForeground(new java.awt.Color(255, 51, 51));
        forgotpassword.setText("Forget Password?");
        forgotpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpasswordMouseClicked(evt);
            }
        });
        lowbar.add(forgotpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 100, 20));

        check.setBackground(new java.awt.Color(0, 174, 239));
        check.setForeground(new java.awt.Color(0, 174, 239));
        check.setBorder(null);
        check.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        lowbar.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 20, 20));

        background.add(lowbar);
        lowbar.setBounds(0, 180, 700, 340);

        logo.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo_wname_orig80.jpg"))); // NOI18N
        logo.setToolTipText("");
        logo.setVerifyInputWhenFocusTarget(false);
        background.add(logo);
        logo.setBounds(0, 0, 700, 180);

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

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void createaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createaccountMouseClicked
        System.out.println("Registration Starts!");
        registrationForm rgf = new registrationForm();
        rgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createaccountMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        if (txtusername.getText().isEmpty() || txtpassword.getText().isEmpty()) {
            lblmessage.setText("Empty Text Fields!");
            System.out.println("Empty Text Fields!");
        } else {
            String result = loginAcc(txtusername.getText(), txtpassword.getText());
            switch (result) {
                case "Login Successfully!":
                    System.out.println(type + " Exist!");
                    if (type.equals("Admin")) {
                        adminForm adf = new adminForm();
                        adf.setVisible(true);
                        this.dispose();
                    } else if (type.equals("User")) {
                        userForm usf = new userForm();
                        usf.setVisible(true);
                        this.dispose();
                    }
                break;
                case "Nonexistent Account!":
                    lblmessage.setText(result);
                    clear();
                    System.out.println("Nonexistent Account!");
                break;
                case "Invalid Password!":
                    txtpassword.setText("");
                    lblmessage.setText(result);
                    System.out.println("Invalid Password!");
                break;
                case "Inactive Account!":
                    clear();
                    lblmessage.setText(result);
                    System.out.println("Inactive Account!");
                break;
            }
        }
    }//GEN-LAST:event_loginMouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setBackground(enterColor);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        login.setBackground(lowColor);
    }//GEN-LAST:event_loginMouseExited

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.out.println("System Ends!");
        this.dispose();//shutdown
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBackground(enterColor);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(lowColor);
    }//GEN-LAST:event_exitMouseExited

    private void forgotpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpasswordMouseClicked
        System.out.println("Reset Password Starts!");
        forgotpassForm fpf = new forgotpassForm();
        fpf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_forgotpasswordMouseClicked

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        if(check.isSelected()){
            txtpassword.setEchoChar((char)0);
        }else{
            txtpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_checkActionPerformed

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new loginForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JCheckBox check;
    private javax.swing.JLabel createaccount;
    public javax.swing.JPanel exit;
    private javax.swing.JLabel forgotpassword;
    private javax.swing.JLabel lblexit;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblmessage;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    public javax.swing.JPanel login;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel lowbar;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}