package internalproductForm;

import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

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
        try (ResultSet resultSet = connector.getData("SELECT p_id, p_name, p_price, p_status FROM tbl_products WHERE p_status = 'Archive'")) {
            DefaultTableModel model = new DefaultTableModel();

            // Define column names
            String[] columnNames = {"Product ID", "Product Name", "Price", "Status"};
            model.setColumnIdentifiers(columnNames);

            // Add rows to the model
            while (resultSet.next()) {
                model.addRow(new Object[] {
                    resultSet.getInt("p_id"),
                    resultSet.getString("p_name"),
                    resultSet.getDouble("p_price"),
                    resultSet.getString("p_status")
                });
            }

            // Set the model to the table
            productlists.setModel(model);

            // Set column widths (optional)
            int[] columnWidths = {85, 180, 120, 120};
            for (int i = 0; i < columnWidths.length; i++) {
                TableColumn column = productlists.getColumnModel().getColumn(i);
                column.setPreferredWidth(columnWidths[i]);
            }
        } catch (SQLException ex) {
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

        scroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        productlists.setFont(new java.awt.Font("Garamond", 0, 11)); // NOI18N
        productlists.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        productlists.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        scroll.setViewportView(productlists);

        background.add(scroll);
        scroll.setBounds(10, 50, 510, 360);

        unarchive.setBackground(new java.awt.Color(255, 255, 255));
        unarchive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        lblunarchive.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        lblunarchive.setForeground(new java.awt.Color(0, 0, 146));
        lblunarchive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblunarchive.setText("U N A R C H I V E");
        unarchive.add(lblunarchive, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 10));

        background.add(unarchive);
        unarchive.setBounds(370, 10, 150, 30);

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
        back.setBounds(10, 10, 80, 24);

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
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
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