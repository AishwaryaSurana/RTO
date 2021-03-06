package rto;

import conn.MyCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author Aishwarya
 */
public class DataEntry extends javax.swing.JFrame 
{
    Connection con=null;
    PreparedStatement psmt=null;
    Calendar c=null;
    
    public DataEntry()
    {
        
        initComponents(); 
        new_vehicle_type.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        vehicle_no = new javax.swing.JTextField();
        balance_total = new javax.swing.JTextField();
        mobile_no = new javax.swing.JTextField();
        balance_due = new javax.swing.JTextField();
        receipt_no = new javax.swing.JTextField();
        balance_deposited = new javax.swing.JTextField();
        particular = new javax.swing.JTextField();
        reference = new javax.swing.JTextField();
        bt_ok = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        vehicle_type = new javax.swing.JComboBox();
        bt_add_new = new javax.swing.JButton();
        new_vehicle_type = new javax.swing.JTextField();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jXDatePicker3 = new org.jdesktop.swingx.JXDatePicker();
        jXDatePicker4 = new org.jdesktop.swingx.JXDatePicker();

        jLabel13.setText("Name");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("                                                      Enter Vehical Details");

        jLabel2.setText("Name");
        jLabel2.setFocusCycleRoot(true);
        jLabel2.setPreferredSize(null);

        jLabel3.setText("Mobile Number");
        jLabel3.setFocusCycleRoot(true);

        jLabel4.setText("Reciept Number");
        jLabel4.setFocusCycleRoot(true);

        jLabel5.setText("Vehicle Number");
        jLabel5.setFocusCycleRoot(true);

        jLabel6.setText("Vehicle Type");
        jLabel6.setFocusCycleRoot(true);

        jLabel7.setText("Reference");
        jLabel7.setFocusCycleRoot(true);

        jLabel8.setText("Address");
        jLabel8.setFocusCycleRoot(true);

        jLabel9.setText("Balance Total");
        jLabel9.setFocusCycleRoot(true);

        jLabel10.setText("Particular");
        jLabel10.setFocusCycleRoot(true);

        jLabel11.setText("Balance Deposited");
        jLabel11.setFocusCycleRoot(true);

        jLabel12.setText("Balance Due");
        jLabel12.setFocusCycleRoot(true);

        jLabel14.setText("Fitness Date");
        jLabel14.setFocusCycleRoot(true);

        jLabel24.setText("Insurance Date");
        jLabel24.setFocusCycleRoot(true);

        jLabel25.setText("Tax Date");
        jLabel25.setFocusCycleRoot(true);

        jLabel26.setText("Permit Date");
        jLabel26.setFocusCycleRoot(true);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        vehicle_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicle_noActionPerformed(evt);
            }
        });

        balance_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balance_totalActionPerformed(evt);
            }
        });

        mobile_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_noActionPerformed(evt);
            }
        });

        balance_due.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balance_dueActionPerformed(evt);
            }
        });

        receipt_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receipt_noActionPerformed(evt);
            }
        });

        balance_deposited.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balance_depositedActionPerformed(evt);
            }
        });

        particular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                particularActionPerformed(evt);
            }
        });

        reference.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenceActionPerformed(evt);
            }
        });

        bt_ok.setText("OK");
        bt_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_okActionPerformed(evt);
            }
        });

        vehicle_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "two wheeler", "four wheeler", "six wheeler" }));
        vehicle_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicle_typeActionPerformed(evt);
            }
        });

        bt_add_new.setText("Add new");
        bt_add_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_add_newActionPerformed(evt);
            }
        });

        new_vehicle_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_vehicle_typeActionPerformed(evt);
            }
        });

        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
            }
        });

        jXDatePicker2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker2ActionPerformed(evt);
            }
        });

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jXDatePicker3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker3ActionPerformed(evt);
            }
        });

        jXDatePicker4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(balance_due, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mobile_no, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(receipt_no, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(vehicle_no, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(balance_total, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(vehicle_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt_add_new)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(new_vehicle_type, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(balance_deposited, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reference, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(particular, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_ok))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(234, 234, 234))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXDatePicker4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXDatePicker3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel14, jLabel2, jLabel24, jLabel25, jLabel26, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(vehicle_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mobile_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(receipt_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vehicle_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_add_new)
                            .addComponent(new_vehicle_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(balance_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel11)
                        .addComponent(balance_deposited, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(balance_due, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jXDatePicker4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jXDatePicker3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(particular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(reference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(bt_ok)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel14, jLabel2, jLabel24, jLabel25, jLabel26, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        jLabel2.getAccessibleContext().setAccessibleName("");
        jLabel3.getAccessibleContext().setAccessibleName("");
        jLabel4.getAccessibleContext().setAccessibleName("");
        jLabel5.getAccessibleContext().setAccessibleName("");
        jLabel6.getAccessibleContext().setAccessibleName("");
        jLabel7.getAccessibleContext().setAccessibleName("");
        jLabel8.getAccessibleContext().setAccessibleName("");
        jLabel9.getAccessibleContext().setAccessibleName("");
        jLabel10.getAccessibleContext().setAccessibleName("");
        jLabel11.getAccessibleContext().setAccessibleName("");
        jLabel12.getAccessibleContext().setAccessibleName("");
        jLabel14.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void vehicle_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicle_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicle_noActionPerformed

    private void balance_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balance_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balance_totalActionPerformed

    private void mobile_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobile_noActionPerformed

    private void balance_dueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balance_dueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balance_dueActionPerformed

    private void receipt_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receipt_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receipt_noActionPerformed

    private void balance_depositedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balance_depositedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balance_depositedActionPerformed

    private void particularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_particularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_particularActionPerformed

    private void referenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenceActionPerformed
private String convertDate(Date date)
 {
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        Calendar cal = Calendar.getInstance();
        cal.setTime(sqlDate);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        String str_date= year+"-"+month+"-"+day;
        return str_date;
 
 }
    private void bt_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_okActionPerformed
        
        Date fitness_dat = jXDatePicker1.getDate();
        String fitness_date=convertDate(fitness_dat);
         System.out.println("Fitness Date="+fitness_date);
        
        Date permit_dat = (Date) jXDatePicker2.getDate();
        String permit_date=convertDate(permit_dat);
        System.out.println(permit_date);
        
        Date insurance_dat = (Date) jXDatePicker3.getDate();
        String insurance_date=convertDate(insurance_dat);
        System.out.println(insurance_date);
        
        Date tax_dat = (Date) jXDatePicker4.getDate();
        String tax_date=convertDate(tax_dat);
        System.out.println(tax_date);
        
        String entry[]=new String[15];
        entry[0]=name.getText();
        entry[1]=vehicle_no.getText();
        entry[2]=address.getText();
        entry[3]=mobile_no.getText();
        entry[4]=receipt_no.getText();
        entry[5]=(String)vehicle_type.getSelectedItem();
        //if(balance_due.getText()!=null)
        entry[6]=balance_due.getText();
        float due=Float.parseFloat(entry[6]);
        entry[7]=balance_total.getText();
        float total=Float.parseFloat(entry[7]);
        entry[8]=balance_deposited.getText();
        float deposited=Float.parseFloat(entry[8]);
        entry[9]=fitness_date;
        entry[10]=permit_date;        
        entry[11]=particular.getText();
        entry[12]=reference.getText();
        entry[13]=tax_date;
        entry[14]=insurance_date;
        
        try
        {
        con = MyCon.getConnection();
        String querry = "INSERT INTO `vehicle_details`( `name`, `vehicle_no`, `address`, `mobile_no`, `reciept_no`, `vehicle_type`, `balance_due`, `balance_total`, `balance_deposite`, `fitness_date`, `permit_date`, `particular`, `reference`, `tax_date`, `insurance_date`)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        psmt=con.prepareStatement(querry);
         System.out.println("querry fired");
         psmt.setString(1,entry[0]);
         System.out.print(" 1st entered");
         psmt.setString(2,entry[1]);
         psmt.setString(3,entry[2]);
         psmt.setString(4,entry[3]);
         psmt.setString(5,entry[4]);
         psmt.setString(6,entry[5]);
         psmt.setFloat(7,due);
         psmt.setFloat(8,total);
         psmt.setFloat(9,deposited);
         psmt.setString(10,fitness_date);
         psmt.setString(11,entry[10]);
         psmt.setString(12,entry[11]);
         psmt.setString(13,entry[12]);
         psmt.setString(14,entry[13]);
         psmt.setString(15,entry[14]);
        System.out.println(" prepared statement");
        
        int res=psmt.executeUpdate();
        if(res>0)
         {
             System.out.print(" Inserted");
         }
         else
         {
                 System.out.print(" not Inserted");
         }
         
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        
        
        
    }//GEN-LAST:event_bt_okActionPerformed

    private void vehicle_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicle_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicle_typeActionPerformed

    private void bt_add_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_add_newActionPerformed
      new_vehicle_type.setVisible(true);
    }//GEN-LAST:event_bt_add_newActionPerformed

    private void new_vehicle_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_vehicle_typeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_new_vehicle_typeActionPerformed

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void jXDatePicker3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDatePicker3ActionPerformed

    private void jXDatePicker4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDatePicker4ActionPerformed

    private void jXDatePicker2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDatePicker2ActionPerformed

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
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JTextField balance_deposited;
    private javax.swing.JTextField balance_due;
    private javax.swing.JTextField balance_total;
    private javax.swing.JButton bt_add_new;
    private javax.swing.JButton bt_ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker3;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker4;
    private javax.swing.JTextField mobile_no;
    private javax.swing.JTextField name;
    private javax.swing.JTextField new_vehicle_type;
    private javax.swing.JTextField particular;
    private javax.swing.JTextField receipt_no;
    private javax.swing.JTextField reference;
    private javax.swing.JTextField vehicle_no;
    private javax.swing.JComboBox vehicle_type;
    // End of variables declaration//GEN-END:variables
}
