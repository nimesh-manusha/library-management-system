
package control;

import javax.swing.JOptionPane;


public class InsertController {
    
    //to add book to book_details table
    public static void addStudent(String stdID,String stdName , String faculty , String batchNo){
       
         if(stdID.equals("") || stdName.equals("") || faculty.equals("") || batchNo.equals("")  ){
            JOptionPane.showMessageDialog(null, "Student Added failed");
            
        
            }else {
                JOptionPane.showMessageDialog(null, "Student Added");
                new model.DBinsert().insertStudent(stdID, stdName , faculty ,  batchNo);
            }
       }
    
   
    
    public static void addBook(String bookName , String author , String quantity , String bookID){
       
         if(bookID.equals("") || bookName.equals("") || author.equals("") || quantity.equals("")  ){
            JOptionPane.showMessageDialog(null, "Book Added failed");
            
        
            }else {
                JOptionPane.showMessageDialog(null, "Book Added");
                new model.DBinsert().addBook(bookName , author , quantity ,bookID);
            }
       }
    
    public static void insertSignupDetails(String name , String email , String pword , String contact){
        
       if(new model.DBcheckDuplicate().checkDuplicateUsername(name) == true ){
           
           if( new control.validateController().validateSignup(name, email, pword, contact)){
               
              if(name.equals("") || email.equals("") || pword.equals("") || contact.equals("")  ){
            JOptionPane.showMessageDialog(null, "Recorded Inserted failure");
            
              }else { 
                JOptionPane.showMessageDialog(null, "Recorded Insertion successfully");
                new model.DBinsert().insertSignupDetails(name , email , pword , contact);
              }
                
           }else {
                   JOptionPane.showMessageDialog(null, "Recorded Insertion Failure !!");
                   }
            
       }else{
           JOptionPane.showMessageDialog(null ,  "username already exist");
       }
         
       }
    
    
    }

