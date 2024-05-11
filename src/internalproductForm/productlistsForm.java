package internalproductForm;

import admin.adminForm;
import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author DERECHO
 */
public class productlistsForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form productlistsForm
     * @param admindesktop
     */
    public productlistsForm(JDesktopPane admindesktop) {
        initComponents();

        this.admindesktop = admindesktop;
        tableplistForm tplf = new tableplistForm();
        productlistdesktop.add(tplf);
        tplf.setVisible(true);        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        update.setEnabled(false);
        archive.setEnabled(false);
    }

    private JDesktopPane admindesktop; 
    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);
    
    private void closeAllInternalFrames() {
        JInternalFrame[] frames = productlistdesktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            frame.dispose();
        }
    }
    
    public void restoreOriginalState() {
        JInternalFrame[] frames = productlistdesktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame  instanceof tableplistForm) {
                frame.dispose();
                break;
            }
        }
        tableplistForm tlf = new tableplistForm();
        productlistdesktop.add(tlf);
        tlf.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        create = new javax.swing.JPanel();
        lblcreate = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        lblupdate = new javax.swing.JLabel();
        archive = new javax.swing.JPanel();
        lblarchive = new javax.swing.JLabel();
        productlistdesktop = new javax.swing.JDesktopPane();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        back.setForeground(new java.awt.Color(46, 49, 146));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("BACK");
        back.setToolTipText("");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        background.add(back);
        back.setBounds(470, 10, 50, 40);

        create.setBackground(new java.awt.Color(255, 255, 255));
        create.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
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
        lblcreate.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblcreate.setForeground(new java.awt.Color(46, 49, 146));
        lblcreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcreate.setText("CREATE");
        create.add(lblcreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, 20));

        background.add(create);
        create.setBounds(10, 10, 70, 40);

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
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
        lblupdate.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblupdate.setForeground(new java.awt.Color(46, 49, 146));
        lblupdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblupdate.setText("UPDATE");
        update.add(lblupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, 20));

        background.add(update);
        update.setBounds(90, 10, 70, 40);

        archive.setBackground(new java.awt.Color(255, 255, 255));
        archive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
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
        lblarchive.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblarchive.setForeground(new java.awt.Color(46, 49, 146));
        lblarchive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblarchive.setText("ARCHIVE");
        archive.add(lblarchive, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, 20));

        background.add(archive);
        archive.setBounds(170, 10, 70, 40);

        productlistdesktop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout productlistdesktopLayout = new javax.swing.GroupLayout(productlistdesktop);
        productlistdesktop.setLayout(productlistdesktopLayout);
        productlistdesktopLayout.setHorizontalGroup(
            productlistdesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        productlistdesktopLayout.setVerticalGroup(
            productlistdesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        background.add(productlistdesktop);
        productlistdesktop.setBounds(10, 60, 530, 410);

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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        adminForm parentFrame = (adminForm) SwingUtilities.getWindowAncestor(this);
        parentFrame.restoreOriginalState();
        System.out.println("Admin clicked Back!");
    }//GEN-LAST:event_backMouseClicked

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
        closeAllInternalFrames();
        producteditForm uef = new producteditForm(true);
        System.out.println("Admin clicked Create Product!");
        productlistdesktop.add(uef).setVisible(true);
    }//GEN-LAST:event_createMouseClicked

    private void createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseEntered
        create.setBackground(enterColor);
    }//GEN-LAST:event_createMouseEntered

    private void createMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseExited
        create.setBackground(borderColor);
    }//GEN-LAST:event_createMouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        JInternalFrame selectedFrame = productlistdesktop.getSelectedFrame();
        update.setEnabled(true);
        if (selectedFrame instanceof tableplistForm) {
            tableplistForm tlf = (tableplistForm) selectedFrame;
            if (tlf != null && tlf.getSelectedRowIndex() != -1) {
                try {
                    int row = tlf.getSelectedRowIndex();
                    int productId = tlf.getSelectedAccountId();
                    dbConnector connector = new dbConnector();
                    ResultSet resultSet = connector.getData("SELECT * FROM tbl_products WHERE p_id = '"+ productId +"' ");
                    if(resultSet.next()){
                        closeAllInternalFrames();
                        producteditForm pef = new producteditForm(false);
                        System.out.println("Admin clicked Update Product!");
                        productlistdesktop.add(pef).setVisible(true);
                        pef.id.setText("# "+resultSet.getInt("p_id"));
                        pef.txtname.setText(""+resultSet.getString("p_name"));
                        pef.txtqty.setText(""+resultSet.getString("p_qty"));
                        pef.txtprice.setText(""+resultSet.getString("p_price"));
                        pef.boxstatus.setSelectedItem(""+resultSet.getString("p_status"));
                        pef.txtnotes.setText(""+resultSet.getString("p_notes"));
                    }
                } catch (SQLException ex) {
                }
            } else {
                update.setEnabled(false);
                System.out.println("No Item!");
                JOptionPane.showMessageDialog(null, "Please select an item.");
            }
        } else {
            System.out.println("Invalid Action!");
        }
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(enterColor);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(borderColor);
    }//GEN-LAST:event_updateMouseExited

    private void archiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseClicked
        JInternalFrame selectedFrame = productlistdesktop.getSelectedFrame();
        archive.setEnabled(true);
        if (selectedFrame instanceof tableplistForm) {
            tableplistForm tlf = (tableplistForm) selectedFrame;
            if (tlf != null && tlf.getSelectedRowIndex() != -1) {
                try {
                    int row = tlf.getSelectedRowIndex();
                    int accountId = tlf.getSelectedAccountId();
                    dbConnector connector = new dbConnector();
                    String updateQuery = "UPDATE tbl_user SET u_status = 'Archive' WHERE p_id = '"+ accountId +"'";
                    connector.updateData(updateQuery);
                    ResultSet resultSet = connector.getData("SELECT * FROM tbl_user WHERE p_id = '"+ accountId +"' ");
                    if(resultSet.next()){
                        closeAllInternalFrames();
                        productarchiveForm prf = new productarchiveForm();
                        System.out.println("Admin clicked Archive Product!");
                        productlistdesktop.add(prf).setVisible(true);
                    }
                } catch (SQLException ex) {
                }
            } else {
            }
        }else {
            closeAllInternalFrames();
            productarchiveForm prf = new productarchiveForm();
            System.out.println("Admin clicked Archive Product!");
            productlistdesktop.add(prf).setVisible(true);
        }
    }//GEN-LAST:event_archiveMouseClicked

    private void archiveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseEntered
        archive.setBackground(enterColor);
    }//GEN-LAST:event_archiveMouseEntered

    private void archiveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseExited
        archive.setBackground(borderColor);
    }//GEN-LAST:event_archiveMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel archive;
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JPanel create;
    private javax.swing.JLabel lblarchive;
    private javax.swing.JLabel lblcreate;
    private javax.swing.JLabel lblupdate;
    public javax.swing.JDesktopPane productlistdesktop;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}