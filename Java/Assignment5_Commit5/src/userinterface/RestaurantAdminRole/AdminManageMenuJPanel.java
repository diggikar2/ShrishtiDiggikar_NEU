/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Restaurant.Item;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHRISHTI
 */
public class AdminManageMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminManageMenuJPanel
     */
    private JPanel container;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;
    
    public AdminManageMenuJPanel(JPanel container, UserAccount userAccount, EcoSystem ecosystem, DB4OUtil dB4OUtil) {
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;
        this.dB4OUtil = dB4OUtil;
        this.userAccount = userAccount;
        jPanelSummary.setVisible(false);
        populateMenuTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        addItemButton = new javax.swing.JButton();
        editItemButton = new javax.swing.JButton();
        removeItemButton = new javax.swing.JButton();
        jPanelSummary = new javax.swing.JPanel();
        labelPassword = new javax.swing.JLabel();
        jLabeladdUpdateSummary = new javax.swing.JLabel();
        changeItemButton = new javax.swing.JButton();
        jTextFieldItemName = new javax.swing.JTextField();
        jTextFieldItemPrice = new javax.swing.JTextField();
        labelusername = new javax.swing.JLabel();

        logoutButton1.setText("Logout");

        backButton.setText("<< Back");

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Item Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        menuTable.setShowGrid(false);
        jScrollPane1.setViewportView(menuTable);

        jLabel1.setText("Manage Menu");

        addItemButton.setText("Add Item");

        editItemButton.setText("Edit Item");

        removeItemButton.setText("Remove Item");

        jPanelSummary.setOpaque(false);

        labelPassword.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPassword.setText("Item Price:");

        jLabeladdUpdateSummary.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 15)); // NOI18N
        jLabeladdUpdateSummary.setText("Dummy Text");

        changeItemButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        changeItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeItemButtonActionPerformed(evt);
            }
        });

        jTextFieldItemName.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        jTextFieldItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldItemNameActionPerformed(evt);
            }
        });

        jTextFieldItemPrice.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        jTextFieldItemPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldItemPriceActionPerformed(evt);
            }
        });

        labelusername.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        labelusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelusername.setText("Item Name:");

        javax.swing.GroupLayout jPanelSummaryLayout = new javax.swing.GroupLayout(jPanelSummary);
        jPanelSummary.setLayout(jPanelSummaryLayout);
        jPanelSummaryLayout.setHorizontalGroup(
            jPanelSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSummaryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelSummaryLayout.createSequentialGroup()
                            .addComponent(labelusername, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelSummaryLayout.createSequentialGroup()
                            .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanelSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldItemPrice)
                                .addGroup(jPanelSummaryLayout.createSequentialGroup()
                                    .addComponent(changeItemButton)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSummaryLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabeladdUpdateSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanelSummaryLayout.setVerticalGroup(
            jPanelSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSummaryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeladdUpdateSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelusername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(changeItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(addItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeItemButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelSummary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(435, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton1)
                .addGap(154, 154, 154))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(backButton)
                    .addContainerGap(783, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addItemButton, editItemButton, removeItemButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(logoutButton1)
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addItemButton)
                    .addComponent(removeItemButton)
                    .addComponent(editItemButton))
                .addGap(33, 33, 33)
                .addComponent(jPanelSummary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(backButton)
                    .addContainerGap(545, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changeItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeItemButtonActionPerformed
        // TODO add your handling code here:
        Restaurant r = this.ecosystem.getRestaurantDirectory().findResttaurantByUserName(userAccount.getUsername());
        if (changeItemButton.getText().equals("Add")) {
            Item i = r.getItemList().addNewItem();
            i.setItemName(jTextFieldItemName.getText());
            i.setItemPrice(Double.parseDouble(jTextFieldItemPrice.getText()));
            JOptionPane.showMessageDialog(null, jTextFieldItemName.getText() + " added to menu.");
            populateMenuTable();
        } else if (changeItemButton.getText().equals("Update")) {
            DefaultTableModel dtm = (DefaultTableModel) menuTable.getModel();
            Item i = r.getItemList().findItemByName(dtm.getValueAt(menuTable.getSelectedRow(), 1).toString());
            if(jTextFieldItemName.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Item name cannot be empty.");
            }
            else if(jTextFieldItemPrice.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Item price cannot be empty.");
            }
            else{
                i.setItemName(jTextFieldItemName.getText());
                try{
                    i.setItemPrice(Double.parseDouble(jTextFieldItemPrice.getText()));
                    JOptionPane.showMessageDialog(null, "Updated item in menu.");
                    populateMenuTable();
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "Price has to be numeric value");
                }

            }

        }
    }//GEN-LAST:event_changeItemButtonActionPerformed

    private void jTextFieldItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldItemNameActionPerformed

    private void jTextFieldItemPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldItemPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldItemPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton changeItemButton;
    private javax.swing.JButton editItemButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabeladdUpdateSummary;
    private javax.swing.JPanel jPanelSummary;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldItemName;
    private javax.swing.JTextField jTextFieldItemPrice;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelusername;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JTable menuTable;
    private javax.swing.JButton removeItemButton;
    // End of variables declaration//GEN-END:variables

    private void populateMenuTable() {
        DefaultTableModel dtm = (DefaultTableModel) menuTable.getModel();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            dtm.removeRow(i);
        }
        Object[] row = new Object[3];
        for (String s : this.ecosystem.getRestaurantDirectory().getRestDirectory().keySet()) {
            for (String i : this.ecosystem.getRestaurantDirectory().getRestDirectory().get(s).getItemList().getItemList().keySet()) {
                row[0] = this.ecosystem.getRestaurantDirectory().getRestDirectory().get(s).getItemList().getItemList().get(i).getItemId();
                row[1] = this.ecosystem.getRestaurantDirectory().getRestDirectory().get(s).getItemList().getItemList().get(i).getItemName();
                row[2] = this.ecosystem.getRestaurantDirectory().getRestDirectory().get(s).getItemList().getItemList().get(i).getItemPrice();
                dtm.addRow(row);
            }
        }
    }
}
