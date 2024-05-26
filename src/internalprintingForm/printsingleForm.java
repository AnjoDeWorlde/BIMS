package internalprintingForm;

import config.PanelPrinter;
import internalinventoryForm.inventoryprintForm;
import internalsaleForm.salesprintForm;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author DERECHO
 */
public class printsingleForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form printsingleForm
     * @param source
     */
    public printsingleForm(String source) {
        initComponents();
        
        this.source = source;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
    private String source;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        print = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        page = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        seperate5 = new javax.swing.JSeparator();
        seperate4 = new javax.swing.JSeparator();
        seperate1 = new javax.swing.JSeparator();
        seperate2 = new javax.swing.JSeparator();
        productID = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        variableX = new javax.swing.JLabel();
        variableY = new javax.swing.JLabel();
        variableZ = new javax.swing.JLabel();
        seperate3 = new javax.swing.JSeparator();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        print.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        print.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        print.setText("Print");
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        background.add(print);
        print.setBounds(20, 10, 70, 30);

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
        back.setBounds(450, 10, 70, 20);

        page.setBackground(new java.awt.Color(255, 255, 255));
        page.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 8));
        page.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo_wname_orig35.jpg"))); // NOI18N
        page.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 310, 60));

        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 470, 20));

        id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 470, 20));

        date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 470, 20));

        seperate5.setForeground(new java.awt.Color(0, 0, 0));
        seperate5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        page.add(seperate5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 10, 250));

        seperate4.setForeground(new java.awt.Color(0, 0, 0));
        seperate4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        page.add(seperate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 20, 250));

        seperate1.setForeground(new java.awt.Color(0, 0, 0));
        page.add(seperate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 470, 10));

        seperate2.setForeground(new java.awt.Color(0, 0, 0));
        page.add(seperate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 470, 10));

        productID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        page.add(productID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 430, 20));

        label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        page.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 430, 20));

        variableX.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        page.add(variableX, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 430, 20));

        variableY.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        page.add(variableY, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 430, 20));

        variableZ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        page.add(variableZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 430, 20));

        seperate3.setForeground(new java.awt.Color(0, 0, 0));
        page.add(seperate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 470, 10));

        background.add(page);
        page.setBounds(0, 50, 530, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        JPanel myPanel = new JPanel();
        PanelPrinter pPrint = new PanelPrinter(page);
        pPrint.printPanel();
    }//GEN-LAST:event_printMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        if (source.equals("sales")) {
            salesprintForm salesFrame = (salesprintForm) SwingUtilities.getAncestorOfClass(salesprintForm.class, this);
            salesFrame.restoreOriginalState();
            System.out.println("Go Back!");
         } 
         if (source.equals("inventory")) {
            inventoryprintForm inventoryFrame = (inventoryprintForm) SwingUtilities.getAncestorOfClass(inventoryprintForm.class, this);
            inventoryFrame.restoreOriginalState();
            System.out.println("Go Back!");
        }
    }//GEN-LAST:event_backMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    public javax.swing.JLabel date;
    public javax.swing.JLabel id;
    public javax.swing.JLabel label;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel page;
    private javax.swing.JLabel print;
    public javax.swing.JLabel productID;
    private javax.swing.JSeparator seperate1;
    private javax.swing.JSeparator seperate2;
    private javax.swing.JSeparator seperate3;
    private javax.swing.JSeparator seperate4;
    private javax.swing.JSeparator seperate5;
    public javax.swing.JLabel status;
    public javax.swing.JLabel variableX;
    public javax.swing.JLabel variableY;
    public javax.swing.JLabel variableZ;
    // End of variables declaration//GEN-END:variables
}