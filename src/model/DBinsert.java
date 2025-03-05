
package model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import view.login;

public class DBinsert {
    
    public boolean insertStudent( String stdID,String stdName , String faculty , String batchNo){
        boolean isAdded = false;

    try {
        Connection conn = DBconnecter.getconnection();
        String sql = "insert into Student_details values (?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, stdID);
        pst.setString(2, stdName);
        pst.setString(3, faculty);
        pst.setString(4, batchNo); 
        
        int rowCount = pst.executeUpdate();
        if(rowCount> 0){
            isAdded = true;
        }else {
            isAdded = false;
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    return isAdded;
    }
    
    public boolean addBook( String bookID,String bookName , String author , String quantity ){
    boolean isAdded = false;
    
    try {
        Connection conn = DBconnecter.getconnection();
        String sql = "insert into book_details values (?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, bookID);
        pst.setString(2, bookName);
        pst.setString(3, author);
        pst.setString(4, quantity); 
        
        int rowCount = pst.executeUpdate();
        if(rowCount> 0){
            isAdded = true;
        }else {
            isAdded = false;
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    return isAdded;
}
    
    public boolean insertSignupDetails(String name , String email , String pword , String contact){
        boolean isAdded = false;
        
        try {
            Connection conn = DBconnecter.getconnection();
            String sql = "INSERT INTO register_table (username,email,password,contact) VALUES (?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, pword);
            pst.setString(4, contact);
            
            int updatedRowCount= pst.executeUpdate();
            
            if(updatedRowCount > 0){
                JOptionPane.showMessageDialog(null, "Recorded Inserted Successfully!!");
                login L1 = new login();
                L1.setVisible(true);
                
            }else {
                JOptionPane.showMessageDialog(null, "Recorded Insertion Failure !!");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isAdded;
    }
    
   
}
