/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.LoginPage.LoginPageJPanel;

/**
 *
 * @author SHRISHTI
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    
    private JPanel container;
    private UserAccount userAccount;
    private EcoSystem system;
    private DB4OUtil dB4OUtil;
    
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, DB4OUtil dB4OUtil) {
        initComponents();
        this.container = userProcessContainer;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        jLabel1.setVisible(false);
        lblSelectedNode.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnManageCustomers = new javax.swing.JButton();
        btnManageDM = new javax.swing.JButton();
        btnManageEmployees = new javax.swing.JButton();
        btnManageRestaurants = new javax.swing.JButton();

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Selected Node:");

        lblSelectedNode.setText("<View_selected_node>");

        btnManageCustomers.setText("Manage Customers");
        btnManageCustomers.setBorderPainted(false);
        btnManageCustomers.setContentAreaFilled(false);
        btnManageCustomers.setOpaque(false);
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
            }
        });

        btnManageDM.setText("Manage DM");
        btnManageDM.setBorderPainted(false);
        btnManageDM.setContentAreaFilled(false);
        btnManageDM.setOpaque(false);
        btnManageDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDMActionPerformed(evt);
            }
        });

        btnManageEmployees.setText("Manage Employees");
        btnManageEmployees.setBorderPainted(false);
        btnManageEmployees.setContentAreaFilled(false);
        btnManageEmployees.setOpaque(false);
        btnManageEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeesActionPerformed(evt);
            }
        });

        btnManageRestaurants.setText("Manage Restaurants");
        btnManageRestaurants.setBorderPainted(false);
        btnManageRestaurants.setContentAreaFilled(false);
        btnManageRestaurants.setOpaque(false);
        btnManageRestaurants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRestaurantsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(lblSelectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(420, 420, 420)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnManageDM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnManageEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnManageRestaurants, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblSelectedNode)
                    .addComponent(logoutButton))
                .addGap(64, 64, 64)
                .addComponent(btnManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnManageDM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnManageEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnManageRestaurants, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        LoginPageJPanel lpp= new LoginPageJPanel(container, system, dB4OUtil);
        container.add("LoginPageJPanel", lpp);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed

        ManageCustomersJPanel mcp = new ManageCustomersJPanel(container, system, dB4OUtil);
        container.add("ManageCustomersJPanel", mcp);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManageCustomersActionPerformed

    private void btnManageDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDMActionPerformed

        ManageDeliveryManJPanel mdmp = new ManageDeliveryManJPanel(container, system, dB4OUtil);
        container.add("ManageDeliveryManJPanel", mdmp);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManageDMActionPerformed

    private void btnManageEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeesActionPerformed
        // TODO add your handling code here:

        ManageEmployeesJPanel mep = new ManageEmployeesJPanel(container, system, dB4OUtil);
        container.add("ManageEmployeesJPanel", mep);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManageEmployeesActionPerformed

    private void btnManageRestaurantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRestaurantsActionPerformed

        ManageRestaurantsJPanel mrp = new ManageRestaurantsJPanel(container, system, dB4OUtil);
        container.add("ManageRestaurantsJPanel", mrp);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManageRestaurantsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnManageDM;
    private javax.swing.JButton btnManageEmployees;
    private javax.swing.JButton btnManageRestaurants;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JButton logoutButton;
    // End of variables declaration//GEN-END:variables
}
