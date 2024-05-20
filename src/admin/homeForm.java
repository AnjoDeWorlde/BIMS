package admin;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author DERECHO
 */
public class homeForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form homeForm
     */
    public homeForm() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        lblgreetings = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        randomproduct = new javax.swing.JPanel();
        directtolistofproducts = new javax.swing.JPanel();
        lblrandomproduct = new javax.swing.JLabel();
        mosthoursuseduser = new javax.swing.JPanel();
        directtolistsofuser = new javax.swing.JPanel();
        lbluserpicture = new javax.swing.JLabel();
        mostsoldproduct = new javax.swing.JPanel();
        directtolistofsales = new javax.swing.JPanel();
        soldproduct = new javax.swing.JLabel();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        lblgreetings.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        lblgreetings.setForeground(new java.awt.Color(46, 49, 146));
        lblgreetings.setText("Welcome to");
        background.add(lblgreetings);
        lblgreetings.setBounds(20, 10, 200, 60);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo_wname_orig35.jpg"))); // NOI18N
        background.add(logo);
        logo.setBounds(210, 10, 320, 60);

        randomproduct.setBackground(new java.awt.Color(255, 255, 255));
        randomproduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        randomproduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        directtolistofproducts.setBackground(new java.awt.Color(255, 255, 255));
        directtolistofproducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                directtolistofproductsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                directtolistofproductsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                directtolistofproductsMouseExited(evt);
            }
        });

        lblrandomproduct.setBackground(new java.awt.Color(255, 255, 255));
        lblrandomproduct.setForeground(new java.awt.Color(46, 49, 146));
        lblrandomproduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblrandomproduct.setText("randomProduct.png");

        javax.swing.GroupLayout directtolistofproductsLayout = new javax.swing.GroupLayout(directtolistofproducts);
        directtolistofproducts.setLayout(directtolistofproductsLayout);
        directtolistofproductsLayout.setHorizontalGroup(
            directtolistofproductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblrandomproduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        directtolistofproductsLayout.setVerticalGroup(
            directtolistofproductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(directtolistofproductsLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lblrandomproduct)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        randomproduct.add(directtolistofproducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        background.add(randomproduct);
        randomproduct.setBounds(80, 70, 210, 190);

        mosthoursuseduser.setBackground(new java.awt.Color(255, 255, 255));
        mosthoursuseduser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        mosthoursuseduser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        directtolistsofuser.setBackground(new java.awt.Color(255, 255, 255));
        directtolistsofuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                directtolistsofuserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                directtolistsofuserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                directtolistsofuserMouseExited(evt);
            }
        });

        lbluserpicture.setBackground(new java.awt.Color(255, 255, 255));
        lbluserpicture.setForeground(new java.awt.Color(46, 49, 146));
        lbluserpicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbluserpicture.setText("userpicture.png");

        javax.swing.GroupLayout directtolistsofuserLayout = new javax.swing.GroupLayout(directtolistsofuser);
        directtolistsofuser.setLayout(directtolistsofuserLayout);
        directtolistsofuserLayout.setHorizontalGroup(
            directtolistsofuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbluserpicture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        directtolistsofuserLayout.setVerticalGroup(
            directtolistsofuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(directtolistsofuserLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lbluserpicture)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        mosthoursuseduser.add(directtolistsofuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        background.add(mosthoursuseduser);
        mosthoursuseduser.setBounds(320, 180, 210, 190);

        mostsoldproduct.setBackground(new java.awt.Color(255, 255, 255));
        mostsoldproduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        mostsoldproduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        directtolistofsales.setBackground(new java.awt.Color(255, 255, 255));
        directtolistofsales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                directtolistofsalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                directtolistofsalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                directtolistofsalesMouseExited(evt);
            }
        });

        soldproduct.setBackground(new java.awt.Color(255, 255, 255));
        soldproduct.setForeground(new java.awt.Color(46, 49, 146));
        soldproduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soldproduct.setText("soldProduct.png");

        javax.swing.GroupLayout directtolistofsalesLayout = new javax.swing.GroupLayout(directtolistofsales);
        directtolistofsales.setLayout(directtolistofsalesLayout);
        directtolistofsalesLayout.setHorizontalGroup(
            directtolistofsalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(soldproduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        directtolistofsalesLayout.setVerticalGroup(
            directtolistofsalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(directtolistofsalesLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(soldproduct)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        mostsoldproduct.add(directtolistofsales, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        background.add(mostsoldproduct);
        mostsoldproduct.setBounds(20, 270, 210, 190);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void directtolistofproductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directtolistofproductsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_directtolistofproductsMouseClicked

    private void directtolistofproductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directtolistofproductsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_directtolistofproductsMouseEntered

    private void directtolistofproductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directtolistofproductsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_directtolistofproductsMouseExited

    private void directtolistsofuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directtolistsofuserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_directtolistsofuserMouseClicked

    private void directtolistsofuserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directtolistsofuserMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_directtolistsofuserMouseEntered

    private void directtolistsofuserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directtolistsofuserMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_directtolistsofuserMouseExited

    private void directtolistofsalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directtolistofsalesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_directtolistofsalesMouseClicked

    private void directtolistofsalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directtolistofsalesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_directtolistofsalesMouseEntered

    private void directtolistofsalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_directtolistofsalesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_directtolistofsalesMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel directtolistofproducts;
    private javax.swing.JPanel directtolistofsales;
    private javax.swing.JPanel directtolistsofuser;
    private javax.swing.JLabel lblgreetings;
    private javax.swing.JLabel lblrandomproduct;
    private javax.swing.JLabel lbluserpicture;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel mosthoursuseduser;
    private javax.swing.JPanel mostsoldproduct;
    private javax.swing.JPanel randomproduct;
    private javax.swing.JLabel soldproduct;
    // End of variables declaration//GEN-END:variables
}