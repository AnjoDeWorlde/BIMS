package internalinventoryForm;

import admin.adminForm;
import config.dbConnector;
import internalprintingForm.printallForm;
import internalprintingForm.printgroupForm;
import internalprintingForm.printselectedForm;
import internalprintingForm.printsingleForm;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public final class inventoryprintForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form inventoryprintForm
     * @param admindesktop
     * @param source
     */
    public inventoryprintForm(JDesktopPane admindesktop, String source) {
        initComponents();
        
        this.source = source;
        this.admindesktop = admindesktop;
        tabletoryForm ttf = new tabletoryForm();
        inventorydesktop.add(ttf);
        ttf.setVisible(true);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        single.setEnabled(false);
    }
    
    public JLabel getLblMessage() {
        return lblmessage;
    }
    
    private final String source;
    private final JDesktopPane admindesktop;
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

    private String formatDateString(String dateString) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = inputFormat.parse(dateString);
            SimpleDateFormat outputFormat = new SimpleDateFormat("M/d/yyyy");
            return outputFormat.format(date);
        } catch (ParseException e) {
            return dateString;
        }
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        single = new javax.swing.JPanel();
        lblsingle = new javax.swing.JLabel();
        all = new javax.swing.JPanel();
        lblall = new javax.swing.JLabel();
        group = new javax.swing.JPanel();
        lblgroup = new javax.swing.JLabel();
        selected = new javax.swing.JPanel();
        lblselected = new javax.swing.JLabel();
        inventorydesktop = new javax.swing.JDesktopPane();
        lblmessage = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(846, 786));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        background.setPreferredSize(new java.awt.Dimension(830, 750));
        background.setLayout(null);

        single.setBackground(new java.awt.Color(255, 255, 255));
        single.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        single.setPreferredSize(new java.awt.Dimension(60, 30));
        single.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                singleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                singleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                singleMouseExited(evt);
            }
        });
        single.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblsingle.setBackground(new java.awt.Color(255, 255, 255));
        lblsingle.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        lblsingle.setForeground(new java.awt.Color(0, 0, 146));
        lblsingle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsingle.setText("SINGLE");
        single.add(lblsingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        background.add(single);
        single.setBounds(340, 20, 110, 50);

        all.setBackground(new java.awt.Color(255, 255, 255));
        all.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        all.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                allMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                allMouseExited(evt);
            }
        });
        all.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblall.setBackground(new java.awt.Color(255, 255, 255));
        lblall.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        lblall.setForeground(new java.awt.Color(0, 0, 146));
        lblall.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblall.setText("ALL");
        all.add(lblall, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        background.add(all);
        all.setBounds(460, 20, 90, 50);

        group.setBackground(new java.awt.Color(255, 255, 255));
        group.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        group.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                groupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                groupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                groupMouseExited(evt);
            }
        });
        group.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblgroup.setBackground(new java.awt.Color(255, 255, 255));
        lblgroup.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        lblgroup.setForeground(new java.awt.Color(0, 0, 146));
        lblgroup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblgroup.setText("GROUP");
        group.add(lblgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        background.add(group);
        group.setBounds(560, 20, 110, 50);

        selected.setBackground(new java.awt.Color(255, 255, 255));
        selected.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        selected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectedMouseExited(evt);
            }
        });
        selected.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblselected.setBackground(new java.awt.Color(255, 255, 255));
        lblselected.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        lblselected.setForeground(new java.awt.Color(0, 0, 146));
        lblselected.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblselected.setText("SELECTED");
        selected.add(lblselected, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        background.add(selected);
        selected.setBounds(680, 20, 130, 50);

        inventorydesktop.setBackground(new java.awt.Color(255, 255, 255));
        inventorydesktop.setPreferredSize(new java.awt.Dimension(790, 630));

        javax.swing.GroupLayout inventorydesktopLayout = new javax.swing.GroupLayout(inventorydesktop);
        inventorydesktop.setLayout(inventorydesktopLayout);
        inventorydesktopLayout.setHorizontalGroup(
            inventorydesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        inventorydesktopLayout.setVerticalGroup(
            inventorydesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        background.add(inventorydesktop);
        inventorydesktop.setBounds(20, 100, 790, 630);

        lblmessage.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        lblmessage.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmessage.setText("PRINTING");
        background.add(lblmessage);
        lblmessage.setBounds(100, 30, 230, 30);

        back.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
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
        back.setBounds(20, 20, 70, 40);

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

    private void singleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singleMouseClicked
        JInternalFrame selectedFrame = inventorydesktop.getSelectedFrame();
        single.setEnabled(true);
        if (selectedFrame instanceof tabletoryForm) {
            tabletoryForm tlf = (tabletoryForm) selectedFrame;
            if (tlf != null && tlf.getSelectedRowIndex() != -1) {
                try {
                    int inventoryId = tlf.getSelectedInventoryId();
                    dbConnector connector = new dbConnector();
                    ResultSet resultSet = connector.getData("SELECT * FROM tbl_inventory WHERE i_id = '"+ inventoryId +"' ");
                    if(resultSet.next()){
                        closeAllInternalFrames();
                        printsingleForm psf = new printsingleForm("inventory");
                        System.out.println("Single Printing Inventory Opens!");
                        lblmessage.setText("");
                        inventorydesktop.add(psf).setVisible(true);
                        
                        int id = resultSet.getInt("i_id");
                        String productId = resultSet.getString("p_id");
                        String date = resultSet.getString("i_date");
                        String availableStocks = resultSet.getString("i_availablestocks");
                        String soldStocks = resultSet.getString("i_soldstocks");
                        String lossStocks = resultSet.getString("i_lossstocks");
                        String status = resultSet.getString("i_status");

                        ResultSet productResultSet = connector.getData("SELECT p_name FROM tbl_products WHERE p_id = '"+ productId +"' ");
                        String productName = productId; 
                        if (productResultSet.next()) {
                            productName = productResultSet.getString("p_name");
                        }                        
                        psf.status.setText(status);
                        psf.id.setText("Inventory #" + id);
                        psf.date.setText(formatDateString(date));
                        psf.productID.setText(" Product Name                :             " + productName);
                        psf.label.setText(" Stocks                                :");
                        psf.variableX.setText("                  Available          :             " + availableStocks);
                        psf.variableY.setText("                  Sold                    :            " + soldStocks);
                        psf.variableZ.setText("                  Loss                    :            " + lossStocks);
                    } else {
                        single.setEnabled(false);
                        System.out.println("No Selected Item!");
                        lblmessage.setText("No Selected Item!");
                    }
                } catch (SQLException ex) {
                }
            } else {
                single.setEnabled(false);
                System.out.println("No Selected Item!");
                lblmessage.setText("No Selected Item!");
            }
        } else {
            single.setEnabled(false);
            System.out.println("No Selected Item!");
            lblmessage.setText("No Selected Item!");
        }
    }//GEN-LAST:event_singleMouseClicked

    private void singleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singleMouseEntered
        single.setBackground(enterColor);
    }//GEN-LAST:event_singleMouseEntered

    private void singleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singleMouseExited
        single.setBackground(borderColor);
    }//GEN-LAST:event_singleMouseExited

    private void allMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allMouseClicked
        closeAllInternalFrames();
        printallForm paf = new printallForm("inventory");
        paf.kind.setText("I N V E N T O R Y");
        System.out.println("All Printing Inventory Opens!");
        lblmessage.setText("");
        inventorydesktop.add(paf).setVisible(true);
    }//GEN-LAST:event_allMouseClicked

    private void allMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allMouseEntered
        all.setBackground(enterColor);
    }//GEN-LAST:event_allMouseEntered

    private void allMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allMouseExited
        all.setBackground(borderColor);
    }//GEN-LAST:event_allMouseExited

    private void groupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_groupMouseClicked
        closeAllInternalFrames();
        printgroupForm pgf = new printgroupForm("inventory");
        pgf.kind.setText("I N V E N T O R Y");
        System.out.println("Group Printing Inventory Opens!");
        lblmessage.setText("");
        inventorydesktop.add(pgf).setVisible(true);
    }//GEN-LAST:event_groupMouseClicked

    private void groupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_groupMouseEntered
       group.setBackground(enterColor);
    }//GEN-LAST:event_groupMouseEntered

    private void groupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_groupMouseExited
       group.setBackground(borderColor);
    }//GEN-LAST:event_groupMouseExited

    private void selectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectedMouseClicked
        closeAllInternalFrames();
        printselectedForm psf = new printselectedForm("inventory");
        psf.kind.setText("I N V E N T O R Y");
        System.out.println("Selected Printing Inventory Opens!");
        lblmessage.setText("");
        inventorydesktop.add(psf).setVisible(true);
    }//GEN-LAST:event_selectedMouseClicked

    private void selectedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectedMouseEntered
        selected.setBackground(enterColor);
    }//GEN-LAST:event_selectedMouseEntered

    private void selectedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectedMouseExited
        selected.setBackground(borderColor);
    }//GEN-LAST:event_selectedMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        if ("admin".equals(source)) {
            adminForm grandparentFrame = (adminForm) SwingUtilities.getWindowAncestor(this);
            grandparentFrame.closeAllInternalFrames();
            inventoryForm inf = new inventoryForm(admindesktop, source);
            admindesktop.add(inf).setVisible(true);
            System.out.println("Go Back!");
        }
        if ("user".equals(source)) {
            userForm grandparentFrame = (userForm) SwingUtilities.getWindowAncestor(this);
            grandparentFrame.closeAllInternalFrames();
            inventoryForm usf = new inventoryForm(admindesktop, source);
            admindesktop.add(usf).setVisible(true);
            System.out.println("Go Back to User Sales Form!");
        }
    }//GEN-LAST:event_backMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel all;
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JPanel group;
    public javax.swing.JDesktopPane inventorydesktop;
    private javax.swing.JLabel lblall;
    private javax.swing.JLabel lblgroup;
    public javax.swing.JLabel lblmessage;
    private javax.swing.JLabel lblselected;
    private javax.swing.JLabel lblsingle;
    private javax.swing.JPanel selected;
    private javax.swing.JPanel single;
    // End of variables declaration//GEN-END:variables
}