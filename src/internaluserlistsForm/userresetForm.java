package internaluserlistsForm;

import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DERECHO
 */
public final class userresetForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form userresetForm
     */
    public userresetForm() {
        initComponents();
        displayUser();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);
    
    public void displayUser() {
        dbConnector connector = new dbConnector();

        try {
            ResultSet resultSet = connector.getData("SELECT u_id, u_email, u_contactnumber, u_username FROM tbl_user WHERE u_status = 'Reset'");
            DefaultTableModel model = new DefaultTableModel();

            // Define column names
            String[] columnNames = {"ID", "Email", "Contact Number", "Username"};
            model.setColumnIdentifiers(columnNames);

            // Add rows to the model
            while (resultSet.next()) {
                model.addRow(new Object[] {
                    resultSet.getString("u_id"),
                    resultSet.getString("u_email"),
                    resultSet.getString("u_contactnumber"),
                    resultSet.getString("u_username")
                });
            }

            // Set the model to the table
            userlists.setModel(model);
            // Set column widths
            int[] columnWidths = {20, 150, 100, 85};
            for (int i = 0; i < columnWidths.length; i++) {
                TableColumn column = userlists.getColumnModel().getColumn(i);
                column.setPreferredWidth(columnWidths[i]);
            }
        } catch (SQLException ex) {
        } 
    }
    
    private String generatePassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        return password.toString();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        userlists = new javax.swing.JTable();
        confirm1 = new javax.swing.JPanel();
        lblconfirm1 = new javax.swing.JLabel();
        confirm = new javax.swing.JPanel();
        lblconfirm = new javax.swing.JLabel();
        txtnewpass = new javax.swing.JTextField();
        lblnewpass = new javax.swing.JLabel();
        txtconfirmpass = new javax.swing.JPasswordField();
        lblconfirmpass = new javax.swing.JLabel();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

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
        back.setBounds(0, 0, 70, 40);

        scroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        userlists.setFont(new java.awt.Font("Garamond", 0, 11)); // NOI18N
        userlists.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        userlists.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        scroll.setViewportView(userlists);

        background.add(scroll);
        scroll.setBounds(10, 30, 360, 370);

        confirm1.setBackground(new java.awt.Color(255, 255, 255));
        confirm1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        confirm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirm1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirm1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirm1MouseExited(evt);
            }
        });
        confirm1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblconfirm1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        lblconfirm1.setForeground(new java.awt.Color(0, 0, 146));
        lblconfirm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblconfirm1.setText("C H A N G E");
        confirm1.add(lblconfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 6, 120, 20));

        background.add(confirm1);
        confirm1.setBounds(380, 330, 140, 30);

        confirm.setBackground(new java.awt.Color(255, 255, 255));
        confirm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmMouseExited(evt);
            }
        });
        confirm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblconfirm.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        lblconfirm.setForeground(new java.awt.Color(0, 0, 146));
        lblconfirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblconfirm.setText("C O N F I R M");
        confirm.add(lblconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 30));

        background.add(confirm);
        confirm.setBounds(380, 70, 140, 30);

        txtnewpass.setForeground(new java.awt.Color(0, 0, 146));
        txtnewpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtnewpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnewpassActionPerformed(evt);
            }
        });
        background.add(txtnewpass);
        txtnewpass.setBounds(380, 160, 140, 30);

        lblnewpass.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lblnewpass.setForeground(new java.awt.Color(0, 0, 146));
        lblnewpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnewpass.setText("New Password:");
        background.add(lblnewpass);
        lblnewpass.setBounds(380, 140, 140, 20);

        txtconfirmpass.setForeground(new java.awt.Color(0, 0, 146));
        txtconfirmpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        txtconfirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconfirmpassActionPerformed(evt);
            }
        });
        background.add(txtconfirmpass);
        txtconfirmpass.setBounds(380, 260, 140, 30);

        lblconfirmpass.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lblconfirmpass.setForeground(new java.awt.Color(0, 0, 146));
        lblconfirmpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblconfirmpass.setText("Confirmed Password:");
        background.add(lblconfirmpass);
        lblconfirmpass.setBounds(380, 230, 140, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        userlistsForm userListFrame = (userlistsForm) SwingUtilities.getAncestorOfClass(userlistsForm.class, this);
        userListFrame.restoreOriginalState();
        userListFrame.getLblMessage().setText("");
        System.out.println("Admin clicked Back!");
    }//GEN-LAST:event_backMouseClicked

    private void txtnewpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnewpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnewpassActionPerformed

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
        int selectedRow = userlists.getSelectedRow();
        if (selectedRow != -1) {
            try {
                String accountId = userlists.getValueAt(selectedRow, 0).toString();
                dbConnector connector = new dbConnector();
                ResultSet resultSet = connector.getData("SELECT * FROM tbl_user WHERE u_id = '" + accountId + "' ");
                if (resultSet.next()) {
                    String password = generatePassword();
                    txtnewpass.setText(password);
                    userlistsForm userListFrame = (userlistsForm) SwingUtilities.getAncestorOfClass(userlistsForm.class, this);
                    userListFrame.getLblMessage().setText("Copy Password!");
                    System.out.println("Generated New Password!");
                }
            } catch (SQLException ex) {
            }
        } else {
            
        }
    }//GEN-LAST:event_confirmMouseClicked

    private void confirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseEntered
        confirm.setBackground(enterColor);
    }//GEN-LAST:event_confirmMouseEntered

    private void confirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseExited
        confirm.setBackground(borderColor);
    }//GEN-LAST:event_confirmMouseExited

    private void confirm1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirm1MouseClicked
        if(txtnewpass.getText().isEmpty() || txtconfirmpass.getText().isEmpty()){
            System.out.println("Empty Text Fields!");
            userlistsForm userListFrame = (userlistsForm) SwingUtilities.getAncestorOfClass(userlistsForm.class, this);
            userListFrame.getLblMessage().setText("Required All Fields!");
        }else{
            int selectedRow = userlists.getSelectedRow();
            if (selectedRow != -1) {
                try{
                    String accountId = userlists.getValueAt(selectedRow, 0).toString();
                    dbConnector connector = new dbConnector();
                    ResultSet resultSet = connector.getData("SELECT * FROM tbl_user WHERE u_id = '" + accountId + "' ");
                    if(resultSet.next()){
                        if(txtnewpass.getText().equals(txtconfirmpass.getText())){
                            String newpass = passwordHasher.hashPassword(txtnewpass.getText());
                            connector.updateData("UPDATE tbl_user SET u_password = '"+newpass+"' , u_status = 'Active' "
                            + "WHERE u_id = '"+accountId+"'");
                            userresetForm urf = new userresetForm();
                            urf.dispose(); 
                            System.out.println("Password Changed!");
                            userlistsForm userListFrame = (userlistsForm) SwingUtilities.getAncestorOfClass(userlistsForm.class, this);
                            userListFrame.getLblMessage().setText("Change Password Succesfully!");
                            urf.setVisible(true);
                        }else{
                            System.out.println("Password Not Matching!");
                            userlistsForm userListFrame = (userlistsForm) SwingUtilities.getAncestorOfClass(userlistsForm.class, this);
                            userListFrame.getLblMessage().setText("Password doesn't matched!");
                            txtconfirmpass.setText("");
                        }
                    }   
                }catch(SQLException | NoSuchAlgorithmException ex){
                }
            }    
        }
    }//GEN-LAST:event_confirm1MouseClicked

    private void confirm1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirm1MouseEntered
        confirm1.setBackground(enterColor);
    }//GEN-LAST:event_confirm1MouseEntered

    private void confirm1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirm1MouseExited
        confirm1.setBackground(borderColor);
    }//GEN-LAST:event_confirm1MouseExited

    private void txtconfirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconfirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconfirmpassActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JPanel confirm;
    private javax.swing.JPanel confirm1;
    private javax.swing.JLabel lblconfirm;
    private javax.swing.JLabel lblconfirm1;
    private javax.swing.JLabel lblconfirmpass;
    private javax.swing.JLabel lblnewpass;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JPasswordField txtconfirmpass;
    private javax.swing.JTextField txtnewpass;
    private javax.swing.JTable userlists;
    // End of variables declaration//GEN-END:variables
}