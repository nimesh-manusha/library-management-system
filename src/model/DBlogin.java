
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.dashboard;

public class DBlogin {
    
    // verift creds
    public void login (String username , String password){
        
        
        try {
            Connection conn = DBconnecter.getconnection();
            
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM register_table WHERE username = ? AND password = ?");
            pst.setString (1,username);
            pst.setString(2, password);
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"login successfull!!");
                dashboard dash = new dashboard();
                dash.setVisible(true);
                
                
            }else {
                JOptionPane.showMessageDialog(null,"incorrent username or password");
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
