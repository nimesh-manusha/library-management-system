
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBdelete {
     
 // delete student details in table
    public boolean deleteStudent(String stdID){
        boolean isDeleted = false;
        
        try {
           Connection conn = DBconnecter.getconnection();
           String sql = "delete from student_details where student_id = ?";
           PreparedStatement pst = conn.prepareStatement(sql);
           pst.setString(1,stdID);
           
           int rowCount = pst.executeUpdate();
           if(rowCount > 0 ){
               isDeleted = true;
           }else {
               isDeleted = false;
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDeleted;
    }
    
    public boolean deleteBook(String bookID){
        boolean isDeleted = false;
        
        
        try {
           Connection conn = DBconnecter.getconnection();
           String sql = "delete from book_details where book_id = ?";
           PreparedStatement pst = conn.prepareStatement(sql);
           pst.setString(1,bookID);
           
           int rowCount = pst.executeUpdate();
           if(rowCount >0 ){
               isDeleted = true;
           }else {
               isDeleted = false;
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDeleted;
    }
}
