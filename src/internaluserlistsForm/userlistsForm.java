package internaluserlistsForm;

import config.dbConnector;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
/**
 *
 * @author DERECHO
 */
public class userlistsForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form userlistsForm
     */
    public userlistsForm() {
        initComponents();
        
        tablelistForm tlf = new tablelistForm();
        userlistdesktop.add(tlf);
        tlf.setVisible(true);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);       
    }
    
    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);
    
    private void closeAllInternalFrames() {
        JInternalFrame[] frames = userlistdesktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            frame.dispose();
        }
    }

    public void restoreOriginalState() {
        Component[] components = userlistdesktop.getComponents();
        for (Component component : components) {
            if (component instanceof tablelistForm) {
                userlistdesktop.remove(component);
                ((JInternalFrame) component).dispose();
                break;
            }
        }
        tablelistForm tlf = new tablelistForm();
        userlistdesktop.add(tlf);
        tlf.setVisible(true);
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        background = new javax.swing.JPanel();
        create = new javax.swing.JPanel();
        lblcreate = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        lblupdate = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        lbldelete = new javax.swing.JLabel();
        reset = new javax.swing.JPanel();
        lblreset = new javax.swing.JLabel();
        userlistdesktop = new javax.swing.JDesktopPane();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(550, 480));
        background.setLayout(null);

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

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbldelete.setBackground(new java.awt.Color(255, 255, 255));
        lbldelete.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lbldelete.setForeground(new java.awt.Color(46, 49, 146));
        lbldelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldelete.setText("DELETE");
        delete.add(lbldelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, 20));

        background.add(delete);
        delete.setBounds(170, 10, 70, 40);

        reset.setBackground(new java.awt.Color(255, 255, 255));
        reset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));

        lblreset.setBackground(new java.awt.Color(255, 255, 255));
        lblreset.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblreset.setForeground(new java.awt.Color(46, 49, 146));
        lblreset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblreset.setText("RESET");

        javax.swing.GroupLayout resetLayout = new javax.swing.GroupLayout(reset);
        reset.setLayout(resetLayout);
        resetLayout.setHorizontalGroup(
            resetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
            .addGroup(resetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(resetLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblreset, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        resetLayout.setVerticalGroup(
            resetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(resetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(resetLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblreset, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(reset);
        reset.setBounds(250, 10, 69, 40);

        userlistdesktop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout userlistdesktopLayout = new javax.swing.GroupLayout(userlistdesktop);
        userlistdesktop.setLayout(userlistdesktopLayout);
        userlistdesktopLayout.setHorizontalGroup(
            userlistdesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        userlistdesktopLayout.setVerticalGroup(
            userlistdesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        background.add(userlistdesktop);
        userlistdesktop.setBounds(10, 60, 530, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
        closeAllInternalFrames();
        usereditForm uef = new usereditForm(this, true);
        System.out.println("Admin clicked Create Account!");
        uef.setSize(530, 410);
        userlistdesktop.add(uef).setVisible(true);
    }//GEN-LAST:event_createMouseClicked

    private void createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseEntered
        create.setBackground(enterColor);
    }//GEN-LAST:event_createMouseEntered

    private void createMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseExited
        create.setBackground(borderColor);
    }//GEN-LAST:event_createMouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        tablelistForm tlf = (tablelistForm) userlistdesktop.getSelectedFrame();
        if (tlf != null && tlf.getSelectedRowIndex() != -1) {
            try {
                int row = tlf.getSelectedRowIndex();
                int accountId = tlf.getSelectedAccountId();
                dbConnector connector = new dbConnector();
                ResultSet resultSet = connector.getData("SELECT * FROM tbl_user WHERE u_id = '"+ accountId +"' ");
                if(resultSet.next()){
                    closeAllInternalFrames();
                    usereditForm uef = new usereditForm(this, false);
                    System.out.println("Admin clicked Update Account!");
                    userlistdesktop.add(uef).setVisible(true);
                    uef.id.setText(""+resultSet.getInt("u_id"));
                    uef.txtfirstname.setText(""+resultSet.getString("u_fname"));
                    uef.txtlastname.setText(""+resultSet.getString("u_lname"));
                    uef.txtemail.setText(""+resultSet.getString("u_email"));
                    uef.txtcontactnumber.setText(""+resultSet.getString("u_contactnumber"));
                    uef.txtusername.setText(""+resultSet.getString("u_username"));
                    uef.txtpassword.setText(""+resultSet.getString("u_password"));
                    uef.boxtype.setSelectedItem(""+resultSet.getString("u_type"));
                    uef.boxstatus.setSelectedItem(""+resultSet.getString("u_status"));
                }
            } catch (SQLException ex) {
            }
        } else {
            System.out.println("No Item!");
            JOptionPane.showMessageDialog(null, "Please select an item.");
        }
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(enterColor);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(borderColor);
    }//GEN-LAST:event_updateMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        tablelistForm tlf = (tablelistForm) userlistdesktop.getSelectedFrame();
        if (tlf != null && tlf.getSelectedRowIndex() != -1) {
            int row = tlf.getSelectedRowIndex();
            int accountId = tlf.getSelectedAccountId();
            dbConnector connector = new dbConnector();
            boolean deleted = connector.deleteData("DELETE FROM tbl_user WHERE u_id = '"+ accountId +"' ");
            if(deleted) {
                closeAllInternalFrames();
                restoreOriginalState();
                System.out.println("Admin clicked Update Account!");
                JOptionPane.showMessageDialog(null, "Deleted Account Successfully!");
            } else {
                System.out.println("Information Rejected!");
                JOptionPane.showMessageDialog(null, "Failed Successfully!");
            }
        } else {
            System.out.println("No Item!");
            JOptionPane.showMessageDialog(null, "Please select an item.");
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(enterColor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(borderColor);
    }//GEN-LAST:event_deleteMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel create;
    private javax.swing.JPanel delete;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblcreate;
    private javax.swing.JLabel lbldelete;
    private javax.swing.JLabel lblreset;
    private javax.swing.JLabel lblupdate;
    private javax.swing.JPanel reset;
    private javax.swing.JPanel update;
    public javax.swing.JDesktopPane userlistdesktop;
    // End of variables declaration//GEN-END:variables
}
