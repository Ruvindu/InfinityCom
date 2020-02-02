
package users;

import com.mysql.jdbc.Connection;
import infinitycom.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruvindu
 */
public class Admin implements Users{

    private int user_id;
    private String user_name;
    private String user_email;
    
    //update user instans
    private int selected_user = 0;
    
    Connection con;
    
    @Override
    public void user_producer(int user_id,String user_name,String user_email) {
       this.user_id = user_id;
       this.user_name = user_name;
       this.user_email = user_email;
       
        //Connect to db
        try {
            con = DBConnection.getConnction().getConnction().createConnection();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error" , JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error" , JOptionPane.ERROR_MESSAGE);
        }
    }
    

    public int getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setSelected_user(int selected_user) {
        this.selected_user = selected_user;
    }

   
    
  /*==============================================User management and configurations===========================================================================*/  
    
    public void user_redirector(String UType,String UName,String UEmail,String UPwd){
        
        if(this.selected_user == 0){
            this.add_user(UType, UName, UEmail, UPwd);
        }
        else{
            this.update_user(UType, UName, UEmail, UPwd);
        }       
    } 
    
    public void add_user(String UType,String UName,String UEmail,String UPwd){
        
        String addQ = "INSERT INTO `user`(`user_name`, `user_email`, `user_password`, `role`) VALUES ('"+UName+"','"+UEmail+"','"+UPwd+"','"+UType+"')";
        
        PreparedStatement qstate;
 
        try {
           qstate = (PreparedStatement) con.prepareStatement(addQ);      
           
           /*Confirm and added one row*/
           qstate.execute();
           JOptionPane.showMessageDialog(null,"Successfully added one user.");
        
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
       }
    }
    
    public void update_user(String UType,String UName,String UEmail,String UPwd){
        
        String updateQ = "UPDATE `user` SET `user_name`='"+UName+"',`user_email`='"+UEmail+"',`role`='"+UType+"' WHERE `user_id` = "+this.selected_user+"";
        
        if(!"cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e".equals(UPwd)){
           updateQ = "UPDATE `user` SET `user_name`='"+UName+"',`user_email`='"+UEmail+"',`user_password`='"+UPwd+"',`role`='"+UType+"' WHERE `user_id` = "+this.selected_user+"";
        }
        
        PreparedStatement qstate;
 
        try {
           qstate = (PreparedStatement) con.prepareStatement(updateQ);      
           
           /*Confirm and update one row*/
           qstate.execute();
           JOptionPane.showMessageDialog(null,"Successfully updated the user.");
        
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
       }
        
    }
    
    
     public void delete_user(){
        
        String deleteQ = "DELETE FROM `user` WHERE `user_id` = "+this.selected_user+"";
        
        PreparedStatement qstate;
 
        try {
           qstate = (PreparedStatement) con.prepareStatement(deleteQ);      
           
           /*Confirm and delete one row*/
           qstate.execute();
           JOptionPane.showMessageDialog(null,"Successfully deleted the user.");
        
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
       }
        
    }
    
  
    
    public ResultSet get_all_users(){
    
        ResultSet res=null;
        String selectusersQ = "SELECT `user_id` as `ID`, `user_name` as `User name` , `user_email` as `Email` , `role` as `Role`  FROM `user` WHERE `user_id`!= "+this.user_id+"";
        
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(selectusersQ);      
            res = qstate.executeQuery();
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return res;
    }
    
    public ResultSet get_selected_user(){
        
        ResultSet selected_user_res = null;
        
         String selectusersQ = "SELECT `user_id`, `user_name`, `user_email`, `role`, `user_password`  FROM `user` WHERE `user_id`= "+this.selected_user+"";
        
        PreparedStatement qstate;
        try {
            
            qstate = (PreparedStatement) con.prepareStatement(selectusersQ);      
            selected_user_res = qstate.executeQuery();
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return selected_user_res;
    }
    
    
    /*======================================================================================================================================================*/  
    
    
    
    
    
    
    
}



