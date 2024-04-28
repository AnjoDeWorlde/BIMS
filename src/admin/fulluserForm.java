package admin;

import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import starting.loginForm;
/**
 *
 * @author DERECHO
 */
public class fulluserForm extends javax.swing.JFrame {

    /** Creates new form fulluserForm */
    public fulluserForm() {
        initComponents();
    }

    public static String email, username;
    
    Color navColor = new Color(0,51,0);
    Color botColor = new Color(204,204,204);
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
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel background = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        lblregistration = new javax.swing.JLabel();
        boxstatus = new javax.swing.JComboBox<>();
        txtfirstname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtcontactnumber = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        boxtype = new javax.swing.JComboBox<>();
        botcreate = new javax.swing.JPanel();
        lblbotcreate = new javax.swing.JLabel();
        botupdate = new javax.swing.JPanel();
        lblbotupdate = new javax.swing.JLabel();
        navigation = new javax.swing.JPanel();
        type = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        create = new javax.swing.JPanel();
        lblcreate = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        lblupdate = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        lbldelete = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        background.setBackground(new java.awt.Color(204, 255, 204));
        background.setLayout(null);

        form.setBackground(new java.awt.Color(204, 204, 204));
        form.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3));
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setForeground(new java.awt.Color(0, 51, 0));
        back.setText("BACK");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        form.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        id.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        id.setForeground(new java.awt.Color(0, 51, 0));
        form.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 150, 50));

        lblregistration.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lblregistration.setForeground(new java.awt.Color(0, 51, 0));
        lblregistration.setText("Account #");
        form.add(lblregistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 420, 60));

        boxstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Active", "Inactive" }));
        boxstatus.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), "A c c o u n t   S t a t u s", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 9), new java.awt.Color(0, 51, 0))); // NOI18N
        boxstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxstatusActionPerformed(evt);
            }
        });
        form.add(boxstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 190, 40));

        txtfirstname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), "F i r s t   N a m e ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 9), new java.awt.Color(0, 51, 0))); // NOI18N
        txtfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstnameActionPerformed(evt);
            }
        });
        form.add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 190, 40));

        txtlastname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), "L a s t   N a m e ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 9), new java.awt.Color(0, 51, 0))); // NOI18N
        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });
        form.add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 190, 40));

        txtemail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), "E m a i l ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 9), new java.awt.Color(0, 51, 0))); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        form.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 190, 40));

        txtcontactnumber.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), "C o n t a c t  N u m b e r ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 9), new java.awt.Color(0, 51, 0))); // NOI18N
        txtcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactnumberActionPerformed(evt);
            }
        });
        form.add(txtcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 190, 40));

        txtusername.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), " U s e r n a m e", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 9), new java.awt.Color(0, 51, 0))); // NOI18N
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        form.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 190, 40));

        txtpassword.setBorder(null);
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        form.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 190, 40));

        boxtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "User", "Admin" }));
        boxtype.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), "T y p e", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 9), new java.awt.Color(0, 51, 0))); // NOI18N
        boxtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxtypeActionPerformed(evt);
            }
        });
        form.add(boxtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 190, 40));

        botcreate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 5));
        botcreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botcreateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botcreateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botcreateMouseExited(evt);
            }
        });

        lblbotcreate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblbotcreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbotcreate.setText("C R E A T E");

        javax.swing.GroupLayout botcreateLayout = new javax.swing.GroupLayout(botcreate);
        botcreate.setLayout(botcreateLayout);
        botcreateLayout.setHorizontalGroup(
            botcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botcreateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblbotcreate, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        botcreateLayout.setVerticalGroup(
            botcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblbotcreate, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        form.add(botcreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 170, -1));

        botupdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 5));
        botupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botupdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botupdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botupdateMouseExited(evt);
            }
        });

        lblbotupdate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblbotupdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbotupdate.setText("U P D A T E");

        javax.swing.GroupLayout botupdateLayout = new javax.swing.GroupLayout(botupdate);
        botupdate.setLayout(botupdateLayout);
        botupdateLayout.setHorizontalGroup(
            botupdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botupdateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblbotupdate, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        botupdateLayout.setVerticalGroup(
            botupdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblbotupdate, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        form.add(botupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 170, -1));

        background.add(form);
        form.setBounds(250, 20, 440, 490);

        navigation.setBackground(new java.awt.Color(0, 51, 0));
        navigation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        type.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        type.setText("(type)");
        navigation.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, 20));

        lname.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lname.setText("ADMIN");
        lname.setVerifyInputWhenFocusTarget(false);
        lname.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        navigation.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 120));

        create.setBackground(new java.awt.Color(0, 51, 0));
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createMouseExited(evt);
            }
        });
        create.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcreate.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblcreate.setForeground(new java.awt.Color(255, 255, 255));
        lblcreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcreate.setText("CREATE");
        create.add(lblcreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 40));

        navigation.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 40));

        update.setBackground(new java.awt.Color(0, 51, 0));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblupdate.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblupdate.setForeground(new java.awt.Color(255, 255, 255));
        lblupdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblupdate.setText("UPDATE");
        update.add(lblupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 40));

        navigation.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 240, 40));

        delete.setBackground(new java.awt.Color(0, 51, 0));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbldelete.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lbldelete.setForeground(new java.awt.Color(255, 255, 255));
        lbldelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldelete.setText("DELETE");
        delete.add(lbldelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 40));

        navigation.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 40));

        background.add(navigation);
        navigation.setBounds(0, 0, 240, 520);

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

    private void boxstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxstatusActionPerformed

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

    private void boxtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxtypeActionPerformed

    private void botcreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botcreateMouseClicked
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

        }else if(boxstatus.getSelectedItem().equals("N/A")){
            System.out.println("Account Status Invalid!");
            JOptionPane.showMessageDialog(null, "Account Status must be Active or Inactive!");

        }else{
            dbConnector dbc = new dbConnector();
            try{
                long conNum = Long.parseLong(cNum);
                String password = passwordHasher.hashPassword(txtpassword.getText());
                    if(dbc.insertData("INSERT INTO tbl_user(u_fname ,u_lname ,u_email ,u_contactnumber ,u_username ,u_password "
                    + ",u_type ,u_status) VALUES('"+txtfirstname.getText()+"','"+txtlastname.getText()+"','"
                    +txtemail.getText()+"','"+conNum+"','"+txtusername.getText()+"','"+password+"','"
                    +boxtype.getSelectedItem()+"','"+boxstatus.getSelectedItem()+"')")){
                        System.out.println("Information Inserted!");
                        JOptionPane.showMessageDialog(null, "Created Account Successfully!");
                        fulluserlists ful = new fulluserlists();
                        ful.setVisible(true);
                        this.dispose();
                    }else{
                        System.out.println("Information Rejected!");
                        JOptionPane.showMessageDialog(null, "Failed Successfully!");
                    }
            }catch(NoSuchAlgorithmException ex){
                System.out.println(""+ex);
            }
        }
    }//GEN-LAST:event_botcreateMouseClicked

    private void botcreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botcreateMouseEntered
        botcreate.setBackground(enterColor);
    }//GEN-LAST:event_botcreateMouseEntered

    private void botcreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botcreateMouseExited
        botcreate.setBackground(botColor);
    }//GEN-LAST:event_botcreateMouseExited

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked

    }//GEN-LAST:event_createMouseClicked

    private void createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseEntered
        create.setBackground(enterColor);
    }//GEN-LAST:event_createMouseEntered

    private void createMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseExited
        create.setBackground(navColor);
    }//GEN-LAST:event_createMouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked

    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(enterColor);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(navColor);
    }//GEN-LAST:event_updateMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked

    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(enterColor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(navColor);
    }//GEN-LAST:event_deleteMouseExited

    private void botupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botupdateMouseClicked
        String cNum = txtcontactnumber.getText();
        if(txtfirstname.getText().isEmpty() || txtlastname.getText().isEmpty() || txtemail.getText().isEmpty()
            || txtusername.getText().isEmpty() || txtpassword.getText().isEmpty() || txtcontactnumber.getText().isEmpty()){
            System.out.println("Empty Text Field!");
            JOptionPane.showMessageDialog(null, "All fields are required!");

        }else if(txtpassword.getText().length() < 8){
            System.out.println("Password Invalid!");
            JOptionPane.showMessageDialog(null, "Password character should be 8 above!");
            txtpassword.setText("");

        }else if(duplicateCheck()){
            System.out.println("Duplication Exist!");

        }else if(!validCNum(cNum)){
            System.out.println("Contact Number Invalid!");
            JOptionPane.showMessageDialog(null, "Contact Number should be numbers or less than 11 digits!");

        }else if(boxtype.getSelectedItem().equals("N/A")){
            System.out.println("Account Type Invalid!");
            JOptionPane.showMessageDialog(null, "Account Type must be Admin or User!");

        }else if(boxstatus.getSelectedItem().equals("N/A")){
            System.out.println("Account Status Invalid!");
            JOptionPane.showMessageDialog(null, "Account Status must be Active or Inactive!");

        }else{
            dbConnector connector = new dbConnector();
            connector.updateData("UPDATE tbl_user SET u_fname = '"+txtfirstname.getText()+"', u_lname = '"
            +txtlastname.getText()+"', u_email = '"+txtemail.getText()+"', u_contactnumber = '"+txtcontactnumber.getText()
            +"', u_username = '"+txtusername.getText()+"', u_password = '"+txtpassword.getText()+"', u_type = '"
            +boxtype.getSelectedItem()+"', u_status = '"+boxstatus.getSelectedItem()+"' WHERE u_id = '"+id.getText()+"'");
            fulluserlists ful = new fulluserlists();
            ful.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_botupdateMouseClicked

    private void botupdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botupdateMouseEntered
        botupdate.setBackground(enterColor);
    }//GEN-LAST:event_botupdateMouseEntered

    private void botupdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botupdateMouseExited
        botupdate.setBackground(botColor);
    }//GEN-LAST:event_botupdateMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        System.out.println("User Lists Returned!");
        fulluserlists ful = new fulluserlists();
        ful.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session shesh = Session.getInstance();
        
        if(shesh.getUid() == 0){
            JOptionPane.showMessageDialog(null, "No account, Login First!");
            loginForm lf = new loginForm();
            lf.setVisible(true);
            this.dispose();
        }else{
            lname.setText(""+shesh.getLname());
            type.setText(""+shesh.getType());
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(fulluserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fulluserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fulluserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fulluserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fulluserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel botcreate;
    private javax.swing.JPanel botupdate;
    public javax.swing.JComboBox<String> boxstatus;
    public javax.swing.JComboBox<String> boxtype;
    private javax.swing.JPanel create;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel form;
    public javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblbotcreate;
    private javax.swing.JLabel lblbotupdate;
    private javax.swing.JLabel lblcreate;
    private javax.swing.JLabel lbldelete;
    private javax.swing.JLabel lblregistration;
    private javax.swing.JLabel lblupdate;
    public javax.swing.JLabel lname;
    private javax.swing.JPanel navigation;
    public javax.swing.JTextField txtcontactnumber;
    public javax.swing.JTextField txtemail;
    public javax.swing.JTextField txtfirstname;
    public javax.swing.JTextField txtlastname;
    public javax.swing.JPasswordField txtpassword;
    public javax.swing.JTextField txtusername;
    public javax.swing.JLabel type;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}