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
        box1 = new javax.swing.JPanel();
        pic1 = new javax.swing.JLabel();
        box3 = new javax.swing.JPanel();
        pic3 = new javax.swing.JLabel();
        box4 = new javax.swing.JPanel();
        pic4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(846, 706));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        background.setPreferredSize(new java.awt.Dimension(830, 750));
        background.setLayout(null);

        lblgreetings.setFont(new java.awt.Font("Candara", 1, 38)); // NOI18N
        lblgreetings.setForeground(new java.awt.Color(46, 49, 146));
        lblgreetings.setText("Welcome to");
        lblgreetings.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        background.add(lblgreetings);
        lblgreetings.setBounds(230, 30, 200, 50);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logooo1.png"))); // NOI18N
        background.add(logo);
        logo.setBounds(440, 10, 100, 90);

        box1.setBackground(new java.awt.Color(255, 255, 255));
        box1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 5));
        box1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pic1.setBackground(new java.awt.Color(255, 255, 255));
        pic1.setFont(new java.awt.Font("Candara", 0, 11)); // NOI18N
        pic1.setForeground(new java.awt.Color(46, 49, 146));
        pic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businesslogo.png"))); // NOI18N
        box1.add(pic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 770, 260));

        background.add(box1);
        box1.setBounds(20, 100, 790, 275);

        box3.setBackground(new java.awt.Color(255, 255, 255));
        box3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 5));
        box3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pic3.setBackground(new java.awt.Color(255, 255, 255));
        pic3.setFont(new java.awt.Font("Candara", 0, 11)); // NOI18N
        pic3.setForeground(new java.awt.Color(46, 49, 146));
        pic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insidestore.png"))); // NOI18N
        box3.add(pic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 260));

        background.add(box3);
        box3.setBounds(20, 370, 280, 280);

        box4.setBackground(new java.awt.Color(255, 255, 255));
        box4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 5));
        box4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pic4.setBackground(new java.awt.Color(255, 255, 255));
        pic4.setFont(new java.awt.Font("Candara", 0, 11)); // NOI18N
        pic4.setForeground(new java.awt.Color(46, 49, 146));
        pic4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/frontviewstore.png"))); // NOI18N
        box4.add(pic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 495, 260));

        background.add(box4);
        box4.setBounds(290, 370, 520, 280);

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel box1;
    private javax.swing.JPanel box3;
    private javax.swing.JPanel box4;
    private javax.swing.JLabel lblgreetings;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic3;
    private javax.swing.JLabel pic4;
    // End of variables declaration//GEN-END:variables
}