package internalproductForm;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author DERECHO
 */
public final class tableplistForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form tableplistForm
     */
    public tableplistForm() {
        initComponents();
        displayProduct();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    public JTable getListProductsTable() {
        return listproducts;
    }
    
    public int getSelectedRowIndex() {
        return listproducts.getSelectedRow();
    }

    public int getSelectedProductId() {
        int row = listproducts.getSelectedRow();
        if (row != -1) {
            return (int) listproducts.getValueAt(row, 0); 
        }
        return -1;
    }
    
    public void displayProduct(){
        dbConnector connector = new dbConnector();       
        try (ResultSet resultSet = connector.getData("SELECT p_id, p_name, p_qty, p_price, p_status FROM tbl_products "
            + "WHERE p_status NOT IN ('Archive') ")) {
              DefaultTableModel model = new DefaultTableModel();

            // Define column names
            String[] columnNames = {"Product ID", "Product Name", "Quantity", "Price", "Status"};
            model.setColumnIdentifiers(columnNames);

            // Add rows to the model
            while (resultSet.next()) {
                model.addRow(new Object[] {
                    resultSet.getInt("p_id"),
                    resultSet.getString("p_name"),
                    resultSet.getInt("p_qty"),
                    resultSet.getDouble("p_price"),
                    resultSet.getString("p_status")
                });
            }

            // Set the model to the table
            listproducts.setModel(model);

            // Set column widths (optional)
            int[] columnWidths = {90, 150, 85, 90, 90};
            for (int i = 0; i < columnWidths.length; i++) {
                TableColumn column = listproducts.getColumnModel().getColumn(i);
                column.setPreferredWidth(columnWidths[i]);
            }
            
        }catch(SQLException ex){            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        table = new javax.swing.JScrollPane();
        listproducts = new javax.swing.JTable();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        background.setLayout(null);

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        table.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listproducts.setFont(new java.awt.Font("Garamond", 0, 11)); // NOI18N
        listproducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        listproducts.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        listproducts.getTableHeader().setReorderingAllowed(false);
        table.setViewportView(listproducts);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTable listproducts;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}