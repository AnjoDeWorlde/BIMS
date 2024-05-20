package internalinventoryForm;

import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author DERECHO
 */
public final class inventoryeditForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form inventoryeditForm
     * @param isCreating
     */
    public inventoryeditForm(boolean isCreating) {
        initComponents();
        CurrentDate();
        fillproductID();
        
        this.isCreating = isCreating;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);        
    }

    public void CurrentDate(){
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        
        txtdate.setText(month+"/"+day+"/"+year);
    }
    
    private Map<String, Product> productMap = new HashMap<>();
    private boolean isCreating; 
    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);   
  
    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?"); 
    }

    public static boolean equalPass(String oldpass, String passhash) {
        return oldpass.equals(passhash);
    }
    
    private void fillproductID() {
        try {
            String query = "SELECT p_id, p_name FROM tbl_products WHERE p_status NOT IN ('Archive', 'Inactive')";
            dbConnector connector = new dbConnector();
            ResultSet rs = connector.getData(query);
            DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) boxproductID.getModel();
            while (rs.next()) {
                String id = rs.getString("p_id");
                String name = rs.getString("p_name");
                Product product = new Product(id, name);
                productMap.put(name, product);
                model.addElement(name);
            }
        } catch (SQLException e) {
        }
    }

    private String formatDateString(String dateString) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("M/d/yyyy");
            java.util.Date date = inputFormat.parse(dateString);
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
            return outputFormat.format(date);
        } catch (ParseException e) {
            return null; 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        lblregistration = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        lblmessage1 = new javax.swing.JLabel();
        boxproductID = new javax.swing.JComboBox<>();
        lblproductID = new javax.swing.JLabel();
        lblmessage2 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        lbldate = new javax.swing.JLabel();
        lblmessage3 = new javax.swing.JLabel();
        txtastocks = new javax.swing.JTextField();
        lblastocks = new javax.swing.JLabel();
        lblmessage4 = new javax.swing.JLabel();
        txtsstocks = new javax.swing.JTextField();
        lblsstocks = new javax.swing.JLabel();
        lblmessage5 = new javax.swing.JLabel();
        txtlstocks = new javax.swing.JTextField();
        lbllstocks = new javax.swing.JLabel();
        lblmessage6 = new javax.swing.JLabel();
        boxstatus = new javax.swing.JComboBox<>();
        lblstatus = new javax.swing.JLabel();
        lblmessage7 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        lblpassword = new javax.swing.JLabel();
        confirm = new javax.swing.JPanel();
        lblconfirm = new javax.swing.JLabel();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        id.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        id.setForeground(new java.awt.Color(46, 49, 146));
        background.add(id);
        id.setBounds(260, 10, 140, 60);

        lblregistration.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lblregistration.setForeground(new java.awt.Color(46, 49, 146));
        lblregistration.setText("Inventory #");
        background.add(lblregistration);
        lblregistration.setBounds(10, 10, 250, 60);

        back.setForeground(new java.awt.Color(46, 49, 146));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/leftarrow_orig.png"))); // NOI18N
        back.setText("BACK");
        back.setToolTipText("");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        background.add(back);
        back.setBounds(450, 20, 70, 20);

        lblmessage1.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage1.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage1);
        lblmessage1.setBounds(310, 80, 30, 30);

        boxproductID.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxproductID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        boxproductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxproductIDActionPerformed(evt);
            }
        });
        background.add(boxproductID);
        boxproductID.setBounds(150, 80, 190, 30);

        lblproductID.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblproductID.setText("Product ID:");
        background.add(lblproductID);
        lblproductID.setBounds(30, 80, 120, 30);

        lblmessage2.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage2.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage2);
        lblmessage2.setBounds(310, 120, 30, 30);

        txtdate.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });
        background.add(txtdate);
        txtdate.setBounds(150, 120, 190, 30);

        lbldate.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbldate.setText("Date:");
        background.add(lbldate);
        lbldate.setBounds(30, 120, 120, 30);

        lblmessage3.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage3.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage3);
        lblmessage3.setBounds(310, 160, 30, 30);

        txtastocks.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtastocks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtastocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtastocksActionPerformed(evt);
            }
        });
        background.add(txtastocks);
        txtastocks.setBounds(150, 160, 190, 30);

        lblastocks.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblastocks.setText("Available Stocks:");
        background.add(lblastocks);
        lblastocks.setBounds(30, 160, 120, 30);

        lblmessage4.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage4.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage4);
        lblmessage4.setBounds(310, 200, 30, 30);

        txtsstocks.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtsstocks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtsstocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsstocksActionPerformed(evt);
            }
        });
        background.add(txtsstocks);
        txtsstocks.setBounds(150, 200, 190, 30);

        lblsstocks.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblsstocks.setText("Sold Stocks:");
        background.add(lblsstocks);
        lblsstocks.setBounds(30, 200, 120, 30);

        lblmessage5.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage5.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage5);
        lblmessage5.setBounds(310, 240, 30, 30);

        txtlstocks.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtlstocks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtlstocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlstocksActionPerformed(evt);
            }
        });
        background.add(txtlstocks);
        txtlstocks.setBounds(150, 240, 190, 30);

        lbllstocks.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbllstocks.setText("Loss Stocks:");
        background.add(lbllstocks);
        lbllstocks.setBounds(30, 240, 120, 30);

        lblmessage6.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage6.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage6);
        lblmessage6.setBounds(290, 280, 30, 30);

        boxstatus.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Available", "Out-of-Stocks", "Limited Stock" }));
        boxstatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        boxstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxstatusActionPerformed(evt);
            }
        });
        background.add(boxstatus);
        boxstatus.setBounds(150, 280, 190, 30);

        lblstatus.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblstatus.setText("Status:");
        background.add(lblstatus);
        lblstatus.setBounds(30, 280, 120, 30);

        lblmessage7.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage7.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage7);
        lblmessage7.setBounds(310, 370, 30, 30);

        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        background.add(txtpassword);
        txtpassword.setBounds(150, 370, 190, 30);

        lblpassword.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblpassword.setText("Password:");
        background.add(lblpassword);
        lblpassword.setBounds(30, 370, 120, 30);

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
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        inventoryForm inventoryFrame = (inventoryForm) SwingUtilities.getAncestorOfClass(inventoryForm.class, this);
        inventoryFrame.restoreOriginalState();
        inventoryFrame.getLblMessage().setText("");
        System.out.println("Go Back!");
    }//GEN-LAST:event_backMouseClicked

    private void txtastocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtastocksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtastocksActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void boxstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxstatusActionPerformed

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
        if (txtpassword.getText().isEmpty() || txtastocks.getText().isEmpty() || txtsstocks.getText().isEmpty() || txtlstocks.getText().isEmpty()) {
            System.out.println("Empty All Text Fields!");
            lblmessage1.setText("***");
            lblmessage2.setText("***");
            lblmessage3.setText("***");
            lblmessage4.setText("***");
            lblmessage5.setText("***");
            lblmessage6.setText("***");
            lblmessage7.setText("***");
        } else if (txtpassword.getText().length() < 8) {
            System.out.println("Password Invalid!");
            lblmessage7.setText("***");
            txtpassword.setText("");
        } else if (!isNumeric(txtastocks.getText())){
            System.out.println("Available Stocks must be numbers!");
            lblmessage3.setText("***");
            txtastocks.setText("");
        }  else if (!isNumeric(txtsstocks.getText())){
            System.out.println("Sold Stocks must be numbers!");
            lblmessage4.setText("***");
            txtsstocks.setText("");
        }  else if (!isNumeric(txtlstocks.getText())){
            System.out.println("Loss Stocks must be numbers!");
            lblmessage5.setText("***");
            txtlstocks.setText("");
        } else if (boxstatus.getSelectedItem().equals("N/A")) {
            System.out.println("Inventory Status Invalid!");
            lblmessage6.setText("***");
        } else {
            dbConnector connector = new dbConnector();
            BigDecimal as = new BigDecimal(txtastocks.getText());
            BigDecimal ss = new BigDecimal(txtsstocks.getText());
            BigDecimal ls = new BigDecimal(txtlstocks.getText());
            try {
                Session shesh = Session.getInstance();
                String query = "SELECT * FROM tbl_user WHERE u_id = '" + shesh.getUid() + "' ";
                ResultSet resultSet = connector.getData(query);
                if (resultSet.next()) { 
                    String oldpass = resultSet.getString("u_password");
                    String passhash = passwordHasher.hashPassword(txtpassword.getText());
                    if (!equalPass(oldpass, passhash)) {
                        System.out.println("Passwords do not match!");
                        lblmessage7.setText("***");
                    } else {
                        String selectedProductName = (String) boxproductID.getSelectedItem();
                        Product selectedProduct = productMap.get(selectedProductName);
                        String productId = selectedProduct.getId();
                        String inputDate = txtdate.getText();
                        String formattedDate = formatDateString(inputDate);
                        if (isCreating) {
                            if (connector.insertData("INSERT INTO tbl_inventory(p_id, i_date, i_availablestocks, i_soldstocks, i_lossstocks, i_status) "
                            + "VALUES('" + productId + "','" + formattedDate + "','" + as + "','" + ss + "','" + ls + "','" + boxstatus.getSelectedItem() + "')")) {
                                inventoryForm inventoryFrame = (inventoryForm) SwingUtilities.getAncestorOfClass(inventoryForm.class, this);
                                inventoryFrame.restoreOriginalState();
                                System.out.println("Information Inserted!");
                                inventoryFrame.getLblMessage().setText("Created Inventory Successfully!");
                            } else {
                                inventoryForm inventoryFrame = (inventoryForm) SwingUtilities.getAncestorOfClass(inventoryForm.class, this);
                                System.out.println("Information Rejected!");
                                inventoryFrame.getLblMessage().setText("Failed Successfully!");
                            }
                        } else {
                            if(connector.updateData("UPDATE tbl_inventory SET p_id = '" + productId + "', i_date = '" + formattedDate + "', "
                            + " i_availablestocks = '" + txtastocks.getText() + "', i_soldstocks = '" + txtsstocks.getText() + "', i_lossstocks = '" + txtlstocks.getText() + "', "
                            + " i_status = '" + boxstatus.getSelectedItem() + "' WHERE i_id = '" + id.getText() + "'")){
                                System.out.println("Information Updated!");
                                inventoryForm inventoryFrame = (inventoryForm) SwingUtilities.getAncestorOfClass(inventoryForm.class, this);
                                inventoryFrame.restoreOriginalState();
                                System.out.println("Information Inserted!");
                                inventoryFrame.getLblMessage().setText("Created Inventory Successfully!");
                            } else {
                                inventoryForm inventoryFrame = (inventoryForm) SwingUtilities.getAncestorOfClass(inventoryForm.class, this);
                                System.out.println("Information Rejected!");
                                inventoryFrame.getLblMessage().setText("Failed Successfully!");
                            }
                        }
                    }
                } else {
                }
            } catch (NoSuchAlgorithmException | SQLException ex) {
            }
        }
    }//GEN-LAST:event_confirmMouseClicked

    private void confirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseEntered
        confirm.setBackground(enterColor);
    }//GEN-LAST:event_confirmMouseEntered

    private void confirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseExited
        confirm.setBackground(borderColor);
    }//GEN-LAST:event_confirmMouseExited

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    private void txtsstocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsstocksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsstocksActionPerformed

    private void txtlstocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlstocksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlstocksActionPerformed

    private void boxproductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxproductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxproductIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    public javax.swing.JComboBox<String> boxproductID;
    public javax.swing.JComboBox<String> boxstatus;
    private javax.swing.JPanel confirm;
    public javax.swing.JLabel id;
    private javax.swing.JLabel lblastocks;
    private javax.swing.JLabel lblconfirm;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbllstocks;
    private javax.swing.JLabel lblmessage1;
    private javax.swing.JLabel lblmessage2;
    private javax.swing.JLabel lblmessage3;
    private javax.swing.JLabel lblmessage4;
    private javax.swing.JLabel lblmessage5;
    private javax.swing.JLabel lblmessage6;
    private javax.swing.JLabel lblmessage7;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblproductID;
    private javax.swing.JLabel lblregistration;
    private javax.swing.JLabel lblsstocks;
    private javax.swing.JLabel lblstatus;
    public javax.swing.JTextField txtastocks;
    public javax.swing.JTextField txtdate;
    public javax.swing.JTextField txtlstocks;
    public javax.swing.JPasswordField txtpassword;
    public javax.swing.JTextField txtsstocks;
    // End of variables declaration//GEN-END:variables
}