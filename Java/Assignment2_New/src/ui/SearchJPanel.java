/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.CarInfo;
import model.CarInfoCatalog;

/**
 *
 * @author SHRISHTI
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
//    CarInfoCatalog catalog;
    private JPanel userProcessContainer;
    private CarInfoCatalog catalog;
    private CarInfo carInfo;
    private String searchBy;

    public SearchJPanel(JPanel userProcessContainer, CarInfoCatalog catalog, CarInfo carInfo) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.catalog = catalog;
        this.carInfo = carInfo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearchByCompanyName = new javax.swing.JButton();
        btnSearchByModel = new javax.swing.JButton();
        txtSearchByYear = new javax.swing.JTextField();
        txtCompanyName = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        btnFirstAvailableCar = new javax.swing.JButton();
        txtSerialNumber = new javax.swing.JTextField();
        btnSearchByYear = new javax.swing.JButton();
        txtCity = new javax.swing.JTextField();
        btnSearchBySerialNumber = new javax.swing.JButton();
        txtMinSeat = new javax.swing.JTextField();
        btnSearchByCity = new javax.swing.JButton();
        btnSearchByNoOfSeats = new javax.swing.JButton();
        btnExpiredCert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaxSeat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearchResults = new javax.swing.JTable();
        btnAvailableCar = new javax.swing.JButton();
        btnUnavailableCar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnSearchByCompanyName.setBackground(new java.awt.Color(255, 153, 204));
        btnSearchByCompanyName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSearchByCompanyName.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchByCompanyName.setText("Search");
        btnSearchByCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByCompanyNameActionPerformed(evt);
            }
        });

        btnSearchByModel.setBackground(new java.awt.Color(255, 153, 204));
        btnSearchByModel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSearchByModel.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchByModel.setText("Search");
        btnSearchByModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByModelActionPerformed(evt);
            }
        });

        txtSearchByYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSearchByYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchByYearActionPerformed(evt);
            }
        });

        txtCompanyName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyNameActionPerformed(evt);
            }
        });

        txtModel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnFirstAvailableCar.setBackground(new java.awt.Color(255, 153, 204));
        btnFirstAvailableCar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnFirstAvailableCar.setForeground(new java.awt.Color(255, 255, 255));
        btnFirstAvailableCar.setText("First Available Car");
        btnFirstAvailableCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailableCarActionPerformed(evt);
            }
        });

        txtSerialNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnSearchByYear.setBackground(new java.awt.Color(255, 153, 204));
        btnSearchByYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSearchByYear.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchByYear.setText("Search");
        btnSearchByYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByYearActionPerformed(evt);
            }
        });

        txtCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        btnSearchBySerialNumber.setBackground(new java.awt.Color(255, 153, 204));
        btnSearchBySerialNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSearchBySerialNumber.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchBySerialNumber.setText("Search");
        btnSearchBySerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBySerialNumberActionPerformed(evt);
            }
        });

        txtMinSeat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnSearchByCity.setBackground(new java.awt.Color(255, 153, 204));
        btnSearchByCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSearchByCity.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchByCity.setText("Search");
        btnSearchByCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByCityActionPerformed(evt);
            }
        });

        btnSearchByNoOfSeats.setBackground(new java.awt.Color(255, 153, 204));
        btnSearchByNoOfSeats.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSearchByNoOfSeats.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchByNoOfSeats.setText("Search");
        btnSearchByNoOfSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByNoOfSeatsActionPerformed(evt);
            }
        });

        btnExpiredCert.setBackground(new java.awt.Color(255, 153, 204));
        btnExpiredCert.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnExpiredCert.setForeground(new java.awt.Color(255, 255, 255));
        btnExpiredCert.setText("View Cars with Expired Certificates");
        btnExpiredCert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpiredCertActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Seach By Manufacture Year :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Seach By Company Name :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Seach By Model Number :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Seach by Serial Number :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Seach by No. of Seats :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Min");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Max");

        txtMaxSeat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Search by City :");

        btnBack.setBackground(new java.awt.Color(255, 153, 204));
        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblSearchResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Company", "Model", "No. of Seats", "Year", "Serial Number", "Availabilty", "City", "Certificate Expiration Date"
            }
        ));
        jScrollPane1.setViewportView(tblSearchResults);

        btnAvailableCar.setBackground(new java.awt.Color(255, 153, 204));
        btnAvailableCar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAvailableCar.setForeground(new java.awt.Color(255, 255, 255));
        btnAvailableCar.setText("View all Available Cars");
        btnAvailableCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableCarActionPerformed(evt);
            }
        });

        btnUnavailableCar.setBackground(new java.awt.Color(255, 153, 204));
        btnUnavailableCar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnUnavailableCar.setForeground(new java.awt.Color(255, 255, 255));
        btnUnavailableCar.setText("View all Unavailable Cars");
        btnUnavailableCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnavailableCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnBack)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(txtMaxSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUnavailableCar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtMinSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8)
                                            .addGap(76, 76, 76))
                                        .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(btnExpiredCert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAvailableCar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnFirstAvailableCar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(17, 17, 17)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(txtModel, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(txtSearchByYear))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchByModel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearchBySerialNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearchByCompanyName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearchByCity, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearchByNoOfSeats)
                    .addComponent(btnSearchByYear))
                .addGap(263, 263, 263))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSearchByCity, btnSearchByCompanyName, btnSearchByModel, btnSearchByNoOfSeats, btnSearchBySerialNumber, btnSearchByYear});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAvailableCar, btnExpiredCert, btnFirstAvailableCar, txtCity});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchByYear)
                            .addComponent(txtSearchByYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchByCompanyName)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchByModel)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btnSearchBySerialNumber))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchByNoOfSeats)
                            .addComponent(txtMinSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(txtMaxSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchByCity)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(btnExpiredCert)))
                .addGap(18, 18, 18)
                .addComponent(btnAvailableCar)
                .addGap(18, 18, 18)
                .addComponent(btnUnavailableCar)
                .addGap(18, 18, 18)
                .addComponent(btnFirstAvailableCar)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFirstAvailableCar, btnSearchByCity, btnSearchByCompanyName, btnSearchByModel, btnSearchByNoOfSeats, btnSearchBySerialNumber, btnSearchByYear});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchByCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByCompanyNameActionPerformed
        // TODO add your handling code here:
        ArrayList<CarInfo> cars = new ArrayList();
        for (CarInfo ci : catalog.getCatalog()) {
            System.out.println(ci.getCompany());
            if (ci.getCompany().equalsIgnoreCase(txtCompanyName.getText())) {
                cars.add(ci);
            }
        }
        txtCompanyName.setText("");
        if(cars.isEmpty()){
            JOptionPane.showMessageDialog(this, "No cars with entered company name found!");
            txtCompanyName.setText("");
        } else {
            SearchResultJPanel modelPanel = new SearchResultJPanel(userProcessContainer, catalog, cars);
            userProcessContainer.add("CarsByBrandPanel", modelPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            txtCompanyName.setText("");
        }
    }//GEN-LAST:event_btnSearchByCompanyNameActionPerformed

    private void txtCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanyNameActionPerformed

    private void btnSearchByModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByModelActionPerformed
        // TODO add your handling code here:
        ArrayList<CarInfo> cars = new ArrayList();
        for (CarInfo ci : catalog.getCatalog()) {
            System.out.println(ci.getCompany());
            if (ci.getModel()== Integer.parseInt(txtModel.getText())) {
                cars.add(ci);
            }
        }
        txtModel.setText("");
        if(cars.isEmpty()){
            JOptionPane.showMessageDialog(this, "No cars with entered Model number found!");
            txtModel.setText("");
        } else {
        SearchResultJPanel modelPanel = new SearchResultJPanel(userProcessContainer, catalog, cars);
        userProcessContainer.add("CarsByBrandPanel", modelPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        txtModel.setText("");
        }
    }//GEN-LAST:event_btnSearchByModelActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnFirstAvailableCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailableCarActionPerformed
        // TODO add your handling code here:

        CarInfo car = catalog.firstAvailableCar();
        if (car == null) {
            JOptionPane.showMessageDialog(this, "No available car is found!");
        } else {
            populateFirstAvailableCarTable();
        }

    }//GEN-LAST:event_btnFirstAvailableCarActionPerformed

    private void btnSearchByYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByYearActionPerformed
        ArrayList<CarInfo> cars = new ArrayList();
        for (CarInfo ci : catalog.getCatalog()) {
            System.out.println(ci.getCompany());
            if (ci.getManufactureYear() == Integer.parseInt(txtSearchByYear.getText())) {
                cars.add(ci);
            }
        }
        txtSearchByYear.setText("");
        if(cars.isEmpty()){
            JOptionPane.showMessageDialog(this, "No cars with entered manufacture year found!");
            txtSearchByYear.setText("");
        } else{
        SearchResultJPanel modelPanel = new SearchResultJPanel(userProcessContainer, catalog, cars);
        userProcessContainer.add("CarsByBrandPanel", modelPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        txtSearchByYear.setText("");
        }
    }//GEN-LAST:event_btnSearchByYearActionPerformed

    private void btnSearchBySerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBySerialNumberActionPerformed
        // TODO add your handling code here:
//        txtSerialNumber.setText("");
        ArrayList<CarInfo> cars = new ArrayList();
        for (CarInfo ci : catalog.getCatalog()) {
            System.out.println(ci.getSerialNo());
            if (ci.getSerialNo().equalsIgnoreCase(txtSerialNumber.getText())) {
                cars.add(ci);
            }
        }
        txtSerialNumber.setText("");
        if(cars.isEmpty()){
            JOptionPane.showMessageDialog(this, "No cars with entered Serial number found!");
//            txtSerialNumber.setText("");
        } else {
            
        SearchResultJPanel modelPanel = new SearchResultJPanel(userProcessContainer, catalog, cars);
        userProcessContainer.add("CarsByBrandPanel", modelPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
//        txtSerialNumber.setText("");
        }
        
    }//GEN-LAST:event_btnSearchBySerialNumberActionPerformed

    private void btnSearchByNoOfSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByNoOfSeatsActionPerformed
        // TODO add your handling code here:
        ArrayList<CarInfo> cars = new ArrayList();
        for (CarInfo ci : catalog.getCatalog()) {
            System.out.println(ci.getCompany());
            if (ci.getNoOfSeats() >= Integer.parseInt(txtMinSeat.getText()) && ci.getNoOfSeats() <= Integer.parseInt(txtMaxSeat.getText())) {
                cars.add(ci);
            }
        }
        txtMinSeat.setText("");
        txtMaxSeat.setText("");
        if(cars.isEmpty()){
            JOptionPane.showMessageDialog(this, "No car with entered no. of seats found");
        } else {
        SearchResultJPanel modelPanel = new SearchResultJPanel(userProcessContainer, catalog, cars);
        userProcessContainer.add("CarsByBrandPanel", modelPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnSearchByNoOfSeatsActionPerformed

    private void btnSearchByCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByCityActionPerformed
        // TODO add your handling code here:
        ArrayList<CarInfo> cars = new ArrayList();
        for (CarInfo ci : catalog.getCatalog()) {
            if (ci.getCity().equals(txtCity.getText())) {
                cars.add(ci);
            }
        }
        txtCity.setText("");
        if(cars.isEmpty()){
            JOptionPane.showMessageDialog(this, "No car with entered city found");
            txtCity.setText("");
        } else {
        SearchResultJPanel modelPanel = new SearchResultJPanel(userProcessContainer, catalog, cars);
        userProcessContainer.add("CarsByBrandPanel", modelPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        txtCity.setText("");
        }
    }//GEN-LAST:event_btnSearchByCityActionPerformed

    private void btnExpiredCertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpiredCertActionPerformed
        // TODO add your handling code here:
        ArrayList<CarInfo> cars = new ArrayList();
        for (CarInfo ci : catalog.getCatalog()) {
            if (ci.getCertificateExpirationDate() < 2021) {
                cars.add(ci);
            }
        }
        if(cars.isEmpty()){
            JOptionPane.showMessageDialog(this, "No car with expired certificate found");
        } else {
        SearchResultJPanel modelPanel = new SearchResultJPanel(userProcessContainer, catalog, cars);
        userProcessContainer.add("CarsByBrandPanel", modelPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnExpiredCertActionPerformed

    private void btnAvailableCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableCarActionPerformed
        // TODO add your handling code here:
        ArrayList<CarInfo> cars = new ArrayList();
        for (CarInfo ci : catalog.getCatalog()) {
            System.out.println(ci.getCompany());
            if (ci.getAvailabilityStatus().equalsIgnoreCase("Yes")) {
                cars.add(ci);
            }
        }
        if(cars.isEmpty()){
            JOptionPane.showMessageDialog(this, "No available cars found");
        } else {
        SearchResultJPanel modelPanel = new SearchResultJPanel(userProcessContainer, catalog, cars);
        userProcessContainer.add("CarsByBrandPanel", modelPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnAvailableCarActionPerformed

    private void txtSearchByYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchByYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchByYearActionPerformed

    private void btnUnavailableCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnavailableCarActionPerformed
        // TODO add your handling code here:
        ArrayList<CarInfo> cars = new ArrayList();
        for (CarInfo ci : catalog.getCatalog()) {
            System.out.println(ci.getCompany());
            if (ci.getAvailabilityStatus().equalsIgnoreCase("No")) {
                cars.add(ci);
            }
        }
        if(cars.isEmpty()){
            JOptionPane.showMessageDialog(this, "No unavailable cars found");
        } else {
        SearchResultJPanel modelPanel = new SearchResultJPanel(userProcessContainer, catalog, cars);
        userProcessContainer.add("CarsByBrandPanel", modelPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnUnavailableCarActionPerformed

    private void populateFirstAvailableCarTable() {
        DefaultTableModel model = (DefaultTableModel) tblSearchResults.getModel();

        model.setRowCount(0);
        for (CarInfo ci : catalog.getCatalog().subList(0, 1)) {
            Object[] row = new Object[8];
            row[0] = ci;
            row[1] = ci.getModel();
            row[2] = ci.getNoOfSeats();
            row[3] = ci.getManufactureYear();
            row[4] = ci.getSerialNo();
            row[5] = ci.getAvailability();
            row[6] = ci.getCity();
            row[7] = ci.getCertificateExpirationDate();

            model.addRow(row);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvailableCar;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExpiredCert;
    private javax.swing.JButton btnFirstAvailableCar;
    private javax.swing.JButton btnSearchByCity;
    private javax.swing.JButton btnSearchByCompanyName;
    private javax.swing.JButton btnSearchByModel;
    private javax.swing.JButton btnSearchByNoOfSeats;
    private javax.swing.JButton btnSearchBySerialNumber;
    private javax.swing.JButton btnSearchByYear;
    private javax.swing.JButton btnUnavailableCar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSearchResults;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtMaxSeat;
    private javax.swing.JTextField txtMinSeat;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSearchByYear;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblSearchResults.getModel();

        model.setRowCount(0);
        for (CarInfo ci : catalog.getCatalog()) {
            Object[] row = new Object[8];
            row[0] = ci;
            row[1] = ci.getModel();
            row[2] = ci.getNoOfSeats();
            row[3] = ci.getManufactureYear();
            row[4] = ci.getSerialNo();
            row[5] = ci.getAvailability();
            row[6] = ci.getCity();
            row[7] = ci.getCertificateExpirationDate();

            model.addRow(row);
        }
    }
}
