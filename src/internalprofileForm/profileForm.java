package internalprofileForm;

import admin.adminForm;
import config.Session;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import user.userForm;

/**
 *
 * @author DERECHO
 */
public class profileForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form profileForm
     * @param admindesktop
     * @param source
     */
    public profileForm(JDesktopPane admindesktop, String source) {
        initComponents();
        
        this.source = source;
        this.admindesktop = admindesktop;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    private final String source;
    private final JDesktopPane admindesktop; 
    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(204,204,255);

    private void closeAllInternalFrames() {
        JInternalFrame[] frames = admindesktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            frame.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        lblaccount = new javax.swing.JLabel();
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
        lbltype = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();
        lblstatus = new javax.swing.JLabel();
        txtstatus = new javax.swing.JTextField();
        picture = new javax.swing.JLabel();
        changepass = new javax.swing.JPanel();
        lblreset = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(846, 706));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
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

        id.setFont(new java.awt.Font("Cambria Math", 1, 80)); // NOI18N
        id.setForeground(new java.awt.Color(46, 49, 146));
        id.setText("0");
        background.add(id);
        id.setBounds(330, 50, 200, 85);

        lblaccount.setFont(new java.awt.Font("Cambria Math", 1, 55)); // NOI18N
        lblaccount.setForeground(new java.awt.Color(46, 49, 146));
        lblaccount.setText("Account #");
        background.add(lblaccount);
        lblaccount.setBounds(60, 70, 270, 50);

        txtfirstname.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtfirstname.setForeground(new java.awt.Color(0, 0, 146));
        txtfirstname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstnameActionPerformed(evt);
            }
        });
        background.add(txtfirstname);
        txtfirstname.setBounds(200, 190, 300, 40);

        lblfirstname.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblfirstname.setForeground(new java.awt.Color(0, 0, 146));
        lblfirstname.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblfirstname.setText("First Name:");
        background.add(lblfirstname);
        lblfirstname.setBounds(50, 190, 150, 40);

        txtlastname.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtlastname.setForeground(new java.awt.Color(0, 0, 146));
        txtlastname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });
        background.add(txtlastname);
        txtlastname.setBounds(200, 260, 300, 40);

        lbllastname.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lbllastname.setForeground(new java.awt.Color(0, 0, 146));
        lbllastname.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbllastname.setText("Last Name:");
        background.add(lbllastname);
        lbllastname.setBounds(50, 260, 150, 40);

        txtemail.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtemail.setForeground(new java.awt.Color(0, 0, 146));
        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        background.add(txtemail);
        txtemail.setBounds(200, 330, 300, 40);

        lblemail.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblemail.setForeground(new java.awt.Color(0, 0, 146));
        lblemail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblemail.setText("E-mail:");
        background.add(lblemail);
        lblemail.setBounds(50, 330, 150, 40);

        txtcontactnumber.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtcontactnumber.setForeground(new java.awt.Color(0, 0, 146));
        txtcontactnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactnumberActionPerformed(evt);
            }
        });
        background.add(txtcontactnumber);
        txtcontactnumber.setBounds(200, 400, 300, 40);

        lblcontactnumber.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblcontactnumber.setForeground(new java.awt.Color(0, 0, 146));
        lblcontactnumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblcontactnumber.setText("Contact Number:");
        background.add(lblcontactnumber);
        lblcontactnumber.setBounds(50, 400, 146, 40);

        txtusername.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtusername.setForeground(new java.awt.Color(0, 0, 146));
        txtusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        background.add(txtusername);
        txtusername.setBounds(200, 470, 300, 40);

        lblusername.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblusername.setForeground(new java.awt.Color(0, 0, 146));
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblusername.setText("Username:");
        background.add(lblusername);
        lblusername.setBounds(50, 470, 150, 40);

        txtpassword.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(0, 0, 146));
        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        background.add(txtpassword);
        txtpassword.setBounds(200, 540, 300, 40);

        lblpassword.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(0, 0, 146));
        lblpassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblpassword.setText("Password:");
        background.add(lblpassword);
        lblpassword.setBounds(50, 540, 150, 40);

        lbltype.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lbltype.setForeground(new java.awt.Color(0, 0, 146));
        lbltype.setText("Account Type:");
        background.add(lbltype);
        lbltype.setBounds(550, 260, 130, 40);

        txttype.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txttype.setForeground(new java.awt.Color(0, 0, 146));
        txttype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });
        background.add(txttype);
        txttype.setBounds(550, 330, 180, 40);

        lblstatus.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        lblstatus.setForeground(new java.awt.Color(0, 0, 146));
        lblstatus.setText("Status:");
        background.add(lblstatus);
        lblstatus.setBounds(550, 400, 60, 40);

        txtstatus.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        txtstatus.setForeground(new java.awt.Color(0, 0, 146));
        txtstatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
            }
        });
        background.add(txtstatus);
        txtstatus.setBounds(550, 470, 180, 40);

        picture.setFont(new java.awt.Font("Candara", 0, 11)); // NOI18N
        picture.setForeground(new java.awt.Color(46, 49, 146));
        picture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(picture);
        picture.setBounds(610, 20, 190, 170);

        changepass.setBackground(new java.awt.Color(255, 255, 255));
        changepass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        changepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changepassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changepassMouseExited(evt);
            }
        });
        changepass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblreset.setBackground(new java.awt.Color(255, 255, 255));
        lblreset.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        lblreset.setForeground(new java.awt.Color(0, 0, 146));
        lblreset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblreset.setText("CHANGE PASSWORD");
        changepass.add(lblreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 30));

        background.add(changepass);
        changepass.setBounds(500, 610, 270, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttypeActionPerformed

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatusActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        if ("admin".equals(source)) {
            adminForm parentFrame = (adminForm) SwingUtilities.getWindowAncestor(this);
            parentFrame.restoreOriginalState();
            System.out.println("Go Back to Admin Form!");
        } 
        if ("user".equals(source)) {
            userForm parentFrame = (userForm) SwingUtilities.getWindowAncestor(this);
            parentFrame.restoreOriginalState();
            System.out.println("Go Back to User Form!");
        }
    }//GEN-LAST:event_backMouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        Session shesh = Session.getInstance();
        id.setText(""+shesh.getUid());
        txtfirstname.setText(""+shesh.getFname());
        txtlastname.setText(""+shesh.getLname());
        txtemail.setText(""+shesh.getEmail());
        txtcontactnumber.setText(""+shesh.getContactnumber());
        txtusername.setText(""+shesh.getUsername());
        txtpassword.setText("**************************************************");
        txttype.setText(""+shesh.getType());
        txtstatus.setText(""+shesh.getStatus());
        String picturePath = shesh.getPicturePath();
        ImageIcon imageIcon = new ImageIcon(picturePath);
        Image image = imageIcon.getImage().getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_SMOOTH);
        picture.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_formInternalFrameActivated

    private void changepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseClicked
        closeAllInternalFrames();
        if ("admin".equals(source)) {
            changepassForm cpf = new changepassForm(admindesktop, source);
            admindesktop.add(cpf).setVisible(true);
            System.out.println("Change Password for Admin Opens!");
        }
        if ("user".equals(source)) {
            changepassForm cpf = new changepassForm(admindesktop, source);
            admindesktop.add(cpf).setVisible(true);
            System.out.println("Change Password for User Opens!");
        }
    }//GEN-LAST:event_changepassMouseClicked

    private void changepassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseEntered
        changepass.setBackground(enterColor);
    }//GEN-LAST:event_changepassMouseEntered

    private void changepassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseExited
        changepass.setBackground(borderColor);
    }//GEN-LAST:event_changepassMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JPanel changepass;
    public javax.swing.JLabel id;
    private javax.swing.JLabel lblaccount;
    private javax.swing.JLabel lblcontactnumber;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblfirstname;
    private javax.swing.JLabel lbllastname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblreset;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JLabel lbltype;
    private javax.swing.JLabel lblusername;
    private javax.swing.JLabel picture;
    public javax.swing.JTextField txtcontactnumber;
    public javax.swing.JTextField txtemail;
    public javax.swing.JTextField txtfirstname;
    public javax.swing.JTextField txtlastname;
    public javax.swing.JPasswordField txtpassword;
    public javax.swing.JTextField txtstatus;
    public javax.swing.JTextField txttype;
    public javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}