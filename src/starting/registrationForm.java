package starting;

import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

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
    public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;
    Color navColor = new Color(204,204,204);
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
    
    public boolean duplicateEmail(String email) {
        dbConnector connector = new dbConnector();
        try {
            String query = "SELECT * FROM tbl_user WHERE u_email = '" + email + "'";
            ResultSet resultSet = connector.getData(query);
        
            if (resultSet.next()) {
                lblmessage3.setText("*** ");
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean duplicateUser(String username) {
        dbConnector connector = new dbConnector();
        try {
            String query = "SELECT * FROM tbl_user WHERE u_username = '" + username + "'";
            ResultSet resultSet = connector.getData(query);
            if (resultSet.next()) {
                lblmessage5.setText("*** ");
                return true;
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

    public boolean validateUserInput(String fName, String lName, String email, String cNum, String username, String password, String userType) {
        boolean isValid = true;

        if (duplicateEmail(email)) {
            System.out.println("Email Exist!");
            txtemail.setText("");
            isValid = false;
        }
        if (!validCNum(cNum)) {
            System.out.println("Contact Number Invalid!");
            txtcontactnumber.setText("");
            lblmessage4.setText("*** ");
            isValid = false;
        }
        if (duplicateUser(username)) {
            System.out.println("Username Exist!");
            txtusername.setText("");
            isValid = false;
        }
        if (password.length() < 8) {
            System.out.println("Password Invalid!");
            txtpassword.setText("");
            lblmessage6.setText("*** ");
            isValid = false;
        }
        if (boxtype.getSelectedItem().equals("N/A")) {
            System.out.println("Account Type Invalid!");
            lblmessage7.setText("***");
            isValid = false;
        }

        return isValid;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel background = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        lblregistration = new javax.swing.JLabel();
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
        boxpicture = new javax.swing.JPanel();
        picture = new javax.swing.JLabel();
        upload = new javax.swing.JPanel();
        lblupload = new javax.swing.JLabel();
        remove = new javax.swing.JPanel();
        lblremove = new javax.swing.JLabel();
        register = new javax.swing.JPanel();
        lblregister = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(0, 174, 239));
        background.setLayout(null);

        form.setBackground(new java.awt.Color(255, 255, 255));
        form.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 3));
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblregistration.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        lblregistration.setForeground(new java.awt.Color(46, 49, 146));
        lblregistration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblregistration.setText("R e g i s t r a t i o n");
        form.add(lblregistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 540, 60));

        lblmessage1.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage1.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 40, 30));

        txtfirstname.setFont(new java.awt.Font("Candara", 0, 13)); // NOI18N
        txtfirstname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstnameActionPerformed(evt);
            }
        });
        form.add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 230, 30));

        lblfirstname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblfirstname.setText("First Name:");
        form.add(lblfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, 30));

        lblmessage2.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage2.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 40, 30));

        txtlastname.setFont(new java.awt.Font("Candara", 0, 13)); // NOI18N
        txtlastname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });
        form.add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 230, 30));

        lbllastname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbllastname.setText("Last Name:");
        form.add(lbllastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, 30));

        lblmessage3.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage3.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 40, 30));

        txtemail.setFont(new java.awt.Font("Candara", 0, 13)); // NOI18N
        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        form.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 230, 30));

        lblemail.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblemail.setText("E-mail:");
        form.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, 30));

        lblmessage4.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage4.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 40, 30));

        txtcontactnumber.setFont(new java.awt.Font("Candara", 0, 13)); // NOI18N
        txtcontactnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactnumberActionPerformed(evt);
            }
        });
        form.add(txtcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 230, 30));

        lblcontactnumber.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblcontactnumber.setText("Contact Number:");
        form.add(lblcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 110, 30));

        lblmessage5.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage5.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 40, 30));

        txtusername.setFont(new java.awt.Font("Candara", 0, 13)); // NOI18N
        txtusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        form.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 230, 30));

        lblusername.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblusername.setText("Username:");
        form.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 110, 30));

        lblmessage6.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage6.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 40, 30));

        txtpassword.setFont(new java.awt.Font("Candara", 0, 13)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        form.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 230, 30));

        lblpassword.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblpassword.setText("Password:");
        form.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 110, 30));

        lblmessage7.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage7.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 40, 30));

        boxtype.setFont(new java.awt.Font("Candara", 0, 13)); // NOI18N
        boxtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "User", "Admin" }));
        boxtype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        boxtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxtypeActionPerformed(evt);
            }
        });
        form.add(boxtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 230, 30));

        lbltype.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbltype.setText("Account Type:");
        form.add(lbltype, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 110, 30));

        boxpicture.setBackground(new java.awt.Color(255, 255, 255));
        boxpicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 3));
        boxpicture.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxpicture.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 140, 138));

        form.add(boxpicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 160, 160));

        upload.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
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

        lblupload.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblupload.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblupload.setText("UPLOAD");
        upload.add(lblupload, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 20));

        form.add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 80, 40));

        remove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
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

        lblremove.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblremove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblremove.setText("REMOVE");
        remove.add(lblremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 20));

        form.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 80, 40));

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
        register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblregister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblregister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblregister.setText("R E G I S T E R");
        register.add(lblregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 20));

        form.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 130, 40));

        back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back.setForeground(new java.awt.Color(46, 49, 146));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/leftarrow_orig.png"))); // NOI18N
        back.setText("BACK");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        form.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 60, 30));

        background.add(form);
        form.setBounds(80, 60, 550, 420);

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
        //big problem is the picture, nee implement inserting images
        String cNum = txtcontactnumber.getText();
        if(txtfirstname.getText().isEmpty() || txtlastname.getText().isEmpty() || txtemail.getText().isEmpty()
            || txtusername.getText().isEmpty() || txtpassword.getText().isEmpty() || txtcontactnumber.getText().isEmpty()
            || destination.isEmpty()){
            System.out.println("All fields are required!");
            lblmessage1.setText("*** ");
            lblmessage2.setText("*** ");
            lblmessage3.setText("*** ");
            lblmessage4.setText("*** ");
            lblmessage5.setText("*** ");
            lblmessage6.setText("*** ");
            lblmessage7.setText("***");
            picture.setText("No Picture!");
        }else{
            lblmessage1.setText("");
            lblmessage2.setText("");
            lblmessage3.setText("");
            lblmessage4.setText("");
            lblmessage5.setText("");
            lblmessage6.setText("");
            lblmessage7.setText("");
            picture.setText("");
            if (validateUserInput(txtfirstname.getText(), txtlastname.getText(), txtemail.getText(), cNum, txtusername.getText(), txtpassword.getText(), (String) boxtype.getSelectedItem())) {
                dbConnector connector = new dbConnector();
                try {
                    long conNum = Long.parseLong(cNum);
                    String password = passwordHasher.hashPassword(txtpassword.getText());
                    if (connector.insertData("INSERT INTO tbl_user(u_fname ,u_lname ,u_email ,u_contactnumber ,u_username ,u_password ,u_type ,u_status, u_picture)"
                    + "VALUES('" + txtfirstname.getText() + "','" + txtlastname.getText() + "','" + txtemail.getText() + "',"
                    + "'" + conNum + "','" + txtusername.getText() + "','" + password + "','" + boxtype.getSelectedItem()
                    + "','Inactive','" + destination + "')")) {
                        try {
                            Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
                            System.out.println("Information Inserted!");
                            loginForm lgf = new loginForm();
                            lgf.setVisible(true);
                            this.dispose();
                        } catch (IOException ex) {
                        }                        
                    } else {
                        System.out.println("Information Rejected!");
                    }
                } catch (NoSuchAlgorithmException ex) {
                    System.out.println("" + ex);
                }
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
        upload.setBackground(navColor);
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
        remove.setBackground(navColor);
    }//GEN-LAST:event_removeMouseExited

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new registrationForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel boxpicture;
    private javax.swing.JComboBox<String> boxtype;
    private javax.swing.JPanel form;
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
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblregister;
    private javax.swing.JLabel lblregistration;
    private javax.swing.JLabel lblremove;
    private javax.swing.JLabel lbltype;
    private javax.swing.JLabel lblupload;
    private javax.swing.JLabel lblusername;
    public javax.swing.JLabel picture;
    private javax.swing.JPanel register;
    private javax.swing.JPanel remove;
    private javax.swing.JTextField txtcontactnumber;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JPanel upload;
    // End of variables declaration//GEN-END:variables
}