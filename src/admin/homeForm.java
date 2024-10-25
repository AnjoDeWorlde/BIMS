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
        mostsoldproduct1 = new javax.swing.JPanel();
        soldproduct1 = new javax.swing.JLabel();
        randomproduct = new javax.swing.JPanel();
        lblrandomproduct = new javax.swing.JLabel();
        mostsoldproduct = new javax.swing.JPanel();
        soldproduct = new javax.swing.JLabel();
        mosthoursuseduser = new javax.swing.JPanel();
        lbluserpicture = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(846, 786));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        background.setPreferredSize(new java.awt.Dimension(830, 750));
        background.setLayout(null);

        lblgreetings.setFont(new java.awt.Font("Candara", 1, 38)); // NOI18N
        lblgreetings.setForeground(new java.awt.Color(46, 49, 146));
        lblgreetings.setText("Welcome to");
        lblgreetings.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        background.add(lblgreetings);
        lblgreetings.setBounds(20, 13, 200, 50);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo_wname_orig35.jpg"))); // NOI18N
        background.add(logo);
        logo.setBounds(280, 10, 320, 60);

        mostsoldproduct1.setBackground(new java.awt.Color(255, 255, 255));
        mostsoldproduct1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 5));
        mostsoldproduct1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        soldproduct1.setBackground(new java.awt.Color(255, 255, 255));
        soldproduct1.setFont(new java.awt.Font("Candara", 0, 11)); // NOI18N
        soldproduct1.setForeground(new java.awt.Color(46, 49, 146));
        soldproduct1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soldproduct1.setText("soldProduct.png");
        mostsoldproduct1.add(soldproduct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 150));

        background.add(mostsoldproduct1);
        mostsoldproduct1.setBounds(610, 550, 210, 190);

        randomproduct.setBackground(new java.awt.Color(255, 255, 255));
        randomproduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 5));
        randomproduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblrandomproduct.setBackground(new java.awt.Color(255, 255, 255));
        lblrandomproduct.setFont(new java.awt.Font("Candara", 0, 11)); // NOI18N
        lblrandomproduct.setForeground(new java.awt.Color(46, 49, 146));
        lblrandomproduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblrandomproduct.setText("randomProduct.png");
        randomproduct.add(lblrandomproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 150));

        background.add(randomproduct);
        randomproduct.setBounds(10, 170, 210, 190);

        mostsoldproduct.setBackground(new java.awt.Color(255, 255, 255));
        mostsoldproduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 5));
        mostsoldproduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        soldproduct.setBackground(new java.awt.Color(255, 255, 255));
        soldproduct.setFont(new java.awt.Font("Candara", 0, 11)); // NOI18N
        soldproduct.setForeground(new java.awt.Color(46, 49, 146));
        soldproduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soldproduct.setText("soldProduct.png");
        mostsoldproduct.add(soldproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 150));

        background.add(mostsoldproduct);
        mostsoldproduct.setBounds(20, 540, 210, 190);

        mosthoursuseduser.setBackground(new java.awt.Color(255, 255, 255));
        mosthoursuseduser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 5));
        mosthoursuseduser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbluserpicture.setBackground(new java.awt.Color(255, 255, 255));
        lbluserpicture.setFont(new java.awt.Font("Candara", 0, 11)); // NOI18N
        lbluserpicture.setForeground(new java.awt.Color(46, 49, 146));
        lbluserpicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbluserpicture.setText("userpicture.png");
        mosthoursuseduser.add(lbluserpicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 150));

        background.add(mosthoursuseduser);
        mosthoursuseduser.setBounds(610, 60, 210, 190);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JPanel mostsoldproduct1;
    private javax.swing.JPanel randomproduct;
    private javax.swing.JLabel soldproduct;
    private javax.swing.JLabel soldproduct1;
    // End of variables declaration//GEN-END:variables
}