/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHRISHTI
 */
public class ManageRestaurantsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantsJPanel
     */
    
    private JPanel container;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;
    
    public ManageRestaurantsJPanel(JPanel container, EcoSystem ecosystem, DB4OUtil dB4OUtil) {
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;
        this.dB4OUtil = dB4OUtil;
        labelPassword.setVisible(false);
        labelusername.setVisible(false);
        labelusername1.setVisible(false);
        labelPassword1.setVisible(false);
        jTextFieldRestName1.setVisible(false);
        jTextFieldPassword.setVisible(false);
        jTextFieldRestContact.setVisible(false);
        jTextFieldUserName.setVisible(false);
        addRestaurantButton1.setVisible(false);
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        logoutButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        restaurantListJTable = new javax.swing.JTable();
        addRestaurantButton = new javax.swing.JButton();
        removeRestaurantButton = new javax.swing.JButton();
        labelusername = new javax.swing.JLabel();
        jTextFieldRestName1 = new javax.swing.JTextField();
        jTextFieldRestContact = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        labelusername1 = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        labelPassword1 = new javax.swing.JLabel();
        addRestaurantButton1 = new javax.swing.JButton();

        backButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        logoutButton1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        logoutButton1.setText("Logout");
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage Restaurants Panel");

        restaurantListJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant ID", "Restaurant Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        restaurantListJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restaurantListJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(restaurantListJTable);

        addRestaurantButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        addRestaurantButton.setText("Add Restaurant");
        addRestaurantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRestaurantButtonActionPerformed(evt);
            }
        });

        removeRestaurantButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        removeRestaurantButton.setText("Remove Restaurant");
        removeRestaurantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRestaurantButtonActionPerformed(evt);
            }
        });

        labelusername.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelusername.setText("Restaurant Name:");

        jTextFieldRestName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRestName1ActionPerformed(evt);
            }
        });

        jTextFieldRestContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRestContactActionPerformed(evt);
            }
        });

        labelPassword.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPassword.setText("Contact Number:");

        labelusername1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelusername1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelusername1.setText("User Name:");

        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });

        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });

        labelPassword1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelPassword1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPassword1.setText("Password:");

        addRestaurantButton1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        addRestaurantButton1.setText("Add ");
        addRestaurantButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRestaurantButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelusername, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldRestName1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldRestContact, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelusername1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(addRestaurantButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(addRestaurantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(removeRestaurantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(440, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backButton, logoutButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addRestaurantButton)
                    .addComponent(removeRestaurantButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelusername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRestName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRestContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelusername1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(addRestaurantButton1)
                .addGap(58, 58, 58))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {backButton, logoutButton1});

    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_logoutButton1ActionPerformed

    private void restaurantListJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurantListJTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_restaurantListJTableMouseClicked

    private void addRestaurantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRestaurantButtonActionPerformed
        // TODO add your handling code here:

        labelPassword.setVisible(true);
        labelusername.setVisible(true);
        labelusername1.setVisible(true);
        labelPassword1.setVisible(true);
        jTextFieldRestName1.setVisible(true);
        jTextFieldPassword.setVisible(true);
        jTextFieldRestContact.setVisible(true);
        jTextFieldUserName.setVisible(true);
        addRestaurantButton1.setVisible(true);

    }//GEN-LAST:event_addRestaurantButtonActionPerformed

    private void removeRestaurantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRestaurantButtonActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) restaurantListJTable.getModel();
        int rowNumber = restaurantListJTable.getSelectedRow();
        if (rowNumber != -1) {
            int result = JOptionPane.showConfirmDialog(null, "Confirm?");
            if (result == JOptionPane.YES_OPTION) {
                this.ecosystem.getRestaurantDirectory().findResttaurantByName(dtm.getValueAt(rowNumber, 1).toString()).setRestAdmin(null);
                this.ecosystem.getRestaurantDirectory().removeRestaurant(dtm.getValueAt(rowNumber, 0).toString());
                dtm.removeRow(rowNumber);
                populateTable();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select delivery man to remove.");
        }
    }//GEN-LAST:event_removeRestaurantButtonActionPerformed

    private void jTextFieldRestName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRestName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRestName1ActionPerformed

    private void jTextFieldRestContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRestContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRestContactActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void addRestaurantButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRestaurantButton1ActionPerformed
        // TODO add your handling code here:
        if(jTextFieldRestName1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Restaurant Name cannot be empty.");
        }else if(jTextFieldUserName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "User Name cannot be empty.");
        }else if(jTextFieldPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Password cannot be empty.");
        }
        else if(this.ecosystem.getUserAccountDirectory().authenticateUser(jTextFieldUserName.getText(), jTextFieldPassword.getText())!=null){
            JOptionPane.showMessageDialog(null, "Username alreay taken.");
        }
        else{
            UserAccount userAccount = this.ecosystem.getUserAccountDirectory().createUserAccount(jTextFieldUserName.getText(), jTextFieldPassword.getText(), new AdminRole());
            Restaurant r = this.ecosystem.getRestaurantDirectory().newRestaurant(userAccount);
            r.setRestName(jTextFieldRestName1.getText());
            if(!jTextFieldRestContact.getText().isEmpty())
            r.setContactNo(jTextFieldRestContact.getText());
            JOptionPane.showMessageDialog(null, "Restaurant Added");
            labelPassword.setVisible(false);
            labelusername.setVisible(false);
            labelusername1.setVisible(false);
            labelPassword1.setVisible(false);
            jTextFieldRestName1.setVisible(false);
            jTextFieldPassword.setVisible(false);
            jTextFieldRestContact.setVisible(false);
            jTextFieldUserName.setVisible(false);
            addRestaurantButton1.setVisible(false);
            populateTable();
        }

    }//GEN-LAST:event_addRestaurantButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRestaurantButton;
    private javax.swing.JButton addRestaurantButton1;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldRestContact;
    private javax.swing.JTextField jTextFieldRestName1;
    private javax.swing.JTextField jTextFieldUserName;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPassword1;
    private javax.swing.JLabel labelusername;
    private javax.swing.JLabel labelusername1;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JButton removeRestaurantButton;
    private javax.swing.JTable restaurantListJTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) restaurantListJTable.getModel();
        dtm.setRowCount(0);
        for (String s : this.ecosystem.getRestaurantDirectory().getRestDirectory().keySet()) {
            Object row[] = new Object[2];
            row[0] = this.ecosystem.getRestaurantDirectory().getRestDirectory().get(s).getRestId();
            row[1] = this.ecosystem.getRestaurantDirectory().getRestDirectory().get(s).getRestName();
            dtm.addRow(row);
        }
    }
}
