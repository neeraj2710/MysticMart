/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MysticMart.gui;

import MysticMart.gui.Cashier.CashierLoginFrame;
import MysticMart.gui.Manager.ManagerLoginFrame;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author prach
 */
public class UserVerificationFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserVerificationFrame
     */
    public UserVerificationFrame() {
        super("UserVerification Frame");
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        BGmainPanel = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
        jrbManager = new javax.swing.JRadioButton();
        jrbCashier = new javax.swing.JRadioButton();
        lblManager = new javax.swing.JLabel();
        lblCashier = new javax.swing.JLabel();
        nxtBtn = new javax.swing.JPanel();
        lblNext = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        DesignPanel3 = new javax.swing.JPanel();
        DesignPanel2 = new javax.swing.JPanel();
        DesignPanel1 = new javax.swing.JPanel();
        DesignPanel4 = new javax.swing.JPanel();
        img2Panel = new javax.swing.JLabel();
        img1Panel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BGmainPanel.setBackground(new java.awt.Color(255, 255, 255));
        BGmainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentPanel.setOpaque(false);

        buttonGroup1.add(jrbManager);
        jrbManager.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jrbManager.setForeground(new java.awt.Color(87, 59, 58));
        jrbManager.setText("Manager");
        jrbManager.setOpaque(false);

        buttonGroup1.add(jrbCashier);
        jrbCashier.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jrbCashier.setForeground(new java.awt.Color(87, 59, 58));
        jrbCashier.setText("Cashier");
        jrbCashier.setOpaque(false);

        lblManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MysticMart/icons/Manager.png"))); // NOI18N

        lblCashier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MysticMart/icons/cashier.png"))); // NOI18N

        nxtBtn.setBackground(new java.awt.Color(204, 110, 85));
        nxtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nxtBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nxtBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nxtBtnMouseExited(evt);
            }
        });

        lblNext.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblNext.setForeground(new java.awt.Color(255, 255, 255));
        lblNext.setText("Next");

        javax.swing.GroupLayout nxtBtnLayout = new javax.swing.GroupLayout(nxtBtn);
        nxtBtn.setLayout(nxtBtnLayout);
        nxtBtnLayout.setHorizontalGroup(
            nxtBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nxtBtnLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lblNext)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        nxtBtnLayout.setVerticalGroup(
            nxtBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nxtBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNext, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(nxtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblManager, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbManager)
                            .addComponent(jrbCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(90, 90, 90))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblManager, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jrbManager)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jrbCashier)
                        .addGap(58, 58, 58)))
                .addComponent(nxtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        BGmainPanel.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 510, 310));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BGmainPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeading.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(87, 59, 58));
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Choose your role ");
        jPanel18.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 56, 310, 60));

        headerPanel.setBackground(new java.awt.Color(199, 225, 186));
        headerPanel.setForeground(new java.awt.Color(221, 196, 112));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MysticMart/icons/headerLogo.png"))); // NOI18N
        lblLogo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MysticMart/icons/exit.png"))); // NOI18N
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 848, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(26, 26, 26)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addContainerGap())
        );

        jPanel18.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 40));

        DesignPanel3.setBackground(new java.awt.Color(204, 110, 85));

        javax.swing.GroupLayout DesignPanel3Layout = new javax.swing.GroupLayout(DesignPanel3);
        DesignPanel3.setLayout(DesignPanel3Layout);
        DesignPanel3Layout.setHorizontalGroup(
            DesignPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        DesignPanel3Layout.setVerticalGroup(
            DesignPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel18.add(DesignPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 250, 5));

        DesignPanel2.setBackground(new java.awt.Color(204, 110, 85));

        javax.swing.GroupLayout DesignPanel2Layout = new javax.swing.GroupLayout(DesignPanel2);
        DesignPanel2.setLayout(DesignPanel2Layout);
        DesignPanel2Layout.setHorizontalGroup(
            DesignPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        DesignPanel2Layout.setVerticalGroup(
            DesignPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel18.add(DesignPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        DesignPanel1.setBackground(new java.awt.Color(243, 213, 189));

        javax.swing.GroupLayout DesignPanel1Layout = new javax.swing.GroupLayout(DesignPanel1);
        DesignPanel1.setLayout(DesignPanel1Layout);
        DesignPanel1Layout.setHorizontalGroup(
            DesignPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        DesignPanel1Layout.setVerticalGroup(
            DesignPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel18.add(DesignPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 250, 5));

        DesignPanel4.setBackground(new java.awt.Color(243, 213, 189));

        javax.swing.GroupLayout DesignPanel4Layout = new javax.swing.GroupLayout(DesignPanel4);
        DesignPanel4.setLayout(DesignPanel4Layout);
        DesignPanel4Layout.setHorizontalGroup(
            DesignPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        DesignPanel4Layout.setVerticalGroup(
            DesignPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel18.add(DesignPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 250, 5));

        img2Panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MysticMart/icons/verifyFrame2.png"))); // NOI18N
        jPanel18.add(img2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 540, 440));

        img1Panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MysticMart/icons/verifyFrame.png"))); // NOI18N
        jPanel18.add(img1Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 540, 420));

        BGmainPanel.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGmainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGmainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nxtBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxtBtnMouseExited
        nxtBtn.setBackground(new Color(204,110,85));
    }//GEN-LAST:event_nxtBtnMouseExited

    private void nxtBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxtBtnMouseEntered
        nxtBtn.setBackground(new Color(219, 154, 136));
    }//GEN-LAST:event_nxtBtnMouseEntered

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void nxtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nxtBtnMouseClicked
        if(this.jrbManager.isSelected()){
        
            new ManagerLoginFrame().setVisible(true);
            this.dispose();
        }
        else if(this.jrbCashier.isSelected()){
        
            new CashierLoginFrame().setVisible(true);
            this.dispose();
        }
        
        else{
        
            JOptionPane.showMessageDialog(null, "Please, select an Option.");
        }
    }//GEN-LAST:event_nxtBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserVerificationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserVerificationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserVerificationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserVerificationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserVerificationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGmainPanel;
    private javax.swing.JPanel DesignPanel1;
    private javax.swing.JPanel DesignPanel2;
    private javax.swing.JPanel DesignPanel3;
    private javax.swing.JPanel DesignPanel4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel img1Panel;
    private javax.swing.JLabel img2Panel;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jrbCashier;
    private javax.swing.JRadioButton jrbManager;
    private javax.swing.JLabel lblCashier;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblManager;
    private javax.swing.JLabel lblNext;
    private javax.swing.JPanel nxtBtn;
    // End of variables declaration//GEN-END:variables
}
