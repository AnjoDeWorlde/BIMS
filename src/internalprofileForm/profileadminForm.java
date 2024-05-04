package internalprofileForm;

import config.Session;
/**
 *
 * @author DERECHO
 */
public class profileadminForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form profileadminForm
     */
    public profileadminForm(Session session) {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        picture = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        lblregistration = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        lblfirstname = new javax.swing.JLabel();
        lbllastname = new javax.swing.JLabel();
        txtlastname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        lblcontactnumber = new javax.swing.JLabel();
        txtcontactnumber = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        lblusername = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        lbltype = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();
        lblstatus = new javax.swing.JLabel();
        txtstatus = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(550, 480));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(null);

        picture.setText("PICTURE NI SIR");
        background.add(picture);
        picture.setBounds(40, 30, 80, 30);

        id.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        id.setForeground(new java.awt.Color(46, 49, 146));
        background.add(id);
        id.setBounds(360, 20, 120, 50);

        lblregistration.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lblregistration.setForeground(new java.awt.Color(46, 49, 146));
        lblregistration.setText("Account #");
        background.add(lblregistration);
        lblregistration.setBounds(150, 20, 330, 60);

        txtfirstname.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtfirstname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstnameActionPerformed(evt);
            }
        });
        background.add(txtfirstname);
        txtfirstname.setBounds(150, 100, 190, 30);

        lblfirstname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblfirstname.setText("First Name:");
        background.add(lblfirstname);
        lblfirstname.setBounds(40, 100, 110, 30);

        lbllastname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbllastname.setText("Last Name:");
        background.add(lbllastname);
        lbllastname.setBounds(40, 150, 110, 30);

        txtlastname.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtlastname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });
        background.add(txtlastname);
        txtlastname.setBounds(150, 150, 190, 30);

        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        background.add(txtemail);
        txtemail.setBounds(150, 200, 190, 30);

        lblemail.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblemail.setText("E-mail:");
        background.add(lblemail);
        lblemail.setBounds(40, 200, 110, 30);

        lblcontactnumber.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblcontactnumber.setText("Contact Number:");
        background.add(lblcontactnumber);
        lblcontactnumber.setBounds(40, 250, 110, 30);

        txtcontactnumber.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtcontactnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactnumberActionPerformed(evt);
            }
        });
        background.add(txtcontactnumber);
        txtcontactnumber.setBounds(150, 250, 190, 30);

        txtusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        background.add(txtusername);
        txtusername.setBounds(150, 300, 190, 30);

        lblusername.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblusername.setText("Username:");
        background.add(lblusername);
        lblusername.setBounds(40, 300, 110, 30);

        lblpassword.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblpassword.setText("Password:");
        background.add(lblpassword);
        lblpassword.setBounds(40, 350, 110, 30);

        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        background.add(txtpassword);
        txtpassword.setBounds(150, 350, 190, 30);

        lbltype.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbltype.setText("Account Type:");
        background.add(lbltype);
        lbltype.setBounds(360, 100, 110, 30);

        txttype.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txttype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });
        background.add(txttype);
        txttype.setBounds(360, 130, 110, 30);

        lblstatus.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lblstatus.setText("Status:");
        background.add(lblstatus);
        lblstatus.setBounds(360, 200, 110, 30);

        txtstatus.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtstatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
            }
        });
        background.add(txtstatus);
        txtstatus.setBounds(360, 230, 110, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfirstnameActionPerformed

    private void txtlastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlastnameActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtcontactnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactnumberActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttypeActionPerformed

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    public javax.swing.JLabel id;
    private javax.swing.JLabel lblcontactnumber;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblfirstname;
    private javax.swing.JLabel lbllastname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblregistration;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JLabel lbltype;
    private javax.swing.JLabel lblusername;
    private javax.swing.JLabel picture;
    public javax.swing.JTextField txtcontactnumber;
    public javax.swing.JTextField txtemail;
    public javax.swing.JTextField txtfirstname;
    public javax.swing.JTextField txtlastname;
    public javax.swing.JPasswordField txtpassword;
    public javax.swing.JTextField txtstatus;
    public javax.swing.JTextField txttype;
    public javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
