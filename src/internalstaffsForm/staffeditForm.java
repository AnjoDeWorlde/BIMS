package internalstaffsForm;

import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
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
public class staffeditForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form usereditForm
     * @param isCreating
     */
    public staffeditForm(boolean isCreating) {
        initComponents();

        this.isCreating = isCreating;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    private final boolean isCreating;
    public static String email, username;
    public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;    
    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);

    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/images/userphotos/", fileName);
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
    
    public boolean duplicateEmail(String email, String userId) {
        dbConnector connector = new dbConnector();
        try {
            String query = userId == null ? "SELECT * FROM tbl_user WHERE u_email = '" + email + "'" : "SELECT * FROM tbl_user WHERE u_email = '" + email + "' AND u_id != '" + userId + "'";
            ResultSet resultSet = connector.getData(query);
            if (resultSet.next()) {
                lblmessage3.setText("*** ");
                return true; // Email exists in the database
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean duplicateUser(String username, String userId) {
        dbConnector connector = new dbConnector();
        try {
            String query = userId == null ? "SELECT * FROM tbl_user WHERE u_username = '" + username + "'" : "SELECT * FROM tbl_user WHERE u_username = '" + username + "' AND u_id != '" + userId + "'";
            ResultSet resultSet = connector.getData(query);
        
            if (resultSet.next()) {
                lblmessage5.setText("*** ");
                return true; // Username exists in the database
            } else {
                return false;
            }
        } catch (SQLException ex) {
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

        background = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        lblaccount = new javax.swing.JLabel();
        lblmessage1 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        lblfirstname = new javax.swing.JLabel();
        lblmessage2 = new javax.swing.JLabel();
        txtlastname = new javax.swing.JTextField();
        lbllastname = new javax.swing.JLabel();
        lblmessage3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        lblmessage4 = new javax.swing.JLabel();
        txtcontactnumber = new javax.swing.JTextField();
        lblcontactnumber = new javax.swing.JLabel();
        lblmessage5 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lblusername = new javax.swing.JLabel();
        lblmessage6 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        lblpassword = new javax.swing.JLabel();
        lblmessage7 = new javax.swing.JLabel();
        boxtype = new javax.swing.JComboBox<>();
        lbltype = new javax.swing.JLabel();
        lblmessage8 = new javax.swing.JLabel();
        boxstatus = new javax.swing.JComboBox<>();
        lblstatus = new javax.swing.JLabel();
        confirm = new javax.swing.JPanel();
        lblconfirm = new javax.swing.JLabel();
        forpicture = new javax.swing.JPanel();
        remove = new javax.swing.JPanel();
        lblremove = new javax.swing.JLabel();
        upload = new javax.swing.JPanel();
        lblupload = new javax.swing.JLabel();
        boxpicture = new javax.swing.JPanel();
        picture = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(806, 586));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        background.setLayout(null);

        id.setFont(new java.awt.Font("Cambria Math", 1, 88)); // NOI18N
        id.setForeground(new java.awt.Color(46, 49, 146));
        id.setText("0");
        id.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        background.add(id);
        id.setBounds(320, 40, 170, 90);

        lblaccount.setFont(new java.awt.Font("Cambria Math", 1, 55)); // NOI18N
        lblaccount.setForeground(new java.awt.Color(46, 49, 146));
        lblaccount.setText("Account #");
        lblaccount.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        background.add(lblaccount);
        lblaccount.setBounds(60, 70, 270, 50);

        lblmessage1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage1.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage1);
        lblmessage1.setBounds(380, 140, 50, 40);

        txtfirstname.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtfirstname.setForeground(new java.awt.Color(46, 49, 146));
        txtfirstname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstnameActionPerformed(evt);
            }
        });
        background.add(txtfirstname);
        txtfirstname.setBounds(180, 140, 270, 40);

        lblfirstname.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblfirstname.setForeground(new java.awt.Color(46, 49, 146));
        lblfirstname.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblfirstname.setText("First Name:");
        background.add(lblfirstname);
        lblfirstname.setBounds(70, 140, 110, 40);

        lblmessage2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage2.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage2);
        lblmessage2.setBounds(380, 200, 50, 40);

        txtlastname.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtlastname.setForeground(new java.awt.Color(46, 49, 146));
        txtlastname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });
        background.add(txtlastname);
        txtlastname.setBounds(180, 200, 270, 40);

        lbllastname.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lbllastname.setForeground(new java.awt.Color(46, 49, 146));
        lbllastname.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbllastname.setText("Last Name:");
        background.add(lbllastname);
        lbllastname.setBounds(80, 200, 100, 40);

        lblmessage3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage3.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage3);
        lblmessage3.setBounds(380, 260, 50, 40);

        txtemail.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtemail.setForeground(new java.awt.Color(46, 49, 146));
        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        background.add(txtemail);
        txtemail.setBounds(180, 260, 270, 40);

        lblemail.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblemail.setForeground(new java.awt.Color(46, 49, 146));
        lblemail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblemail.setText("E-mail:");
        background.add(lblemail);
        lblemail.setBounds(110, 260, 70, 40);

        lblmessage4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage4.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage4);
        lblmessage4.setBounds(380, 320, 50, 40);

        txtcontactnumber.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtcontactnumber.setForeground(new java.awt.Color(46, 49, 146));
        txtcontactnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactnumberActionPerformed(evt);
            }
        });
        background.add(txtcontactnumber);
        txtcontactnumber.setBounds(180, 320, 270, 40);

        lblcontactnumber.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblcontactnumber.setForeground(new java.awt.Color(46, 49, 146));
        lblcontactnumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblcontactnumber.setText("Contact Number:");
        background.add(lblcontactnumber);
        lblcontactnumber.setBounds(30, 320, 150, 40);

        lblmessage5.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage5.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage5);
        lblmessage5.setBounds(380, 380, 50, 40);

        txtusername.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtusername.setForeground(new java.awt.Color(46, 49, 146));
        txtusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        background.add(txtusername);
        txtusername.setBounds(180, 380, 270, 40);

        lblusername.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblusername.setForeground(new java.awt.Color(46, 49, 146));
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblusername.setText("Username:");
        background.add(lblusername);
        lblusername.setBounds(80, 380, 100, 40);

        lblmessage6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage6.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage6);
        lblmessage6.setBounds(380, 440, 50, 40);

        txtpassword.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(46, 49, 146));
        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        background.add(txtpassword);
        txtpassword.setBounds(180, 440, 270, 40);

        lblpassword.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(46, 49, 146));
        lblpassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblpassword.setText("Password:");
        background.add(lblpassword);
        lblpassword.setBounds(90, 440, 90, 40);

        lblmessage7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage7.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage7);
        lblmessage7.setBounds(380, 500, 50, 40);

        boxtype.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        boxtype.setForeground(new java.awt.Color(46, 49, 146));
        boxtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "User", "Admin" }));
        boxtype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        boxtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxtypeActionPerformed(evt);
            }
        });
        background.add(boxtype);
        boxtype.setBounds(180, 500, 270, 40);

        lbltype.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lbltype.setForeground(new java.awt.Color(46, 49, 146));
        lbltype.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbltype.setText("Account Type: ");
        background.add(lbltype);
        lbltype.setBounds(52, 500, 130, 40);

        lblmessage8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblmessage8.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage8);
        lblmessage8.setBounds(700, 430, 50, 40);

        boxstatus.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        boxstatus.setForeground(new java.awt.Color(46, 49, 146));
        boxstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Active", "Inactive" }));
        boxstatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        boxstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxstatusActionPerformed(evt);
            }
        });
        background.add(boxstatus);
        boxstatus.setBounds(540, 430, 230, 40);

        lblstatus.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblstatus.setForeground(new java.awt.Color(46, 49, 146));
        lblstatus.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblstatus.setText("Status:");
        background.add(lblstatus);
        lblstatus.setBounds(480, 430, 59, 40);

        confirm.setBackground(new java.awt.Color(255, 255, 255));
        confirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        lblconfirm.setForeground(new java.awt.Color(46, 49, 146));
        lblconfirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblconfirm.setText("C O N F I R M");
        confirm.add(lblconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        background.add(confirm);
        confirm.setBounds(520, 490, 200, 50);

        forpicture.setBackground(new java.awt.Color(255, 255, 255));
        forpicture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        forpicture.setLayout(null);

        remove.setBackground(new java.awt.Color(255, 255, 255));
        remove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        lblremove.setForeground(new java.awt.Color(46, 49, 146));
        lblremove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblremove.setText("REMOVE");
        remove.add(lblremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        forpicture.add(remove);
        remove.setBounds(170, 330, 110, 50);

        upload.setBackground(new java.awt.Color(255, 255, 255));
        upload.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        lblupload.setForeground(new java.awt.Color(46, 49, 146));
        lblupload.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblupload.setText("UPLOAD");
        upload.add(lblupload, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        forpicture.add(upload);
        upload.setBounds(10, 330, 110, 50);

        boxpicture.setBackground(new java.awt.Color(255, 255, 255));
        boxpicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        boxpicture.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picture.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        picture.setForeground(new java.awt.Color(255, 15, 15));
        picture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxpicture.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 250, 290));

        forpicture.add(boxpicture);
        boxpicture.setBounds(10, 10, 270, 310);

        background.add(forpicture);
        forpicture.setBounds(480, 20, 290, 390);

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
        back.setBounds(10, 10, 70, 30);

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
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        boolean isAnyFieldEmpty = false;
        
        if (txtfirstname.getText().isEmpty()) {
            lblmessage1.setText("***");
            isAnyFieldEmpty = true;
        } else {
            lblmessage1.setText("");
        }
        if (txtlastname.getText().isEmpty()) {
            lblmessage2.setText("***");
            isAnyFieldEmpty = true;
        } else {
            lblmessage2.setText("");
        }
        if (txtemail.getText().isEmpty()) {
            lblmessage3.setText("***");
            isAnyFieldEmpty = true;
        } else {
            lblmessage3.setText("");
        }
        if (txtusername.getText().isEmpty()) {
            lblmessage4.setText("***");
            isAnyFieldEmpty = true;
        } else {
            lblmessage4.setText("");
        }
        if (txtcontactnumber.getText().isEmpty()) {
            lblmessage5.setText("***");
            isAnyFieldEmpty = true;
        } else {
            lblmessage5.setText("");
        }
        if (isCreating && txtpassword.getText().isEmpty()) {
            lblmessage6.setText("***");
            isAnyFieldEmpty = true;
        } else if (!isCreating) {
            lblmessage6.setText("");
        }
        if (boxtype.getSelectedItem().equals("N/A")) {
            lblmessage7.setText("***");
            isAnyFieldEmpty = true;
        } else {
            lblmessage7.setText("");
        }
        if (boxstatus.getSelectedItem().equals("N/A")) {
            lblmessage8.setText("***");
            isAnyFieldEmpty = true;
        } else {
            lblmessage8.setText("");
        }
        if (destination.isEmpty()) {
            picture.setText("No Picture!");
            isAnyFieldEmpty = true;
        } else {
            picture.setText("");
        } 
        if (isAnyFieldEmpty) {
            System.out.println("Empty All Text Field!");
            return;
        }      
        if (!validCNum(cNum)) {
            System.out.println("Contact Number Invalid!");
            lblmessage4.setText("***");
            return;
        }
        if (txtpassword.getText().length() < 8) {
            System.out.println("Password Invalid!");
            lblmessage6.setText("***");
            txtpassword.setText("");
            return;
        }
        
        String userId = isCreating ? null : id.getText();
        if (duplicateEmail(txtemail.getText(), userId)) {
            System.out.println("Email Exists!");
            txtemail.setText("");
            return;
        }
        if (duplicateUser(txtusername.getText(), userId)) {
            System.out.println("Username Exists!");
            txtusername.setText("");
            return;
        }

        lblmessage1.setText("");
        lblmessage2.setText("");
        lblmessage3.setText("");
        lblmessage4.setText("");
        lblmessage5.setText("");
        lblmessage6.setText("");
        lblmessage7.setText("");
        lblmessage8.setText("");
        picture.setText("");

        dbConnector connector = new dbConnector();
        long conNum = Long.parseLong(cNum);
        try {
            if (isCreating) {
                String password = passwordHasher.hashPassword(txtpassword.getText());
                if (connector.insertData("INSERT INTO tbl_user(u_fname ,u_lname ,u_email ,u_contactnumber ,u_username "
                    + ",u_password ,u_type ,u_status, u_picture) VALUES('" + txtfirstname.getText() + "','" + txtlastname.getText() + "','" 
                    + txtemail.getText() + "','" + conNum + "','" + txtusername.getText() + "','" + password + "','"
                    + boxtype.getSelectedItem() + "','" + boxstatus.getSelectedItem() + "','" + destination + "')")) {
                    try {
                        Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
                        stafflistsForm userListFrame = (stafflistsForm) SwingUtilities.getAncestorOfClass(stafflistsForm.class, this);
                        userListFrame.restoreOriginalState();
                        System.out.println("Information Inserted!");
                        userListFrame.getLblMessage().setText("Accomplished Successfully!");
                    } catch (IOException ex) {
                    }
                } else {
                    stafflistsForm userListFrame = (stafflistsForm) SwingUtilities.getAncestorOfClass(stafflistsForm.class, this);
                    System.out.println("Information Rejected!");
                    userListFrame.getLblMessage().setText("Failed Successfully!");
                }
            } else {
                if (connector.updateData("UPDATE tbl_user SET u_fname = '" + txtfirstname.getText() + "', u_lname = '"
                    + txtlastname.getText() + "', u_email = '" + txtemail.getText() + "', u_contactnumber = '"
                    + conNum + "', u_username = '" + txtusername.getText() + "', u_type = '"  + boxtype.getSelectedItem() + "', u_status = '" 
                    + boxstatus.getSelectedItem() + "', u_picture = '" + destination + "' WHERE u_id = '" + id.getText() + "'")) {
                    stafflistsForm userListFrame = (stafflistsForm) SwingUtilities.getAncestorOfClass(stafflistsForm.class, this);
                    userListFrame.restoreOriginalState();
                    System.out.println("Information Updated!");
                    userListFrame.getLblMessage().setText("Accomplished Successfully!");
                } else {
                    stafflistsForm userListFrame = (stafflistsForm) SwingUtilities.getAncestorOfClass(stafflistsForm.class, this);
                    System.out.println("Information Rejected!");
                    userListFrame.getLblMessage().setText("Failed Successfully!");
                }
            }
        } catch (NoSuchAlgorithmException ex) {
        }
    }//GEN-LAST:event_confirmMouseClicked

    private void confirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseEntered
        confirm.setBackground(enterColor);
    }//GEN-LAST:event_confirmMouseEntered

    private void confirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseExited
        confirm.setBackground(borderColor);
    }//GEN-LAST:event_confirmMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        stafflistsForm userListFrame = (stafflistsForm) SwingUtilities.getAncestorOfClass(stafflistsForm.class, this);
        userListFrame.restoreOriginalState();
        userListFrame.getLblMessage().setText("");
        System.out.println("Go Back!");
    }//GEN-LAST:event_backMouseClicked

    private void uploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadMouseClicked
        picture.setText("");
        JFileChooser fileChooser = new JFileChooser();
            
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                selectedFile = fileChooser.getSelectedFile();
                destination = "src/images/userphotos/" + selectedFile.getName();
                path  = selectedFile.getAbsolutePath();

                if(FileExistenceChecker(path) == 1){
                    picture.setText("File Already Exist!");
                    destination = "";
                    path="";
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JPanel boxpicture;
    public javax.swing.JComboBox<String> boxstatus;
    public javax.swing.JComboBox<String> boxtype;
    private javax.swing.JPanel confirm;
    private javax.swing.JPanel forpicture;
    public javax.swing.JLabel id;
    private javax.swing.JLabel lblaccount;
    private javax.swing.JLabel lblconfirm;
    private javax.swing.JLabel lblcontactnumber;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblfirstname;
    private javax.swing.JLabel lbllastname;
    private javax.swing.JLabel lblmessage1;
    private javax.swing.JLabel lblmessage2;
    private javax.swing.JLabel lblmessage3;
    private javax.swing.JLabel lblmessage4;
    private javax.swing.JLabel lblmessage5;
    private javax.swing.JLabel lblmessage6;
    private javax.swing.JLabel lblmessage7;
    private javax.swing.JLabel lblmessage8;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblremove;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JLabel lbltype;
    private javax.swing.JLabel lblupload;
    private javax.swing.JLabel lblusername;
    public javax.swing.JLabel picture;
    private javax.swing.JPanel remove;
    public javax.swing.JTextField txtcontactnumber;
    public javax.swing.JTextField txtemail;
    public javax.swing.JTextField txtfirstname;
    public javax.swing.JTextField txtlastname;
    public javax.swing.JPasswordField txtpassword;
    public javax.swing.JTextField txtusername;
    private javax.swing.JPanel upload;
    // End of variables declaration//GEN-END:variables
}