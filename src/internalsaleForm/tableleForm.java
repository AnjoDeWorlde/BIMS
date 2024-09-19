package internalsaleForm;

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
public final class tableleForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form tableleForm
     */
    public tableleForm() {
        initComponents();
        displaySales();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
        public JTable getInventoryTable() {
        return sales;
    }
    
    public int getSelectedRowIndex() {
        return sales.getSelectedRow();
    }

    public int getSelectedInventoryId() {
        int row = sales.getSelectedRow();
        if (row != -1) {
            return (int) sales.getValueAt(row, 0); 
        }
        return -1;
    }
    
    public void displaySales(){
        dbConnector connector = new dbConnector();        
            try (ResultSet resultSet = connector.getData("SELECT s_id, p_id, i_id, s_gross, s_deductions, s_net, s_status FROM tbl_sales "
                    + "WHERE s_status NOT IN ('Archive') ")) {
                DefaultTableModel model = new DefaultTableModel();

        // Define column names
        String[] columnNames = {"Sales ID", "Product ID", "Inventory ID", "Gross Sales", "Deductions", "Net Sales", "Status"};
        model.setColumnIdentifiers(columnNames);

        // Add rows to the model
        while (resultSet.next()) {
            model.addRow(new Object[] {
                resultSet.getInt("s_id"),
                resultSet.getInt("p_id"),
                resultSet.getInt("i_id"),
                resultSet.getDouble("s_gross"),
                resultSet.getDouble("s_deductions"),
                resultSet.getDouble("s_net"),
                resultSet.getString("s_status")
            });
        }

        // Set the model to the table
        sales.setModel(model);

        // Set column widths (optional)
        int[] columnWidths = {65, 75, 85, 75, 75, 65, 65};
        for (int i = 0; i < columnWidths.length; i++) {
            TableColumn column = sales.getColumnModel().getColumn(i);
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
        sales = new javax.swing.JTable();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        background.setLayout(null);

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));

        sales.setFont(new java.awt.Font("Garamond", 0, 11)); // NOI18N
        sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        sales.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setViewportView(sales);

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
    private javax.swing.JTable sales;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}