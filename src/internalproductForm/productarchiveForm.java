package internalproductForm;

import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DERECHO
 */
public final class productarchiveForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form productarchiveForm
     */
    public productarchiveForm() {
        initComponents();
        displayProduct();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);
    
    public void displayProduct(){
        dbConnector connector = new dbConnector();
        try{            
            try (ResultSet resultSet = connector.getData("SELECT p_id, p_name, p_price, p_status FROM tbl_products WHERE p_status = 'Archive'")) {
                productlists.setModel(DbUtils.resultSetToTableModel(resultSet));
            }            
        }catch(SQLException ex){            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        productlists = new javax.swing.JTable();
        unarchive = new javax.swing.JPanel();
        lblunarchive = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        scroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 3));

        productlists.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scroll.setViewportView(productlists);

        background.add(scroll);
        scroll.setBounds(10, 10, 360, 390);

        unarchive.setBackground(new java.awt.Color(255, 255, 255));
        unarchive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        unarchive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unarchiveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                unarchiveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                unarchiveMouseExited(evt);
            }
        });
        unarchive.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblunarchive.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblunarchive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblunarchive.setText("U N A R C H I V E");
        unarchive.add(lblunarchive, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        background.add(unarchive);
        unarchive.setBounds(380, 10, 140, 50);

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
        back.setBounds(440, 380, 80, 24);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unarchiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unarchiveMouseClicked
        int selectedRow = productlists.getSelectedRow();
        if (selectedRow != -1) {
            try {
                String producttId = productlists.getValueAt(selectedRow, 0).toString();
                dbConnector connector = new dbConnector();
                String updateQuery = "UPDATE tbl_products SET p_status = 'Inactive' WHERE p_id = '" + producttId + "'";
                connector.updateData(updateQuery);
                ResultSet resultSet = connector.getData("SELECT * FROM tbl_products WHERE p_id = '" + producttId + "' ");
                if (resultSet.next()) {
                    productlistsForm productListFrame = (productlistsForm) SwingUtilities.getAncestorOfClass(productlistsForm.class, this);
                    System.out.println("Unarchive Successfully!");
                    productListFrame.getLblMessage().setText("Unarchive Successfully!");
                }
            } catch (SQLException ex) {
            }
        } else {
            productlistsForm productListFrame = (productlistsForm) SwingUtilities.getAncestorOfClass(productlistsForm.class, this);
            System.out.println("No Selected Item!");
            productListFrame.getLblMessage().setText("Please select an Item!");
        }
    }//GEN-LAST:event_unarchiveMouseClicked

    private void unarchiveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unarchiveMouseEntered
        unarchive.setBackground(enterColor);
    }//GEN-LAST:event_unarchiveMouseEntered

    private void unarchiveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unarchiveMouseExited
        unarchive.setBackground(borderColor);
    }//GEN-LAST:event_unarchiveMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        productlistsForm productListFrame = (productlistsForm) SwingUtilities.getAncestorOfClass(productlistsForm.class, this);
        productListFrame.restoreOriginalState();
        productListFrame.getLblMessage().setText("");
        System.out.println("Go Back!");
    }//GEN-LAST:event_backMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JLabel lblunarchive;
    private javax.swing.JTable productlists;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JPanel unarchive;
    // End of variables declaration//GEN-END:variables
}