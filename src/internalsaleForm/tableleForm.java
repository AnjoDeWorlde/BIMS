package internalsaleForm;

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
            sales.setRowHeight(30);
            
            // Set font for table header
            JTableHeader header = sales.getTableHeader();
            Font headerFont = new Font("Cambria Math", Font.PLAIN, 16);
            header.setFont(headerFont);

            // Define column names
            String[] columnNames = {"Sales#", "Product#", "Inventory#", "Gross Sales", "Deductions", "Net Sales", "Status"};
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

            // Set column widths 
            int[] columnWidths = {80, 100, 120, 100, 100, 90, 155};
            for (int i = 0; i < columnWidths.length; i++) {
                TableColumn column = sales.getColumnModel().getColumn(i);
                column.setPreferredWidth(columnWidths[i]);
            }
            
            alignColumn(0, sales, DefaultTableCellRenderer.CENTER);  
            alignColumn(1, sales, DefaultTableCellRenderer.CENTER);   
            alignColumn(2, sales, DefaultTableCellRenderer.CENTER);   
            alignColumn(3, sales, DefaultTableCellRenderer.RIGHT);
            alignColumn(4, sales, DefaultTableCellRenderer.RIGHT); 
            alignColumn(5, sales, DefaultTableCellRenderer.RIGHT); 
            alignColumn(6, sales, DefaultTableCellRenderer.CENTER);
            
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
        sales = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(806, 586));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        background.setLayout(null);

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        table.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        table.setPreferredSize(new java.awt.Dimension(0, 0));

        sales.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        sales.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        sales.getTableHeader().setResizingAllowed(false);
        sales.getTableHeader().setReorderingAllowed(false);
        table.setViewportView(sales);

        background.add(table);
        table.setBounds(20, 20, 750, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
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