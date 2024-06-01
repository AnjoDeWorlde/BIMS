package admin;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author DERECHO
 */
public final class homeForm extends javax.swing.JInternalFrame {

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
        lblrandomproduct = new javax.swing.JLabel();
        mosthoursuseduser = new javax.swing.JPanel();
        lbluserpicture = new javax.swing.JLabel();
        mostsoldproduct = new javax.swing.JPanel();
        soldproduct = new javax.swing.JLabel();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        lblgreetings.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        lblgreetings.setForeground(new java.awt.Color(46, 49, 146));
        lblgreetings.setText("Welcome to");
        background.add(lblgreetings);
        lblgreetings.setBounds(20, 10, 200, 60);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo_wname_orig35.jpg"))); // NOI18N
        background.add(logo);
        logo.setBounds(210, 10, 320, 60);

        randomproduct.setBackground(new java.awt.Color(255, 255, 255));
        randomproduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        randomproduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblrandomproduct.setBackground(new java.awt.Color(255, 255, 255));
        lblrandomproduct.setForeground(new java.awt.Color(46, 49, 146));
        lblrandomproduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblrandomproduct.setText("randomProduct.png");
        randomproduct.add(lblrandomproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 150));

        background.add(randomproduct);
        randomproduct.setBounds(80, 70, 210, 190);

        mosthoursuseduser.setBackground(new java.awt.Color(255, 255, 255));
        mosthoursuseduser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        mosthoursuseduser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbluserpicture.setBackground(new java.awt.Color(255, 255, 255));
        lbluserpicture.setForeground(new java.awt.Color(46, 49, 146));
        lbluserpicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbluserpicture.setText("userpicture.png");
        mosthoursuseduser.add(lbluserpicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 150));

        background.add(mosthoursuseduser);
        mosthoursuseduser.setBounds(320, 180, 210, 190);

        mostsoldproduct.setBackground(new java.awt.Color(255, 255, 255));
        mostsoldproduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        mostsoldproduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        soldproduct.setBackground(new java.awt.Color(255, 255, 255));
        soldproduct.setForeground(new java.awt.Color(46, 49, 146));
        soldproduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soldproduct.setText("soldProduct.png");
        mostsoldproduct.add(soldproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 150));

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
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