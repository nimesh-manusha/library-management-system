
package view;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import model.DBtable;

public class dashboard extends javax.swing.JFrame {

    Color mouseEnterColor = new Color(51,51,51);
    Color mouseExitColor  = new Color(0,0,0);
    DefaultTableModel model;
    DefaultTableModel model1;

    public dashboard() {
        initComponents();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DBtable.setStudentDetailsToTable(model, jTable1);


        DefaultTableModel model1 = (DefaultTableModel) jTable2 .getModel();
        DBtable.setBookDetailsToTable(model1, jTable2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        mbpnl = new javax.swing.JPanel();
        mb = new javax.swing.JLabel();
        mspnl = new javax.swing.JPanel();
        ms = new javax.swing.JLabel();
        ibpnl = new javax.swing.JPanel();
        ib = new javax.swing.JLabel();
        rbpnl = new javax.swing.JPanel();
        rb = new javax.swing.JLabel();
        vrpnl = new javax.swing.JPanel();
        vr = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1110, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 50));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 5, 3, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/User.png"))); // NOI18N
        jLabel2.setText("Welcome , Admin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 220, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Library Management System");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 350, 50));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 30, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 20, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(153, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/2.png"))); // NOI18N
        jLabel11.setText("  Home Page");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, -1, 150, 60));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 300, 60));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/3.png"))); // NOI18N
        jLabel12.setText(" LMS Dashboard");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 190, 40));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Features");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 150, 40));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/4.png"))); // NOI18N
        jLabel5.setText(" Logout");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 170, 50));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 300, 50));

        mbpnl.setBackground(new java.awt.Color(0, 0, 0));
        mbpnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mbpnlMouseEntered(evt);
            }
        });

        mb.setBackground(new java.awt.Color(255, 255, 255));
        mb.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        mb.setForeground(new java.awt.Color(255, 255, 255));
        mb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/5.png"))); // NOI18N
        mb.setText(" Manage Books");
        mb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mbMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mbpnlLayout = new javax.swing.GroupLayout(mbpnl);
        mbpnl.setLayout(mbpnlLayout);
        mbpnlLayout.setHorizontalGroup(
            mbpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mbpnlLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(mb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        mbpnlLayout.setVerticalGroup(
            mbpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mb, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(mbpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 300, 50));

        mspnl.setBackground(new java.awt.Color(0, 0, 0));

        ms.setBackground(new java.awt.Color(255, 255, 255));
        ms.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        ms.setForeground(new java.awt.Color(255, 255, 255));
        ms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/6.png"))); // NOI18N
        ms.setText(" Manage Student");
        ms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                msMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                msMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                msMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mspnlLayout = new javax.swing.GroupLayout(mspnl);
        mspnl.setLayout(mspnlLayout);
        mspnlLayout.setHorizontalGroup(
            mspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mspnlLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        mspnlLayout.setVerticalGroup(
            mspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ms, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(mspnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 300, 50));

        ibpnl.setBackground(new java.awt.Color(0, 0, 0));

        ib.setBackground(new java.awt.Color(255, 255, 255));
        ib.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        ib.setForeground(new java.awt.Color(255, 255, 255));
        ib.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/7.png"))); // NOI18N
        ib.setText(" Issue Books");
        ib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ibMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ibMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ibMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ibpnlLayout = new javax.swing.GroupLayout(ibpnl);
        ibpnl.setLayout(ibpnlLayout);
        ibpnlLayout.setHorizontalGroup(
            ibpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ibpnlLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(ib, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        ibpnlLayout.setVerticalGroup(
            ibpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ibpnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ib, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(ibpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 300, 50));

        rbpnl.setBackground(new java.awt.Color(0, 0, 0));

        rb.setBackground(new java.awt.Color(255, 255, 255));
        rb.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        rb.setForeground(new java.awt.Color(255, 255, 255));
        rb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/8.png"))); // NOI18N
        rb.setText(" Return Books");
        rb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbMouseExited(evt);
            }
        });

        javax.swing.GroupLayout rbpnlLayout = new javax.swing.GroupLayout(rbpnl);
        rbpnl.setLayout(rbpnlLayout);
        rbpnlLayout.setHorizontalGroup(
            rbpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rbpnlLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(rb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        rbpnlLayout.setVerticalGroup(
            rbpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rbpnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(rbpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 300, 50));

        vrpnl.setBackground(new java.awt.Color(0, 0, 0));

        vr.setBackground(new java.awt.Color(255, 255, 255));
        vr.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        vr.setForeground(new java.awt.Color(255, 255, 255));
        vr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/9.png"))); // NOI18N
        vr.setText(" View Records");
        vr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vrMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vrMouseExited(evt);
            }
        });

        javax.swing.GroupLayout vrpnlLayout = new javax.swing.GroupLayout(vrpnl);
        vrpnl.setLayout(vrpnlLayout);
        vrpnlLayout.setHorizontalGroup(
            vrpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vrpnlLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(vr, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        vrpnlLayout.setVerticalGroup(
            vrpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vrpnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(vr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(vrpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 300, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 270, 660));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Book Details");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 110, -1));

        jTable1.setBackground(new java.awt.Color(0, 102, 102));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Course", "Batch No."
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new java.awt.Color(102, 153, 255));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTable1);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 630, 200));

        jTable2.setBackground(new java.awt.Color(0, 102, 102));
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Name", "Author", "Quantity"
            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable2.setRowHeight(40);
        jTable2.setSelectionBackground(new java.awt.Color(102, 153, 255));
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.setShowHorizontalLines(true);
        jTable2.setShowVerticalLines(true);
        jScrollPane2.setViewportView(jTable2);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 630, 210));

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Student Details");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/g.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 850, 840));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 1030, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void mbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbMouseClicked
        manageBook mb = new manageBook();
        mb.setVisible(true);
        dispose();
    }//GEN-LAST:event_mbMouseClicked

    private void mbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbMouseEntered
        mbpnl.setBackground(mouseEnterColor);
    }//GEN-LAST:event_mbMouseEntered

    private void mbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbMouseExited
        mbpnl.setBackground(mouseExitColor);
    }//GEN-LAST:event_mbMouseExited

    private void mbpnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbpnlMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_mbpnlMouseEntered

    private void msMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msMouseClicked
        manageStudent ms = new manageStudent();
        ms.setVisible(true);
        dispose();
    }//GEN-LAST:event_msMouseClicked

    private void msMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msMouseEntered
        mspnl.setBackground(mouseEnterColor);
    }//GEN-LAST:event_msMouseEntered

    private void msMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msMouseExited
        mspnl.setBackground(mouseExitColor);
    }//GEN-LAST:event_msMouseExited

    private void ibMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibMouseEntered
        ibpnl.setBackground(mouseEnterColor);
    }//GEN-LAST:event_ibMouseEntered

    private void ibMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibMouseExited
        ibpnl.setBackground(mouseExitColor);
    }//GEN-LAST:event_ibMouseExited

    private void rbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMouseEntered
        rbpnl.setBackground(mouseEnterColor);
    }//GEN-LAST:event_rbMouseEntered

    private void rbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMouseExited
        rbpnl.setBackground(mouseExitColor);
    }//GEN-LAST:event_rbMouseExited

    private void vrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vrMouseEntered
        vrpnl.setBackground(mouseEnterColor);
    }//GEN-LAST:event_vrMouseEntered

    private void vrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vrMouseExited
        vrpnl.setBackground(mouseExitColor);
    }//GEN-LAST:event_vrMouseExited

    private void ibMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibMouseClicked
        IssueBook IB = new IssueBook();
        IB.setVisible(true);
        dispose();
    }//GEN-LAST:event_ibMouseClicked

    private void rbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMouseClicked
        ReturnBook RB = new ReturnBook();
        RB.setVisible(true);
        dispose();
    }//GEN-LAST:event_rbMouseClicked

    private void vrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vrMouseClicked
        viewRecords vs = new viewRecords();
        vs.setVisible(true);
        dispose();
    }//GEN-LAST:event_vrMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ib;
    private javax.swing.JPanel ibpnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel mb;
    private javax.swing.JPanel mbpnl;
    private javax.swing.JLabel ms;
    private javax.swing.JPanel mspnl;
    private javax.swing.JLabel rb;
    private javax.swing.JPanel rbpnl;
    private javax.swing.JLabel vr;
    private javax.swing.JPanel vrpnl;
    // End of variables declaration//GEN-END:variables
}
