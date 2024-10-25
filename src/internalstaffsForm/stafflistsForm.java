package internalstaffsForm;

import admin.adminForm;
import config.dbConnector;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author DERECHO
 */
public class stafflistsForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form userlistsForm
     * @param admindesktop
     */
    public stafflistsForm(JDesktopPane admindesktop) {
        initComponents();
        
        this.admindesktop = admindesktop;
        tableslistForm tulf = new tableslistForm();
        userlistdesktop.add(tulf);
        tulf.setVisible(true);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        update.setEnabled(false);
    }

    public JLabel getLblMessage() {
        return lblmessage;
    }

    private final JDesktopPane admindesktop; 
    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);
    
    private void closeAllInternalFrames() {
        JInternalFrame[] frames = userlistdesktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            frame.dispose();
        }
    }
        
    public void restoreOriginalState() {
        JInternalFrame[] frames = userlistdesktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame  instanceof tableslistForm) {
                frame.dispose();
                break;
            }
        }
        tableslistForm tlf = new tableslistForm();
        userlistdesktop.add(tlf);
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
        reset = new javax.swing.JPanel();
        lblreset = new javax.swing.JLabel();
        userlistdesktop = new javax.swing.JDesktopPane();
        lblmessage = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(846, 786));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        background.setLayout(null);

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

        create.setBackground(new java.awt.Color(255, 255, 255));
        create.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
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
        lblcreate.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        lblcreate.setForeground(new java.awt.Color(0, 0, 146));
        lblcreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcreate.setText("CREATE");
        create.add(lblcreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        background.add(create);
        create.setBounds(350, 20, 110, 50);

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
        lblupdate.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        lblupdate.setForeground(new java.awt.Color(0, 0, 146));
        lblupdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblupdate.setText("UPDATE");
        update.add(lblupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        background.add(update);
        update.setBounds(470, 20, 110, 50);

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
        lblarchive.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        lblarchive.setForeground(new java.awt.Color(0, 0, 146));
        lblarchive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblarchive.setText("ARCHIVE");
        archive.add(lblarchive, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        background.add(archive);
        archive.setBounds(590, 20, 110, 50);

        reset.setBackground(new java.awt.Color(255, 255, 255));
        reset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetMouseExited(evt);
            }
        });
        reset.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblreset.setBackground(new java.awt.Color(255, 255, 255));
        lblreset.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        lblreset.setForeground(new java.awt.Color(0, 0, 146));
        lblreset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblreset.setText("RESET");
        reset.add(lblreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        background.add(reset);
        reset.setBounds(710, 20, 100, 50);

        userlistdesktop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout userlistdesktopLayout = new javax.swing.GroupLayout(userlistdesktop);
        userlistdesktop.setLayout(userlistdesktopLayout);
        userlistdesktopLayout.setHorizontalGroup(
            userlistdesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        userlistdesktopLayout.setVerticalGroup(
            userlistdesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        background.add(userlistdesktop);
        userlistdesktop.setBounds(20, 100, 790, 630);

        lblmessage.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        lblmessage.setForeground(new java.awt.Color(255, 15, 15));
        lblmessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblmessage);
        lblmessage.setBounds(100, 30, 240, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
        closeAllInternalFrames();
        staffeditForm uef = new staffeditForm(true);
        System.out.println("Create Account Opens!");
        lblmessage.setText("");
        userlistdesktop.add(uef).setVisible(true);
    }//GEN-LAST:event_createMouseClicked

    private void createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseEntered
        create.setBackground(enterColor);
    }//GEN-LAST:event_createMouseEntered

    private void createMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseExited
        create.setBackground(borderColor);
    }//GEN-LAST:event_createMouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        JInternalFrame selectedFrame = userlistdesktop.getSelectedFrame();
        update.setEnabled(true);
        if (selectedFrame instanceof tableslistForm) {
            tableslistForm tlf = (tableslistForm) selectedFrame;
            if (tlf != null && tlf.getSelectedRowIndex() != -1) {
                try {
                    int accountId = tlf.getSelectedAccountId();
                    dbConnector connector = new dbConnector();
                    ResultSet resultSet = connector.getData("SELECT * FROM tbl_user WHERE u_id = '"+ accountId +"' ");
                    if(resultSet.next()){
                        closeAllInternalFrames();
                        staffeditForm uef = new staffeditForm(false);
                        System.out.println("Update Account Opens!");
                        lblmessage.setText("");
                        userlistdesktop.add(uef).setVisible(true);
                        uef.id.setText(""+resultSet.getInt("u_id"));
                        uef.txtfirstname.setText(""+resultSet.getString("u_fname"));
                        uef.txtlastname.setText(""+resultSet.getString("u_lname"));
                        uef.txtemail.setText(""+resultSet.getString("u_email"));
                        uef.txtcontactnumber.setText(""+resultSet.getString("u_contactnumber"));
                        uef.txtusername.setText(""+resultSet.getString("u_username"));
                        uef.txtpassword.setText("*************************");
                        uef.boxtype.setSelectedItem(""+resultSet.getString("u_type"));
                        uef.boxstatus.setSelectedItem(""+resultSet.getString("u_status"));
                        String picturePath = resultSet.getString("u_picture");
                        ImageIcon imageIcon = new ImageIcon(picturePath);
                        Image image = imageIcon.getImage().getScaledInstance(uef.picture.getWidth(), uef.picture.getHeight(), Image.SCALE_SMOOTH);
                        uef.picture.setIcon(new ImageIcon(image));
                        uef.destination = picturePath;
                    }
                } catch (SQLException ex) {
                }
            } else {
                update.setEnabled(false);
                System.out.println("No Selected Item!");
                lblmessage.setText("NO ITEM");
            }
        } else {
            update.setEnabled(false);
            System.out.println("No Selected Item!");
            lblmessage.setText("NO ITEM");
        }
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(enterColor);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(borderColor);
    }//GEN-LAST:event_updateMouseExited

    private void archiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseClicked
        JInternalFrame selectedFrame = userlistdesktop.getSelectedFrame();
        if (selectedFrame instanceof tableslistForm) {
            tableslistForm tlf = (tableslistForm) selectedFrame;
            if (tlf != null && tlf.getSelectedRowIndex() != -1) {
                try {
                    int accountId = tlf.getSelectedAccountId();
                    dbConnector connector = new dbConnector();
                    String updateQuery = "UPDATE tbl_user SET u_status = 'Archive' WHERE u_id = '"+ accountId +"'";
                    connector.updateData(updateQuery);
                    ResultSet resultSet = connector.getData("SELECT * FROM tbl_user WHERE u_id = '"+ accountId +"' ");
                    if(resultSet.next()){
                        closeAllInternalFrames();
                        staffarchiveForm urf = new staffarchiveForm();
                        System.out.println("Archive Account Opens!");
                        lblmessage.setText("SUCCESS");
                        userlistdesktop.add(urf).setVisible(true);
                    }
                } catch (SQLException ex) {
                }
            } else {
                closeAllInternalFrames();
                staffarchiveForm urf = new staffarchiveForm();
                System.out.println("Archive Account Opens!");
                lblmessage.setText("");
                userlistdesktop.add(urf).setVisible(true);
            }
        }else {
            closeAllInternalFrames();
            staffarchiveForm urf = new staffarchiveForm();
            System.out.println("Archive Account Opens!");
            lblmessage.setText("");
            userlistdesktop.add(urf).setVisible(true);
        }
    }//GEN-LAST:event_archiveMouseClicked

    private void archiveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseEntered
        archive.setBackground(enterColor);
    }//GEN-LAST:event_archiveMouseEntered

    private void archiveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveMouseExited
        archive.setBackground(borderColor);
    }//GEN-LAST:event_archiveMouseExited

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        closeAllInternalFrames();
        staffresetForm urf = new staffresetForm();
        System.out.println("Reset Password Opens!");
        lblmessage.setText("");
        userlistdesktop.add(urf).setVisible(true);
    }//GEN-LAST:event_resetMouseClicked

    private void resetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseEntered
        reset.setBackground(enterColor);
    }//GEN-LAST:event_resetMouseEntered

    private void resetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseExited
        reset.setBackground(borderColor);
    }//GEN-LAST:event_resetMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        adminForm parentFrame = (adminForm) SwingUtilities.getWindowAncestor(this);
        parentFrame.restoreOriginalState();
        System.out.println("Go Back!");
    }//GEN-LAST:event_backMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel archive;
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JPanel create;
    private javax.swing.JLabel lblarchive;
    private javax.swing.JLabel lblcreate;
    public javax.swing.JLabel lblmessage;
    private javax.swing.JLabel lblreset;
    private javax.swing.JLabel lblupdate;
    private javax.swing.JPanel reset;
    private javax.swing.JPanel update;
    public javax.swing.JDesktopPane userlistdesktop;
    // End of variables declaration//GEN-END:variables
}