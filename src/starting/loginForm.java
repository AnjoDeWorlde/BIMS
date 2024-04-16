package starting;

import admin.adminForm;
import config.dbConnector;
import java.awt.Color;
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
    
    public static String username, password;
    
    Color navColor = new Color(240,240,240);
    Color logColor = new Color(204,255,204);
    
    public static boolean loginAcc(String username, String password){
        dbConnector connector = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = '" + username + "' AND u_password = '" + password + "'";
            ResultSet resultSet = connector.getData(query);
            return resultSet.next();
        }catch (SQLException ex) {
            return false;
        }
    }
   
    public boolean checkUname(){
        dbConnector connector = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = '" + txtusername.getText() + "'";
            ResultSet resultSet = connector.getData(query);
            
            if(resultSet.next()){                             
                username = resultSet.getString("u_username");
                if(username.equals(txtusername.getText())){
                    return true;
                }
            }
            return false;                
        }catch (SQLException ex) {
            return false;
        }
    }
 
    public boolean checkPword(){
        dbConnector connector = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_password = '" + txtpassword.getText() + "'";
            ResultSet resultSet = connector.getData(query);
            
            if(resultSet.next()){                             
                password = resultSet.getString("u_password");
                if(password.equals(txtpassword.getText())){
                    return true;
                }
            }
            return false;                 
        }catch (SQLException ex) {
            return false;
        }
    }

    public boolean validAcc(String username){
        dbConnector connector = new dbConnector();        
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = ?";
            PreparedStatement statement = connector.prepareStatement(query);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){                
                String status = resultSet.getString("u_status");
                if(status.equals("Active")){
                    return true;
                }
            }
            return false;        
        }catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean checkAdmin(String username){
        dbConnector connector = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = ?";
            PreparedStatement statement = connector.prepareStatement(query);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){                
                String type = resultSet.getString("u_type");
                if(type.equals("Admin")){
                    return true;
                }
            }
            return false;               
        }catch (SQLException ex){
            return false;
        }            
    }
    
    public boolean checkUser(String username){
        dbConnector connector = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = ?";
            PreparedStatement statement = connector.prepareStatement(query);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){                
                String type = resultSet.getString("u_type");
                if(type.equals("User")){
                    return true;
                }
            }
            return false;               
        }catch (SQLException ex){
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
        lbltitle1 = new javax.swing.JLabel();
        lbltitle2 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        createaccount = new javax.swing.JLabel();
        forgotpassword = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        lbllogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(204, 255, 204));
        background.setLayout(null);

        lbltitle1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        lbltitle1.setText("Beverage Inventory Management");
        background.add(lbltitle1);
        lbltitle1.setBounds(180, 10, 400, 50);

        lbltitle2.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        lbltitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle2.setText("System ");
        background.add(lbltitle2);
        lbltitle2.setBounds(180, 50, 390, 50);

        sidebar.setBackground(new java.awt.Color(0, 51, 0));
        sidebar.setLayout(null);

        logo.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setText("LOGO");
        logo.setToolTipText("");
        logo.setVerifyInputWhenFocusTarget(false);
        sidebar.add(logo);
        logo.setBounds(30, 40, 100, 31);

        lblusername.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 255, 255));
        lblusername.setText("USERNAME: ");
        sidebar.add(lblusername);
        lblusername.setBounds(87, 174, 83, 28);

        lblpassword.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(255, 255, 255));
        lblpassword.setText("PASSWORD: ");
        sidebar.add(lblpassword);
        lblpassword.setBounds(83, 213, 87, 28);

        background.add(sidebar);
        sidebar.setBounds(0, 0, 170, 430);

        txtusername.setBackground(new java.awt.Color(204, 255, 204));
        txtusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0)));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        background.add(txtusername);
        txtusername.setBounds(180, 170, 180, 30);

        txtpassword.setBackground(new java.awt.Color(204, 255, 204));
        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0)));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        background.add(txtpassword);
        txtpassword.setBounds(180, 210, 180, 30);

        createaccount.setFont(new java.awt.Font("Myanmar Text", 0, 10)); // NOI18N
        createaccount.setForeground(new java.awt.Color(255, 51, 51));
        createaccount.setText("Create Account?");
        createaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createaccountMouseClicked(evt);
            }
        });
        background.add(createaccount);
        createaccount.setBounds(180, 250, 80, 20);

        forgotpassword.setFont(new java.awt.Font("Myanmar Text", 0, 10)); // NOI18N
        forgotpassword.setForeground(new java.awt.Color(255, 51, 51));
        forgotpassword.setText("Forget Password?");
        forgotpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpasswordMouseClicked(evt);
            }
        });
        background.add(forgotpassword);
        forgotpassword.setBounds(280, 250, 80, 20);

        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 5));
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

        lbllogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogin.setText("LOGIN");

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbllogin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbllogin, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        background.add(login);
        login.setBounds(260, 280, 100, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void createaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createaccountMouseClicked
        System.out.println("Registration Start!");
        registrationForm rgf = new registrationForm();
        rgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createaccountMouseClicked

    private void forgotpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpasswordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotpasswordMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        if(txtusername.getText().isEmpty() || txtpassword.getText().isEmpty()){
            System.out.println("Empty Text Field!");
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else{
            if(loginAcc(txtusername.getText(), txtpassword.getText())){
                if(validAcc(txtusername.getText())){
                    if(checkAdmin(txtusername.getText())){
                        System.out.println("Admin Exist!");
                        JOptionPane.showMessageDialog(null, "Login Success!");
                        adminForm adf = new adminForm();
                        adf.setVisible(true);
                        this.dispose();
                    }

                    if(checkUser(txtusername.getText())){
                        System.out.println("User Exist!");
                        JOptionPane.showMessageDialog(null, "Login Success!");
                        userForm usf = new userForm();
                        usf.setVisible(true);
                        this.dispose();
                    }
                }else{
                    System.out.println("Account Inactive!");
                    JOptionPane.showMessageDialog(null, "Account is still Inactive!");
                }
            }else{
                if(!checkUname() && !checkPword()){
                    System.out.println("Account Invalid!");
                    txtusername.setText("");
                    txtpassword.setText("");
                    JOptionPane.showMessageDialog(null, "Account does not exist!");
                }else{
                
                if(!checkUname()){
                    System.out.println("Username Invalid!");
                    txtusername.setText("");
                    JOptionPane.showMessageDialog(null, "Username is incorrect!");
                }
                
                if(!checkPword()){
                    System.out.println("Password Invalid!");
                    txtpassword.setText("");
                    JOptionPane.showMessageDialog(null, "Password is incorrect!");
                }
                }
            }
        }
    }//GEN-LAST:event_loginMouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setBackground(logColor);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        login.setBackground(navColor);
    }//GEN-LAST:event_loginMouseExited

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
    private javax.swing.JLabel forgotpassword;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lbltitle1;
    private javax.swing.JLabel lbltitle2;
    private javax.swing.JLabel lblusername;
    private javax.swing.JPanel login;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel sidebar;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}