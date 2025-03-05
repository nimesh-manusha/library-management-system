
package view;


import model.DBconnecter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class IssueBook extends javax.swing.JFrame {

    
    
    public IssueBook() {
        initComponents();
    }
    
    // for book details
    public void getBookDetails(){
        int bookID = Integer.parseInt(bookid.getText());
        
        try {
            Connection conn = DBconnecter.getconnection();
            PreparedStatement pst = conn.prepareStatement("select * from book_details where book_id = ?");
            pst.setInt(1, bookID);
            ResultSet rs = pst. executeQuery();
            
            if(rs.next()){
                bookid2.setText(rs.getString("book_id"));
                bookname.setText(rs.getString("name"));
                author.setText(rs.getString("author"));
                quantity.setText(rs.getString("quantity"));
            }else{
                bdlbl.setText("Invalide Book ID");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    //for student details
    public void getStDetails(){
        int stdID = Integer.parseInt(sdtid.getText());
        
        try {
            Connection conn = DBconnecter.getconnection();
            PreparedStatement pst = conn.prepareStatement("select * from student_details where student_id = ?");
            pst.setInt(1, stdID);
            ResultSet rs = pst. executeQuery();
            
            if(rs.next()){
                stdid2.setText(rs.getString("student_id"));
                stdname.setText(rs.getString("name"));
                faculty.setText(rs.getString("faculty"));
                batch.setText(rs.getString("batch"));
            }else{
                sdlbl.setText("Invalide Student ID");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //insert issue book details to database
    public boolean addIssueBook(){
      boolean isissued = false;  
     int bookID = Integer.parseInt(bookid.getText());
     int stdID = Integer.parseInt(sdtid.getText());
     String bname = bookname.getText();
     String Sname = stdname.getText();
     
    java.util.Date idate = issuedate.getDate();
    java.util.Date ddate = duedate.getDate();

    java.sql.Date isdate = new java.sql.Date(idate.getTime());
    java.sql.Date dudate = new java.sql.Date(ddate.getTime());

        try {
            Connection conn = DBconnecter.getconnection();
            String sql = "insert into issue_book_details (book_id,book_name,student_id,student_name,issue_date,due_date,status) values (?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, bookID);
            pst.setString(2, bname);
            pst.setInt(3, stdID);
            pst.setString(4, Sname);
            pst.setDate(5, isdate);
            pst.setDate(6, dudate);
            pst.setString(7, "pending");
            
            int rowCount = pst.executeUpdate();
            if(rowCount > 0){
                isissued = true;
            }else{
                isissued= false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isissued;
    }

    //updating book count
    public void updateBookCount(){
        int bookID = Integer.parseInt(bookid.getText());
        
        
        try {
           Connection conn = DBconnecter.getconnection();
        String sql = "update book_details set quantity = quantity - 1 where book_id =?  ";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, bookID);
        
        int rowCount = pst.executeUpdate();
        
        if(rowCount > 0){
            JOptionPane.showMessageDialog(this,"book count updated");
            int initialCount = Integer.parseInt(quantity.getText());
            quantity.setText(Integer.toString(initialCount -1));   
        }
        else{
            JOptionPane.showConfirmDialog(this, "can't update book count");
        }
            
        } catch (Exception e) {  
            e.printStackTrace();           
        }
        
    } 
    
    //checking whether book already allocated or not 
    public boolean isAlreadyIssued(){
        boolean isAlreadyIssued = false;
        int bookID = Integer.parseInt(bookid.getText());
     int stdID = Integer.parseInt(sdtid.getText());
     
        try {
            Connection conn = DBconnecter.getconnection();
            String sql = "select * from  issue_book_details where book_id = ? and student_id = ? and status = ? ";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, bookID);
            pst.setInt(2, stdID);
            pst.setString(3, "pending");
            
            ResultSet rs  = pst.executeQuery();
            
            if(rs.next()){
                 isAlreadyIssued = true;
            }else{
                isAlreadyIssued = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isAlreadyIssued;
    }
    
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bdlbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        bookid2 = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        bookname = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        sdlbl = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        batch = new javax.swing.JTextField();
        stdid2 = new javax.swing.JTextField();
        faculty = new javax.swing.JTextField();
        stdname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        bookid = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        sdtid = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        signupbtn = new javax.swing.JButton();
        duedate = new com.toedter.calendar.JDateChooser();
        issuedate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(984, 570));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(325, 570));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book Details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 120, 30));

        bdlbl.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        bdlbl.setForeground(new java.awt.Color(255, 204, 0));
        jPanel2.add(bdlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 270, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Book Name :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Author :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Book ID :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        quantity.setBackground(new java.awt.Color(102, 0, 0));
        quantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 170, 30));

        bookid2.setBackground(new java.awt.Color(102, 0, 0));
        bookid2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bookid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookid2ActionPerformed(evt);
            }
        });
        jPanel2.add(bookid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 170, 30));

        author.setBackground(new java.awt.Color(102, 0, 0));
        author.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorActionPerformed(evt);
            }
        });
        jPanel2.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 170, 30));

        bookname.setBackground(new java.awt.Color(102, 0, 0));
        bookname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(bookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 170, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Quantity :");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 630));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(325, 570));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sdlbl.setBackground(new java.awt.Color(255, 204, 0));
        sdlbl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        sdlbl.setForeground(new java.awt.Color(255, 204, 0));
        jPanel5.add(sdlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 270, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Student Name :");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Faculty :");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Student ID :");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        batch.setBackground(new java.awt.Color(0, 102, 102));
        batch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        batch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchActionPerformed(evt);
            }
        });
        jPanel5.add(batch, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 160, 30));

        stdid2.setBackground(new java.awt.Color(0, 102, 102));
        stdid2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        stdid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdid2ActionPerformed(evt);
            }
        });
        jPanel5.add(stdid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 160, 30));

        faculty.setBackground(new java.awt.Color(0, 102, 102));
        faculty.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyActionPerformed(evt);
            }
        });
        jPanel5.add(faculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 160, 30));

        stdname.setBackground(new java.awt.Color(0, 102, 102));
        stdname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        stdname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdnameActionPerformed(evt);
            }
        });
        jPanel5.add(stdname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 160, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student Details");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 140, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Batch :");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 310, 630));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Issued Book");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 140, 30));

        exit.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 20, 20));

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
        jPanel1.add(bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 240, 30));

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
        jPanel1.add(sdtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 240, 30));

        jLabel105.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setText("Issue Date :");
        jPanel1.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 80, 20));

        jLabel108.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setText("Due Date :");
        jPanel1.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 80, 20));

        signupbtn.setBackground(new java.awt.Color(0, 153, 153));
        signupbtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        signupbtn.setForeground(new java.awt.Color(255, 255, 255));
        signupbtn.setText("Issue Book");
        signupbtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });
        jPanel1.add(signupbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 280, 40));

        duedate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 0)));
        jPanel1.add(duedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 240, 30));

        issuedate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 0)));
        jPanel1.add(issuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 240, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/g.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dashboard dash = new dashboard();
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorActionPerformed

    private void facultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void batchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batchActionPerformed

    private void stdnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdnameActionPerformed

    private void stdid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdid2ActionPerformed

    private void bookidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookidActionPerformed
        
    }//GEN-LAST:event_bookidActionPerformed

    private void bookidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookidFocusLost
        if(!bookid.getText().equals("")){
          getBookDetails();
      }
       
    }//GEN-LAST:event_bookidFocusLost

    private void sdtidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sdtidFocusLost
      if(!sdtid.getText().equals("")){
          getStDetails();
      }
    }//GEN-LAST:event_sdtidFocusLost

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        if(quantity.getText().equals("0")){
            JOptionPane.showMessageDialog(this, "book is not available");
        }else{
            if(isAlreadyIssued() == false){
                
                 if(addIssueBook() == true ){
               JOptionPane.showMessageDialog(this, "Book Issued Successfully");
               updateBookCount();
               
        }else{
            JOptionPane.showMessageDialog(this, "Can't Issue This Book");
        }
            
    }else {
           JOptionPane.showMessageDialog(this, "this student already has this Book");     
            }
            
       } 
        
    }//GEN-LAST:event_signupbtnActionPerformed

    private void bookid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookid2ActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author;
    private javax.swing.JTextField batch;
    private javax.swing.JLabel bdlbl;
    private javax.swing.JTextField bookid;
    private javax.swing.JTextField bookid2;
    private javax.swing.JTextField bookname;
    private com.toedter.calendar.JDateChooser duedate;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField faculty;
    private com.toedter.calendar.JDateChooser issuedate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel sdlbl;
    private javax.swing.JTextField sdtid;
    private javax.swing.JButton signupbtn;
    private javax.swing.JTextField stdid2;
    private javax.swing.JTextField stdname;
    // End of variables declaration//GEN-END:variables
}
