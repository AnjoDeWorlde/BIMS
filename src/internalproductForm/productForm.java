package internalproductForm;

import admin.adminForm;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author DERECHO
 */
public class productForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form productForm
     */
    public productForm(JDesktopPane admindesktop) {
        initComponents();
        
        this.admindesktop = admindesktop;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null); 
    }

    private JDesktopPane admindesktop; 
    Color borderColor = new Color(255,255,255);
    Color enterColor = new Color(46,49,146);

    private void closeAllInternalFrames() {
        JInternalFrame[] frames = admindesktop.getAllFrames();
        for (JInternalFrame frame : frames) {
            frame.dispose();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        lblgreetings = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        displaybar = new javax.swing.JPanel();
        product1 = new javax.swing.JPanel();
        product2 = new javax.swing.JPanel();
        product3 = new javax.swing.JPanel();
        product4 = new javax.swing.JPanel();
        product5 = new javax.swing.JPanel();
        product6 = new javax.swing.JPanel();
        product7 = new javax.swing.JPanel();
        product8 = new javax.swing.JPanel();
        product9 = new javax.swing.JPanel();
        product10 = new javax.swing.JPanel();
        product11 = new javax.swing.JPanel();
        product12 = new javax.swing.JPanel();
        product13 = new javax.swing.JPanel();
        product14 = new javax.swing.JPanel();
        product15 = new javax.swing.JPanel();
        product16 = new javax.swing.JPanel();
        product17 = new javax.swing.JPanel();
        product18 = new javax.swing.JPanel();
        stopper = new javax.swing.JSeparator();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 2));
        background.setLayout(null);

        lblgreetings.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        lblgreetings.setForeground(new java.awt.Color(46, 49, 146));
        lblgreetings.setText("'s  Products");
        background.add(lblgreetings);
        lblgreetings.setBounds(320, 10, 200, 60);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo_wname_orig35.jpg"))); // NOI18N
        background.add(logo);
        logo.setBounds(10, 10, 320, 60);

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        displaybar.setBackground(new java.awt.Color(255, 255, 255));
        displaybar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product1.setBackground(new java.awt.Color(255, 255, 255));
        product1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product1MouseExited(evt);
            }
        });
        product1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 160, 150));

        product2.setBackground(new java.awt.Color(255, 255, 255));
        product2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product2MouseExited(evt);
            }
        });
        product2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 160, 150));

        product3.setBackground(new java.awt.Color(255, 255, 255));
        product3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product3MouseExited(evt);
            }
        });
        product3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 160, 150));

        product4.setBackground(new java.awt.Color(255, 255, 255));
        product4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product4MouseExited(evt);
            }
        });
        product4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 160, 150));

        product5.setBackground(new java.awt.Color(255, 255, 255));
        product5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product5MouseExited(evt);
            }
        });
        product5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 160, 150));

        product6.setBackground(new java.awt.Color(255, 255, 255));
        product6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product6MouseExited(evt);
            }
        });
        product6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 160, 150));

        product7.setBackground(new java.awt.Color(255, 255, 255));
        product7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product7MouseExited(evt);
            }
        });
        product7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 160, 150));

        product8.setBackground(new java.awt.Color(255, 255, 255));
        product8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product8MouseExited(evt);
            }
        });
        product8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 160, 150));

        product9.setBackground(new java.awt.Color(255, 255, 255));
        product9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product9MouseExited(evt);
            }
        });
        product9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 160, 150));

        product10.setBackground(new java.awt.Color(255, 255, 255));
        product10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product10MouseExited(evt);
            }
        });
        product10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 160, 150));

        product11.setBackground(new java.awt.Color(255, 255, 255));
        product11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product11MouseExited(evt);
            }
        });
        product11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 160, 150));

        product12.setBackground(new java.awt.Color(255, 255, 255));
        product12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product12MouseExited(evt);
            }
        });
        product12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 160, 150));

        product13.setBackground(new java.awt.Color(255, 255, 255));
        product13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product13MouseExited(evt);
            }
        });
        product13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 160, 150));

        product14.setBackground(new java.awt.Color(255, 255, 255));
        product14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product14MouseExited(evt);
            }
        });
        product14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 670, 160, 150));

        product15.setBackground(new java.awt.Color(255, 255, 255));
        product15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product15MouseExited(evt);
            }
        });
        product15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 670, 160, 150));

        product16.setBackground(new java.awt.Color(255, 255, 255));
        product16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product16MouseExited(evt);
            }
        });
        product16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 830, 160, 150));

        product17.setBackground(new java.awt.Color(255, 255, 255));
        product17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product17MouseExited(evt);
            }
        });
        product17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 830, 160, 150));

        product18.setBackground(new java.awt.Color(255, 255, 255));
        product18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 49, 146), 5));
        product18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product18MouseExited(evt);
            }
        });
        product18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displaybar.add(product18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 830, 160, 150));
        displaybar.add(stopper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 990, 530, 0));

        scroll.setViewportView(displaybar);

        background.add(scroll);
        scroll.setBounds(10, 70, 530, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void product1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product1MouseEntered

    private void product1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product1MouseClicked

    private void product1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product1MouseExited

    private void product2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product2MouseEntered

    private void product2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product2MouseClicked

    private void product2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product2MouseExited

    private void product3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product3MouseEntered

    private void product3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product3MouseExited

    private void product3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product3MouseClicked

    private void product4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product4MouseClicked

    private void product4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product4MouseEntered

    private void product4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product4MouseExited

    private void product5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product5MouseClicked

    private void product5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product5MouseEntered

    private void product5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product5MouseExited

    private void product6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product6MouseClicked

    private void product6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product6MouseEntered

    private void product6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product6MouseExited

    private void product7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product7MouseClicked

    private void product7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product7MouseEntered

    private void product7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product7MouseExited

    private void product8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product8MouseClicked

    private void product8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product8MouseEntered

    private void product8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product8MouseExited

    private void product9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product9MouseClicked

    private void product9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product9MouseEntered

    private void product9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product9MouseExited

    private void product10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product10MouseClicked

    private void product10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product10MouseEntered

    private void product10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product10MouseExited

    private void product11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product11MouseClicked

    private void product11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product11MouseEntered

    private void product11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product11MouseExited

    private void product12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product12MouseClicked

    private void product12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product12MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product12MouseEntered

    private void product12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product12MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product12MouseExited

    private void product13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product13MouseClicked

    private void product13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product13MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product13MouseEntered

    private void product13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product13MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product13MouseExited

    private void product14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product14MouseClicked

    private void product14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product14MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product14MouseEntered

    private void product14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product14MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product14MouseExited

    private void product15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product15MouseClicked

    private void product15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product15MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product15MouseEntered

    private void product15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product15MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product15MouseExited

    private void product16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product16MouseClicked

    private void product16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product16MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product16MouseEntered

    private void product16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product16MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product16MouseExited

    private void product17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product17MouseClicked

    private void product17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product17MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product17MouseEntered

    private void product17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product17MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product17MouseExited

    private void product18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_product18MouseClicked

    private void product18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product18MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_product18MouseEntered

    private void product18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product18MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_product18MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel displaybar;
    private javax.swing.JLabel lblgreetings;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel product1;
    private javax.swing.JPanel product10;
    private javax.swing.JPanel product11;
    private javax.swing.JPanel product12;
    private javax.swing.JPanel product13;
    private javax.swing.JPanel product14;
    private javax.swing.JPanel product15;
    private javax.swing.JPanel product16;
    private javax.swing.JPanel product17;
    private javax.swing.JPanel product18;
    private javax.swing.JPanel product2;
    private javax.swing.JPanel product3;
    private javax.swing.JPanel product4;
    private javax.swing.JPanel product5;
    private javax.swing.JPanel product6;
    private javax.swing.JPanel product7;
    private javax.swing.JPanel product8;
    private javax.swing.JPanel product9;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JSeparator stopper;
    // End of variables declaration//GEN-END:variables
}