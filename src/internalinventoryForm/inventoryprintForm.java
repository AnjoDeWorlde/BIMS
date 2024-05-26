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

/**
 *
 * @author DERECHO
 */
public final class inventoryprintForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form inventoryprintForm
     * @param admindesktop
     */
    public inventoryprintForm(JDesktopPane admindesktop) {
        initComponents();
        
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

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        single.setBackground(new java.awt.Color(255, 255, 255));
        single.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
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
        lblsingle.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblsingle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsingle.setText("SINGLE");
        single.add(lblsingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        background.add(single);
        single.setBounds(10, 10, 70, 40);

        all.setBackground(new java.awt.Color(255, 255, 255));
        all.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
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
        lblall.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblall.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblall.setText("ALL");
        all.add(lblall, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        background.add(all);
        all.setBounds(90, 10, 70, 40);

        group.setBackground(new java.awt.Color(255, 255, 255));
        group.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
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
        lblgroup.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblgroup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblgroup.setText("GROUP");
        group.add(lblgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        background.add(group);
        group.setBounds(170, 10, 70, 40);

        selected.setBackground(new java.awt.Color(255, 255, 255));
        selected.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
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
        lblselected.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblselected.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblselected.setText("SELECTED");
        selected.add(lblselected, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 20));

        background.add(selected);
        selected.setBounds(250, 10, 80, 40);

        inventorydesktop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout inventorydesktopLayout = new javax.swing.GroupLayout(inventorydesktop);
        inventorydesktop.setLayout(inventorydesktopLayout);
        inventorydesktopLayout.setHorizontalGroup(
            inventorydesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        inventorydesktopLayout.setVerticalGroup(
            inventorydesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        background.add(inventorydesktop);
        inventorydesktop.setBounds(10, 60, 530, 410);

        lblmessage.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        lblmessage.setForeground(new java.awt.Color(255, 0, 0));
        lblmessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage);
        lblmessage.setBounds(330, 20, 150, 20);

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
        back.setBounds(480, 10, 60, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                        psf.productID.setText("Product Name       :                                               " + productName);
                        psf.label.setText("Stocks                  :");
                        psf.variableX.setText("         Available      :                                               " + availableStocks);
                        psf.variableY.setText("         Sold            :                                               " + soldStocks);
                        psf.variableZ.setText("         Loss            :                                               " + lossStocks);
                    } else {
                        single.setEnabled(false);
                        System.out.println("No Selected Item!");
                        lblmessage.setText("Please select an Item!");
                    }
                } catch (SQLException ex) {
                }
            } else {
                single.setEnabled(false);
                System.out.println("No Selected Item!");
                lblmessage.setText("Please select an Item!");
            }
        } else {
            single.setEnabled(false);
            System.out.println("No Selected Item!");
            lblmessage.setText("Please select an Item!");
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
        adminForm grandparentFrame = (adminForm) SwingUtilities.getWindowAncestor(this);
        grandparentFrame.closeAllInternalFrames();
        inventoryForm inf = new inventoryForm(admindesktop);
        admindesktop.add(inf).setVisible(true);
        System.out.println("Go Back!");
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