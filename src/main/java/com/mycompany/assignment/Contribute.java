/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Contribute extends javax.swing.JPanel {

    

    public Contribute() {
        initComponents();
        Ctb_load();
    }

    
    
    public void Ctb_load() {
    try {
        // Create a DefaultTableModel for the UserTable
        DefaultTableModel dt = (DefaultTableModel) ContributeTable.getModel();
        dt.setRowCount(0); // Clear existing rows

        // Open the supplier.txt file for reading
        Scanner scanner = new Scanner(new File("ppe.txt"));

        // Skip the header line (if it exists)
        if (scanner.hasNextLine()) {
            scanner.nextLine(); // Skip header
        }

        // Read data line by line and add to the table
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] data = line.split(","); // Split line by comma

            // Create a Vector to store data for a row
            Vector<String> row = new Vector<>();
            row.add(data[0]); 
            row.add(data[1]); 
            row.add(data[2]); 
            row.add(data[3]); 

            // Add the row to the table model
            dt.addRow(row);
        }

        // Close the scanner to release resources
        scanner.close();

    } catch (Exception e) {
        
    }
 }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CI_code = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CQ_quantity = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CH_code = new javax.swing.JTextField();
        ComboBox = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ContributeTable = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel2.setPreferredSize(new java.awt.Dimension(300, 450));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Hospital Code :");

        CI_code.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CI_code.setText("0");
        CI_code.setPreferredSize(new java.awt.Dimension(64, 40));
        CI_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CI_codeActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Clear.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\clear.png")); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Quantity :");

        CQ_quantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CQ_quantity.setText("0");
        CQ_quantity.setPreferredSize(new java.awt.Dimension(64, 40));
        CQ_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CQ_quantityActionPerformed(evt);
            }
        });

        Save.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Save.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\Save.png")); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Contribute");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Item Code :");

        CH_code.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CH_code.setText("0");
        CH_code.setPreferredSize(new java.awt.Dimension(64, 40));
        CH_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CH_codeActionPerformed(evt);
            }
        });

        ComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Less Than 25 Box" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CH_code, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CI_code, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(jLabel3))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(67, 67, 67)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBox, 0, 217, Short.MAX_VALUE)
                                .addComponent(CQ_quantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CI_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CH_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CQ_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ContributeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ItemCode", "ItemName", "SupplierCode", "QuantityBox"
            }
        ));
        jScrollPane2.setViewportView(ContributeTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CQ_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CQ_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CQ_quantityActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        CI_code.setText("0");
        CH_code.setText("0");
        CQ_quantity.setText("0");
    }//GEN-LAST:event_ClearActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

        String code = CI_code.getText();
        String Hcode = CH_code.getText();
        String quantity = CQ_quantity.getText();
        String supplier = null;
        String ItemName = null;

        // Check if the supplier code exists in "ppe.txt"
        boolean PPEExists = false;
        int currentQuantity = 0;
        Vector<String[]> PPEData = new Vector<>();
        
        // Check if the hospital code exists in "hospitals.txt"
        boolean hospitalExists = false;
        try (BufferedReader hospitalReader = new BufferedReader(new FileReader("hospitals.txt"))) {
            String hospitalLine;
            while ((hospitalLine = hospitalReader.readLine()) != null) {
                String[] hospitalDataLine = hospitalLine.split(",");
                if (hospitalDataLine[0].equals(Hcode)) {
                    hospitalExists = true;
                    break;
                }
            }
        } catch (Exception e) {

        }
        try (BufferedReader reader = new BufferedReader(new FileReader("ppe.txt"));
             FileWriter writer = new FileWriter("ppe.txt", true)) { // Append to the file
            String line;
            while ((line = reader.readLine()) != null) {
                String[] PPEDataLine = line.split(",");
                PPEData.add(PPEDataLine);
                if (PPEDataLine[0].equals(code)) {
                    ItemName = PPEDataLine[1];
                    supplier = PPEDataLine[2];
                    PPEExists = true;
                    currentQuantity = Integer.parseInt(PPEDataLine[3]);
                    break;
                }
            }

            // Check if the code exists based on the supplier variable
            if (supplier == null || !hospitalExists) {
                JOptionPane.showMessageDialog(null, "Invalid Input or Invalid Hospital Code");
            } else {
                try {
                    FileReader fr = new FileReader("ppe.txt");
                    BufferedReader br = new BufferedReader(fr);     // Create a BufferedReader to read the file line by line
                    StringBuilder sb = new StringBuilder();     // Create a StringBuilder to store the updated content

                    // Read the file line by line
                    String lines;
                    boolean found = false;
                    while ((lines = br.readLine()) != null) {
                        String[] userfile = lines.split(","); // Split the line into an array of fields
                        String uid = userfile[0].trim();

                        if (code.equals(uid)) {
                            userfile[1] = ItemName; 
                            userfile[2] = supplier;
                            if (Integer.parseInt(quantity) < 0) {
                                JOptionPane.showMessageDialog(null, "Cannot enter a negative quantity.");
                                break;
                            }
                            if (currentQuantity < Integer.parseInt(quantity)) {
                            JOptionPane.showMessageDialog(null, "Insufficient quantity of the item.");
                            break;
                        }
                            int newQuantity = currentQuantity - Integer.parseInt(quantity);
                            userfile[3] = String.valueOf(newQuantity);
                            lines = String.join(",", userfile);
                            found = true;
                        }
                        // Join the updated fields back into a string
                        sb.append(lines).append("\n");
                    }

                    br.close();

                    if (found) {
                        FileWriter fw = new FileWriter("ppe.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(sb.toString());
                        bw.close(); 
                        // Record in transactions.txt
                try (FileWriter transactionWriter = new FileWriter("transactions.txt", true)) {
                    transactionWriter.write(code + ",distribute," + supplier + ","+ Hcode +"," + quantity + "," + new SimpleDateFormat("dd-MM-yyyy").format(new Date()) + "\n");
                } catch (Exception e) {
                    // Handle exceptions appropriately
                }

                JOptionPane.showMessageDialog(null, "Saved");
                CI_code.setText("0");
                CH_code.setText("0");
                CQ_quantity.setText("0");
                Ctb_load();

                    } else {
                        JOptionPane.showMessageDialog(null, "Something Wrong");
                    }

                } catch (Exception e) {

                }

                
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void CI_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CI_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CI_codeActionPerformed

    private void CH_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CH_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CH_codeActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        String selectedOption = ComboBox.getSelectedItem().toString();
        if(selectedOption.equals("Less Than 25 Box")){
                
                try {
        // Create a DefaultTableModel for the RecordTable
        DefaultTableModel dt = (DefaultTableModel) ContributeTable.getModel();
        dt.setRowCount(0); // Clear existing rows

        // Open the supplier.txt file for reading
        Scanner scanner = new Scanner(new File("ppe.txt"));

        // Skip the header line (if it exists)
        if (scanner.hasNextLine()) {
            scanner.nextLine(); // Skip header
        }

        // Read data line by line and add to the table
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] data = line.split(","); // Split line by comma

            // Create a Vector to store data for a row
            if (Integer.parseInt(data[3]) < 25) {
                Vector<String> row = new Vector<>();
                row.add(data[0]);
                row.add(data[1]);
                row.add(data[2]);
                row.add(data[3]);


                // Add the row to the table model
                dt.addRow(row);
            }
        }

        // Close the scanner to release resources
        scanner.close();

    } catch (Exception e) {
        
    }
            }else {
            Ctb_load();
            }
    }//GEN-LAST:event_ComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CH_code;
    private javax.swing.JTextField CI_code;
    private javax.swing.JTextField CQ_quantity;
    private javax.swing.JButton Clear;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTable ContributeTable;
    private javax.swing.JButton Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
