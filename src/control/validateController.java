
package control;

import javax.swing.JOptionPane;

public class validateController { 
    
   public boolean validateSignup(String name , String email , String pword , String contact){
        
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "please enter username");
            return false;
        }
         
        if(email.equals("") || email.matches ("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,6}$")){
            JOptionPane.showMessageDialog(null, "please enter valid email ");
            return false;
        }
      
        if(pword.equals("")){
            JOptionPane.showMessageDialog(null, "please enter pword");
            return false;
        }
      
        if(contact.equals("")){
            JOptionPane.showMessageDialog(null, "please enter contact number");
            return false;
        }
        return true;
    }
   
       public boolean validateLogin (String username ,String password ){
           
        if (username.equals("")){
            JOptionPane.showMessageDialog(null, "please enter uername");
            return false;
    }
    if (password.equals("")){
            JOptionPane.showMessageDialog(null, "please enter password");
            return false;
    }
    return true;
}
}
