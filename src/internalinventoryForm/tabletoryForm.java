package internalinventoryForm;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;

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

            // Define column names
            String[] columnNames = {"Inventory ID", "Product ID", "Date", "Available", "Sold", "Loss", "Status"};
            model.setColumnIdentifiers(columnNames);

            // Add rows to the model
            while (resultSet.next()) {
                model.addRow(new Object[] {
                    resultSet.getString("i_id"),
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
        int[] columnWidths = {85, 75, 95, 75, 50, 50, 75};
        for (int i = 0; i < columnWidths.length; i++) {
            TableColumn column = inventory.getColumnModel().getColumn(i);
            column.setPreferredWidth(columnWidths[i]);
        }
    } catch (SQLException ex) {
    }
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        table = new javax.swing.JScrollPane();
        inventory = new javax.swing.JTable();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        background.setLayout(null);

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        table.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        inventory.setFont(new java.awt.Font("Garamond", 0, 11)); // NOI18N
        inventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        inventory.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setViewportView(inventory);

        background.add(table);
        table.setBounds(10, 10, 510, 400);

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
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTable inventory;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}