package internalproductForm;

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
            + "WHERE p_status NOT IN ('Reject') ")) {
            DefaultTableModel model = new DefaultTableModel();
            listproducts.setRowHeight(30);

            // Set font for table header
            JTableHeader header = listproducts.getTableHeader();
            Font headerFont = new Font("Cambria Math", Font.PLAIN, 20);
            header.setFont(headerFont);
              
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
            int[] columnWidths = {150, 230, 115, 120, 129};
            for (int i = 0; i < columnWidths.length; i++) {
                TableColumn column = listproducts.getColumnModel().getColumn(i);
                column.setPreferredWidth(columnWidths[i]);
            }
            
            alignColumn(0, listproducts, DefaultTableCellRenderer.CENTER);  
            alignColumn(1, listproducts, DefaultTableCellRenderer.LEFT);   
            alignColumn(2, listproducts, DefaultTableCellRenderer.RIGHT);   
            alignColumn(3, listproducts, DefaultTableCellRenderer.RIGHT);   
            alignColumn(4, listproducts, DefaultTableCellRenderer.CENTER);
            
        }catch(SQLException ex){            
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
        listproducts = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(806, 666));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        background.setLayout(null);

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        table.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        table.setPreferredSize(new java.awt.Dimension(0, 0));

        listproducts.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        listproducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        listproducts.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        listproducts.getTableHeader().setResizingAllowed(false);
        listproducts.getTableHeader().setReorderingAllowed(false);
        table.setViewportView(listproducts);

        background.add(table);
        table.setBounds(20, 20, 750, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTable listproducts;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}