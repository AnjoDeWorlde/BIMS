package internalsaleForm;

import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
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
        try{            
            try (ResultSet resultSet = connector.getData("SELECT s_id, i_id,  s_net, s_status FROM tbl_sales "
                    + "WHERE s_status = 'Archive'")) {
                sales.setModel(DbUtils.resultSetToTableModel(resultSet));
            }        
        }catch(SQLException ex){            
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

        scroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 3));

        sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scroll.setViewportView(sales);

        background.add(scroll);
        scroll.setBounds(10, 30, 510, 370);

        back.setForeground(new java.awt.Color(46, 49, 146));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/leftarrow_orig.png"))); // NOI18N
        back.setText("BACK");
        back.setToolTipText("");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        background.add(back);
        back.setBounds(450, 10, 70, 20);

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