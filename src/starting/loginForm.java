package starting;

import admin.adminForm;
import com.formdev.flatlaf.FlatLightLaf;
import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
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
        
        txtpassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                checkCapsLock(e);
            }
            @Override
            public void keyReleased(KeyEvent e) {
                checkCapsLock(e);
            }
        });
    }
    
    public static String  lname, username, password, status ,type;
    
    Color origColor = new Color(255,255,255);
    Color enterColor = new Color(204,204,255);
    
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
                return "Incorrect Password!";
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
            shesh.setPicturePath(userResultSet.getString("u_picture"));

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

    private void checkCapsLock(KeyEvent e) {
        boolean isCapsLockOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
        boolean isShiftPressed = e.isShiftDown();

        if (isCapsLockOn && isShiftPressed) {
            lblmessage.setText("CAPS On!");
        } else if (isCapsLockOn) {
            lblmessage.setText("Caps Lock is ON!");
        } else if (isShiftPressed) {
            lblmessage.setText("CAPS ON!");
        } else {
            lblmessage.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        side = new javax.swing.JPanel();
        diagonal1 = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        diagonal4 = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        bubble1 = new javax.swing.JLabel();
        diagonal2 = new javax.swing.JLabel();
        diagoonal3 = new javax.swing.JLabel();
        bubble2 = new javax.swing.JLabel();
        bubble3 = new javax.swing.JLabel();
        bubble4 = new javax.swing.JLabel();
        bubble5 = new javax.swing.JLabel();
        bubble6 = new javax.swing.JLabel();
        bubble7 = new javax.swing.JLabel();
        bubble8 = new javax.swing.JLabel();
        top = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        bubble9 = new javax.swing.JLabel();
        bubble10 = new javax.swing.JLabel();
        bubble11 = new javax.swing.JLabel();
        lblmessage = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        forgotpassword = new javax.swing.JLabel();
        createaccount = new javax.swing.JLabel();
        exit = new javax.swing.JPanel();
        lblexit = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        lbllogin = new javax.swing.JLabel();
        check = new javax.swing.JCheckBox();
        lblbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        logo.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo_wname_orig-removebg-preview.png"))); // NOI18N
        logo.setToolTipText("");
        logo.setVerifyInputWhenFocusTarget(false);
        background.add(logo);
        logo.setBounds(0, 10, 630, 110);

        side.setBackground(new java.awt.Color(255, 255, 255));
        side.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        side.setLayout(null);

        diagonal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        side.add(diagonal1);
        diagonal1.setBounds(50, 100, 100, 100);

        lblusername.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        lblusername.setForeground(new java.awt.Color(46, 49, 146));
        lblusername.setText("USERNAME: ");
        side.add(lblusername);
        lblusername.setBounds(30, 220, 110, 20);

        diagonal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        side.add(diagonal4);
        diagonal4.setBounds(-40, 440, 100, 100);

        lblpassword.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(46, 49, 146));
        lblpassword.setText("PASSWORD:");
        side.add(lblpassword);
        lblpassword.setBounds(30, 280, 110, 20);

        bubble1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 50.png"))); // NOI18N
        side.add(bubble1);
        bubble1.setBounds(30, 410, 50, 50);

        diagonal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        side.add(diagonal2);
        diagonal2.setBounds(-60, 200, 100, 100);

        diagoonal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        side.add(diagoonal3);
        diagoonal3.setBounds(60, 330, 100, 100);

        bubble2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        side.add(bubble2);
        bubble2.setBounds(20, 300, 50, 40);

        bubble3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 35.png"))); // NOI18N
        side.add(bubble3);
        bubble3.setBounds(110, 490, 50, 40);

        bubble4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        side.add(bubble4);
        bubble4.setBounds(-10, 150, 50, 40);

        bubble5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        side.add(bubble5);
        bubble5.setBounds(130, 280, 50, 40);

        bubble6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 50.png"))); // NOI18N
        side.add(bubble6);
        bubble6.setBounds(0, 0, 50, 50);

        bubble7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 35.png"))); // NOI18N
        side.add(bubble7);
        bubble7.setBounds(70, 180, 50, 40);

        bubble8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 50.png"))); // NOI18N
        side.add(bubble8);
        bubble8.setBounds(30, 410, 50, 50);

        background.add(side);
        side.setBounds(0, 0, 140, 520);

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
        top.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 30, 30));

        bubble9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        top.add(bubble9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        bubble10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        top.add(bubble10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        bubble11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        top.add(bubble11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        background.add(top);
        top.setBounds(130, 0, 570, 30);

        lblmessage.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        lblmessage.setForeground(new java.awt.Color(255, 51, 51));
        lblmessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmessageMouseClicked(evt);
            }
        });
        background.add(lblmessage);
        lblmessage.setBounds(180, 180, 250, 20);

        txtusername.setFont(new java.awt.Font("Candara", 0, 19)); // NOI18N
        txtusername.setForeground(new java.awt.Color(46, 49, 146));
        txtusername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        background.add(txtusername);
        txtusername.setBounds(160, 210, 300, 40);

        txtpassword.setFont(new java.awt.Font("Candara", 0, 19)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(46, 49, 146));
        txtpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        background.add(txtpassword);
        txtpassword.setBounds(160, 270, 300, 40);

        forgotpassword.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        forgotpassword.setForeground(new java.awt.Color(255, 51, 51));
        forgotpassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotpassword.setText("Forget Password?");
        forgotpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpasswordMouseClicked(evt);
            }
        });
        background.add(forgotpassword);
        forgotpassword.setBounds(330, 320, 130, 20);

        createaccount.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        createaccount.setForeground(new java.awt.Color(255, 51, 51));
        createaccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createaccount.setText("Create Account?");
        createaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createaccountMouseClicked(evt);
            }
        });
        background.add(createaccount);
        createaccount.setBounds(160, 320, 120, 20);

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        lblexit.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        lblexit.setForeground(new java.awt.Color(46, 49, 146));
        lblexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblexit.setText("E X I T");
        exit.add(lblexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 20));

        background.add(exit);
        exit.setBounds(160, 350, 120, 40);

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        lbllogin.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        lbllogin.setForeground(new java.awt.Color(46, 49, 146));
        lbllogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogin.setText("L O G I N");
        login.add(lbllogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 20));

        background.add(login);
        login.setBounds(330, 350, 130, 40);

        check.setBackground(new java.awt.Color(204, 204, 255));
        check.setForeground(new java.awt.Color(46, 49, 146));
        check.setBorder(null);
        check.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        background.add(check);
        check.setBounds(470, 280, 20, 20);

        lblbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        lblbackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        background.add(lblbackground);
        lblbackground.setBounds(90, -10, 610, 530);

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
        if (txtusername.getText().isEmpty() && txtpassword.getText().isEmpty()) {
            lblmessage.setText("Empty Text Fields!");
            System.out.println("Empty Text Fields!");
            return;
        }
        if (txtusername.getText().isEmpty()) {
            lblmessage.setText("Empty Username!");
            System.out.println("Empty Username!");
            return;
        }
        if (txtpassword.getText().isEmpty()) {
            lblmessage.setText("Empty Password!");
            System.out.println("Empty Password!");
            return;
        }
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
            case "Incorrect Password!":
                txtpassword.setText("");
                lblmessage.setText(result);
                System.out.println("Incorrect Password!");
            break;
            case "Inactive Account!":
                clear();
                lblmessage.setText(result);
                System.out.println("Inactive Account!");
            break;
        }
    }//GEN-LAST:event_loginMouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setBackground(enterColor);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        login.setBackground(origColor);
    }//GEN-LAST:event_loginMouseExited

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.out.println("System Ends!");
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBackground(enterColor);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(origColor);
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
            txtpassword.setEchoChar('•');
        }
    }//GEN-LAST:event_checkActionPerformed

    private void lblmessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmessageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblmessageMouseClicked

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        System.out.println("System Ends!");
        this.dispose();
    }//GEN-LAST:event_xMouseClicked

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
            new loginForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel bubble1;
    private javax.swing.JLabel bubble10;
    private javax.swing.JLabel bubble11;
    private javax.swing.JLabel bubble2;
    private javax.swing.JLabel bubble3;
    private javax.swing.JLabel bubble4;
    private javax.swing.JLabel bubble5;
    private javax.swing.JLabel bubble6;
    private javax.swing.JLabel bubble7;
    private javax.swing.JLabel bubble8;
    private javax.swing.JLabel bubble9;
    private javax.swing.JCheckBox check;
    private javax.swing.JLabel createaccount;
    private javax.swing.JLabel diagonal1;
    private javax.swing.JLabel diagonal2;
    private javax.swing.JLabel diagonal4;
    private javax.swing.JLabel diagoonal3;
    public javax.swing.JPanel exit;
    private javax.swing.JLabel forgotpassword;
    private javax.swing.JLabel lblbackground;
    private javax.swing.JLabel lblexit;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblmessage;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    public javax.swing.JPanel login;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel side;
    private javax.swing.JPanel top;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}