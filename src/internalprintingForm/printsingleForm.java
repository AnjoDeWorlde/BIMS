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
        top = new javax.swing.JSeparator();
        mid = new javax.swing.JSeparator();
        left = new javax.swing.JSeparator();
        right = new javax.swing.JSeparator();
        productID = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        variableX = new javax.swing.JLabel();
        variableY = new javax.swing.JLabel();
        variableZ = new javax.swing.JLabel();
        bot = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(806, 666));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        background.setLayout(null);

        print.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        print.setForeground(new java.awt.Color(0, 0, 146));
        print.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        print.setText("PRINT");
        print.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        background.add(print);
        print.setBounds(320, 10, 120, 30);

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

        page.setBackground(new java.awt.Color(255, 255, 255));
        page.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 146), 3, true));
        page.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo_wname_orig35.jpg"))); // NOI18N
        page.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 370, 80));

        status.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 105, 730, 30));

        id.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 150, 730, 30));

        date.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 180, 730, 30));

        top.setForeground(new java.awt.Color(0, 0, 0));
        top.setPreferredSize(new java.awt.Dimension(0, 0));
        page.add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 750, 2));

        mid.setForeground(new java.awt.Color(0, 0, 0));
        mid.setPreferredSize(new java.awt.Dimension(0, 0));
        page.add(mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 750, 2));

        left.setForeground(new java.awt.Color(0, 0, 0));
        left.setOrientation(javax.swing.SwingConstants.VERTICAL);
        left.setPreferredSize(new java.awt.Dimension(0, 0));
        page.add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 2, 460));

        right.setForeground(new java.awt.Color(0, 0, 0));
        right.setOrientation(javax.swing.SwingConstants.VERTICAL);
        right.setPreferredSize(new java.awt.Dimension(0, 0));
        page.add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 2, 460));

        productID.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        page.add(productID, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 270, 730, 30));

        label.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        page.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 305, 730, 30));

        variableX.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        page.add(variableX, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 340, 730, 30));

        variableY.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        page.add(variableY, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 380, 730, 30));

        variableZ.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        page.add(variableZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 420, 730, 30));

        bot.setForeground(new java.awt.Color(0, 0, 0));
        bot.setPreferredSize(new java.awt.Dimension(0, 0));
        page.add(bot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 751, 2));

        background.add(page);
        page.setBounds(10, 50, 770, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JSeparator bot;
    public javax.swing.JLabel date;
    public javax.swing.JLabel id;
    public javax.swing.JLabel label;
    private javax.swing.JSeparator left;
    private javax.swing.JLabel logo;
    private javax.swing.JSeparator mid;
    private javax.swing.JPanel page;
    private javax.swing.JLabel print;
    public javax.swing.JLabel productID;
    private javax.swing.JSeparator right;
    public javax.swing.JLabel status;
    private javax.swing.JSeparator top;
    public javax.swing.JLabel variableX;
    public javax.swing.JLabel variableY;
    public javax.swing.JLabel variableZ;
    // End of variables declaration//GEN-END:variables
}