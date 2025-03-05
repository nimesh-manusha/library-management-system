
package model;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DBtable {
    
    public static  void setStudentDetailsToTable(DefaultTableModel model, JTable table){
    try {
        Connection conn = DBconnecter.getconnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(" select * from student_details");
        
        while(rs.next()){
            int stdID = rs. getInt ("student_id");
            String stdName = rs. getString ("name");
            String faculty = rs. getString ("faculty");
            int batchNo  = rs. getInt ("batch");
            
            Object[] obj = {stdID, stdName , faculty, batchNo};
            model =(DefaultTableModel) table .getModel();
            model.addRow(obj);
        }
    
    } catch (Exception e) {
        e.printStackTrace();
    }
    
} 
    
    public static  void setBookDetailsToTable(DefaultTableModel model , JTable table2){
    try {
        Connection conn = DBconnecter.getconnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(" select * from book_details");
        
        while(rs.next()){
            int bookID = rs. getInt ("book_id");
            String bookName = rs. getString ("name");
            String author = rs. getString ("author");
            int quantity  = rs. getInt ("quantity");
            
            Object[] obj = {bookID, bookName , author, quantity};
            model =(DefaultTableModel) table2.getModel();
            model.addRow(obj);
        }
    
    } catch (Exception e) {
        e.printStackTrace();
    }
    
} 
    
    public static void setissueBookDetailsToTable(DefaultTableModel model , JTable table3){
        try {
            Connection conn = DBconnecter.getconnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from issue_book_details");
            
            while(rs.next()){
                String ID = rs.getString("ID");
                String bookID = rs.getString("book_id");
                String bookname = rs.getString("book_name");
                String stdid = rs.getString("student_id");
                String stdname = rs.getString("student_name");
                String issuedate = rs.getString("issue_date");
                String duedate = rs.getString("due_date");
                String status = rs.getString("status");
                
                Object[] obj = {ID,bookID,bookname,stdid,stdname,issuedate,duedate,status };
            model =(DefaultTableModel) table3 .getModel();
            model.addRow(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
