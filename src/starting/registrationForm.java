package starting;

import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author DERECHO
 */
public class registrationForm extends javax.swing.JFrame {

    /**
     * Creates new form registrationForm
     */
    public registrationForm() {
        initComponents();
    }
    public static String email, username;
    
    Color navColor = new Color(204,204,204);
    Color enterColor = new Color(46,49,146);
    
    public boolean duplicateEmail(){
        dbConnector connector = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_email = '" + txtemail.getText() + "'";
            ResultSet resultSet = connector.getData(query);
            
            if(resultSet.next()){                
                email = resultSet.getString("u_email");
                if(email.equals(txtemail.getText())){
                    txtemail.setText("");
                }
                return true;
            }else{
                return false;
            }
                
        }catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean duplicateUser(){
        dbConnector connector = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = '" + txtusername.getText() + "'";
            ResultSet resultSet = connector.getData(query);
            
            if(resultSet.next()){                             
                username = resultSet.getString("u_username");
                if(username.equals(txtusername.getText())){
                    txtusername.setText("");
                }
                return true;
            }else{
                return false;
            }                
        }catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean validCNum(String cNum){
        try{
            BigInteger bigInteger = new BigInteger(cNum);
            return bigInteger.compareTo(BigInteger.ZERO) >= 0 
                    && bigInteger.compareTo(BigInteger.valueOf(10_000_000_000L)) < 0;            
        }catch (NumberFormatException e) {
            return false;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        javax.swing.JPanel background = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        lblregistration = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        lblfirstname = new javax.swing.JLabel();
        txtlastname = new javax.swing.JTextField();
        lbllastname = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtcontactnumber = new javax.swing.JTextField();
        lblcontactnumber = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lblusername = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        lblpassword = new javax.swing.JLabel();
        boxtype = new javax.swing.JComboBox<>();
        lbltype = new javax.swing.JLabel();
        register = new javax.swing.JPanel();
        lblregister = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        bar1 = new javax.swing.JPanel();
        bar2 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(0, 174, 239));
        background.setLayout(null);

        form.setBackground(new java.awt.Color(255, 255, 255));
        form.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 3));
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblregistration.setFont(new java.awt.Font("Candara", 1, 50)); // NOI18N
        lblregistration.setForeground(new java.awt.Color(46, 49, 146));
        lblregistration.setText("R e g i s t r a t i o n");
        form.add(lblregistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 390, 60));

        txtfirstname.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtfirstname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstnameActionPerformed(evt);
            }
        });
        form.add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 230, 30));

        lblfirstname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblfirstname.setText("First Name:");
        form.add(lblfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 110, 30));

        txtlastname.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtlastname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });
        form.add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 230, 30));

        lbllastname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbllastname.setText("Last Name:");
        form.add(lbllastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 110, 30));

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        form.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 230, 30));

        lblemail.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblemail.setText("E-mail:");
        form.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 110, 30));

        txtcontactnumber.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtcontactnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactnumberActionPerformed(evt);
            }
        });
        form.add(txtcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 230, 30));

        lblcontactnumber.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblcontactnumber.setText("Contact Number:");
        form.add(lblcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 110, 30));

        txtusername.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        form.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 230, 30));

        lblusername.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblusername.setText("Username:");
        form.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, 30));

        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        form.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 230, 30));

        lblpassword.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblpassword.setText("Password:");
        form.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 110, 30));

        boxtype.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "User", "Admin" }));
        boxtype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        boxtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxtypeActionPerformed(evt);
            }
        });
        form.add(boxtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 230, 30));

        lbltype.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbltype.setText("Account Type:");
        form.add(lbltype, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 110, 30));

        register.setBackground(new java.awt.Color(204, 204, 204));
        register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerMouseExited(evt);
            }
        });

        lblregister.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblregister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblregister.setText("R E G I S T E R");

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblregister)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblregister, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        form.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 140, 40));

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

        bar1.setBackground(new java.awt.Color(255, 255, 255));
        bar1.setLayout(null);
        background.add(bar1);
        bar1.setBounds(0, 80, 700, 160);

        bar2.setBackground(new java.awt.Color(255, 255, 255));
        bar2.setLayout(null);
        background.add(bar2);
        bar2.setBounds(0, 300, 700, 160);

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

    private void txtfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfirstnameActionPerformed

    private void txtlastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlastnameActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void boxtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxtypeActionPerformed

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        String cNum = txtcontactnumber.getText();
        if(txtfirstname.getText().isEmpty() || txtlastname.getText().isEmpty() || txtemail.getText().isEmpty()
            || txtusername.getText().isEmpty() || txtpassword.getText().isEmpty() || txtcontactnumber.getText().isEmpty()){
            System.out.println("Empty Text Field!");
            JOptionPane.showMessageDialog(null, "All fields are required!");

        }else if(txtpassword.getText().length() < 8){
            System.out.println("Password Invalid!");
            JOptionPane.showMessageDialog(null, "Password character should be 8 above!");
            txtpassword.setText("");

        }else if(duplicateEmail()){
            System.out.println("Email Exist!");
            JOptionPane.showMessageDialog(null, "Email is Already Used!");

        }else if(duplicateUser()){
            System.out.println("Username Exist!");
            JOptionPane.showMessageDialog(null, "Username is Already Used!");

        }else if(!validCNum(cNum)){
            System.out.println("Contact Number Invalid!");
            JOptionPane.showMessageDialog(null, "Contact Number should be numbers or less than 11 digits!");
        
        }else if(boxtype.getSelectedItem().equals("N/A")){
            System.out.println("Account Type Invalid!");
            JOptionPane.showMessageDialog(null, "Account Type must be Admin or User!");
            
        }else{
            dbConnector connector = new dbConnector();
            try{
                long conNum = Long.parseLong(cNum);
                String password = passwordHasher.hashPassword(txtpassword.getText());
                if(connector.insertData("INSERT INTO tbl_user(u_fname ,u_lname ,u_email ,u_contactnumber ,u_username ,u_password ,u_type ,u_status)"
                    + "VALUES('"+txtfirstname.getText()+"','"+txtlastname.getText()+"','"+txtemail.getText()+"',"
                    + "'"+conNum+"','"+txtusername.getText()+"','"+password+"','"+boxtype.getSelectedItem()
                    +"','Inactive')")){
                    System.out.println("Information Inserted!");
                    JOptionPane.showMessageDialog(null, "Registered Successfully!");
                    loginForm lgf = new loginForm();
                    lgf.setVisible(true);
                    this.dispose();

                }else{
                    System.out.println("Information Rejected!");
                    JOptionPane.showMessageDialog(null, "Failed Successfully!");

                }
            }catch(NoSuchAlgorithmException ex){
                System.out.println(""+ex);
            }
        }
    }//GEN-LAST:event_registerMouseClicked

    private void registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseEntered
        register.setBackground(enterColor);
    }//GEN-LAST:event_registerMouseEntered

    private void registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseExited
        register.setBackground(navColor);
    }//GEN-LAST:event_registerMouseExited

    private void txtcontactnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactnumberActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        System.out.println("Login Returned!");
        loginForm lgf = new loginForm();
        lgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

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
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel bar1;
    private javax.swing.JPanel bar2;
    private javax.swing.JComboBox<String> boxtype;
    private javax.swing.JPanel form;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcontactnumber;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblfirstname;
    private javax.swing.JLabel lbllastname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblregister;
    private javax.swing.JLabel lblregistration;
    private javax.swing.JLabel lbltype;
    private javax.swing.JLabel lblusername;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel register;
    private javax.swing.JTextField txtcontactnumber;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}