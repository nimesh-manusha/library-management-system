
package view;

import model.DBconnecter;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ReturnBook extends javax.swing.JFrame {

    public ReturnBook() {
        initComponents();
    }
//to fetch the issue book details from the database and display it to panel
    public void getIssueBookDetails(){
        
        int bookID = Integer.parseInt(bookid.getText());
        int stdID = Integer.parseInt(sdtid.getText());
        
        try {
            
            Connection conn = DBconnecter.getconnection();
            String sql = "select * from issue_book_details where book_id = ? and student_id = ? and status = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, bookID);
            pst.setInt(2, stdID);
            pst.setString(3, "pending");
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                iID.setText(rs.getString ("ID"));
                bname.setText(rs.getString("book_name"));
                sname.setText(rs.getString("student_name"));
                idate.setText(rs.getString("issue_date"));
                ddate.setText(rs.getString("due_date"));
                error.setText("");
            }else{
                error.setText("No Record Found ");
                iID.setText("");
                bname.setText("");
                sname.setText("");
                idate.setText("");
                ddate.setText("");
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
     
    }
    
    //return the book
    public boolean returnBook(){
        boolean isreturn = false;
        int bookID = Integer.parseInt(bookid.getText());
        int stdID = Integer.parseInt(sdtid.getText());
        
        try {
            Connection conn = DBconnecter.getconnection();
            String sql =" update issue_book_details set status = ? where student_id = ? and book_id = ? and status = ? ";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, "returned");
            pst.setInt(2, stdID);
            pst.setInt(3, bookID);
            pst.setString(4, "pending");
            
            int rowCount = pst.executeUpdate();
            if(rowCount > 0){
                isreturn = true;
            }else{
                isreturn= false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       return isreturn;
    }
    
    public void updateBookCount(){
        int bookID = Integer.parseInt(bookid.getText());
        
        
        try {
           Connection conn = DBconnecter.getconnection();
        String sql = "update book_details set quantity = quantity + 1 where book_id =?  ";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, bookID);
        
        int rowCount = pst.executeUpdate();
        
        if(rowCount > 0){
            JOptionPane.showMessageDialog(this,"book count updated");
              
        }
        else{
            JOptionPane.showConfirmDialog(this, "can't update book count");
        }
            
        } catch (Exception e) {  
            e.printStackTrace();           
        }
        
    } 
            
   
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        error = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ddate = new javax.swing.JTextField();
        iID = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        bname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        idate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        bookid = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        sdtid = new javax.swing.JTextField();
        fdetails = new javax.swing.JButton();
        rbook = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(984, 570));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(102, 0, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(325, 570));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        error.setBackground(new java.awt.Color(255, 204, 0));
        error.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        error.setForeground(new java.awt.Color(255, 204, 0));
        jPanel5.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 270, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Book Name :");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Student Name :");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Issued ID");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        ddate.setBackground(new java.awt.Color(102, 0, 0));
        ddate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        ddate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddateActionPerformed(evt);
            }
        });
        jPanel5.add(ddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 170, 40));

        iID.setBackground(new java.awt.Color(102, 0, 0));
        iID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        iID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iIDActionPerformed(evt);
            }
        });
        jPanel5.add(iID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 170, 30));

        sname.setBackground(new java.awt.Color(102, 0, 0));
        sname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });
        jPanel5.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 170, 40));

        bname.setBackground(new java.awt.Color(102, 0, 0));
        bname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnameActionPerformed(evt);
            }
        });
        jPanel5.add(bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 170, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Issued Book Details");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 180, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Issued Date :");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Due Date :");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 30));

        idate.setBackground(new java.awt.Color(102, 0, 0));
        idate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        idate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idateActionPerformed(evt);
            }
        });
        jPanel5.add(idate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 170, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 310, 630));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Return Book");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 140, 30));

        exit.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 20, 20));

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Book ID :");
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 60, 30));

        bookid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 0)));
        bookid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bookidFocusLost(evt);
            }
        });
        bookid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookidActionPerformed(evt);
            }
        });
        jPanel1.add(bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 230, 40));

        jLabel52.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Student ID :");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 90, 30));

        sdtid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 0)));
        sdtid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sdtidFocusLost(evt);
            }
        });
        jPanel1.add(sdtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 230, 40));

        fdetails.setBackground(new java.awt.Color(0, 153, 153));
        fdetails.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        fdetails.setForeground(new java.awt.Color(255, 255, 255));
        fdetails.setText("Find Detais");
        fdetails.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        fdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdetailsActionPerformed(evt);
            }
        });
        jPanel1.add(fdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 290, 40));

        rbook.setBackground(new java.awt.Color(0, 153, 153));
        rbook.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        rbook.setForeground(new java.awt.Color(255, 255, 255));
        rbook.setText("Return Book");
        rbook.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        rbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbookActionPerformed(evt);
            }
        });
        jPanel1.add(rbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 290, 40));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" <<Back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/g.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, -1, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ddateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddateActionPerformed

    private void iIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iIDActionPerformed

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameActionPerformed

    private void bnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnameActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void bookidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookidFocusLost
        

    }//GEN-LAST:event_bookidFocusLost

    private void bookidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookidActionPerformed

    }//GEN-LAST:event_bookidActionPerformed

    private void sdtidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sdtidFocusLost
        
    }//GEN-LAST:event_sdtidFocusLost

    private void idateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idateActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dashboard dash = new dashboard();
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void fdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdetailsActionPerformed
        getIssueBookDetails();
// TODO add your handling code here:
    }//GEN-LAST:event_fdetailsActionPerformed

    private void rbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbookActionPerformed
    if(returnBook() == true){
        JOptionPane.showMessageDialog(this, "Book Returned Successfully");
        updateBookCount();
    }else{
       JOptionPane.showMessageDialog(this, "Book Returned Failled" );
    }
    }//GEN-LAST:event_rbookActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bname;
    private javax.swing.JTextField bookid;
    private javax.swing.JTextField ddate;
    private javax.swing.JLabel error;
    private javax.swing.JLabel exit;
    private javax.swing.JButton fdetails;
    private javax.swing.JTextField iID;
    private javax.swing.JTextField idate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton rbook;
    private javax.swing.JTextField sdtid;
    private javax.swing.JTextField sname;
    // End of variables declaration//GEN-END:variables
}
