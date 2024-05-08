package internaluserlistsForm;

import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author DERECHO
 */
public class usereditForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form usereditForm
     * @param isCreating
     */
    public usereditForm(boolean isCreating) {
        initComponents();
        
        this.isCreating = isCreating;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    private boolean isCreating;
    public static String email, username;    
    Color borderColor = new Color(255,255,255);
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
    
           
    public boolean duplicateCheck(){
        dbConnector connector = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_user  WHERE (u_email = '" + txtemail.getText() 
            + "' OR u_username = '" + txtusername.getText() + "') AND u_id  != '"+id.getText()+"'";
            ResultSet resultSet = connector.getData(query);
            
            if(resultSet.next()){                
                email = resultSet.getString("u_email");
                if(email.equals(txtemail.getText())){
                    System.out.println("Email Exist!");
                    JOptionPane.showMessageDialog(null, "Email is Already Used!");
                    txtemail.setText("");
                }
                username = resultSet.getString("u_username");
                if(username.equals(txtusername.getText())){
                    System.out.println("Username Exist!");
                    JOptionPane.showMessageDialog(null, "Username is Already Used!");
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        lblregistration = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
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
        boxstatus = new javax.swing.JComboBox<>();
        lblstatus = new javax.swing.JLabel();
        confirm = new javax.swing.JPanel();
        lblconfirm = new javax.swing.JLabel();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        id.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        id.setForeground(new java.awt.Color(46, 49, 146));
        background.add(id);
        id.setBounds(220, 10, 150, 50);

        lblregistration.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lblregistration.setForeground(new java.awt.Color(46, 49, 146));
        lblregistration.setText("Account #");
        background.add(lblregistration);
        lblregistration.setBounds(10, 10, 420, 60);

        back.setForeground(new java.awt.Color(46, 49, 146));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("BACK");
        back.setToolTipText("");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        background.add(back);
        back.setBounds(470, 10, 50, 40);

        txtfirstname.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtfirstname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstnameActionPerformed(evt);
            }
        });
        background.add(txtfirstname);
        txtfirstname.setBounds(150, 80, 190, 30);

        lblfirstname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblfirstname.setText("First Name:");
        background.add(lblfirstname);
        lblfirstname.setBounds(40, 80, 110, 30);

        txtlastname.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtlastname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });
        background.add(txtlastname);
        txtlastname.setBounds(150, 130, 190, 30);

        lbllastname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbllastname.setText("Last Name:");
        background.add(lbllastname);
        lbllastname.setBounds(40, 130, 110, 30);

        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        background.add(txtemail);
        txtemail.setBounds(150, 180, 190, 30);

        lblemail.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblemail.setText("E-mail:");
        background.add(lblemail);
        lblemail.setBounds(40, 180, 110, 30);

        txtcontactnumber.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtcontactnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactnumberActionPerformed(evt);
            }
        });
        background.add(txtcontactnumber);
        txtcontactnumber.setBounds(150, 230, 190, 30);

        lblcontactnumber.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblcontactnumber.setText("Contact Number:");
        background.add(lblcontactnumber);
        lblcontactnumber.setBounds(40, 230, 110, 30);

        txtusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        background.add(txtusername);
        txtusername.setBounds(150, 280, 190, 30);

        lblusername.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblusername.setText("Username:");
        background.add(lblusername);
        lblusername.setBounds(40, 280, 110, 30);

        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        background.add(txtpassword);
        txtpassword.setBounds(150, 330, 190, 30);

        lblpassword.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblpassword.setText("Password:");
        background.add(lblpassword);
        lblpassword.setBounds(40, 330, 110, 30);

        boxtype.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "User", "Admin" }));
        boxtype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        boxtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxtypeActionPerformed(evt);
            }
        });
        background.add(boxtype);
        boxtype.setBounds(360, 110, 120, 30);

        lbltype.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbltype.setText("Account Type:");
        background.add(lbltype);
        lbltype.setBounds(360, 80, 120, 30);

        boxstatus.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Active", "Inactive" }));
        boxstatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        boxstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxstatusActionPerformed(evt);
            }
        });
        background.add(boxstatus);
        boxstatus.setBounds(360, 210, 120, 30);

        lblstatus.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblstatus.setText("Status:");
        background.add(lblstatus);
        lblstatus.setBounds(360, 180, 120, 30);

        confirm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmMouseExited(evt);
            }
        });
        confirm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblconfirm.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblconfirm.setText("C O N F I R M");
        confirm.add(lblconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 20));

        background.add(confirm);
        confirm.setBounds(390, 360, 130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
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

    private void txtcontactnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactnumberActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void boxtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxtypeActionPerformed

    private void boxstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxstatusActionPerformed

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
        String cNum = txtcontactnumber.getText();
        if (txtfirstname.getText().isEmpty() || txtlastname.getText().isEmpty() || txtemail.getText().isEmpty()
            || txtusername.getText().isEmpty() || txtpassword.getText().isEmpty() || txtcontactnumber.getText().isEmpty()) {
            System.out.println("Empty Text Field!");
            JOptionPane.showMessageDialog(null, "All fields are required!");

        } else if (txtpassword.getText().length() < 8) {
            System.out.println("Password Invalid!");
            JOptionPane.showMessageDialog(null, "Password character should be 8 above!");
            txtpassword.setText("");

        } else if (!validCNum(cNum)) {
            System.out.println("Contact Number Invalid!");
            JOptionPane.showMessageDialog(null, "Contact Number should be numbers or less than 11 digits!");

        } else if (boxtype.getSelectedItem().equals("N/A")) {
            System.out.println("Account Type Invalid!");
            JOptionPane.showMessageDialog(null, "Account Type must be Admin or User!");

        } else if (boxstatus.getSelectedItem().equals("N/A")) {
            System.out.println("Account Status Invalid!");
            JOptionPane.showMessageDialog(null, "Account Status must be Active or Inactive!");

        } else {
            dbConnector connector = new dbConnector();
            try {
                long conNum = Long.parseLong(cNum);
                String password = passwordHasher.hashPassword(txtpassword.getText());

                if (isCreating) {
                    if (connector.insertData("INSERT INTO tbl_user(u_fname ,u_lname ,u_email ,u_contactnumber ,u_username "
                        + ",u_password ,u_type ,u_status) VALUES('" + txtfirstname.getText() + "','" + txtlastname.getText()
                        + "','" + txtemail.getText() + "','" + conNum + "','" + txtusername.getText() + "','" + password + "','"
                        + boxtype.getSelectedItem() + "','" + boxstatus.getSelectedItem() + "')")) {
                        try {
                            userlistsForm userListFrame = (userlistsForm) SwingUtilities.getAncestorOfClass(userlistsForm.class, this);
                            userListFrame.restoreOriginalState();
                            System.out.println("Information Inserted!");
                            JOptionPane.showMessageDialog(null, "Created Account Successfully!");
                        } catch (ClassCastException e) {
                        }
                    } else {
                        System.out.println("Information Rejected!");
                        JOptionPane.showMessageDialog(null, "Failed Successfully!");
                    }
                } else {
                    if(connector.updateData("UPDATE tbl_user SET u_fname = '" + txtfirstname.getText() + "', u_lname = '"
                        + txtlastname.getText() + "', u_email = '" + txtemail.getText() + "', u_contactnumber = '"
                        + txtcontactnumber.getText() + "', u_username = '" + txtusername.getText() + "', u_password = '"
                        + txtpassword.getText() + "', u_type = '" + boxtype.getSelectedItem() + "', u_status = '"
                        + boxstatus.getSelectedItem() + "' WHERE u_id = '" + id.getText() + "'")){
                        try {
                            userlistsForm userListFrame = (userlistsForm) SwingUtilities.getAncestorOfClass(userlistsForm.class, this);
                            userListFrame.restoreOriginalState();
                            System.out.println("Information Updated!");
                            JOptionPane.showMessageDialog(null, "Updated Account Successfully!");
                        } catch (ClassCastException e) {
                        }
                    } else {
                        System.out.println("Information Rejected!");
                        JOptionPane.showMessageDialog(null, "Failed Successfully!");
                    }
                }
            } catch (NoSuchAlgorithmException ex) {
            System.out.println("" + ex);
            }
        }
    }//GEN-LAST:event_confirmMouseClicked

    private void confirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseEntered
        confirm.setBackground(enterColor);
    }//GEN-LAST:event_confirmMouseEntered

    private void confirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseExited
        confirm.setBackground(borderColor);
    }//GEN-LAST:event_confirmMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        try {
            userlistsForm userListFrame = (userlistsForm) SwingUtilities.getAncestorOfClass(userlistsForm.class, this);
            userListFrame.restoreOriginalState();
            System.out.println("Admin clicked Back!");
        } catch (ClassCastException e) {
        }
    }//GEN-LAST:event_backMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    public javax.swing.JComboBox<String> boxstatus;
    public javax.swing.JComboBox<String> boxtype;
    private javax.swing.JPanel confirm;
    public javax.swing.JLabel id;
    private javax.swing.JLabel lblconfirm;
    private javax.swing.JLabel lblcontactnumber;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblfirstname;
    private javax.swing.JLabel lbllastname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblregistration;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JLabel lbltype;
    private javax.swing.JLabel lblusername;
    public javax.swing.JTextField txtcontactnumber;
    public javax.swing.JTextField txtemail;
    public javax.swing.JTextField txtfirstname;
    public javax.swing.JTextField txtlastname;
    public javax.swing.JPasswordField txtpassword;
    public javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}