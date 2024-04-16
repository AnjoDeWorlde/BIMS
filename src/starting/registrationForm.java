package starting;

import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
    
    Color navColor = new Color(240,240,240);
    Color enterColor = new Color(204,255,204);
    
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
            Long.parseLong(cNum); 
            return true;
        }catch (NumberFormatException e) {
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

        javax.swing.JPanel background = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        lblregistration = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        boxtype = new javax.swing.JComboBox<>();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        register = new javax.swing.JPanel();
        lbllogin = new javax.swing.JLabel();
        txtcontactnumber = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        header1 = new javax.swing.JPanel();
        header2 = new javax.swing.JPanel();
        sider = new javax.swing.JPanel();
        sider1 = new javax.swing.JPanel();
        sider2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(204, 255, 204));
        background.setLayout(null);

        form.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 3));
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblregistration.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblregistration.setText("R e g i s t r a t i o n");
        form.add(lblregistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 230, 30));

        txtfirstname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), " F i r s t   N a m e ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        txtfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstnameActionPerformed(evt);
            }
        });
        form.add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 230, 40));

        txtlastname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), " L a s t   N a m e ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });
        form.add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, 40));

        txtemail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), " E m a i l ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        form.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, 40));

        boxtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        boxtype.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), " T y p e", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        boxtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxtypeActionPerformed(evt);
            }
        });
        form.add(boxtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 130, 40));

        txtusername.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), " U s e r n a m e", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        form.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 230, 40));

        txtpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), " P a s s w o r d"));
        form.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 40));

        register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 5));
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

        lbllogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogin.setText("REGISTER");

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbllogin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbllogin, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        form.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        txtcontactnumber.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), "Contact Number "));
        txtcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactnumberActionPerformed(evt);
            }
        });
        form.add(txtcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 130, 40));

        back.setText("BACK");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        form.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        background.add(form);
        form.setBounds(130, 70, 420, 330);

        header.setBackground(new java.awt.Color(0, 51, 0));
        header.setLayout(null);
        background.add(header);
        header.setBounds(0, 0, 580, 20);

        header1.setBackground(new java.awt.Color(0, 51, 0));
        header1.setLayout(null);
        background.add(header1);
        header1.setBounds(60, 30, 520, 20);

        header2.setBackground(new java.awt.Color(0, 51, 0));
        header2.setLayout(null);
        background.add(header2);
        header2.setBounds(110, 60, 470, 20);

        sider.setBackground(new java.awt.Color(0, 51, 0));
        sider.setLayout(null);
        background.add(sider);
        sider.setBounds(70, 20, 40, 410);

        sider1.setBackground(new java.awt.Color(0, 51, 0));
        sider1.setLayout(null);
        background.add(sider1);
        sider1.setBounds(20, 20, 40, 410);

        sider2.setBackground(new java.awt.Color(0, 51, 0));
        sider2.setLayout(null);
        background.add(sider2);
        sider2.setBounds(120, 20, 40, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
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
            JOptionPane.showMessageDialog(null, "Contact Number should be numbers!");

        }else{
            dbConnector dbc = new dbConnector();
            long conNum = Long.parseLong(cNum);
            if(dbc.insertData("INSERT INTO tbl_user(u_fname ,u_lname ,u_email ,u_contactnumber ,u_username ,u_password ,u_type ,u_status)"
                + "VALUES('"+txtfirstname.getText()+"','"+txtlastname.getText()+"','"+txtemail.getText()+"',"
                + "'"+conNum+"','"+txtusername.getText()+"','"+txtpassword.getText()+"','"+boxtype.getSelectedItem()
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
    private javax.swing.JComboBox<String> boxtype;
    private javax.swing.JPanel form;
    private javax.swing.JPanel header;
    private javax.swing.JPanel header1;
    private javax.swing.JPanel header2;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblregistration;
    private javax.swing.JPanel register;
    private javax.swing.JPanel sider;
    private javax.swing.JPanel sider1;
    private javax.swing.JPanel sider2;
    private javax.swing.JTextField txtcontactnumber;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
