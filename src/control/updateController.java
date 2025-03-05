
package control;

import javax.swing.JOptionPane;

public class updateController {
    
    public static void updateStudent(String stdID,String stdName , String faculty , String batchNo){
       
         if(stdID.equals("") || stdName.equals("") || faculty.equals("") || batchNo.equals("")  ){
            JOptionPane.showMessageDialog(null, "Student update failed");
            
        
            }else {
                JOptionPane.showMessageDialog(null, "Student updated");
                new model.DBupdate().updateStudent(stdID, stdName , faculty ,  batchNo);
            }
       }
    
    public static void updateBook(String bookID ,String bookName , String author , String quantity ){
       
         if(bookID.equals("") || bookName.equals("") || author.equals("") || quantity.equals("")  ){
            JOptionPane.showMessageDialog(null, "Book update failed");
            
        
            }else {
                JOptionPane.showMessageDialog(null, "Book updated");
                new model.DBupdate().updateBook(bookName , author , quantity ,bookID);
            }
       }
    
    
}
