
package view;

import model.DBtable;
import control.InsertController;
import control.deleteController;
import control.updateController;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class manageStudent extends javax.swing.JFrame {
 
   
    DefaultTableModel model;
    
    public manageStudent() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) studentdetailstbl.getModel();
        DBtable.setStudentDetailsToTable(model, studentdetailstbl);

    }
    

//clear student_details table
public void clearTable(){
    DefaultTableModel model= (DefaultTableModel) studentdetailstbl.getModel();
    model.setRowCount(0);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        studentidbox = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        studentnamebox = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        deletebtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        facultybox = new javax.swing.JComboBox<>();
        batchbox = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentdetailstbl = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setPreferredSize(new java.awt.Dimension(340, 900));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setMinimumSize(new java.awt.Dimension(320, 900));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" <<Back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/20.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 50, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Batch number");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, 20));

        studentidbox.setBackground(new java.awt.Color(0, 102, 102));
        studentidbox.setBorder(null);
        studentidbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentidboxActionPerformed(evt);
            }
        });
        jPanel3.add(studentidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 230, 30));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 230, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/18.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 50, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter Student Name");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, 20));

        studentnamebox.setBackground(new java.awt.Color(0, 102, 102));
        studentnamebox.setBorder(null);
        studentnamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentnameboxActionPerformed(evt);
            }
        });
        jPanel3.add(studentnamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 230, 30));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 230, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/19.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 50, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Faculty");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, 20));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 230, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/17.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 40, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Enter Student ID");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 40));

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 230, 40));

        deletebtn.setBackground(new java.awt.Color(153, 0, 0));
        deletebtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete");
        deletebtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel3.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 70, 30));

        addbtn.setBackground(new java.awt.Color(153, 0, 0));
        addbtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add");
        addbtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel3.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 70, 30));

        updatebtn.setBackground(new java.awt.Color(153, 0, 0));
        updatebtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update");
        updatebtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel3.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 70, 30));

        facultybox.setBackground(new java.awt.Color(0, 102, 102));
        facultybox.setForeground(new java.awt.Color(255, 255, 255));
        facultybox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT faculty", "Management faculty", "Education faculty", "Science faculty", "Nursing faculty", "Other" }));
        facultybox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        facultybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyboxActionPerformed(evt);
            }
        });
        jPanel3.add(facultybox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 322, 230, 30));

        batchbox.setBackground(new java.awt.Color(0, 102, 102));
        batchbox.setForeground(new java.awt.Color(255, 255, 255));
        batchbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01 ", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "Other" }));
        batchbox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(batchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 230, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 570));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel4.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 20, 20));

        studentdetailstbl.setBackground(new java.awt.Color(0, 153, 153));
        studentdetailstbl.setForeground(new java.awt.Color(255, 255, 255));
        studentdetailstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student name", "Faculty", "Batch"
            }
        ));
        studentdetailstbl.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        studentdetailstbl.setRowHeight(40);
        studentdetailstbl.setSelectionBackground(new java.awt.Color(102, 153, 255));
        studentdetailstbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        studentdetailstbl.setShowHorizontalLines(true);
        studentdetailstbl.setShowVerticalLines(true);
        studentdetailstbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentdetailstblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(studentdetailstbl);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 510, 380));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Manage Student");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(153, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 15));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 280, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/h.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 0, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 640, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dashboard dash = new dashboard();
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void studentidboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentidboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentidboxActionPerformed

    private void studentnameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentnameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentnameboxActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        deleteController.deleteStudent(studentidbox.getText() );
        clearTable();
        DBtable.setStudentDetailsToTable(model, studentdetailstbl);
    }//GEN-LAST:event_deletebtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        InsertController.addStudent(studentidbox.getText() , studentnamebox.getText() , facultybox.getSelectedItem().toString() , batchbox.getSelectedItem().toString());
        clearTable();
        DBtable.setStudentDetailsToTable(model, studentdetailstbl);

    }//GEN-LAST:event_addbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        updateController.updateStudent(studentidbox.getText() , studentnamebox.getText() , facultybox.getSelectedItem().toString() , batchbox.getSelectedItem().toString());
        clearTable();
        DBtable.setStudentDetailsToTable(model, studentdetailstbl);
    }//GEN-LAST:event_updatebtnActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void studentdetailstblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentdetailstblMouseClicked
        int rowNo = studentdetailstbl.getSelectedRow();
        TableModel model= studentdetailstbl.getModel();
        
        studentidbox.setText(model.getValueAt(rowNo, 0).toString());
        studentnamebox.setText(model.getValueAt(rowNo, 1).toString());
        facultybox.setSelectedItem(model.getValueAt(rowNo, 2).toString());
        batchbox.setSelectedItem(model.getValueAt(rowNo, 3).toString());
        
    }//GEN-LAST:event_studentdetailstblMouseClicked

    private void facultyboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyboxActionPerformed

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
            java.util.logging.Logger.getLogger(manageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JComboBox<String> batchbox;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel exit;
    private javax.swing.JComboBox<String> facultybox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable studentdetailstbl;
    private javax.swing.JTextField studentidbox;
    private javax.swing.JTextField studentnamebox;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
