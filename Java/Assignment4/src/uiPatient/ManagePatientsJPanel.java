/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiPatient;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.MyStringVerifier;
import model.Patient;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author SHRISHTI
 */
public class ManagePatientsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientsJPanel
     */
    private PersonDirectory personDirectory;
    private JPanel userProcessContainer;
    
    public ManagePatientsJPanel(JPanel userProcessContainer, PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        ArrayList<Person> personList = personDirectory.getPersonHistory();
        populatePatientsTable(personList);
        InputVerifier stringVerifier = new MyStringVerifier();
//        searchBoxJTextField.setInputVerifier(stringVerifier);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnCreatePatient = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewPersonsJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnEditPatient = new javax.swing.JButton();
        btnViewPatient = new javax.swing.JButton();
        btnDeletePatient = new javax.swing.JButton();
        searchBoxJTextField = new javax.swing.JTextField();
        searchPatientJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 0, 204));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresh.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 0, 204));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnCreatePatient.setBackground(new java.awt.Color(255, 255, 255));
        btnCreatePatient.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        btnCreatePatient.setForeground(new java.awt.Color(255, 0, 204));
        btnCreatePatient.setText("Create Patient");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        viewPersonsJTable.setBackground(new java.awt.Color(255, 255, 255));
        viewPersonsJTable.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        viewPersonsJTable.setForeground(new java.awt.Color(255, 0, 204));
        viewPersonsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient First Name", "Patient Last Name", "Age", "Patient ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewPersonsJTable);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Patients");

        btnEditPatient.setBackground(new java.awt.Color(255, 255, 255));
        btnEditPatient.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        btnEditPatient.setForeground(new java.awt.Color(255, 0, 204));
        btnEditPatient.setText("Edit Patient");
        btnEditPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPatientActionPerformed(evt);
            }
        });

        btnViewPatient.setBackground(new java.awt.Color(255, 255, 255));
        btnViewPatient.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        btnViewPatient.setForeground(new java.awt.Color(255, 0, 204));
        btnViewPatient.setText("View Patient");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        btnDeletePatient.setBackground(new java.awt.Color(255, 255, 255));
        btnDeletePatient.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        btnDeletePatient.setForeground(new java.awt.Color(255, 0, 204));
        btnDeletePatient.setText("Delete Patient");
        btnDeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatientActionPerformed(evt);
            }
        });

        searchBoxJTextField.setBackground(new java.awt.Color(255, 255, 255));
        searchBoxJTextField.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        searchBoxJTextField.setForeground(new java.awt.Color(255, 0, 204));

        searchPatientJButton.setBackground(new java.awt.Color(255, 255, 255));
        searchPatientJButton.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        searchPatientJButton.setForeground(new java.awt.Color(255, 0, 204));
        searchPatientJButton.setText("Search Patient by Name");
        searchPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(370, 370, 370)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(searchBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCreatePatient)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEditPatient)
                                    .addComponent(searchPatientJButton))
                                .addGap(18, 18, 18)
                                .addComponent(btnDeletePatient)))
                        .addGap(0, 652, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(581, 581, 581)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreatePatient, btnDeletePatient, btnEditPatient, btnRefresh, btnViewPatient});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreatePatient)
                    .addComponent(btnViewPatient)
                    .addComponent(btnEditPatient)
                    .addComponent(btnDeletePatient))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchPatientJButton)
                    .addComponent(searchBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRefresh)
                .addContainerGap(765, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreatePatient, btnDeletePatient, btnEditPatient, btnRefresh, btnViewPatient});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
//        searchBoxJTextField.setText("");
        populatePatientsTable(personDirectory.getPersonHistory());
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        if(person.getPatient()!=null)
        {
            JOptionPane.showMessageDialog(this, "Patient already exists.","Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        CreatePatientJPanel cpJPanel= new CreatePatientJPanel(userProcessContainer, person);
        userProcessContainer.add("cpJPanel", cpJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void btnEditPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPatientActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        /*pass userProcessContainer and Patient*/
        Patient patient= person.getPatient();
        if(patient!=null)
        {
            ViewUpdatePatientDetailsJPanel vupdJPanel=
            new ViewUpdatePatientDetailsJPanel(userProcessContainer, patient,Boolean.TRUE);
            userProcessContainer.add("vupdJPanel", vupdJPanel);
            CardLayout layout=(CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Patient not created, "
                + "Please create Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditPatientActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        /*pass userProcessContainer and Patient*/
        Patient patient = person.getPatient();
        if(patient!=null)
        {
            ViewUpdatePatientDetailsJPanel vupdJPanel=
            new ViewUpdatePatientDetailsJPanel(userProcessContainer, patient,Boolean.FALSE);
            userProcessContainer.add("vupdJPanel", vupdJPanel);
            CardLayout layout=(CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Patient not created, "
                + "Please create Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void btnDeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatientActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        Patient patient=person.getPatient();
        if(patient==null)
        {
            JOptionPane.showMessageDialog(this, "Patient not created. Cannot delete",
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        /*Ask confirmation*/
        int flag= JOptionPane.showConfirmDialog(this, "Are you sure want to remove?",
            "Warning", JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            person.setPatient(null);
            populatePatientsTable(personDirectory.getPersonHistory());
        }
    }//GEN-LAST:event_btnDeletePatientActionPerformed

    private void searchPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatientJButtonActionPerformed
        // TODO add your handling code here:
        String key= searchBoxJTextField.getText().trim();
        if(key.length()==0)
        {
            JOptionPane.showMessageDialog(this, "Please enter key.", "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList<Person> searchPatients;
        searchPatients=personDirectory.searchPatient(key);
        populatePatientsTable(searchPatients);
    }//GEN-LAST:event_searchPatientJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnDeletePatient;
    private javax.swing.JButton btnEditPatient;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchBoxJTextField;
    private javax.swing.JButton searchPatientJButton;
    private javax.swing.JTable viewPersonsJTable;
    // End of variables declaration//GEN-END:variables

    private void populatePatientsTable(ArrayList<Person> personList) {
        DefaultTableModel model = (DefaultTableModel) viewPersonsJTable.getModel();
        model.setRowCount(0);
        if(personList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Patient Found! Please check spelling or create patient first!",
                    "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Person person : personList) {
            Object[] row = new Object[4];
            row[0] = person;
            row[1] = person.getLastName();
            row[2]= person.getAge();
            if(person.getPatient()!=null)
            {
                row[3] = person.getPatient().getPatientID();
            }
            else
            {
                row[3] = "Patient Not Created";
            }
            
            model.addRow(row);
        }
    }
}
