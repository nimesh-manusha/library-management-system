
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBupdate {
    
    public boolean updateStudent(String stdID,String stdName , String faculty , String batchNo){
    boolean isUpdated = false;
    
    try {
        Connection conn = DBconnecter.getconnection();
        String sql = " update student_details set name = ?, faculty = ?, batch = ? where student_id = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,stdName);
        pst.setString(2,faculty);
        pst.setString(3,batchNo);
        pst.setString(4, stdID);
        
        int rowCount = pst.executeUpdate();
        if(rowCount> 0){
            isUpdated = true;
        }else {
            isUpdated = false ;
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    return isUpdated;
}
    
    public boolean updateBook(String bookName , String author , String quantity , String bookID){
    boolean isUpdated = false;
  
    try {
        Connection conn = DBconnecter.getconnection();
        String sql = " update book_details set name = ?, author = ?, quantity = ? where book_id = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,bookName);
        pst.setString(2,author);
        pst.setString(3,quantity);
        pst.setString(4, bookID);
        
        int rowCount = pst.executeUpdate();
        if(rowCount> 0){
            isUpdated = true;
        }else {
            isUpdated = false ;
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    return isUpdated;
}
}
