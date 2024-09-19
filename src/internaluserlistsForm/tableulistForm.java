package internaluserlistsForm;

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
public final class tableulistForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form tableulistForm
     */
    public tableulistForm() {
        initComponents();
        displayUser();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    public JTable getListUsersTable() {
        return listusers;
    }
    
    public int getSelectedRowIndex() {
        return listusers.getSelectedRow();
    }

    public int getSelectedAccountId() {
        int row = listusers.getSelectedRow();
        if (row != -1) {
            return (int) listusers.getValueAt(row, 0); 
        }
        return -1;
    }
    
    public void displayUser() {
        dbConnector connector = new dbConnector();
        try {            
            ResultSet resultSet = connector.getData("SELECT u_id, u_lname, u_email, u_type, u_status FROM tbl_user "
                + "WHERE u_status NOT IN ('Archive', 'Reset')");
            DefaultTableModel model = new DefaultTableModel();
        
            // Define column names
            String[] columnNames = {"ID", "Last Name", "Email", "Type", "Status"};
            model.setColumnIdentifiers(columnNames);
        
            // Add rows to the model
            while (resultSet.next()) {
                model.addRow(new Object[] {
                    resultSet.getInt("u_id"),
                    resultSet.getString("u_lname"),
                    resultSet.getString("u_email"),
                    resultSet.getString("u_type"),
                    resultSet.getString("u_status")
                });
            }
        
            // Set the model to the table
            listusers.setModel(model);
        
            // Set column widths
            int[] columnWidths = {30, 100, 200, 90, 90};
            for (int i = 0; i < columnWidths.length; i++) {
                TableColumn column = listusers.getColumnModel().getColumn(i);
                column.setPreferredWidth(columnWidths[i]);
            }
        
            // Set the model to the table
            listusers.setModel(model);
        } catch (SQLException ex) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        table = new javax.swing.JScrollPane();
        listusers = new javax.swing.JTable();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        background.setLayout(null);

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        table.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listusers.setFont(new java.awt.Font("Garamond", 0, 11)); // NOI18N
        listusers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        listusers.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setViewportView(listusers);

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
    private javax.swing.JTable listusers;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}