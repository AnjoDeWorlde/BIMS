package internalproductForm;

import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
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
    
    private final boolean isCreating;
    public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;
    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);    
    
    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?"); 
    }
    
    public static boolean equalPass(String oldpass, String passhash) {
        return oldpass.equals(passhash);
    }
    
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/images/productphotos/", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
        }
        
        return -1;
    }
    
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
        ImageIcon MyImage = null;
        if(ImagePath !=null){
                MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
public boolean validateInputs() {
    boolean hasErrors = false;

    // Validate empty fields
    if (txtname.getText().isEmpty()) {
        lblmessage1.setText("***");
        hasErrors = true;
    } else {
        lblmessage1.setText("");
    }

    if (txtqty.getText().isEmpty()) {
        lblmessage2.setText("***");
        hasErrors = true;
    } else if (!isNumeric(txtqty.getText())) { // Check if qty is numeric
        System.out.println("Quantity must be numeric!");
        lblmessage2.setText("***");
        txtqty.setText("");
        hasErrors = true;
    } else {
        lblmessage2.setText("");
    }

    if (txtprice.getText().isEmpty()) {
        lblmessage3.setText("***");
        hasErrors = true;
    } else if (!isNumeric(txtprice.getText())) { // Check if price is numeric
        System.out.println("Price must be numeric!");
        lblmessage3.setText("***");
        txtprice.setText("");
        hasErrors = true;
    } else {
        lblmessage3.setText("");
    }

    if (boxstatus.getSelectedItem().equals("N/A")) {
        lblmessage4.setText("***");
        hasErrors = true;
    } else {
        lblmessage4.setText("");
    }

    if (txtpassword.getText().isEmpty()) {
        lblmessage5.setText("***");
        hasErrors = true;
    } else {
        lblmessage5.setText("");
    }

    if (destination.isEmpty()) {
        picture.setText("No Picture!");
        hasErrors = true;
    } else {
        picture.setText("");
    }

    return !hasErrors; // Return true if there are no errors
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        lblproduct = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
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
        forpicture = new javax.swing.JPanel();
        remove = new javax.swing.JPanel();
        lblremove = new javax.swing.JLabel();
        upload = new javax.swing.JPanel();
        lblupload = new javax.swing.JLabel();
        boxpicture = new javax.swing.JPanel();
        picture = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(806, 586));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        background.setLayout(null);

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
        back.setBounds(10, 10, 30, 30);

        lblproduct.setFont(new java.awt.Font("Cambria Math", 1, 55)); // NOI18N
        lblproduct.setForeground(new java.awt.Color(0, 0, 146));
        lblproduct.setText("Product #");
        background.add(lblproduct);
        lblproduct.setBounds(60, 70, 260, 50);

        id.setFont(new java.awt.Font("Cambria Math", 1, 80)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 146));
        id.setText("0");
        id.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        background.add(id);
        id.setBounds(320, 48, 220, 90);

        lblmessage1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage1.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage1);
        lblmessage1.setBounds(380, 180, 40, 40);

        txtname.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtname.setForeground(new java.awt.Color(0, 0, 146));
        txtname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        background.add(txtname);
        txtname.setBounds(170, 180, 270, 40);

        lblname.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblname.setForeground(new java.awt.Color(0, 0, 146));
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblname.setText("Product Name:");
        background.add(lblname);
        lblname.setBounds(30, 180, 140, 40);

        lblmessage2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage2.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage2);
        lblmessage2.setBounds(380, 240, 40, 40);

        txtqty.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtqty.setForeground(new java.awt.Color(0, 0, 146));
        txtqty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        txtqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtyActionPerformed(evt);
            }
        });
        background.add(txtqty);
        txtqty.setBounds(170, 240, 270, 40);

        lblqty.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblqty.setForeground(new java.awt.Color(0, 0, 146));
        lblqty.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblqty.setText("Quantity:");
        background.add(lblqty);
        lblqty.setBounds(30, 240, 140, 40);

        lblmessage3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage3.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage3);
        lblmessage3.setBounds(380, 300, 40, 40);

        txtprice.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtprice.setForeground(new java.awt.Color(0, 0, 146));
        txtprice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        background.add(txtprice);
        txtprice.setBounds(170, 300, 270, 40);

        lblprice.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblprice.setForeground(new java.awt.Color(0, 0, 146));
        lblprice.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblprice.setText("Price:");
        background.add(lblprice);
        lblprice.setBounds(30, 300, 140, 40);

        lblmessage4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage4.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage4);
        lblmessage4.setBounds(380, 360, 40, 40);

        boxstatus.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        boxstatus.setForeground(new java.awt.Color(0, 0, 146));
        boxstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Approve", "Reject" }));
        boxstatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        boxstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxstatusActionPerformed(evt);
            }
        });
        background.add(boxstatus);
        boxstatus.setBounds(170, 360, 270, 40);

        lblstatus.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblstatus.setForeground(new java.awt.Color(0, 0, 146));
        lblstatus.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblstatus.setText("Status:");
        background.add(lblstatus);
        lblstatus.setBounds(30, 360, 140, 40);

        lblmessage5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage5.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage5);
        lblmessage5.setBounds(380, 420, 40, 40);

        txtpassword.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(0, 0, 146));
        txtpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        background.add(txtpassword);
        txtpassword.setBounds(170, 420, 270, 40);

        lblpassword.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(0, 0, 146));
        lblpassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblpassword.setText("Password:");
        background.add(lblpassword);
        lblpassword.setBounds(30, 420, 140, 40);

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
        confirm.setBounds(240, 470, 200, 50);

        forpicture.setBackground(new java.awt.Color(255, 255, 255));
        forpicture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        forpicture.setLayout(null);

        remove.setBackground(new java.awt.Color(255, 255, 255));
        remove.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeMouseExited(evt);
            }
        });
        remove.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblremove.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        lblremove.setForeground(new java.awt.Color(0, 0, 146));
        lblremove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblremove.setText("REMOVE");
        remove.add(lblremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 45));

        forpicture.add(remove);
        remove.setBounds(150, 300, 120, 65);

        upload.setBackground(new java.awt.Color(255, 255, 255));
        upload.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        upload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                uploadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                uploadMouseExited(evt);
            }
        });
        upload.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblupload.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        lblupload.setForeground(new java.awt.Color(0, 0, 146));
        lblupload.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblupload.setText("UPLOAD");
        upload.add(lblupload, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 100, 40));

        forpicture.add(upload);
        upload.setBounds(10, 300, 120, 65);

        boxpicture.setBackground(new java.awt.Color(255, 255, 255));
        boxpicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        boxpicture.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picture.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        picture.setForeground(new java.awt.Color(0, 0, 146));
        picture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxpicture.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 240, 250));

        forpicture.add(boxpicture);
        boxpicture.setBounds(10, 19, 260, 270);

        background.add(forpicture);
        forpicture.setBounds(480, 140, 280, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if (!validateInputs()) {
            return;
        }

        BigDecimal qty;
        BigDecimal price;

        try {
            qty = new BigDecimal(txtqty.getText());
            price = new BigDecimal(txtprice.getText());
        } catch (NumberFormatException ex) {
            return;
        }

        dbConnector connector = new dbConnector();
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
                    return;
                }else {
                    if (isCreating) {
                        if (connector.insertData("INSERT INTO tbl_products(p_name, p_qty, p_price, p_status, p_picture) "
                        + "VALUES('" + txtname.getText() + "','" + qty + "','" + price + "','" + boxstatus.getSelectedItem() + "','" 
                        + destination + "')")) {
                            try {
                                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
                                productlistsForm productListFrame = (productlistsForm) SwingUtilities.getAncestorOfClass(productlistsForm.class, this);
                                productListFrame.restoreOriginalState();
                                System.out.println("Information Inserted!");
                                productListFrame.getLblMessage().setText("Insert Product Success!");
                            } catch (IOException ex) {
                            }
                        } else {
                            productlistsForm productListFrame = (productlistsForm) SwingUtilities.getAncestorOfClass(productlistsForm.class, this);
                            System.out.println("Information Rejected!");
                            productListFrame.getLblMessage().setText("Insert Product Failed!");
                        }
                    } else {
                        if (connector.updateData("UPDATE tbl_products SET p_name = '" + txtname.getText() + "', p_qty = '"
                        + qty + "', p_price = '" + price + "', p_status = '" + boxstatus.getSelectedItem() 
                        + "', p_picture = '" + destination + "' WHERE p_id = '" + id.getText() + "'")) {
                            productlistsForm productListFrame = (productlistsForm) SwingUtilities.getAncestorOfClass(productlistsForm.class, this);
                            productListFrame.restoreOriginalState();
                            System.out.println("Information Updated!");
                            productListFrame.getLblMessage().setText("Update Product Success!");
                        } else {
                            productlistsForm productListFrame = (productlistsForm) SwingUtilities.getAncestorOfClass(productlistsForm.class, this);
                            System.out.println("Information Rejected!");
                            productListFrame.getLblMessage().setText("Update Product Fail!");
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

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        picture.setText("");
        remove.setEnabled(false);
        upload.setEnabled(true);
        picture.setIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_removeMouseClicked

    private void removeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseEntered
        remove.setBackground(enterColor);
    }//GEN-LAST:event_removeMouseEntered

    private void removeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseExited
        remove.setBackground(borderColor);
    }//GEN-LAST:event_removeMouseExited

    private void uploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadMouseClicked
        picture.setText("");
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                selectedFile = fileChooser.getSelectedFile();
                destination = "src/images/productphotos/" + selectedFile.getName();
                path  = selectedFile.getAbsolutePath();

                if(FileExistenceChecker(path) == 1){
                    picture.setText("File Already Exist!");
                    destination = "";
                    path= "";
                }else{
                    picture.setIcon(ResizeImage(path, null, picture));
                    upload.setEnabled(false);
                    remove.setEnabled(true);
                }
            } catch (Exception ex) {
                System.out.println("File Error!");
            }
        }
    }//GEN-LAST:event_uploadMouseClicked

    private void uploadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadMouseEntered
        upload.setBackground(enterColor);
    }//GEN-LAST:event_uploadMouseEntered

    private void uploadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadMouseExited
        upload.setBackground(borderColor);
    }//GEN-LAST:event_uploadMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JPanel boxpicture;
    public javax.swing.JComboBox<String> boxstatus;
    private javax.swing.JPanel confirm;
    private javax.swing.JPanel forpicture;
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
    private javax.swing.JLabel lblremove;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JLabel lblupload;
    public javax.swing.JLabel picture;
    private javax.swing.JPanel remove;
    public javax.swing.JTextField txtname;
    public javax.swing.JPasswordField txtpassword;
    public javax.swing.JTextField txtprice;
    public javax.swing.JTextField txtqty;
    private javax.swing.JPanel upload;
    // End of variables declaration//GEN-END:variables
}