package model;
import java.sql.DriverManager;
import java.sql.Connection;

public class DBconnecter {
    
       static Connection conn = null;
       
       public static Connection getconnection(){
       try {
           Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library management system","root","");
           
       }catch(Exception e) {
            e.printStackTrace();
       }
       return conn;
    }      
}