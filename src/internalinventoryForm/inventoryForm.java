package internalinventoryForm;

/**
 *
 * @author DERECHO
 */
public class inventoryForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form inventoryForm
     */
    public inventoryForm() {
        initComponents();
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
        delete = new javax.swing.JPanel();
        lbldelete = new javax.swing.JLabel();
        purchase = new javax.swing.JPanel();
        lblpurchase = new javax.swing.JLabel();
        inventorydesktop = new javax.swing.JDesktopPane();

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

        purchase.setBackground(new java.awt.Color(255, 255, 255));
        purchase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        purchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                purchaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                purchaseMouseExited(evt);
            }
        });
        purchase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblpurchase.setBackground(new java.awt.Color(255, 255, 255));
        lblpurchase.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblpurchase.setForeground(new java.awt.Color(46, 49, 146));
        lblpurchase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpurchase.setText("PURCHASE");
        purchase.add(lblpurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 80, 20));

        background.add(purchase);
        purchase.setBounds(250, 10, 90, 40);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        System.out.println("Admin clicked Back!");
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
        closeAllInternalFrames();
        usereditForm uef = new usereditForm(this, true);
        System.out.println("Admin clicked Create Account!");
        uef.setSize(530, 410);
        inventorydesktop.add(uef).setVisible(true);
    }//GEN-LAST:event_createMouseClicked

    private void createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseEntered
        create.setBackground(enterColor);
    }//GEN-LAST:event_createMouseEntered

    private void createMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseExited
        create.setBackground(borderColor);
    }//GEN-LAST:event_createMouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        tablelistForm tlf = (tablelistForm) inventorydesktop.getSelectedFrame();
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
                    inventorydesktop.add(uef).setVisible(true);
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
        tablelistForm tlf = (tablelistForm) inventorydesktop.getSelectedFrame();
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

    private void purchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseMouseClicked
        closeAllInternalFrames();
        userresetForm urf = new userresetForm();
        System.out.println("Admin clicked Reset Password!");
        urf.setSize(530, 410);
        inventorydesktop.add(urf).setVisible(true);
    }//GEN-LAST:event_purchaseMouseClicked

    private void purchaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseMouseEntered
        purchase.setBackground(enterColor);
    }//GEN-LAST:event_purchaseMouseEntered

    private void purchaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseMouseExited
        purchase.setBackground(borderColor);
    }//GEN-LAST:event_purchaseMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JPanel create;
    private javax.swing.JPanel delete;
    public javax.swing.JDesktopPane inventorydesktop;
    private javax.swing.JLabel lblcreate;
    private javax.swing.JLabel lbldelete;
    private javax.swing.JLabel lblpurchase;
    private javax.swing.JLabel lblupdate;
    private javax.swing.JPanel purchase;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}