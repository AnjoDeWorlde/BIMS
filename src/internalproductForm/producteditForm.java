package internalproductForm;

import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author DERECHO
 */
public class producteditForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     * @param isCreating
     */
    public producteditForm(boolean isCreating) {
        initComponents();
        
        this.isCreating = isCreating;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);initComponents();
    }
    
    private boolean isCreating; 
    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);    
    
    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?"); 
    }
    
    public static boolean equalPass(String oldpass, String passhash) {
        return oldpass.equals(passhash);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        lblproduct = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        lblmessage1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        lblmessage2 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        lblqty = new javax.swing.JLabel();
        lblmessage3 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        lblprice = new javax.swing.JLabel();
        lblmessage4 = new javax.swing.JLabel();
        boxstatus = new javax.swing.JComboBox<>();
        lblstatus = new javax.swing.JLabel();
        lblmessage5 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        lblpassword = new javax.swing.JLabel();
        confirm = new javax.swing.JPanel();
        lblconfirm = new javax.swing.JLabel();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        id.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        id.setForeground(new java.awt.Color(46, 49, 146));
        background.add(id);
        id.setBounds(220, 10, 140, 60);

        lblproduct.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lblproduct.setForeground(new java.awt.Color(46, 49, 146));
        lblproduct.setText("Product #");
        background.add(lblproduct);
        lblproduct.setBounds(10, 10, 210, 60);

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
        back.setBounds(460, 10, 60, 20);

        lblmessage1.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage1.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage1);
        lblmessage1.setBounds(310, 80, 30, 30);

        txtname.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        background.add(txtname);
        txtname.setBounds(150, 80, 190, 30);

        lblname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblname.setText("Product Name:");
        background.add(lblname);
        lblname.setBounds(40, 80, 110, 30);

        lblmessage2.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage2.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage2);
        lblmessage2.setBounds(310, 130, 30, 30);

        txtqty.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtqty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtyActionPerformed(evt);
            }
        });
        background.add(txtqty);
        txtqty.setBounds(150, 130, 190, 30);

        lblqty.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblqty.setText("Quantity:");
        background.add(lblqty);
        lblqty.setBounds(40, 130, 110, 30);

        lblmessage3.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage3.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage3);
        lblmessage3.setBounds(310, 180, 30, 30);

        txtprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        background.add(txtprice);
        txtprice.setBounds(150, 180, 190, 30);

        lblprice.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblprice.setText("Price:");
        background.add(lblprice);
        lblprice.setBounds(40, 180, 110, 30);

        lblmessage4.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage4.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage4);
        lblmessage4.setBounds(290, 230, 30, 30);

        boxstatus.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Active", "Inactive" }));
        boxstatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        boxstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxstatusActionPerformed(evt);
            }
        });
        background.add(boxstatus);
        boxstatus.setBounds(150, 230, 190, 30);

        lblstatus.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblstatus.setText("Status:");
        background.add(lblstatus);
        lblstatus.setBounds(40, 230, 110, 30);

        lblmessage5.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage5.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage5);
        lblmessage5.setBounds(310, 330, 30, 30);

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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        productlistsForm productListFrame = (productlistsForm) SwingUtilities.getAncestorOfClass(productlistsForm.class, this);
        productListFrame.restoreOriginalState();
        productListFrame.getLblMessage().setText("");
        System.out.println("Go Back!");
    }//GEN-LAST:event_backMouseClicked

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtyActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void boxstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxstatusActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
        if (txtname.getText().isEmpty() || txtqty.getText().isEmpty() || txtprice.getText().isEmpty() || txtpassword.getText().isEmpty()) {
            System.out.println("Empty All Text Fields!");
            lblmessage1.setText("***");
            lblmessage2.setText("***");
            lblmessage3.setText("***");
            lblmessage4.setText("***");
            lblmessage5.setText("***");
        } else if (!isNumeric(txtqty.getText())){
            System.out.println("Quantity must be numbers!");
            lblmessage2.setText("***");
            txtqty.setText("");
        } else if (!isNumeric(txtprice.getText())){
            System.out.println("Price must be numbers!");
            lblmessage3.setText("***");
            txtprice.setText("");
        } else if (boxstatus.getSelectedItem().equals("N/A")) {
            System.out.println("Product Status Invalid!");
            lblmessage4.setText("***");
        } else {
            dbConnector connector = new dbConnector();
            BigDecimal qty = new BigDecimal(txtqty.getText());
            BigDecimal price = new BigDecimal(txtprice.getText());
            try {
                Session shesh = Session.getInstance();
                String query = "SELECT * FROM tbl_user WHERE u_id = '" + shesh.getUid() + "' ";
                ResultSet resultSet = connector.getData(query);
                if (resultSet.next()) { 
                    String oldpass = resultSet.getString("u_password");
                    String passhash = passwordHasher.hashPassword(txtpassword.getText());
                    if (!equalPass(oldpass, passhash)) {
                        System.out.println("Passwords do not match!");
                        lblmessage5.setText("***");
                    } else {
                        if (isCreating) {
                            if (connector.insertData("INSERT INTO tbl_products( p_name, p_qty, p_price, p_status) "
                            + "VALUES('" + txtname.getText() + "','" + qty + "','" + price + "','" + boxstatus.getSelectedItem() + "')")) {
                                productlistsForm productListFrame = (productlistsForm) SwingUtilities.getAncestorOfClass(productlistsForm.class, this);
                                productListFrame.restoreOriginalState();
                                System.out.println("Information Inserted!");
                                productListFrame.getLblMessage().setText("Created Product Successfully!");
                            } else {
                                productlistsForm productListFrame = (productlistsForm) SwingUtilities.getAncestorOfClass(productlistsForm.class, this);
                                System.out.println("Information Rejected!");
                                productListFrame.getLblMessage().setText("Failed Successfully!");
                            }
                        } else {
                            if (connector.updateData("UPDATE tbl_products SET p_name = '" + txtname.getText() + "', p_qty = '"
                            + txtqty.getText() + "', p_price = '" + txtprice.getText() + "', p_status = '"
                            + boxstatus.getSelectedItem()+ "' WHERE p_id = '" + id.getText() + "'")) {
                                productlistsForm productListFrame = (productlistsForm) SwingUtilities.getAncestorOfClass(productlistsForm.class, this);
                                productListFrame.restoreOriginalState();
                                System.out.println("Information Updated!");
                                productListFrame.getLblMessage().setText("Updated Product Successfully!");                            
                            } else {
                                productlistsForm productListFrame = (productlistsForm) SwingUtilities.getAncestorOfClass(productlistsForm.class, this);
                                System.out.println("Information Rejected!");
                                productListFrame.getLblMessage().setText("Failed Successfully!");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    public javax.swing.JComboBox<String> boxstatus;
    private javax.swing.JPanel confirm;
    public javax.swing.JLabel id;
    private javax.swing.JLabel lblconfirm;
    private javax.swing.JLabel lblmessage1;
    private javax.swing.JLabel lblmessage2;
    private javax.swing.JLabel lblmessage3;
    private javax.swing.JLabel lblmessage4;
    private javax.swing.JLabel lblmessage5;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblprice;
    private javax.swing.JLabel lblproduct;
    private javax.swing.JLabel lblqty;
    private javax.swing.JLabel lblstatus;
    public javax.swing.JTextField txtname;
    public javax.swing.JPasswordField txtpassword;
    public javax.swing.JTextField txtprice;
    public javax.swing.JTextField txtqty;
    // End of variables declaration//GEN-END:variables
}