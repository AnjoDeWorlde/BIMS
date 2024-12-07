package internalinventoryForm;

import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
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
     * @param selectedProductId
     */
    public inventoryeditForm(boolean isCreating, String selectedProductId) {
        initComponents();
        CurrentDate();
        fillproductID();
                
        this.selectedProductId = selectedProductId;
        this.isCreating = isCreating;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);        
    }

    private final String selectedProductId;
    private final Map<String, Product> productMap = new HashMap<>(); //connector to product
    private final boolean isCreating; 
    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);     
    
    public void CurrentDate(){
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        
        txtdate.setText(month+"/"+day+"/"+year);
    }
  
    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?"); 
    }

    public static boolean equalPass(String oldpass, String passhash) {
        return oldpass.equals(passhash);
    }
    
    public void fillproductID() {
        try {
            String query = "SELECT p_id, p_name FROM tbl_products WHERE p_status NOT IN ('Reject')";
            dbConnector connector = new dbConnector();
            ResultSet rs = connector.getData(query);
            DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) boxproductID.getModel();
            while (rs.next()) {
                String id = rs.getString("p_id");
                String name = rs.getString("p_name");
                Product product = new Product(id, name);
                productMap.put(name, product);
                model.addElement(name);
                if (id.equals(selectedProductId)) {
                    boxproductID.setSelectedItem(name);
                }
            }
        } catch (SQLException e) {
        }
    }

    private String formatDateString(String dateString) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
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

        setPreferredSize(new java.awt.Dimension(806, 586));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        background.setLayout(null);

        id.setFont(new java.awt.Font("Cambria Math", 1, 88)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 146));
        id.setText("0");
        id.setToolTipText("");
        id.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        background.add(id);
        id.setBounds(370, 40, 210, 90);

        lblregistration.setFont(new java.awt.Font("Cambria Math", 1, 55)); // NOI18N
        lblregistration.setForeground(new java.awt.Color(0, 0, 146));
        lblregistration.setText("Inventory #");
        background.add(lblregistration);
        lblregistration.setBounds(60, 70, 320, 50);

        back.setFont(new java.awt.Font("Candara", 1, 10)); // NOI18N
        back.setForeground(new java.awt.Color(46, 49, 146));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dark blue back arrow 24.png"))); // NOI18N
        back.setToolTipText("");
        back.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        background.add(back);
        back.setBounds(10, 10, 24, 30);

        lblmessage1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage1.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage1);
        lblmessage1.setBounds(370, 180, 50, 40);

        boxproductID.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        boxproductID.setForeground(new java.awt.Color(0, 0, 146));
        boxproductID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        boxproductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxproductIDActionPerformed(evt);
            }
        });
        background.add(boxproductID);
        boxproductID.setBounds(170, 180, 270, 40);

        lblproductID.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblproductID.setForeground(new java.awt.Color(0, 0, 146));
        lblproductID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblproductID.setText("Product Name:");
        background.add(lblproductID);
        lblproductID.setBounds(40, 180, 130, 40);

        lblmessage2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage2.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage2);
        lblmessage2.setBounds(370, 240, 50, 40);

        txtdate.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtdate.setForeground(new java.awt.Color(0, 0, 146));
        txtdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });
        background.add(txtdate);
        txtdate.setBounds(170, 240, 270, 40);

        lbldate.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lbldate.setForeground(new java.awt.Color(0, 0, 146));
        lbldate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbldate.setText("Date:");
        background.add(lbldate);
        lbldate.setBounds(120, 240, 50, 40);

        lblmessage3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage3.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage3);
        lblmessage3.setBounds(370, 300, 50, 40);

        txtastocks.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtastocks.setForeground(new java.awt.Color(0, 0, 146));
        txtastocks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtastocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtastocksActionPerformed(evt);
            }
        });
        background.add(txtastocks);
        txtastocks.setBounds(170, 300, 270, 40);

        lblastocks.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblastocks.setForeground(new java.awt.Color(0, 0, 146));
        lblastocks.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblastocks.setText("Available Stocks:");
        background.add(lblastocks);
        lblastocks.setBounds(20, 300, 150, 40);

        lblmessage4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage4.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage4);
        lblmessage4.setBounds(370, 360, 50, 40);

        txtsstocks.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtsstocks.setForeground(new java.awt.Color(0, 0, 146));
        txtsstocks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtsstocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsstocksActionPerformed(evt);
            }
        });
        background.add(txtsstocks);
        txtsstocks.setBounds(170, 360, 270, 40);

        lblsstocks.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblsstocks.setForeground(new java.awt.Color(0, 0, 146));
        lblsstocks.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblsstocks.setText("Sold Stocks:");
        background.add(lblsstocks);
        lblsstocks.setBounds(60, 360, 110, 40);

        lblmessage5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage5.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage5);
        lblmessage5.setBounds(370, 420, 50, 40);

        txtlstocks.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtlstocks.setForeground(new java.awt.Color(0, 0, 146));
        txtlstocks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtlstocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlstocksActionPerformed(evt);
            }
        });
        background.add(txtlstocks);
        txtlstocks.setBounds(170, 420, 270, 40);

        lbllstocks.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lbllstocks.setForeground(new java.awt.Color(0, 0, 146));
        lbllstocks.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbllstocks.setText("Loss Stocks:");
        background.add(lbllstocks);
        lbllstocks.setBounds(60, 420, 110, 40);

        lblmessage6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage6.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage6);
        lblmessage6.setBounds(370, 490, 50, 40);

        boxstatus.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        boxstatus.setForeground(new java.awt.Color(0, 0, 146));
        boxstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Available", "Out-of-Stocks" }));
        boxstatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        boxstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxstatusActionPerformed(evt);
            }
        });
        background.add(boxstatus);
        boxstatus.setBounds(170, 490, 270, 40);

        lblstatus.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblstatus.setForeground(new java.awt.Color(0, 0, 146));
        lblstatus.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblstatus.setText("Status:");
        background.add(lblstatus);
        lblstatus.setBounds(110, 490, 60, 40);

        lblmessage7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage7.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage7);
        lblmessage7.setBounds(690, 360, 50, 40);

        txtpassword.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(0, 0, 146));
        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        background.add(txtpassword);
        txtpassword.setBounds(490, 360, 270, 40);

        lblpassword.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(0, 0, 146));
        lblpassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblpassword.setText("Password:");
        background.add(lblpassword);
        lblpassword.setBounds(490, 300, 89, 40);

        confirm.setBackground(new java.awt.Color(255, 255, 255));
        confirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirm.setPreferredSize(new java.awt.Dimension(200, 50));
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

        lblconfirm.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        lblconfirm.setForeground(new java.awt.Color(0, 0, 146));
        lblconfirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblconfirm.setText("C O N F I R M");
        confirm.add(lblconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        background.add(confirm);
        confirm.setBounds(550, 480, 200, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        boolean isAnyFieldEmpty = false;
        
        if (txtdate.getText().isEmpty()) {
            lblmessage2.setText("***");
            isAnyFieldEmpty = true;
        } else {
            lblmessage2.setText("");
        }
        if (txtastocks.getText().isEmpty()) {
            lblmessage3.setText("***");
            isAnyFieldEmpty = true;
        } else {
            lblmessage3.setText("");
        }
        if (txtsstocks.getText().isEmpty()) {
            lblmessage4.setText("***");
            isAnyFieldEmpty = true;
        } else {
            lblmessage4.setText("");
        }
        if (txtlstocks.getText().isEmpty()) {
            lblmessage5.setText("***");
            isAnyFieldEmpty = true;
        } else {
            lblmessage5.setText("");
        }
        if (boxstatus.getSelectedItem().equals("N/A")) {
            lblmessage6.setText("***");
            isAnyFieldEmpty = true;
        } else {
            lblmessage6.setText("");
        }
        if (txtpassword.getText().isEmpty()) {
            lblmessage7.setText("***");
            isAnyFieldEmpty = true;
        } else {
            lblmessage7.setText("");
        }
        if (isAnyFieldEmpty) {
            System.out.println("Empty All Text Fields!");
            return;
        }
        
        boolean isValidationFailed = false;

if (!isNumeric(txtastocks.getText())) {
    System.out.println("Available Stocks must be numbers!");
    lblmessage3.setText("***");
    isValidationFailed = true;
} else {
    lblmessage3.setText("");
}
if (!isNumeric(txtsstocks.getText())) {
    System.out.println("Sold Stocks must be numbers!");
    lblmessage4.setText("***");
    isValidationFailed = true;
} else {
    lblmessage4.setText("");
}
if (!isNumeric(txtlstocks.getText())) {
    System.out.println("Loss Stocks must be numbers!");
    lblmessage5.setText("***");
    isValidationFailed = true;
} else {
    lblmessage5.setText("");
}

// If any validation failed, do not proceed
if (isValidationFailed) {
    return;
}
       
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
                    lblmessage7.setText("");
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
                            inventoryFrame.getLblMessage().setText("Create Inventory Success!");
                        } else {
                            inventoryForm inventoryFrame = (inventoryForm) SwingUtilities.getAncestorOfClass(inventoryForm.class, this);
                            System.out.println("Information Rejected!");
                            inventoryFrame.getLblMessage().setText("Create Inventory Fail!");
                        }
                    } else {
                        if (connector.updateData("UPDATE tbl_inventory SET p_id = '" + productId + "', i_date = '" + formattedDate + "', "
                            + " i_availablestocks = '" + txtastocks.getText() + "', i_soldstocks = '" + txtsstocks.getText() + "', i_lossstocks = '" + txtlstocks.getText() + "', "
                            + " i_status = '" + boxstatus.getSelectedItem() + "' WHERE i_id = '" + id.getText() + "'")) {
                            inventoryForm inventoryFrame = (inventoryForm) SwingUtilities.getAncestorOfClass(inventoryForm.class, this);
                            inventoryFrame.restoreOriginalState();
                            System.out.println("Information Updated!");
                            inventoryFrame.getLblMessage().setText("Update Inventory Successful!");
                        } else {
                            inventoryForm inventoryFrame = (inventoryForm) SwingUtilities.getAncestorOfClass(inventoryForm.class, this);
                            System.out.println("Information Rejected!");
                            inventoryFrame.getLblMessage().setText("Update Inventory Fail!");
                        }
                    }
                }
            }
        } catch (NoSuchAlgorithmException | SQLException ex) {
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