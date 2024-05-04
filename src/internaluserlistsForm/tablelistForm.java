package internaluserlistsForm;

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
public class tablelistForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form tablelistForm
     */
    public tablelistForm() {
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
    
    public void displayUser(){
        dbConnector connector = new dbConnector();
        try{            
            try (ResultSet resultSet = connector.getData("SELECT u_id, u_lname, u_email, u_type, u_status FROM tbl_user")) {
                listusers.setModel(DbUtils.resultSetToTableModel(resultSet));
            }
            
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listusers = new javax.swing.JTable();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 3));
        background.setLayout(null);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 3));

        listusers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(listusers);

        background.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 510, 390);

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listusers;
    // End of variables declaration//GEN-END:variables
}
