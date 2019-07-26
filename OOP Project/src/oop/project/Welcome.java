/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project;

/**
 *
 * @author Aniruddh
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcom
     * @param w
     */
   /* public Welcome(LoginPage l) {
        userNameLbl.setText(l.userNameTxt.getText());
        initComponents();
    }*/
    public Welcome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLbl = new javax.swing.JLabel();
        userNameLbl = new javax.swing.JLabel();
        bookHotelLbl = new javax.swing.JLabel();
        canceBookinglLbl = new javax.swing.JLabel();
        previousBookingLbl = new javax.swing.JLabel();
        bookHotelBtn = new javax.swing.JButton();
        cancelBookingBtn = new javax.swing.JButton();
        historyBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        modifyBookingLbl = new javax.swing.JLabel();
        modifyBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLbl.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        welcomeLbl.setText("Welcome");

        userNameLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userNameLbl.setText("user");

        bookHotelLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bookHotelLbl.setText("1)Book Hotel");

        canceBookinglLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        canceBookinglLbl.setText("2)Cancel Booking");

        previousBookingLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        previousBookingLbl.setText("4)Previous Bookings");

        bookHotelBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookHotelBtn.setText("Book Now");
        bookHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookHotelBtnActionPerformed(evt);
            }
        });

        cancelBookingBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelBookingBtn.setText("Cancel Booking");
        cancelBookingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBookingBtnActionPerformed(evt);
            }
        });

        historyBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        historyBtn.setText("History");
        historyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyBtnActionPerformed(evt);
            }
        });

        logOutBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logOutBtn.setText("Log Out");
        logOutBtn.setActionCommand("");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        modifyBookingLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modifyBookingLbl.setText("3)Modify Bookings");

        modifyBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modifyBtn.setText("Modify Booking");
        modifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logOutBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookHotelLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(welcomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(canceBookinglLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(previousBookingLbl)
                        .addComponent(modifyBookingLbl)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(historyBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelBookingBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookHotelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLbl))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookHotelLbl)
                    .addComponent(bookHotelBtn))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canceBookinglLbl)
                    .addComponent(cancelBookingBtn))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyBookingLbl)
                    .addComponent(modifyBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previousBookingLbl)
                    .addComponent(historyBtn))
                .addGap(82, 82, 82)
                .addComponent(logOutBtn)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookHotelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookHotelBtnActionPerformed
        // TODO add your handling code here:
        CompareHotels ch=new CompareHotels();
        ch.userName(userNameLbl.getText());
        ch.setVisible(true); 
        dispose();
    }//GEN-LAST:event_bookHotelBtnActionPerformed

    private void cancelBookingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBookingBtnActionPerformed
        // TODO add your handling code here:
        CancelBookingPage cb=new CancelBookingPage(userNameLbl.getText());
        cb.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_cancelBookingBtnActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
        LoginPage lp=new LoginPage();
        lp.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void modifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBtnActionPerformed
        // TODO add your handling code here:
        ModificationPage mp=new ModificationPage(userNameLbl.getText());
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_modifyBtnActionPerformed

    private void historyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyBtnActionPerformed
        // TODO add your handling code here:
        HistoryPage hp=new HistoryPage(userNameLbl.getText());
        hp.setVisible(true);
        dispose();
    }//GEN-LAST:event_historyBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookHotelBtn;
    private javax.swing.JLabel bookHotelLbl;
    private javax.swing.JLabel canceBookinglLbl;
    private javax.swing.JButton cancelBookingBtn;
    private javax.swing.JButton historyBtn;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JLabel modifyBookingLbl;
    private javax.swing.JButton modifyBtn;
    private javax.swing.JLabel previousBookingLbl;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
public void userName(String w)
{
    userNameLbl.setText(w);
}
}