package internalstaffsForm;

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
public final class staffarchiveForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form userarchiveForm
     */
    public staffarchiveForm() {
        initComponents();
        displayUser();

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);
    
    public void displayUser(){
        dbConnector connector = new dbConnector();
        try (ResultSet resultSet = connector.getData("SELECT u_id, u_lname, u_email, u_type, u_status FROM tbl_user WHERE u_status = 'Archive'")) {
            DefaultTableModel model = new DefaultTableModel();
            userlists.setRowHeight(30);
            
            // Set font for table header
            JTableHeader header = userlists.getTableHeader();
            Font headerFont = new Font("Cambria Math", Font.PLAIN, 20);
            header.setFont(headerFont);
            
            // Define column names
            String[] columnNames = {"ID", "Last Name", "Email", "Type", "Status"};
            model.setColumnIdentifiers(columnNames);

            // Add rows to the model
            while (resultSet.next()) {
                model.addRow(new Object[] {
                    resultSet.getString("u_id"),
                    resultSet.getString("u_lname"),
                    resultSet.getString("u_email"),
                    resultSet.getString("u_type"),
                    resultSet.getString("u_status")
                });
            }

            // Set the model to the table
            userlists.setModel(model);

            // Set column widths (optional)
            int[] columnWidths = {50, 165, 330, 100, 100};
            for (int i = 0; i < columnWidths.length; i++) {
                TableColumn column = userlists.getColumnModel().getColumn(i);
                column.setPreferredWidth(columnWidths[i]);
            }
            
            alignColumn(0, userlists, DefaultTableCellRenderer.CENTER);  
            alignColumn(1, userlists, DefaultTableCellRenderer.LEFT);   
            alignColumn(2, userlists, DefaultTableCellRenderer.LEFT);   
            alignColumn(3, userlists, DefaultTableCellRenderer.CENTER);
            alignColumn(4, userlists, DefaultTableCellRenderer.CENTER); 
            
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
        userlists = new javax.swing.JTable();
        unarchive = new javax.swing.JPanel();
        lblunarchive = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(806, 666));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        background.setLayout(null);

        scroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        userlists.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        userlists.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        userlists.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        userlists.getTableHeader().setResizingAllowed(false);
        userlists.getTableHeader().setReorderingAllowed(false);
        scroll.setViewportView(userlists);

        background.add(scroll);
        scroll.setBounds(20, 55, 750, 555);

        unarchive.setBackground(new java.awt.Color(255, 255, 255));
        unarchive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        unarchive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unarchiveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                unarchiveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                unarchiveMouseExited(evt);
            }
        });
        unarchive.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblunarchive.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        lblunarchive.setForeground(new java.awt.Color(46, 49, 146));
        lblunarchive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblunarchive.setText("U N A R C H I V E");
        unarchive.add(lblunarchive, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 20));

        background.add(unarchive);
        unarchive.setBounds(590, 10, 180, 40);

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
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void unarchiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unarchiveMouseClicked
        int selectedRow = userlists.getSelectedRow();
        if (selectedRow != -1) {
            try {
                String accountId = userlists.getValueAt(selectedRow, 0).toString();
                dbConnector connector = new dbConnector();
                String updateQuery = "UPDATE tbl_user SET u_status = 'Inactive' WHERE u_id = '" + accountId + "'";
                connector.updateData(updateQuery);
                ResultSet resultSet = connector.getData("SELECT * FROM tbl_user WHERE u_id = '" + accountId + "' ");
                if (resultSet.next()) {
                    stafflistsForm userListFrame = (stafflistsForm) SwingUtilities.getAncestorOfClass(stafflistsForm.class, this);
                    System.out.println("Unarchive Successfully!");
                    userListFrame.getLblMessage().setText("SUCCESS");
                }
            } catch (SQLException ex) {
            }
        } else {
            stafflistsForm userListFrame = (stafflistsForm) SwingUtilities.getAncestorOfClass(stafflistsForm.class, this);
            System.out.println("No Selected Item!");
            userListFrame.getLblMessage().setText("NO ITEM");
        }
    }//GEN-LAST:event_unarchiveMouseClicked

    private void unarchiveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unarchiveMouseEntered
        unarchive.setBackground(enterColor);
    }//GEN-LAST:event_unarchiveMouseEntered

    private void unarchiveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unarchiveMouseExited
        unarchive.setBackground(borderColor);
    }//GEN-LAST:event_unarchiveMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        stafflistsForm userListFrame = (stafflistsForm) SwingUtilities.getAncestorOfClass(stafflistsForm.class, this);
        userListFrame.restoreOriginalState();
        userListFrame.getLblMessage().setText("");
        System.out.println("Go Back!");
    }//GEN-LAST:event_backMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JLabel lblunarchive;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JPanel unarchive;
    private javax.swing.JTable userlists;
    // End of variables declaration//GEN-END:variables
}