package internalinventoryForm;

import admin.adminForm;
import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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
public class inventoryForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form inventoryForm
     * @param admindesktop
     * @param source
     */
    public inventoryForm(JDesktopPane admindesktop, String source) {
        initComponents();
        
        this.source = source;
        this.admindesktop = admindesktop;
        tabletoryForm ttf = new tabletoryForm();
        inventorydesktop.add(ttf);
        ttf.setVisible(true);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        update.setEnabled(false);
    }
    
    public JLabel getLblMessage() {
        return lblmessage;
    }
    
    private String source;
    private JDesktopPane admindesktop; 
    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);
    
    private void closeAllInternalFrames() {
        JInternalFrame[] frames = inventorydesktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            frame.dispose();
        }
    }
        
    public void restoreOriginalState() {
        JInternalFrame[] frames = inventorydesktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame  instanceof tabletoryForm) {
                frame.dispose();
                break;
            }
        }
        tabletoryForm ttf = new tabletoryForm();
        inventorydesktop.add(ttf);
        ttf.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        lblmessage = new javax.swing.JLabel();
        create = new javax.swing.JPanel();
        lblcreate = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        lblupdate = new javax.swing.JLabel();
        archive = new javax.swing.JPanel();
        lblarchive = new javax.swing.JLabel();
        print = new javax.swing.JPanel();
        lblprint = new javax.swing.JLabel();
        inventorydesktop = new javax.swing.JDesktopPane();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        background.setPreferredSize(new java.awt.Dimension(550, 490));
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

        lblmessage.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblmessage.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage);
        lblmessage.setBounds(70, 20, 150, 30);

        create.setBackground(new java.awt.Color(255, 255, 255));
        create.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        create.setPreferredSize(new java.awt.Dimension(60, 30));
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createMouseExited(evt);
            }
        });
        create.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcreate.setBackground(new java.awt.Color(255, 255, 255));
        lblcreate.setFont(new java.awt.Font("Cambria", 1, 10)); // NOI18N
        lblcreate.setForeground(new java.awt.Color(0, 0, 146));
        lblcreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcreate.setText("CREATE");
        create.add(lblcreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 60, 30));

        background.add(create);
        create.setBounds(230, 20, 70, 30);

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblupdate.setBackground(new java.awt.Color(255, 255, 255));
        lblupdate.setFont(new java.awt.Font("Cambria", 1, 10)); // NOI18N
        lblupdate.setForeground(new java.awt.Color(0, 0, 146));
        lblupdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblupdate.setText("UPDATE");
        update.add(lblupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        background.add(update);
        update.setBounds(310, 20, 70, 30);

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

        inventorydesktop.setBackground(new java.awt.Color(255, 255, 255));
        inventorydesktop.setForeground(new java.awt.Color(0, 0, 146));

        javax.swing.GroupLayout inventorydesktopLayout = new javax.swing.GroupLayout(inventorydesktop);
        inventorydesktop.setLayout(inventorydesktopLayout);
        inventorydesktopLayout.setHorizontalGroup(
            inventorydesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        inventorydesktopLayout.setVerticalGroup(
            inventorydesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        background.add(inventorydesktop);
        inventorydesktop.setBounds(10, 60, 530, 420);

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

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        JInternalFrame selectedFrame = inventorydesktop.getSelectedFrame();
        update.setEnabled(true);
        if (selectedFrame instanceof tabletoryForm) {
            tabletoryForm tlf = (tabletoryForm) selectedFrame;
            if (tlf != null && tlf.getSelectedRowIndex() != -1) {
                try {
                    int inventoryId = tlf.getSelectedInventoryId();                    
                    dbConnector connector = new dbConnector();
                    ResultSet resultSet = connector.getData("SELECT * FROM tbl_inventory WHERE i_id = '"+ inventoryId +"' ");
                    if(resultSet.next()){
                        closeAllInternalFrames();
                        String selectedProductId = resultSet.getString("p_id");
                        inventoryeditForm ief = new inventoryeditForm(false, selectedProductId);
                        System.out.println("Update Inventory Opens!");
                        lblmessage.setText("");
                        inventorydesktop.add(ief).setVisible(true);
                        ief.id.setText(""+resultSet.getInt("i_id"));
                        ief.fillproductID();
                        java.sql.Date date = resultSet.getDate("i_date");
                        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); // Format to display
                        String formattedDate = dateFormat.format(date);
                        ief.txtdate.setText(formattedDate);
                        ief.txtastocks.setText(""+resultSet.getString("i_availablestocks"));
                        ief.txtsstocks.setText(""+resultSet.getString("i_soldstocks"));
                        ief.txtlstocks.setText(""+resultSet.getString("i_lossstocks"));
                        ief.boxstatus.setSelectedItem(""+resultSet.getString("i_status"));
                    }
                } catch (SQLException ex) {
                }
            } else {
                update.setEnabled(false);
                System.out.println("No Selected Item!");
                lblmessage.setText("Please select an Item!");
            }
        } else {
            update.setEnabled(false);
            System.out.println("No Selected Item!");
            lblmessage.setText("Please select an Item!");
        }
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(enterColor);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(borderColor);
    }//GEN-LAST:event_updateMouseExited

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
        closeAllInternalFrames();
        inventoryeditForm ief = new inventoryeditForm(true, null);
        System.out.println("Create Inventory Opens!");
        lblmessage.setText("");
        inventorydesktop.add(ief).setVisible(true);
    }//GEN-LAST:event_createMouseClicked

    private void createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseEntered
        create.setBackground(enterColor);
    }//GEN-LAST:event_createMouseEntered

    private void createMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseExited
        create.setBackground(borderColor);
    }//GEN-LAST:event_createMouseExited

    private void archiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseClicked
        JInternalFrame selectedFrame = inventorydesktop.getSelectedFrame();
        if (selectedFrame instanceof tabletoryForm) {
            tabletoryForm tlf = (tabletoryForm) selectedFrame;
            if (tlf != null && tlf.getSelectedRowIndex() != -1) {
                try {
                    int inventoryId = tlf.getSelectedInventoryId();
                    dbConnector connector = new dbConnector();
                    String updateQuery = "UPDATE tbl_inventory SET i_status = 'Archive' WHERE i_id = '"+ inventoryId +"'";
                    connector.updateData(updateQuery);
                    ResultSet resultSet = connector.getData("SELECT * FROM tbl_inventory WHERE i_id = '"+ inventoryId +"' ");
                    if(resultSet.next()){
                        closeAllInternalFrames();
                        inventoryarchiveForm iaf = new inventoryarchiveForm();
                        System.out.println("Archive Inventory Opens!");
                        lblmessage.setText("Accomplished Successfully!");
                        inventorydesktop.add(iaf).setVisible(true);
                    }
                } catch (SQLException ex) {
                }
            } else {
                closeAllInternalFrames();
                inventoryarchiveForm iaf = new inventoryarchiveForm();
                System.out.println("Archive Inventory Opens!");
                lblmessage.setText("");
                inventorydesktop.add(iaf).setVisible(true);
            }
        }else {
            closeAllInternalFrames();
            inventoryarchiveForm iaf = new inventoryarchiveForm();
            System.out.println("Archive Inventory Opens!");
            lblmessage.setText("");
            inventorydesktop.add(iaf).setVisible(true);
        }
    }//GEN-LAST:event_archiveMouseClicked

    private void archiveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseEntered
        archive.setBackground(enterColor);
    }//GEN-LAST:event_archiveMouseEntered

    private void archiveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseExited
        archive.setBackground(borderColor);
    }//GEN-LAST:event_archiveMouseExited

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        closeAllInternalFrames();
        inventoryprintForm ipf = new inventoryprintForm(admindesktop, source);
        System.out.println("Print Inventory Opens!");
        lblmessage.setText("");
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
    private javax.swing.JPanel create;
    public javax.swing.JDesktopPane inventorydesktop;
    private javax.swing.JLabel lblarchive;
    private javax.swing.JLabel lblcreate;
    public javax.swing.JLabel lblmessage;
    private javax.swing.JLabel lblprint;
    private javax.swing.JLabel lblupdate;
    private javax.swing.JPanel print;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}