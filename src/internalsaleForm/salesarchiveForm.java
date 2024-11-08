package internalsaleForm;

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
public final class salesarchiveForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form inventoryarchiveForm
     */
    public salesarchiveForm() {
        initComponents();
        displaySales();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);

    public void displaySales(){
        dbConnector connector = new dbConnector();      
        try (ResultSet resultSet = connector.getData("SELECT s_id, p_id, i_id, s_gross, s_deductions, s_net, s_status FROM tbl_sales "
            + "WHERE s_status = 'Archive'")) {
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
        scroll = new javax.swing.JScrollPane();
        sales = new javax.swing.JTable();
        back = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(806, 586));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        background.setLayout(null);

        scroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setPreferredSize(new java.awt.Dimension(0, 0));

        sales.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        sales.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        sales.setAutoscrolls(false);
        sales.getTableHeader().setResizingAllowed(false);
        sales.getTableHeader().setReorderingAllowed(false);
        scroll.setViewportView(sales);

        background.add(scroll);
        scroll.setBounds(20, 55, 750, 480);

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
        back.setBounds(10, 10, 30, 30);

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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        salesForm salesFrame = (salesForm) SwingUtilities.getAncestorOfClass(salesForm.class, this);
        salesFrame.restoreOriginalState();
        System.out.println("Go Back!");
    }//GEN-LAST:event_backMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JTable sales;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}