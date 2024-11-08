package internalinventoryForm;

import config.dbConnector;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author DERECHO
 */
public final class tabletoryForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form tabletoryForm
     */
    public tabletoryForm() {
        initComponents();
        displayInventory();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    public JTable getInventoryTable() {
        return inventory;
    }
    
    public int getSelectedRowIndex() {
        return inventory.getSelectedRow();
    }

    public int getSelectedInventoryId() {
        int row = inventory.getSelectedRow();
        if (row != -1) {
            return (int) inventory.getValueAt(row, 0); 
        }
        return -1;
    }
    
    public void displayInventory(){
        dbConnector connector = new dbConnector();
        try (ResultSet resultSet = connector.getData("SELECT i_id, p_id, i_date, i_availablestocks, i_soldstocks, i_lossstocks, i_status FROM tbl_inventory "
            + "WHERE i_status NOT IN ('Archive') ")) {
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
                resultSet.getInt("p_id"),
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
        table = new javax.swing.JScrollPane();
        inventory = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(806, 586));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        background.setLayout(null);

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        table.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setPreferredSize(new java.awt.Dimension(750, 590));

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
        table.setViewportView(inventory);

        background.add(table);
        table.setBounds(20, 20, 750, 510);

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTable inventory;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}