package internalsaleForm;

import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;

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
            try (ResultSet resultSet = connector.getData("SELECT s_id, i_id,  s_net, s_status FROM tbl_sales "
                    + "WHERE s_status = 'Archive'")) {
                    DefaultTableModel model = new DefaultTableModel();

        // Define column names
        String[] columnNames = {"Sales ID", "Inventory ID", "Net Sales", "Status"};
        model.setColumnIdentifiers(columnNames);
        
                
        // Add rows to the model
        while (resultSet.next()) {
            model.addRow(new Object[] {
                resultSet.getString("s_id"),
                resultSet.getString("i_id"),
                resultSet.getDouble("s_net"),
                resultSet.getString("s_status")
            });
        }

        // Set the model to the table
        sales.setModel(model);

        // Set column widths (optional)
        int[] columnWidths = {120, 120, 145, 120};
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
        scroll = new javax.swing.JScrollPane();
        sales = new javax.swing.JTable();
        back = new javax.swing.JLabel();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        scroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));

        sales.setFont(new java.awt.Font("Garamond", 0, 11)); // NOI18N
        sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        sales.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        sales.setAutoscrolls(false);
        scroll.setViewportView(sales);

        background.add(scroll);
        scroll.setBounds(10, 40, 510, 370);

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