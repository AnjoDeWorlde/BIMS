package internalinventoryForm;

import config.dbConnector;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author DERECHO
 */
public final class inventoryarchiveForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form inventoryarchiveForm
     */
    public inventoryarchiveForm() {
        initComponents();
        displayInventory();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);

    public void displayInventory(){
        dbConnector connector = new dbConnector();
        try (ResultSet resultSet = connector.getData("SELECT i_id, p_id, i_date, i_availablestocks, i_soldstocks, i_lossstocks, i_status FROM tbl_inventory "
        + "WHERE i_status = 'Archive'")) {
            DefaultTableModel model = new DefaultTableModel();
            inventory.setRowHeight(30);
            
            // Set font for table header
            JTableHeader header = inventory.getTableHeader();
            Font headerFont = new Font("Cambria Math", Font.PLAIN, 16);
            header.setFont(headerFont);

            // Define column names
            String[] columnNames = {"Inventory ID", "Product ID", "Inventory Date", "Available", "Sold", "Reject", "Status"};
            model.setColumnIdentifiers(columnNames);
        
            // Add rows to the model
            while (resultSet.next()) {
                model.addRow(new Object[] {
                    resultSet.getInt("i_id"),
                    resultSet.getString("p_id"),
                    resultSet.getDate("i_date"),
                    resultSet.getInt("i_availablestocks"),
                    resultSet.getInt("i_soldstocks"),
                    resultSet.getInt("i_lossstocks"),
                    resultSet.getString("i_status")
                });
            }

            // Set the model to the table
            inventory.setModel(model);

            // Set column widths (optional)
            int[] columnWidths = {110, 100, 130, 110, 50, 80, 165};
            for (int i = 0; i < columnWidths.length; i++) {
                TableColumn column = inventory.getColumnModel().getColumn(i);
                column.setPreferredWidth(columnWidths[i]);
            }
            
            alignColumn(0, inventory, DefaultTableCellRenderer.CENTER);  
            alignColumn(1, inventory, DefaultTableCellRenderer.CENTER);   
            alignColumn(2, inventory, DefaultTableCellRenderer.CENTER);   
            alignColumn(3, inventory, DefaultTableCellRenderer.RIGHT);
            alignColumn(4, inventory, DefaultTableCellRenderer.RIGHT); 
            alignColumn(5, inventory, DefaultTableCellRenderer.RIGHT); 
            alignColumn(6, inventory, DefaultTableCellRenderer.CENTER);
            
        } catch (SQLException ex) {
        }
    }

    public void alignColumn(int columnIndex, JTable table, int alignment) {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(alignment);  // Set alignment
        table.getColumnModel().getColumn(columnIndex).setCellRenderer(renderer);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        inventory = new javax.swing.JTable();
        unarchive = new javax.swing.JPanel();
        lblunarchive = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(806, 586));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        background.setLayout(null);

        scroll.setBackground(new java.awt.Color(255, 255, 255));
        scroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setPreferredSize(new java.awt.Dimension(770, 570));

        inventory.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        inventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        inventory.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        inventory.getTableHeader().setResizingAllowed(false);
        inventory.getTableHeader().setReorderingAllowed(false);
        scroll.setViewportView(inventory);

        background.add(scroll);
        scroll.setBounds(20, 55, 750, 480);

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

        lblunarchive.setBackground(new java.awt.Color(255, 255, 255));
        lblunarchive.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        lblunarchive.setForeground(new java.awt.Color(0, 0, 146));
        lblunarchive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblunarchive.setText("U N A R C H I V E");
        unarchive.add(lblunarchive, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 20));

        background.add(unarchive);
        unarchive.setBounds(590, 10, 180, 40);

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
        back.setBounds(10, 10, 30, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unarchiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unarchiveMouseClicked
        int selectedRow = inventory.getSelectedRow();
        if (selectedRow != -1) {
            try {
                String inventoryId = inventory.getValueAt(selectedRow, 0).toString();
                dbConnector connector = new dbConnector();
                String updateQuery = "UPDATE tbl_inventory SET i_status = 'Inactive' WHERE i_id = '" + inventoryId + "'";
                connector.updateData(updateQuery);
                ResultSet resultSet = connector.getData("SELECT * FROM tbl_inventory WHERE i_id = '" + inventoryId + "' ");
                if (resultSet.next()) {
                    inventoryForm inventoryFrame = (inventoryForm) SwingUtilities.getAncestorOfClass(inventoryForm.class, this);
                    System.out.println("Unarchive Successfully!");
                    inventoryFrame.getLblMessage().setText("SUCCESS");
                }
            } catch (SQLException ex) {
            }
        } else {
            inventoryForm inventoryFrame = (inventoryForm) SwingUtilities.getAncestorOfClass(inventoryForm.class, this);
            System.out.println("No Selected Item!");
            inventoryFrame.getLblMessage().setText("NO ITEM");
        }
    }//GEN-LAST:event_unarchiveMouseClicked

    private void unarchiveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unarchiveMouseEntered
        unarchive.setBackground(enterColor);
    }//GEN-LAST:event_unarchiveMouseEntered

    private void unarchiveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unarchiveMouseExited
        unarchive.setBackground(borderColor);
    }//GEN-LAST:event_unarchiveMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        inventoryForm inventoryFrame = (inventoryForm) SwingUtilities.getAncestorOfClass(inventoryForm.class, this);
        inventoryFrame.restoreOriginalState();
        System.out.println("Go Back!");
    }//GEN-LAST:event_backMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JTable inventory;
    private javax.swing.JLabel lblunarchive;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JPanel unarchive;
    // End of variables declaration//GEN-END:variables
}