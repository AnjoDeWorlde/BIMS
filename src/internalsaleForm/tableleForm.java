package internalsaleForm;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;

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
        try{            
            try (ResultSet resultSet = connector.getData("SELECT s_id, p_id, i_id, s_gross, s_deductions, s_net, s_status FROM tbl_sales "
                    + "WHERE s_status NOT IN ('Archive') ")) {
                sales.setModel(DbUtils.resultSetToTableModel(resultSet));
            }
            
        }catch(SQLException ex){            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        table = new javax.swing.JScrollPane();
        sales = new javax.swing.JTable();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        background.setLayout(null);

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 3));

        sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setViewportView(sales);

        background.add(table);
        table.setBounds(10, 10, 510, 390);

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTable sales;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}