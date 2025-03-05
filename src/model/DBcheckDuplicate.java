
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBcheckDuplicate {
    
    public boolean checkDuplicateUsername (String name){
        
        boolean isExist = false;
        
        try {
            Connection conn = DBconnecter.getconnection();
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM register_table WHERE username = ?");
            pst.setString(1, name);
            ResultSet rs = pst.executeQuery();
            if ( rs.next()){
                isExist = true ;
            }else {
                isExist = false; 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isExist;
    }

    
}
