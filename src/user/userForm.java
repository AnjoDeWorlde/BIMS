package user;

import admin.*;
import config.Session;
import internalinventoryForm.inventoryForm;
import internalproductForm.productlistsForm;
import internalprofileForm.profileForm;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import starting.loginForm;

/**
 *
 * @author DERECHO
 */
public class userForm extends javax.swing.JFrame {

    /**
     * Creates new form adminForm
     */
    public userForm() {
        initComponents();
        
        homeForm tlf = new homeForm();
        admindesktop.add(tlf);
        tlf.setVisible(true);
    }

    Color navColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);
    
    public void closeAllInternalFrames() {
        JInternalFrame[] frames = admindesktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            frame.dispose();
        }
    }
    
    public void restoreOriginalState() {
        JInternalFrame[] frames = admindesktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame  instanceof homeForm) {
                frame.dispose();
                break;
            }
        }
        homeForm hf = new homeForm();
        admindesktop.add(hf);
        hf.setVisible(true);
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        navigation = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        profile = new javax.swing.JPanel();
        lblprofile = new javax.swing.JLabel();
        products = new javax.swing.JPanel();
        lblproducts = new javax.swing.JLabel();
        inventory = new javax.swing.JPanel();
        lblinventory = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        admindesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1001, 670));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        navigation.setBackground(new java.awt.Color(255, 255, 255));
        navigation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        navigation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        navigation.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 150));

        type.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        type.setForeground(new java.awt.Color(0, 0, 146));
        type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        type.setText("(type)");
        navigation.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 170, 20));

        lname.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        lname.setForeground(new java.awt.Color(0, 0, 146));
        lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lname.setText("USER");
        lname.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lname.setVerifyInputWhenFocusTarget(false);
        lname.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        navigation.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 170, 20));

        profile.setBackground(new java.awt.Color(255, 255, 255));
        profile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        lblprofile.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        lblprofile.setForeground(new java.awt.Color(0, 0, 146));
        lblprofile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblprofile.setText("PROFILE");
        profile.add(lblprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 20));

        navigation.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, 40));

        products.setBackground(new java.awt.Color(255, 255, 255));
        products.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productsMouseExited(evt);
            }
        });
        products.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblproducts.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        lblproducts.setForeground(new java.awt.Color(0, 0, 146));
        lblproducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblproducts.setText("PRODUCTS");
        products.add(lblproducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 20));

        navigation.add(products, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 130, 40));

        inventory.setBackground(new java.awt.Color(255, 255, 255));
        inventory.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        lblinventory.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        lblinventory.setForeground(new java.awt.Color(0, 0, 146));
        lblinventory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblinventory.setText("INVENTORY");
        inventory.add(lblinventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 20));

        navigation.add(inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 40));

        logout.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        logout.setForeground(new java.awt.Color(0, 0, 146));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        logout.setText("LOGOUT");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        navigation.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 150, 40));

        background.add(navigation);
        navigation.setBounds(0, 0, 170, 670);

        admindesktop.setBackground(new java.awt.Color(255, 255, 255));
        admindesktop.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));

        javax.swing.GroupLayout admindesktopLayout = new javax.swing.GroupLayout(admindesktop);
        admindesktop.setLayout(admindesktopLayout);
        admindesktopLayout.setHorizontalGroup(
            admindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );
        admindesktopLayout.setVerticalGroup(
            admindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );

        background.add(admindesktop);
        admindesktop.setBounds(170, 0, 830, 670);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        closeAllInternalFrames();
        profileForm pf = new profileForm(admindesktop, "user");
        admindesktop.add(pf).setVisible(true);
        System.out.println("Profile Starts!");
    }//GEN-LAST:event_profileMouseClicked

    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered
        profile.setBackground(enterColor);
    }//GEN-LAST:event_profileMouseEntered

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited
        profile.setBackground(navColor);
    }//GEN-LAST:event_profileMouseExited

    private void productsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsMouseEntered
        products.setBackground(enterColor);
    }//GEN-LAST:event_productsMouseEntered

    private void productsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsMouseExited
        products.setBackground(navColor);
    }//GEN-LAST:event_productsMouseExited

    private void inventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryMouseEntered
        inventory.setBackground(enterColor);
    }//GEN-LAST:event_inventoryMouseEntered

    private void inventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryMouseExited
        inventory.setBackground(navColor);
    }//GEN-LAST:event_inventoryMouseExited

    private void productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsMouseClicked
        closeAllInternalFrames();
        productlistsForm plf = new productlistsForm(admindesktop, "user");
        admindesktop.add(plf).setVisible(true);
        System.out.println("Product Lists Starts!");
    }//GEN-LAST:event_productsMouseClicked

    private void inventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryMouseClicked
        closeAllInternalFrames();
        inventoryForm inf = new inventoryForm(admindesktop, "user");
        admindesktop.add(inf).setVisible(true);
        System.out.println("Inventory Starts!");
    }//GEN-LAST:event_inventoryMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        System.out.println("Admin Logouts!");
        loginForm lgf = new loginForm();
        lgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session shesh = Session.getInstance();
        
        if(shesh.getUid() == 0){
            JOptionPane.showMessageDialog(null, "Found 404 Account Not Found, Login First!");
            loginForm lf = new loginForm();
            lf.setVisible(true);
            this.dispose();
        }else{
            lname.setText(""+shesh.getLname());
            type.setText(""+shesh.getType());
            String picturePath = shesh.getPicturePath();
            ImageIcon imageIcon = new ImageIcon(picturePath);
            Image image = imageIcon.getImage().getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_SMOOTH);
            icon.setIcon(new ImageIcon(image));
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new userForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane admindesktop;
    private javax.swing.JPanel background;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel inventory;
    private javax.swing.JLabel lblinventory;
    private javax.swing.JLabel lblproducts;
    private javax.swing.JLabel lblprofile;
    public javax.swing.JLabel lname;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel navigation;
    private javax.swing.JPanel products;
    private javax.swing.JPanel profile;
    public javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}