/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aniruddh
 */
public class HistoryPage extends javax.swing.JFrame {

    /**
     * Creates new form HistoryPage
     */
    public HistoryPage() {
        initComponents();
    }
    
    public HistoryPage(String w) {
        initComponents();
        userNameLbl1.setText(w);
                 try {
                        
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/usersdb","root","shantanu2003"); 
                        String query4="SELECT place, hotelName, checkIN, checkOUT,NumberOfRooms, BookingID, totalCost from hotels where UserName='"+userNameLbl1.getText()+"'";
                        PreparedStatement stmt4=con.prepareStatement(query4);
                        ResultSet rs4=stmt4.executeQuery();
                        DefaultTableModel tm=(DefaultTableModel)previousBookingTable.getModel();
                        tm.setRowCount(0);
                        while(rs4.next())
                        {
                            Object o[]={rs4.getString("place"),rs4.getString("HotelName"),rs4.getString("checkIN"),rs4.getString("checkOUT"),rs4.getString("NumberOfRooms"),rs4.getString("BookingID"),rs4.getString("totalCost")};
                            tm.addRow(o);
                        }
                       
                    }
                     catch (Exception e) {
                        
                    }
                 
                 
                 try {
                        
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/usersdb","root","shantanu2003"); 
                        String query4="SELECT place, hotelName, checkIN, checkOUT,NumberOfRooms, BookingID, totalCost from waitlist where UserName='"+userNameLbl1.getText()+"'";
                        PreparedStatement stmt4=con.prepareStatement(query4);
                        ResultSet rs4=stmt4.executeQuery();
                        DefaultTableModel tm=(DefaultTableModel)waitListTable.getModel();
                        tm.setRowCount(0);
                        while(rs4.next())
                        {
                            Object o[]={rs4.getString("place"),rs4.getString("HotelName"),rs4.getString("checkIN"),rs4.getString("checkOUT"),rs4.getString("NumberOfRooms"),rs4.getString("BookingID"),rs4.getString("totalCost")};
                            tm.addRow(o);
                        }
                       
                    }
                     catch (Exception e) {
                        
                    }
                 
                 
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        previousBookingTable = new javax.swing.JTable();
        welcomeLbl = new javax.swing.JLabel();
        waitlistEnrollmentLbl = new javax.swing.JLabel();
        userNameLbl1 = new javax.swing.JLabel();
        confirmBookingLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        waitListTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        previousBookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Place", "Hotel Name", "CheckIN", "CheckOUT", "No.of Rooms", "BookingID", "Total Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(previousBookingTable);

        welcomeLbl.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        welcomeLbl.setText("Welcome");

        waitlistEnrollmentLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        waitlistEnrollmentLbl.setText("Waitlist Enrollment");

        userNameLbl1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userNameLbl1.setText("user");

        confirmBookingLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        confirmBookingLbl.setText("Confirmed Bookings");

        waitListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Place", "Hotel Name", "CheckIN", "CheckOUT", "No.of Rooms", "BookingID", "Total Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(waitListTable);

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(waitlistEnrollmentLbl)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(welcomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(userNameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(confirmBookingLbl)
                    .addContainerGap(681, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLbl1))
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(waitlistEnrollmentLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(confirmBookingLbl)
                    .addContainerGap(500, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        Welcome w1=new Welcome();
        w1.setVisible(true);
        w1.userName(userNameLbl1.getText());
        dispose();
        
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(HistoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoryPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel confirmBookingLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable previousBookingTable;
    private javax.swing.JLabel userNameLbl1;
    private javax.swing.JTable waitListTable;
    private javax.swing.JLabel waitlistEnrollmentLbl;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
}
