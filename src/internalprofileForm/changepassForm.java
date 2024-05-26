package internalprofileForm;

import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.awt.Image;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author DERECHO
 */
public class changepassForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form changepassForm
     * @param admindesktop
     */
    public changepassForm(JDesktopPane admindesktop) {
        initComponents();
        
        this.admindesktop = admindesktop;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
    private JDesktopPane admindesktop; 
    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);
    
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
        picture = new javax.swing.JLabel();
        check = new javax.swing.JCheckBox();
        lblmessage1 = new javax.swing.JLabel();
        txtoldpass = new javax.swing.JPasswordField();
        lbloldpass = new javax.swing.JLabel();
        check1 = new javax.swing.JCheckBox();
        lblmessage2 = new javax.swing.JLabel();
        txtnewpass = new javax.swing.JPasswordField();
        lblnewpass = new javax.swing.JLabel();
        check2 = new javax.swing.JCheckBox();
        lblmessage3 = new javax.swing.JLabel();
        txtconfirmpass = new javax.swing.JPasswordField();
        lblconfirmpassw = new javax.swing.JLabel();
        changepass = new javax.swing.JPanel();
        lblreset = new javax.swing.JLabel();
        lblaccount = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

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
        background.setPreferredSize(new java.awt.Dimension(550, 480));
        background.setLayout(null);

        picture.setFont(new java.awt.Font("Candara", 0, 11)); // NOI18N
        picture.setForeground(new java.awt.Color(46, 49, 146));
        picture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(picture);
        picture.setBounds(10, 10, 110, 90);

        check.setBackground(new java.awt.Color(255, 255, 255));
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setBorder(null);
        check.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        background.add(check);
        check.setBounds(410, 120, 23, 23);

        lblmessage1.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage1.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage1);
        lblmessage1.setBounds(370, 120, 30, 30);

        txtoldpass.setFont(new java.awt.Font("Candara", 0, 13)); // NOI18N
        txtoldpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtoldpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtoldpassActionPerformed(evt);
            }
        });
        background.add(txtoldpass);
        txtoldpass.setBounds(210, 120, 190, 30);

        lbloldpass.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbloldpass.setText("Old Password:");
        background.add(lbloldpass);
        lbloldpass.setBounds(50, 120, 160, 30);

        check1.setBackground(new java.awt.Color(255, 255, 255));
        check1.setForeground(new java.awt.Color(255, 255, 255));
        check1.setBorder(null);
        check1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        check1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check1ActionPerformed(evt);
            }
        });
        background.add(check1);
        check1.setBounds(410, 180, 20, 20);

        lblmessage2.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage2.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage2);
        lblmessage2.setBounds(370, 180, 30, 30);

        txtnewpass.setFont(new java.awt.Font("Candara", 0, 13)); // NOI18N
        txtnewpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtnewpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnewpassActionPerformed(evt);
            }
        });
        background.add(txtnewpass);
        txtnewpass.setBounds(210, 180, 190, 30);

        lblnewpass.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblnewpass.setText("New Password:");
        background.add(lblnewpass);
        lblnewpass.setBounds(50, 180, 160, 30);

        check2.setBackground(new java.awt.Color(255, 255, 255));
        check2.setForeground(new java.awt.Color(255, 255, 255));
        check2.setBorder(null);
        check2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        check2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check2ActionPerformed(evt);
            }
        });
        background.add(check2);
        check2.setBounds(410, 240, 20, 20);

        lblmessage3.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblmessage3.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage3);
        lblmessage3.setBounds(370, 240, 30, 30);

        txtconfirmpass.setFont(new java.awt.Font("Candara", 0, 13)); // NOI18N
        txtconfirmpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtconfirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconfirmpassActionPerformed(evt);
            }
        });
        background.add(txtconfirmpass);
        txtconfirmpass.setBounds(210, 240, 190, 30);

        lblconfirmpassw.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblconfirmpassw.setText("Confirmed Password:");
        background.add(lblconfirmpassw);
        lblconfirmpassw.setBounds(50, 240, 160, 30);

        changepass.setBackground(new java.awt.Color(255, 255, 255));
        changepass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
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
        lblreset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblreset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblreset.setText("CHANGE PASSWORD");
        changepass.add(lblreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 150, 40));

        background.add(changepass);
        changepass.setBounds(230, 330, 160, 50);

        lblaccount.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblaccount.setForeground(new java.awt.Color(46, 49, 146));
        lblaccount.setText("Account #");
        background.add(lblaccount);
        lblaccount.setBounds(140, 30, 190, 60);

        id.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        id.setForeground(new java.awt.Color(46, 49, 146));
        background.add(id);
        id.setBounds(330, 30, 120, 60);

        back.setForeground(new java.awt.Color(46, 49, 146));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/leftarrow_orig.png"))); // NOI18N
        back.setText("BACK");
        back.setToolTipText("");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        background.add(back);
        back.setBounds(473, 11, 63, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtoldpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtoldpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtoldpassActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        Session shesh = Session.getInstance();
        id.setText(""+shesh.getUid());
        String picturePath = shesh.getPicturePath();
        ImageIcon imageIcon = new ImageIcon(picturePath);
        Image image = imageIcon.getImage().getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_SMOOTH);
        picture.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtnewpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnewpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnewpassActionPerformed

    private void txtconfirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconfirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconfirmpassActionPerformed

    private void changepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseClicked
        if(txtoldpass.getText().isEmpty() || txtnewpass.getText().isEmpty() || txtconfirmpass.getText().isEmpty()){
            System.out.println("Empty Text Fields!");
            lblmessage1.setText("***");
            lblmessage2.setText("***");
            lblmessage3.setText("***");
        }else if(txtnewpass.getText().length() < 8){
            System.out.println("Password Invalid!");
            lblmessage2.setText("***");
            txtnewpass.setText("");
            txtconfirmpass.setText("");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                Session shesh = Session.getInstance();
                String query = "SELECT * FROM tbl_user WHERE u_id = '"+shesh.getUid()+"' ";
                ResultSet resultSet = dbc.getData(query);
                if(resultSet.next()){
                    String oldpass = resultSet.getString("u_password");
                    String oldhash = passwordHasher.hashPassword(txtoldpass.getText());                    
                    if(oldpass.equals(oldhash)){
                        String newpass = passwordHasher.hashPassword(txtnewpass.getText());
                        if (newpass.equals(oldpass)) {
                            System.out.println("New and Old Password is alike!");
                            lblmessage1.setText("***");
                            lblmessage2.setText("***");
                            txtnewpass.setText("");
                            txtconfirmpass.setText("");
                        } else if(txtnewpass.getText().equals(txtconfirmpass.getText())){
                            dbc.updateData("UPDATE tbl_user SET u_password = '"+newpass+"' WHERE u_id = '"+id.getText()+"'");
                            System.out.println("Password Changed!");
                            JOptionPane.showMessageDialog(null, "Change Password Succesfully!");
                            closeAllInternalFrames();
                            profileForm pf = new profileForm(admindesktop); 
                            admindesktop.add(pf).setVisible(true);
                        }else{
                            System.out.println("Password Not Matching!");
                            lblmessage2.setText("***");
                            lblmessage3.setText("***");
                            txtconfirmpass.setText("");
                        }
                    }else{
                        System.out.println("Wrong Password!");
                        lblmessage1.setText("***");
                        txtoldpass.setText("");
                        txtnewpass.setText("");
                        txtconfirmpass.setText("");
                    }
                 }       
            }catch(SQLException  | NoSuchAlgorithmException ex){
            }
        }
    }//GEN-LAST:event_changepassMouseClicked

    private void changepassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseEntered
        changepass.setBackground(enterColor);
    }//GEN-LAST:event_changepassMouseEntered

    private void changepassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseExited
        changepass.setBackground(borderColor);
    }//GEN-LAST:event_changepassMouseExited

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        if(check.isSelected()){
            txtoldpass.setEchoChar((char)0);
        }else{
            txtoldpass.setEchoChar('*');
        }
    }//GEN-LAST:event_checkActionPerformed

    private void check1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check1ActionPerformed
        if(check1.isSelected()){
            txtnewpass.setEchoChar((char)0);
        }else{
            txtnewpass.setEchoChar('*');
        }
    }//GEN-LAST:event_check1ActionPerformed

    private void check2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check2ActionPerformed
        if(check2.isSelected()){
            txtconfirmpass.setEchoChar((char)0);
        }else{
            txtconfirmpass.setEchoChar('*');
        }
    }//GEN-LAST:event_check2ActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        closeAllInternalFrames();
        profileForm pf = new profileForm(admindesktop); 
        admindesktop.add(pf).setVisible(true);
        System.out.println("Go Back!");
    }//GEN-LAST:event_backMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JPanel changepass;
    private javax.swing.JCheckBox check;
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check2;
    public javax.swing.JLabel id;
    private javax.swing.JLabel lblaccount;
    private javax.swing.JLabel lblconfirmpassw;
    private javax.swing.JLabel lblmessage1;
    private javax.swing.JLabel lblmessage2;
    private javax.swing.JLabel lblmessage3;
    private javax.swing.JLabel lblnewpass;
    private javax.swing.JLabel lbloldpass;
    private javax.swing.JLabel lblreset;
    private javax.swing.JLabel picture;
    public javax.swing.JPasswordField txtconfirmpass;
    public javax.swing.JPasswordField txtnewpass;
    public javax.swing.JPasswordField txtoldpass;
    // End of variables declaration//GEN-END:variables
}