package internalprintingForm;

import config.PanelPrinter;
import config.dbConnector;
import internalinventoryForm.inventoryprintForm;
import internalsaleForm.salesprintForm;
import java.awt.Font;
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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author DERECHO
 */
public final class printselectedForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form printselectedForm
     * @param source
     */
    public printselectedForm(String source) {
        initComponents();
        CurrentDate();
        
        this.source = source;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);

        if ("sales".equalsIgnoreCase(source)) {
            displaySales();
        } else if ("inventory".equalsIgnoreCase(source)) {
            displayInventory();
        }
        
        confirm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                confirmMouseClicked(evt);
            }
        });
    }

    private String source;
    
    public void CurrentDate() {
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        
        date.setText(month + "/" + day + "/" + year);
    }
    
    public void alignColumn(int columnIndex, JTable table, int alignment) {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(alignment);  // Set alignment
        table.getColumnModel().getColumn(columnIndex).setCellRenderer(renderer);
    }

    public void displayInventory() {
        dbConnector connector = new dbConnector();
        try {
            String query = "SELECT i.i_id, p.p_name AS product_name, i.i_date, i.i_availablestocks, i.i_soldstocks, i.i_lossstocks, i.i_status " +
                       "FROM tbl_inventory i " +
                       "JOIN tbl_products p ON i.p_id = p.p_id " +
                       "WHERE i.i_status NOT IN ('Archive')";
        try (ResultSet resultSet = connector.getData(query)) {
            DefaultTableModel model = new DefaultTableModel();
            show.setRowHeight(30);
            
            // Set font for table header
            JTableHeader header = show.getTableHeader();
            Font headerFont = new Font("Cambria Math", Font.PLAIN, 16);
            header.setFont(headerFont);

            // Define column names
            String[] columnNames = {"Inventory ID", "Product", "Date", "Available", "Sold", "Loss", "Status"};
            model.setColumnIdentifiers(columnNames);

            // Add rows to the model
            while (resultSet.next()) {
                model.addRow(new Object[] {
                    resultSet.getInt("i_id"),
                    resultSet.getString("product_name"),
                    resultSet.getDate("i_date"),
                    resultSet.getInt("i_availablestocks"),
                    resultSet.getInt("i_soldstocks"),
                    resultSet.getInt("i_lossstocks"),
                    resultSet.getString("i_status")
                });
            }

            // Set the model to the table
            show.setModel(model);

            // Set column widths (optional)
            int[] columnWidths = {100, 210, 100, 90, 60, 60, 120};
            for (int i = 0; i < columnWidths.length; i++) {
                TableColumn column = show.getColumnModel().getColumn(i);
                column.setPreferredWidth(columnWidths[i]);
            }
            
            alignColumn(0, show, DefaultTableCellRenderer.CENTER);  
            alignColumn(1, show, DefaultTableCellRenderer.LEFT);   
            alignColumn(2, show, DefaultTableCellRenderer.CENTER);   
            alignColumn(3, show, DefaultTableCellRenderer.RIGHT);
            alignColumn(4, show, DefaultTableCellRenderer.RIGHT); 
            alignColumn(5, show, DefaultTableCellRenderer.RIGHT); 
            alignColumn(6, show, DefaultTableCellRenderer.CENTER);

            // Format the date column
            formatDateColumn(show, 2);
        }
        } catch (SQLException ex) {
        }
    }

    public void displaySales() {
        dbConnector connector = new dbConnector();
        try {
            String query = "SELECT s.s_id, p.p_name AS product_name, i.i_date AS s_date, s.s_gross, s.s_deductions, s.s_net, s.s_status " +
                "FROM tbl_sales s " +
                "JOIN tbl_products p ON s.p_id = p.p_id " +
                "JOIN tbl_inventory i ON s.i_id = i.i_id " +
                "WHERE s.s_status NOT IN ('Archive')";
        try (ResultSet resultSet = connector.getData(query)) {
            DefaultTableModel model = new DefaultTableModel();
            show.setRowHeight(30);
            
            // Set font for table header
            JTableHeader header = show.getTableHeader();
            Font headerFont = new Font("Cambria Math", Font.PLAIN, 16);
            header.setFont(headerFont);

            // Define column names
            String[] columnNames = {"Sales ID", "Product Name", "Date", "Gross Sales", "Deductions", "Net Sales", "Status"};
            model.setColumnIdentifiers(columnNames);

            // Add rows to the model
            while (resultSet.next()) {
                model.addRow(new Object[] {
                    resultSet.getInt("s_id"),
                    resultSet.getString("product_name"),
                    resultSet.getDate("s_date"),
                    resultSet.getDouble("s_gross"),
                    resultSet.getDouble("s_deductions"),
                    resultSet.getDouble("s_net"),
                    resultSet.getString("s_status")
                });
            }
            
            // Set the model to the table
            show.setModel(model);
            // Set column widths (optional)
            int[] columnWidths = {70, 180, 90, 100, 100, 90, 110};
            for (int i = 0; i < columnWidths.length; i++) {
                TableColumn column = show.getColumnModel().getColumn(i);
                column.setPreferredWidth(columnWidths[i]);
            }
            
            alignColumn(0, show, DefaultTableCellRenderer.CENTER);  
            alignColumn(1, show, DefaultTableCellRenderer.LEFT);   
            alignColumn(2, show, DefaultTableCellRenderer.CENTER);   
            alignColumn(3, show, DefaultTableCellRenderer.RIGHT);
            alignColumn(4, show, DefaultTableCellRenderer.RIGHT); 
            alignColumn(5, show, DefaultTableCellRenderer.RIGHT); 
            alignColumn(6, show, DefaultTableCellRenderer.CENTER);

            // Format the date column
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
            Date d = inputFormat.parse(dateString);
            SimpleDateFormat outputFormat = new SimpleDateFormat("M/d/yyyy");
            return outputFormat.format(d);
        } catch (ParseException e) {
            return dateString;
        }
    }

    private void displaySelectedRows() {
        int[] selectedRows = show.getSelectedRows();
        if (selectedRows.length > 0) {
            DefaultTableModel model = (DefaultTableModel) show.getModel();
            DefaultTableModel newModel = new DefaultTableModel();

            for (int column = 0; column < model.getColumnCount(); column++) {
                newModel.addColumn(model.getColumnName(column));
            }

            for (int row : selectedRows) {
                Object[] rowData = new Object[model.getColumnCount()];
                for (int column = 0; column < model.getColumnCount(); column++) {
                    rowData[column] = model.getValueAt(row, column);
                }
                newModel.addRow(rowData);
            }

            show.setModel(newModel);
        } else {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        print = new javax.swing.JLabel();
        confirm = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        page = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        kind = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        seperate1 = new javax.swing.JSeparator();
        seperate2 = new javax.swing.JSeparator();
        table = new javax.swing.JScrollPane();
        show = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(806, 666));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        background.setLayout(null);

        print.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        print.setForeground(new java.awt.Color(0, 0, 146));
        print.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        print.setText("PRINT");
        print.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        background.add(print);
        print.setBounds(260, 10, 120, 30);

        confirm.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        confirm.setForeground(new java.awt.Color(0, 0, 146));
        confirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirm.setText("CONFIRM");
        confirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
        });
        background.add(confirm);
        confirm.setBounds(390, 10, 140, 30);

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

        page.setBackground(new java.awt.Color(255, 255, 255));
        page.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 146), 3, true));
        page.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo_wname_orig35.jpg"))); // NOI18N
        page.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 340, 50));

        kind.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        kind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page.add(kind, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, 730, 20));

        date.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("(date)");
        page.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 730, 20));

        seperate1.setForeground(new java.awt.Color(0, 0, 0));
        page.add(seperate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 70, 740, 2));

        seperate2.setForeground(new java.awt.Color(0, 0, 0));
        page.add(seperate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 95, 740, 2));

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 146)));
        table.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        show.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        show.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        show.getTableHeader().setResizingAllowed(false);
        show.getTableHeader().setReorderingAllowed(false);
        table.setViewportView(show);

        page.add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 120, 740, 440));

        background.add(page);
        page.setBounds(10, 50, 770, 570);

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

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        JPanel myPanel = new JPanel();
        PanelPrinter pPrint = new PanelPrinter(page);
        pPrint.printPanel();
    }//GEN-LAST:event_printMouseClicked

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
        displaySelectedRows();
    }//GEN-LAST:event_confirmMouseClicked

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
    private javax.swing.JLabel confirm;
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
