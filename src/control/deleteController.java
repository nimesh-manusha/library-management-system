
package control;

import javax.swing.JOptionPane;


public class deleteController {
    public static void deleteStudent(String stdID){
       
         if(stdID.equals("")  ){
            JOptionPane.showMessageDialog(null, "Student delete failed");
            
        
            }else {
                JOptionPane.showMessageDialog(null, "Student Deleted");
                new model.DBdelete().deleteStudent(stdID);
            }
       }
    
    public static void deleteBook(String bookID){
        if(bookID.equals("")  ){
            JOptionPane.showMessageDialog(null, "Book delete failed");
            
        
            }else {
                JOptionPane.showMessageDialog(null, "Book Deleted");
                new model.DBdelete().deleteBook(bookID);
            }
    }
}

