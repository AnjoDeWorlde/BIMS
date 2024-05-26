package internalprintingForm;

import config.PanelPrinter;
import config.dbConnector;
import internalinventoryForm.inventoryprintForm;
import internalsaleForm.salesprintForm;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DERECHO
 */
public final class printallForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form printallForm
     * @param source
     */
    public printallForm(String source) {
        initComponents();
        CurrentDate();
        
        this.source = source;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        if ("sales".equalsIgnoreCase(source)) {
            displaySales(0);
            show.getTableHeader().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int column = show.columnAtPoint(e.getPoint());
                    String columnName = show.getColumnName(column);
                    if ("s_date".equals(columnName)) { 
                        sortState = (sortState + 2) % 3 - 1; 
                        displaySales(sortState);
                    }
                }
            });
        }  
        
        if ("inventory".equalsIgnoreCase(source)) {
            displayInventory(0);
            show.getTableHeader().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int column = show.columnAtPoint(e.getPoint());
                    String columnName = show.getColumnName(column);
                    if ("i_date".equals(columnName)) { 
                        sortState = (sortState + 2) % 3 - 1; 
                        displayInventory(sortState);
                    }
                }
            });
        } 
    }

    private String source;
    private int sortState = 0;
    
    public void CurrentDate(){
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        
        date.setText(month+"/"+day+"/"+year);
    }
    
    public void displayInventory(int sortState) {
        dbConnector connector = new dbConnector();
        try {
            String orderClause = "";
            if (sortState == 1) {
                orderClause = " ORDER BY i.i_date ASC";
            } else if (sortState == -1) {
                orderClause = " ORDER BY i.i_date DESC";
            }

            String query = "SELECT i.i_id, p.p_name AS product_name, i.i_date, i.i_availablestocks, i.i_soldstocks, i.i_lossstocks, i.i_status " +
                       "FROM tbl_inventory i " +
                       "JOIN tbl_products p ON i.p_id = p.p_id " +
                       "WHERE i.i_status NOT IN ('Archive')" + orderClause;

            try (ResultSet resultSet = connector.getData(query)) {
                show.setModel(DbUtils.resultSetToTableModel(resultSet));
                formatDateColumn(show, 2);
            }
        } catch (SQLException ex) {
        }
    }

    public void displaySales(int sortState) {
        dbConnector connector = new dbConnector();
        try {
            String orderClause = "";
            if (sortState == 1) {
                orderClause = " ORDER BY s.s_date ASC";
            } else if (sortState == -1) {
                orderClause = " ORDER BY s.s_date DESC";
            }

            String query = "SELECT s.s_id, p.p_name AS product_name, i.i_date AS s_date, s.s_gross, s.s_deductions, s.s_net, s.s_status " +
                   "FROM tbl_sales s " +
                   "JOIN tbl_products p ON s.p_id = p.p_id " +
                   "JOIN tbl_inventory i ON s.i_id = i.i_id " +
                   "WHERE s.s_status NOT IN ('Archive')" + orderClause;

            try (ResultSet resultSet = connector.getData(query)) {
                show.setModel(DbUtils.resultSetToTableModel(resultSet));
                formatDateColumn(show, 2); 
            }
        } catch (SQLException ex) {
        }
    }

    private void formatDateColumn(JTable table, int columnIndex) {
        table.getColumnModel().getColumn(columnIndex).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
        public void setValue(Object value) {
            if (value != null) {
                setText(formatDateString(value.toString()));
            } else {
                setText("");
            }
        }
        });
    }

    private String formatDateString(String dateString) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = inputFormat.parse(dateString);
            SimpleDateFormat outputFormat = new SimpleDateFormat("M/d/yyyy");
            return outputFormat.format(date);
        } catch (ParseException e) {
            return dateString;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        print = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        page = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        kind = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        seperate1 = new javax.swing.JSeparator();
        seperate2 = new javax.swing.JSeparator();
        table = new javax.swing.JScrollPane();
        show = new javax.swing.JTable();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        print.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        print.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        print.setText("Print");
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        background.add(print);
        print.setBounds(20, 10, 70, 30);

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

        page.setBackground(new java.awt.Color(255, 255, 255));
        page.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 8));
        page.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo_wname_orig35.jpg"))); // NOI18N
        page.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 310, 60));

        kind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page.add(kind, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 490, 20));

        date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("(date)");
        page.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 490, 20));

        seperate1.setForeground(new java.awt.Color(0, 0, 0));
        page.add(seperate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 490, 10));

        seperate2.setForeground(new java.awt.Color(0, 0, 0));
        page.add(seperate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 490, 10));

        table.setBorder(null);
        table.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setViewportView(show);

        page.add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 120, 480, 220));

        background.add(page);
        page.setBounds(0, 50, 530, 360);

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
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        JPanel myPanel = new JPanel();
        PanelPrinter pPrint = new PanelPrinter(page);
        pPrint.printPanel();
    }//GEN-LAST:event_printMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        if (source.equals("sales")) {
            salesprintForm salesFrame = (salesprintForm) SwingUtilities.getAncestorOfClass(salesprintForm.class, this);
            salesFrame.restoreOriginalState();
            System.out.println("Go Back!");
         } 
         if (source.equals("inventory")) {
            inventoryprintForm inventoryFrame = (inventoryprintForm) SwingUtilities.getAncestorOfClass(inventoryprintForm.class, this);
            inventoryFrame.restoreOriginalState();
            System.out.println("Go Back!");
        }
    }//GEN-LAST:event_backMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    public javax.swing.JLabel date;
    public javax.swing.JLabel kind;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel page;
    private javax.swing.JLabel print;
    private javax.swing.JSeparator seperate1;
    private javax.swing.JSeparator seperate2;
    private javax.swing.JTable show;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}