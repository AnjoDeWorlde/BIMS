package internalsaleForm;

import admin.adminForm;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import user.userForm;

/**
 *
 * @author DERECHO
 */
public class salesForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form salesForm
     * @param admindesktop
     * @param source
     */
    public salesForm(JDesktopPane admindesktop, String source) {
        initComponents();
        
        this.source = source;
        this.admindesktop = admindesktop;
        tableleForm ttf = new tableleForm();
        salesdesktop.add(ttf);
        ttf.setVisible(true);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    private String source;
    private JDesktopPane admindesktop; 
    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);
    
    private void closeAllInternalFrames() {
        JInternalFrame[] frames = salesdesktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            frame.dispose();
        }
    }
        
    public void restoreOriginalState() {
        JInternalFrame[] frames = salesdesktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame  instanceof tableleForm) {
                frame.dispose();
                break;
            }
        }
        tableleForm ttf = new tableleForm();
        salesdesktop.add(ttf);
        ttf.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        archive = new javax.swing.JPanel();
        lblarchive = new javax.swing.JLabel();
        print = new javax.swing.JPanel();
        lblprint = new javax.swing.JLabel();
        salesdesktop = new javax.swing.JDesktopPane();

        setBackground(new java.awt.Color(255, 255, 255));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        background.setLayout(null);

        back.setFont(new java.awt.Font("Candara", 1, 10)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 146));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("BACK");
        back.setToolTipText("");
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        background.add(back);
        back.setBounds(10, 10, 40, 20);

        archive.setBackground(new java.awt.Color(255, 255, 255));
        archive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        archive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                archiveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                archiveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                archiveMouseExited(evt);
            }
        });
        archive.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblarchive.setBackground(new java.awt.Color(255, 255, 255));
        lblarchive.setFont(new java.awt.Font("Cambria", 1, 10)); // NOI18N
        lblarchive.setForeground(new java.awt.Color(0, 0, 146));
        lblarchive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblarchive.setText("ARCHIVE");
        archive.add(lblarchive, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        background.add(archive);
        archive.setBounds(390, 20, 80, 30);

        print.setBackground(new java.awt.Color(255, 255, 255));
        print.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printMouseExited(evt);
            }
        });
        print.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblprint.setBackground(new java.awt.Color(255, 255, 255));
        lblprint.setFont(new java.awt.Font("Cambria", 1, 10)); // NOI18N
        lblprint.setForeground(new java.awt.Color(0, 0, 146));
        lblprint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblprint.setText("PRINT");
        print.add(lblprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 50, 30));

        background.add(print);
        print.setBounds(480, 20, 60, 30);

        salesdesktop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout salesdesktopLayout = new javax.swing.GroupLayout(salesdesktop);
        salesdesktop.setLayout(salesdesktopLayout);
        salesdesktopLayout.setHorizontalGroup(
            salesdesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        salesdesktopLayout.setVerticalGroup(
            salesdesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        background.add(salesdesktop);
        salesdesktop.setBounds(10, 60, 530, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        if ("admin".equals(source)) {
            adminForm parentFrame = (adminForm) SwingUtilities.getWindowAncestor(this);
            parentFrame.restoreOriginalState();
            System.out.println("Go Back to Admin Form!");
        } 
        if ("user".equals(source)) {
            userForm parentFrame = (userForm) SwingUtilities.getWindowAncestor(this);
            parentFrame.restoreOriginalState();
            System.out.println("Go Back to User Form!");
        }
    }//GEN-LAST:event_backMouseClicked

    private void archiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseClicked
        closeAllInternalFrames();
        salesarchiveForm saf = new salesarchiveForm();
        System.out.println("Archive Product Opens!");
        salesdesktop.add(saf).setVisible(true);
    }//GEN-LAST:event_archiveMouseClicked

    private void archiveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseEntered
        archive.setBackground(enterColor);
    }//GEN-LAST:event_archiveMouseEntered

    private void archiveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseExited
        archive.setBackground(borderColor);
    }//GEN-LAST:event_archiveMouseExited

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        closeAllInternalFrames();
        salesprintForm ipf = new salesprintForm(admindesktop, source);
        System.out.println("Print Sales Opens!");
        admindesktop.add(ipf).setVisible(true);
    }//GEN-LAST:event_printMouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        print.setBackground(enterColor);
    }//GEN-LAST:event_printMouseEntered

    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
        print.setBackground(borderColor);
    }//GEN-LAST:event_printMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel archive;
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JLabel lblarchive;
    private javax.swing.JLabel lblprint;
    private javax.swing.JPanel print;
    public javax.swing.JDesktopPane salesdesktop;
    // End of variables declaration//GEN-END:variables
}