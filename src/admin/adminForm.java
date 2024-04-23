package admin;

import config.Session;
import java.awt.Color;
import internalForm.*;
import javax.swing.JOptionPane;
import starting.loginForm;
/**
 *
 * @author DERECHO
 */
public class adminForm extends javax.swing.JFrame {

    /**
     * Creates new form adminForm
     */
    public adminForm() {
        initComponents();
    }

    Color navColor = new Color(0,51,0);
    Color enterColor = new Color(204,255,204);
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        userlists = new javax.swing.JPanel();
        lbluserlists = new javax.swing.JLabel();
        settings = new javax.swing.JPanel();
        lblsettings = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        admindesktop = new javax.swing.JDesktopPane();

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
        navigation.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 20));

        lname.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lname.setText("ADMIN");
        lname.setVerifyInputWhenFocusTarget(false);
        lname.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        navigation.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 120));

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
        lblhome.setText(" HOME");
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

        userlists.setBackground(new java.awt.Color(0, 51, 0));
        userlists.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userlistsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userlistsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userlistsMouseExited(evt);
            }
        });
        userlists.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbluserlists.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lbluserlists.setForeground(new java.awt.Color(255, 255, 255));
        lbluserlists.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbluserlists.setText(" USER LISTS");
        userlists.add(lbluserlists, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        navigation.add(userlists, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, 40));

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

        navigation.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 220, 40));

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

        admindesktop.setBackground(new java.awt.Color(204, 255, 204));
        admindesktop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204), 5));

        javax.swing.GroupLayout admindesktopLayout = new javax.swing.GroupLayout(admindesktop);
        admindesktop.setLayout(admindesktopLayout);
        admindesktopLayout.setHorizontalGroup(
            admindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        admindesktopLayout.setVerticalGroup(
            admindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        background.add(admindesktop);
        admindesktop.setBounds(220, 60, 480, 460);

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
        profileForm prf = new profileForm();
        System.out.println("Admin clicked Profile!");
        admindesktop.add(prf).setVisible(true);
    }//GEN-LAST:event_profileMouseClicked

    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered
        profile.setBackground(enterColor);
    }//GEN-LAST:event_profileMouseEntered

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited
        profile.setBackground(navColor);
    }//GEN-LAST:event_profileMouseExited

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        home.setBackground(enterColor);
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        home.setBackground(navColor);
    }//GEN-LAST:event_homeMouseExited

    private void inventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryMouseEntered
        inventory.setBackground(enterColor);
    }//GEN-LAST:event_inventoryMouseEntered

    private void inventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryMouseExited
        inventory.setBackground(navColor);
    }//GEN-LAST:event_inventoryMouseExited

    private void userlistsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userlistsMouseEntered
        userlists.setBackground(enterColor);
    }//GEN-LAST:event_userlistsMouseEntered

    private void userlistsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userlistsMouseExited
        userlists.setBackground(navColor);
    }//GEN-LAST:event_userlistsMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        settings.setBackground(enterColor);
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        settings.setBackground(navColor);
    }//GEN-LAST:event_settingsMouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        homeForm hmf = new homeForm();
        System.out.println("Admin clicked Home!");
        admindesktop.add(hmf).setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void inventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryMouseClicked
        inventoryForm inf = new inventoryForm();
        System.out.println("Admin clicked Inventory!");
        admindesktop.add(inf).setVisible(true);
    }//GEN-LAST:event_inventoryMouseClicked

    private void userlistsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userlistsMouseClicked
        userlistsForm usf = new userlistsForm();
        System.out.println("Admin clicked User Lists!");
        admindesktop.add(usf).setVisible(true);
    }//GEN-LAST:event_userlistsMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        settingsForm stf = new settingsForm();
        System.out.println("Admin clicked Settings!");
        admindesktop.add(stf).setVisible(true);
    }//GEN-LAST:event_settingsMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        System.out.println("Login Returned!");
        loginForm lgf = new loginForm();
        lgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

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
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane admindesktop;
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JPanel header;
    private javax.swing.JPanel home;
    private javax.swing.JPanel inventory;
    private javax.swing.JLabel lblhome;
    private javax.swing.JLabel lblinventory;
    private javax.swing.JLabel lblprofile;
    private javax.swing.JLabel lblsettings;
    private javax.swing.JLabel lbluserlists;
    public javax.swing.JLabel lname;
    private javax.swing.JPanel navigation;
    private javax.swing.JPanel profile;
    private javax.swing.JPanel settings;
    public javax.swing.JLabel type;
    private javax.swing.JPanel userlists;
    // End of variables declaration//GEN-END:variables
}
