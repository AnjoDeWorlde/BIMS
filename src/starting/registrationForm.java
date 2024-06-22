package starting;

import com.formdev.flatlaf.FlatLightLaf;
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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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
    Color origColor = new Color(255,255,255);
    Color enterColor = new Color(204,204,255);
    
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
        return isValid;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel background = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        lblmessage1 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        lblmessage2 = new javax.swing.JLabel();
        txtlastname = new javax.swing.JTextField();
        lblmessage3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblmessage4 = new javax.swing.JLabel();
        txtcontactnumber = new javax.swing.JTextField();
        lblmessage5 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lblmessage6 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        lblmessage7 = new javax.swing.JLabel();
        boxtype = new javax.swing.JComboBox<>();
        forpicture = new javax.swing.JPanel();
        upload = new javax.swing.JPanel();
        lblupload = new javax.swing.JLabel();
        remove = new javax.swing.JPanel();
        lblremove = new javax.swing.JLabel();
        boxpicture = new javax.swing.JPanel();
        picture = new javax.swing.JLabel();
        lblbackground1 = new javax.swing.JLabel();
        lblregistration = new javax.swing.JLabel();
        register = new javax.swing.JPanel();
        lblregister = new javax.swing.JLabel();
        lblbackground = new javax.swing.JLabel();
        lblfirstname = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblcontactnumber = new javax.swing.JLabel();
        lbllastname = new javax.swing.JLabel();
        lbltype = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        diagonal1 = new javax.swing.JLabel();
        diagonal2 = new javax.swing.JLabel();
        diagonal3 = new javax.swing.JLabel();
        diagonal4 = new javax.swing.JLabel();
        bubble7 = new javax.swing.JLabel();
        bubble2 = new javax.swing.JLabel();
        bubble3 = new javax.swing.JLabel();
        bubble1 = new javax.swing.JLabel();
        bubble9 = new javax.swing.JLabel();
        bubble10 = new javax.swing.JLabel();
        bubble11 = new javax.swing.JLabel();
        rlogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        background.setLayout(null);

        form.setBackground(new java.awt.Color(255, 255, 255));
        form.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblmessage1.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        lblmessage1.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 40, 30));

        txtfirstname.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        txtfirstname.setForeground(new java.awt.Color(46, 49, 146));
        txtfirstname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        txtfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstnameActionPerformed(evt);
            }
        });
        form.add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 280, 30));

        lblmessage2.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        lblmessage2.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 40, 30));

        txtlastname.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        txtlastname.setForeground(new java.awt.Color(46, 49, 146));
        txtlastname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });
        form.add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 280, 30));

        lblmessage3.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        lblmessage3.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 40, 30));

        txtemail.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        txtemail.setForeground(new java.awt.Color(46, 49, 146));
        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        form.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 280, 30));

        lblmessage4.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        lblmessage4.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 40, 30));

        txtcontactnumber.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        txtcontactnumber.setForeground(new java.awt.Color(46, 49, 146));
        txtcontactnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        txtcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactnumberActionPerformed(evt);
            }
        });
        form.add(txtcontactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 280, 30));

        lblmessage5.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        lblmessage5.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 40, 30));

        txtusername.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        txtusername.setForeground(new java.awt.Color(46, 49, 146));
        txtusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        form.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 280, 30));

        lblmessage6.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        lblmessage6.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 40, 30));

        txtpassword.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(46, 49, 146));
        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        form.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 280, 30));

        lblmessage7.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        lblmessage7.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        form.add(lblmessage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 40, 30));

        boxtype.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N
        boxtype.setForeground(new java.awt.Color(46, 49, 146));
        boxtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "User", "Admin" }));
        boxtype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        boxtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxtypeActionPerformed(evt);
            }
        });
        form.add(boxtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 280, 30));

        forpicture.setBackground(new java.awt.Color(255, 255, 255));
        forpicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        forpicture.setLayout(null);

        upload.setBackground(new java.awt.Color(255, 255, 255));
        upload.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
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

        lblupload.setFont(new java.awt.Font("Cambria Math", 1, 10)); // NOI18N
        lblupload.setForeground(new java.awt.Color(46, 49, 146));
        lblupload.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblupload.setText("UPLOAD");
        upload.add(lblupload, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 20));

        forpicture.add(upload);
        upload.setBounds(10, 230, 80, 40);

        remove.setBackground(new java.awt.Color(255, 255, 255));
        remove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
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

        lblremove.setFont(new java.awt.Font("Cambria Math", 1, 10)); // NOI18N
        lblremove.setForeground(new java.awt.Color(46, 49, 146));
        lblremove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblremove.setText("REMOVE");
        remove.add(lblremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 20));

        forpicture.add(remove);
        remove.setBounds(150, 230, 80, 40);

        boxpicture.setBackground(new java.awt.Color(255, 255, 255));
        boxpicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        boxpicture.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picture.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        picture.setForeground(new java.awt.Color(255, 15, 15));
        picture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxpicture.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 180));

        forpicture.add(boxpicture);
        boxpicture.setBounds(10, 10, 220, 200);

        lblbackground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        lblbackground1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        forpicture.add(lblbackground1);
        lblbackground1.setBounds(-310, -140, 610, 530);

        form.add(forpicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 240, 290));

        lblregistration.setFont(new java.awt.Font("Candara", 1, 50)); // NOI18N
        lblregistration.setForeground(new java.awt.Color(46, 49, 146));
        lblregistration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblregistration.setText("e g i s t r a t i o n");
        form.add(lblregistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 350, 80));

        register.setBackground(new java.awt.Color(255, 255, 255));
        register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
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

        lblregister.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        lblregister.setForeground(new java.awt.Color(46, 49, 146));
        lblregister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblregister.setText("R E G I S T E R");
        register.add(lblregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 20));

        form.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 130, 40));

        lblbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.png"))); // NOI18N
        lblbackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        form.add(lblbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 460));

        background.add(form);
        form.setBounds(120, 50, 570, 460);

        lblfirstname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblfirstname.setForeground(new java.awt.Color(46, 49, 146));
        lblfirstname.setText("First Name:");
        background.add(lblfirstname);
        lblfirstname.setBounds(10, 170, 110, 30);

        lblemail.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblemail.setForeground(new java.awt.Color(46, 49, 146));
        lblemail.setText("E-mail:");
        background.add(lblemail);
        lblemail.setBounds(10, 250, 110, 30);

        lblcontactnumber.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblcontactnumber.setForeground(new java.awt.Color(46, 49, 146));
        lblcontactnumber.setText("Contact Number:");
        background.add(lblcontactnumber);
        lblcontactnumber.setBounds(10, 290, 110, 30);

        lbllastname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbllastname.setForeground(new java.awt.Color(46, 49, 146));
        lbllastname.setText("Last Name:");
        background.add(lbllastname);
        lbllastname.setBounds(10, 210, 110, 30);

        lbltype.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbltype.setForeground(new java.awt.Color(46, 49, 146));
        lbltype.setText("Account Type:");
        background.add(lbltype);
        lbltype.setBounds(10, 410, 110, 30);

        lblpassword.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(46, 49, 146));
        lblpassword.setText("Password:");
        background.add(lblpassword);
        lblpassword.setBounds(10, 370, 110, 30);

        lblusername.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblusername.setForeground(new java.awt.Color(46, 49, 146));
        lblusername.setText("Username:");
        background.add(lblusername);
        lblusername.setBounds(10, 330, 110, 30);

        back.setFont(new java.awt.Font("Candara", 1, 10)); // NOI18N
        back.setForeground(new java.awt.Color(46, 49, 146));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("BACK");
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        background.add(back);
        back.setBounds(20, 20, 40, 30);

        diagonal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        background.add(diagonal1);
        diagonal1.setBounds(80, 30, 100, 110);

        diagonal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        background.add(diagonal2);
        diagonal2.setBounds(-10, 430, 100, 100);

        diagonal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        background.add(diagonal3);
        diagonal3.setBounds(-70, 150, 100, 100);

        diagonal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-diagonal-lines-100.png"))); // NOI18N
        background.add(diagonal4);
        diagonal4.setBounds(80, 300, 100, 100);

        bubble7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 35.png"))); // NOI18N
        background.add(bubble7);
        bubble7.setBounds(70, 180, 50, 40);

        bubble2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        background.add(bubble2);
        bubble2.setBounds(100, 410, 50, 40);

        bubble3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        background.add(bubble3);
        bubble3.setBounds(20, 300, 50, 40);

        bubble1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 50.png"))); // NOI18N
        background.add(bubble1);
        bubble1.setBounds(0, 50, 50, 50);

        bubble9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        background.add(bubble9);
        bubble9.setBounds(430, 10, 25, 25);

        bubble10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        background.add(bubble10);
        bubble10.setBounds(560, 20, 25, 25);

        bubble11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bubbles 25.png"))); // NOI18N
        background.add(bubble11);
        bubble11.setBounds(300, 10, 25, 25);

        rlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo1_orig25.jpg"))); // NOI18N
        background.add(rlogo);
        rlogo.setBounds(10, 60, 120, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
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
        boolean isAnyFieldEmpty = false;

        if(txtfirstname.getText().isEmpty()) {
            System.out.println("First name is required!");
            lblmessage1.setText("*** ");
            isAnyFieldEmpty = true;
        } else {
            lblmessage1.setText("");
        }
        if(txtlastname.getText().isEmpty()) {
            System.out.println("Last name is required!");
            lblmessage2.setText("*** ");
            isAnyFieldEmpty = true;
        } else {
            lblmessage2.setText("");
        }
        if(txtemail.getText().isEmpty()) {
            System.out.println("Email is required!");
            lblmessage3.setText("*** ");
            isAnyFieldEmpty = true;
        } else {
            lblmessage3.setText("");
        }
        if(txtusername.getText().isEmpty()) {
            System.out.println("Username is required!");
            lblmessage4.setText("*** ");
            isAnyFieldEmpty = true;
        } else {
            lblmessage4.setText("");
        }
        if(txtpassword.getText().isEmpty()) {
            System.out.println("Password is required!");
            lblmessage5.setText("*** ");
            isAnyFieldEmpty = true;
        } else {
            lblmessage5.setText("");
        }
        if(txtcontactnumber.getText().isEmpty()) {
            System.out.println("Contact number is required!");
            lblmessage6.setText("*** ");
            isAnyFieldEmpty = true;
        } else {
            lblmessage6.setText("");
        }
        if(boxtype.getSelectedItem().equals("N/A")){
            System.out.println("Account Type is required!");
            lblmessage7.setText("***");
        }else{
            lblmessage7.setText("");
        }
        if(destination.isEmpty()) {
            System.out.println("Destination is required!");
            picture.setText("No Picture!");
            isAnyFieldEmpty = true;
        } else {
            picture.setText("");
        }
        if(isAnyFieldEmpty) {
            System.out.println("Boho");
        }else{
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
                }
            }
        }
    }//GEN-LAST:event_registerMouseClicked

    private void registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseEntered
        register.setBackground(enterColor);
    }//GEN-LAST:event_registerMouseEntered

    private void registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseExited
        register.setBackground(origColor);
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
        upload.setBackground(origColor);
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
        remove.setBackground(origColor);
    }//GEN-LAST:event_removeMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( UnsupportedLookAndFeelException ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new registrationForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel boxpicture;
    private javax.swing.JComboBox<String> boxtype;
    private javax.swing.JLabel bubble1;
    private javax.swing.JLabel bubble10;
    private javax.swing.JLabel bubble11;
    private javax.swing.JLabel bubble2;
    private javax.swing.JLabel bubble3;
    private javax.swing.JLabel bubble7;
    private javax.swing.JLabel bubble9;
    private javax.swing.JLabel diagonal1;
    private javax.swing.JLabel diagonal2;
    private javax.swing.JLabel diagonal3;
    private javax.swing.JLabel diagonal4;
    private javax.swing.JPanel form;
    private javax.swing.JPanel forpicture;
    private javax.swing.JLabel lblbackground;
    private javax.swing.JLabel lblbackground1;
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
    private javax.swing.JLabel rlogo;
    private javax.swing.JTextField txtcontactnumber;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JPanel upload;
    // End of variables declaration//GEN-END:variables
}