package user;

import config.Session;
import java.awt.Color;
import javax.swing.JOptionPane;
import starting.loginForm;

/**
 *
 * @author DERECHO
 */
public class profileFForm extends javax.swing.JFrame {

    /**
     * Creates new form profileFForm
     */
    public profileFForm() {
        initComponents();
    }

    Color navColor = new Color(0,51,0);
    Color enterColor = new Color(204,255,204);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        background = new javax.swing.JPanel();
        navigation = new javax.swing.JPanel();
        type = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        profile = new javax.swing.JPanel();
        lblprofile = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        lblhome = new javax.swing.JLabel();
        inventory = new javax.swing.JPanel();
        lblinventory = new javax.swing.JLabel();
        settings = new javax.swing.JPanel();
        lblsettings = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        lblregistration = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtcontactnumber = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        boxtype = new javax.swing.JComboBox<>();
        changepass = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        background.setBackground(new java.awt.Color(204, 255, 204));
        background.setLayout(null);

        navigation.setBackground(new java.awt.Color(0, 51, 0));
        navigation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        type.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        type.setText("(type)");
        navigation.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lname.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lname.setText("USER");
        lname.setVerifyInputWhenFocusTarget(false);
        lname.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        navigation.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 220, 120));

        profile.setBackground(new java.awt.Color(0, 51, 0));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileMouseExited(evt);
            }
        });
        profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblprofile.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblprofile.setForeground(new java.awt.Color(255, 255, 255));
        lblprofile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblprofile.setText("PROFILE");
        profile.add(lblprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        navigation.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 220, 40));

        home.setBackground(new java.awt.Color(0, 51, 0));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblhome.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblhome.setForeground(new java.awt.Color(255, 255, 255));
        lblhome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhome.setText("HOME");
        home.add(lblhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        navigation.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 220, 40));

        inventory.setBackground(new java.awt.Color(0, 51, 0));
        inventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inventoryMouseExited(evt);
            }
        });
        inventory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblinventory.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblinventory.setForeground(new java.awt.Color(255, 255, 255));
        lblinventory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblinventory.setText("INVENTORY");
        inventory.add(lblinventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        navigation.add(inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 220, 40));

        settings.setBackground(new java.awt.Color(0, 51, 0));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblsettings.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblsettings.setForeground(new java.awt.Color(255, 255, 255));
        lblsettings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsettings.setText("SETTINGS");
        settings.add(lblsettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        navigation.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, 40));

        background.add(navigation);
        navigation.setBounds(0, 0, 220, 520);

        header.setBackground(new java.awt.Color(0, 51, 0));

        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(435, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(19, 19, 19))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        background.add(header);
        header.setBounds(220, 0, 480, 60);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 5));

        form.setBackground(new java.awt.Color(204, 204, 204));
        form.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3));
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        id.setForeground(new java.awt.Color(0, 51, 0));
        form.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 150, 50));

        lblregistration.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lblregistration.setForeground(new java.awt.Color(0, 51, 0));
        lblregistration.setText("Account #");
        form.add(lblregistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 420, 60));

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

        txtusername.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), "U s e r n a m e", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 9), new java.awt.Color(0, 51, 0))); // NOI18N
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        form.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 190, 40));

        txtpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), "P a s s w o r d", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 9), new java.awt.Color(0, 51, 0))); // NOI18N
        form.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 190, 40));

        boxtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "User", "Admin" }));
        boxtype.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3), "T y p e", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 9), new java.awt.Color(0, 51, 0))); // NOI18N
        boxtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxtypeActionPerformed(evt);
            }
        });
        form.add(boxtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 190, 40));

        changepass.setText("change password");
        changepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepassMouseClicked(evt);
            }
        });
        form.add(changepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 100, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        background.add(jPanel2);
        jPanel2.setBounds(220, 60, 480, 460);

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

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
       
    }//GEN-LAST:event_profileMouseClicked

    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered
        profile.setBackground(enterColor);
    }//GEN-LAST:event_profileMouseEntered

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited
        profile.setBackground(navColor);
    }//GEN-LAST:event_profileMouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
       
    }//GEN-LAST:event_homeMouseClicked

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        home.setBackground(enterColor);
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        home.setBackground(navColor);
    }//GEN-LAST:event_homeMouseExited

    private void inventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryMouseClicked
        
    }//GEN-LAST:event_inventoryMouseClicked

    private void inventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryMouseEntered
        inventory.setBackground(enterColor);
    }//GEN-LAST:event_inventoryMouseEntered

    private void inventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryMouseExited
        inventory.setBackground(navColor);
    }//GEN-LAST:event_inventoryMouseExited

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        
    }//GEN-LAST:event_settingsMouseClicked

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        settings.setBackground(enterColor);
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        settings.setBackground(navColor);
    }//GEN-LAST:event_settingsMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        
    }//GEN-LAST:event_backMouseClicked

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
            id.setText(""+shesh.getUid());
            txtfirstname.setText(""+shesh.getFname());
            txtlastname.setText(""+shesh.getLname());
            txtemail.setText(""+shesh.getEmail());
            txtcontactnumber.setText(""+shesh.getContactnumber());
            txtusername.setText(""+shesh.getUsername());
            boxtype.setSelectedItem(""+shesh.getType());
        }
    }//GEN-LAST:event_formWindowActivated

    private void changepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseClicked
        changepassForm cpf = new changepassForm();
        System.out.println("User clicked Change Password!");
        cpf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changepassMouseClicked

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
            java.util.logging.Logger.getLogger(profileFForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profileFForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profileFForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profileFForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profileFForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    public javax.swing.JComboBox<String> boxtype;
    private javax.swing.JLabel changepass;
    private javax.swing.JPanel form;
    private javax.swing.JPanel header;
    private javax.swing.JPanel home;
    public javax.swing.JLabel id;
    private javax.swing.JPanel inventory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblhome;
    private javax.swing.JLabel lblinventory;
    private javax.swing.JLabel lblprofile;
    private javax.swing.JLabel lblregistration;
    private javax.swing.JLabel lblsettings;
    public javax.swing.JLabel lname;
    private javax.swing.JPanel navigation;
    private javax.swing.JPanel profile;
    private javax.swing.JPanel settings;
    public javax.swing.JTextField txtcontactnumber;
    public javax.swing.JTextField txtemail;
    public javax.swing.JTextField txtfirstname;
    public javax.swing.JTextField txtlastname;
    private javax.swing.JPasswordField txtpassword;
    public javax.swing.JTextField txtusername;
    public javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}