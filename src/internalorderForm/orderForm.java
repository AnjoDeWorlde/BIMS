package internalorderForm;

import config.dbConnector;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JDesktopPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;
import user.userForm;

/**
 *
 * @author DERECHO
 */
public final class orderForm extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form orderForm
     * @param admindesktop
     */
    public orderForm(JDesktopPane admindesktop) {
        initComponents();
        displayAvailable();
        
        this.admindesktop = admindesktop;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        order.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                orderMouseClicked(evt);
        }
        });
    }

    public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;  
    private JDesktopPane admindesktop; 
    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);

    public void receipt(String productName, int quantity, double price) {
        double totalPrice = quantity * price;
        String receiptText = "**********************\n"
                + "               WELCOME\n"
                + "  2 THE REFRESHVENTORY\n"
                + "**********************\n"
                + "  " + CurrentDate() + "\n"
                + "**********************\n"
                + "Product | Qty | Total Price\n"
                + "" + productName + " " + quantity + " =  " + totalPrice + "\n"
                + "**********************\n"
                + "               Thank You\n "
                + "         for your purchase!\n";
        page.setText(receiptText);
    }

    public String CurrentDate(){
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int ampm = cal.get(Calendar.AM_PM);
        
        String period = ampm == Calendar.AM ? "AM" : "PM";
        
        if (hour == 0) {
            hour = 12; 
        }
        
        String formattedMonth = String.format("%02d", month);
        String formattedDay = String.format("%02d", day);
        String formattedHour = String.format("%02d", hour);
        String formattedMinute = String.format("%02d", minute);
        String formattedSecond = String.format("%02d", second);
        
        return formattedMonth + "/" + formattedDay + "/" + year + " " + formattedHour + ":" + formattedMinute + ":" + formattedSecond + " " + period;
    }
    
public void displayAvailable() {
    dbConnector connector = new dbConnector();
    try {
        String query = "SELECT p.p_name, p.p_price, i.i_availablestocks, i.i_status " +
                       "FROM tbl_inventory i " +
                       "JOIN tbl_products p ON i.p_id = p.p_id " +
                       "WHERE i.i_status NOT IN ('Archive', 'Out-of-Stocks')";
        try (ResultSet resultSet = connector.getData(query)) {
            inventory.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
    } catch (SQLException ex) {
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        orderlist = new javax.swing.JPanel();
        order = new javax.swing.JPanel();
        lblorder = new javax.swing.JLabel();
        drop = new javax.swing.JPanel();
        lbldrop = new javax.swing.JLabel();
        purchase = new javax.swing.JPanel();
        lblorder1 = new javax.swing.JLabel();
        table = new javax.swing.JScrollPane();
        inventory = new javax.swing.JTable();
        quantity = new javax.swing.JSpinner();
        scroll2 = new javax.swing.JScrollPane();
        page = new javax.swing.JTextArea();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        back.setFont(new java.awt.Font("Candara", 1, 10)); // NOI18N
        back.setForeground(new java.awt.Color(46, 49, 146));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("BACK");
        back.setToolTipText("");
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        background.add(back);
        back.setBounds(10, 10, 40, 20);

        orderlist.setBackground(new java.awt.Color(255, 255, 255));
        orderlist.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        orderlist.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        order.setBackground(new java.awt.Color(255, 255, 255));
        order.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        order.setPreferredSize(new java.awt.Dimension(60, 30));
        order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                orderMouseExited(evt);
            }
        });
        order.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblorder.setBackground(new java.awt.Color(255, 255, 255));
        lblorder.setFont(new java.awt.Font("Cambria", 1, 10)); // NOI18N
        lblorder.setForeground(new java.awt.Color(0, 0, 146));
        lblorder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblorder.setText("ORDER");
        order.add(lblorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        orderlist.add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 40));

        drop.setBackground(new java.awt.Color(255, 255, 255));
        drop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        drop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dropMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dropMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dropMouseExited(evt);
            }
        });
        drop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbldrop.setBackground(new java.awt.Color(255, 255, 255));
        lbldrop.setFont(new java.awt.Font("Cambria", 1, 10)); // NOI18N
        lbldrop.setForeground(new java.awt.Color(0, 0, 146));
        lbldrop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldrop.setText("DROP");
        drop.add(lbldrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 20));

        orderlist.add(drop, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 40));

        purchase.setBackground(new java.awt.Color(255, 255, 255));
        purchase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        purchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                purchaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                purchaseMouseExited(evt);
            }
        });
        purchase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblorder1.setBackground(new java.awt.Color(255, 255, 255));
        lblorder1.setFont(new java.awt.Font("Cambria", 1, 10)); // NOI18N
        lblorder1.setForeground(new java.awt.Color(0, 0, 146));
        lblorder1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblorder1.setText("PURCHASE");
        purchase.add(lblorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 20));

        orderlist.add(purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 80, 40));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));

        inventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setViewportView(inventory);

        orderlist.add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 310, 350));

        quantity.setFont(new java.awt.Font("Candara", 1, 10)); // NOI18N
        quantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        quantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        orderlist.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 60, 40));

        background.add(orderlist);
        orderlist.setBounds(10, 30, 330, 440);

        scroll2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        scroll2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        page.setColumns(20);
        page.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        page.setRows(5);
        page.setBorder(null);
        scroll2.setViewportView(page);

        background.add(scroll2);
        scroll2.setBounds(350, 20, 190, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        userForm parentFrame = (userForm) SwingUtilities.getWindowAncestor(this);
        parentFrame.restoreOriginalState();
        System.out.println("Go Back!");
    }//GEN-LAST:event_backMouseClicked

    private void orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseClicked
        // Get the selected row index from the inventory table
    int selectedRow = inventory.getSelectedRow();
    
    if (selectedRow != -1) {
        // Get product details from the selected row
        String productName = inventory.getValueAt(selectedRow, 0).toString();
        double price = Double.parseDouble(inventory.getValueAt(selectedRow, 1).toString());
        
        // Assume you have a text field named 'quantityField' to input the quantity
        int qty = (Integer) quantity.getValue();
        
        // Generate the receipt
        receipt(productName, qty, price);
            }
    }//GEN-LAST:event_orderMouseClicked

    private void orderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseEntered
        order.setBackground(enterColor);
    }//GEN-LAST:event_orderMouseEntered

    private void orderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseExited
        order.setBackground(borderColor);
    }//GEN-LAST:event_orderMouseExited

    private void dropMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dropMouseClicked

    private void dropMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_dropMouseEntered

    private void dropMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_dropMouseExited

    private void purchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseMouseClicked

    private void purchaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseMouseEntered

    private void purchaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JPanel drop;
    private javax.swing.JTable inventory;
    private javax.swing.JLabel lbldrop;
    private javax.swing.JLabel lblorder;
    private javax.swing.JLabel lblorder1;
    private javax.swing.JPanel order;
    private javax.swing.JPanel orderlist;
    private javax.swing.JTextArea page;
    private javax.swing.JPanel purchase;
    private javax.swing.JSpinner quantity;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}