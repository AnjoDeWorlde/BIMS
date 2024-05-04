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
import javax.swing.JOptionPane;
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
    }
    
    public static String  lname, username, password, status ,type;
    
    Color lowColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);
    
public static boolean loginAcc(String username, String password){
    dbConnector connector = new dbConnector();
    try{
        String query = "SELECT * FROM tbl_user WHERE u_username = ? AND u_password = ? AND u_status = 'Active'";
        PreparedStatement preparedStatement = connector.prepareStatement(query);
        preparedStatement.setString(1, username);
        String hashedPassword = passwordHasher.hashPassword(password);
        preparedStatement.setString(2, hashedPassword);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            lname = resultSet.getString("u_lname");
            type = resultSet.getString("u_type");
            Session shesh = Session.getInstance();
            shesh.setUid(resultSet.getInt("u_id"));
            shesh.setFname(resultSet.getString("u_fname"));
            shesh.setLname(resultSet.getString("u_lname"));
            shesh.setEmail(resultSet.getString("u_email"));
            shesh.setContactnumber(resultSet.getLong("u_contactnumber"));
            shesh.setUsername(resultSet.getString("u_username"));
            shesh.setType(resultSet.getString("u_type"));
            shesh.setStatus(resultSet.getString("u_status"));
            if(type.equals("Admin") || type.equals("User")){
                return true;
            }else{
                System.out.println("Invalid user type!"); 
                return false;
            }
        }else{
            System.out.println("Invalid username, password, or account status!"); 
            return false;
        }
    }catch (SQLException | NoSuchAlgorithmException ex) {
        System.out.println("Exception: " + ex.getMessage());
        return false;
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        lowbar = new javax.swing.JPanel();
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
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        lowbar.setBackground(new java.awt.Color(0, 174, 239));
        lowbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        lowbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        lblexit.setBackground(new java.awt.Color(255, 255, 255));
        lblexit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblexit.setText("E X I T");

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblexit)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblexit)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        lowbar.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 90, 40));

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

        lbllogin.setBackground(new java.awt.Color(255, 255, 255));
        lbllogin.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbllogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogin.setText("L O G I N");

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbllogin)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbllogin)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        lowbar.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 170, -1, 40));

        forgotpassword.setFont(new java.awt.Font("Myanmar Text", 2, 11)); // NOI18N
        forgotpassword.setForeground(new java.awt.Color(255, 51, 51));
        forgotpassword.setText("Forget Password?");
        forgotpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpasswordMouseClicked(evt);
            }
        });
        lowbar.add(forgotpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 100, 20));

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
        System.out.println("Registration Start!");
        registrationForm rgf = new registrationForm();
        rgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createaccountMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        if(txtusername.getText().isEmpty() || txtpassword.getText().isEmpty()){
            System.out.println("Empty Text Field!");
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else{
            if(loginAcc(txtusername.getText(), txtpassword.getText())){
                System.out.println(type + " Exist!");
               JOptionPane.showMessageDialog(null, "Login Success!");
                if(type.equals("Admin")){
                    adminForm adf = new adminForm();
                    adf.setVisible(true);
                    this.dispose();
                }else if(type.equals("User")){
                    userForm usf = new userForm();
                    usf.setVisible(true);
                    this.dispose();
                }
            }else{
                System.out.println("Invalid username, password, or account status!"); 
                txtusername.setText("");
                txtpassword.setText("");
                JOptionPane.showMessageDialog(null, "Invalid username, password, or account status!");
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
        System.out.println("Get Lost! Wrong Button");
        this.dispose();//shutdown
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBackground(enterColor);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(lowColor);// TODO add your handling code here:
    }//GEN-LAST:event_exitMouseExited

    private void forgotpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpasswordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotpasswordMouseClicked

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel createaccount;
    public javax.swing.JPanel exit;
    private javax.swing.JLabel forgotpassword;
    private javax.swing.JLabel lblexit;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    public javax.swing.JPanel login;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel lowbar;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}