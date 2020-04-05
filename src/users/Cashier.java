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
public class Cashier implements Users {

    private int user_id;
    private String user_name;
    private String user_email;

    Connection con;
    
    
    @Override
    public void user_producer(int user_id, String user_name, String user_email) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_email = user_email;

        //Connect to db
        try {
            con = DBConnection.getConnction().getConnction().createConnection();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /*========================================================== user settings ==============================================================================*/
    public ResultSet get_user_details_for_edit() {

        ResultSet user_details_res = null;

        String selectusersQ = "SELECT `user_id`, `user_name`, `user_email`  FROM `user` WHERE `user_id`= " + this.user_id + "";

        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(selectusersQ);
            user_details_res = qstate.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return user_details_res;
    }

    public void edit_user_details(String UName, String UEmail) {

        String updateQ = "UPDATE `user` SET `user_name`='" + UName + "',`user_email`='" + UEmail + "' WHERE `user_id` = " + this.user_id + "";

        PreparedStatement qstate;

        try {
            qstate = (PreparedStatement) con.prepareStatement(updateQ);

            /*Confirm and update one row*/
            qstate.execute();
            JOptionPane.showMessageDialog(null, "Successfully updated your details.");

            this.user_name = UName;
            this.user_email = UEmail;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public ResultSet get_pwd_to_change() {
        ResultSet user_pwd_res = null;

        String selectusersQ = "SELECT `user_password` FROM `user` WHERE `user_id`= " + this.user_id + "";

        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(selectusersQ);
            user_pwd_res = qstate.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return user_pwd_res;
    }

    public boolean change_pwd(String Upwd) {

        boolean done = false;

        String updateQ = "UPDATE `user` SET `user_password` = '" + Upwd + "'  WHERE `user_id` = " + this.user_id + "";

        PreparedStatement qstate;

        try {
            qstate = (PreparedStatement) con.prepareStatement(updateQ);

            /*Confirm and update one row*/
            qstate.execute();
            JOptionPane.showMessageDialog(null, "Successfully changed your password.");
            done = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return done;
    }

    /*=========================================================================================================================================================*/
    
    
    /*============================================================== dashboard config ========================================================================*/
    
    public ResultSet get_more_details_for_fill_billing_form(int stock_id){
    
        ResultSet stock_details = null;
        
        String selectusersQ = "SELECT * FROM `inventory` WHERE `stock_id`= " + stock_id + "";

        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(selectusersQ);
            stock_details = qstate.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        
        return stock_details;
    }
    
    public int latest_invoice(){
    
       int latest_inv_num = 100000;
        
        String get_lastst_inv_num = "SELECT `invoice_id` FROM `purchase` ORDER BY `invoice_id` DESC LIMIT 1;";

        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(get_lastst_inv_num);
            ResultSet Result_inv = qstate.executeQuery();
            
            if(Result_inv.next()){
                latest_inv_num = Result_inv.getInt("invoice_id");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return latest_inv_num+1;
    }
    
    public boolean purchases_process(String invnum,String billing_date, String billing_time, Object tblarray[][], int rc ,int cc){
    
        boolean success = false;
        
         String insert_purchasesQ = "INSERT INTO `purchase`(`invoice_id`, `purchase_date`, `purchase_time`, `product_id`, `purchase_quantity`, `discount`, `net_amount`) VALUES ";
         
        
         insert_purchasesQ = insert_purchasesQ.concat(String.format("(%s, '%s', '%s', %s, %s, %s, %s)", invnum,billing_date,billing_time,tblarray[0][0],tblarray[0][3],tblarray[0][4],tblarray[0][5]));
        
          
         for(int i=1; i<=rc-1; i++){
            insert_purchasesQ = insert_purchasesQ.concat(String.format(",(%s, '%s', '%s', %s, %s, %s, %s)", invnum,billing_date,billing_time,tblarray[i][0],tblarray[i][3],tblarray[i][4],tblarray[i][5]));
         }
         
         
        PreparedStatement qstate;

        try {
            qstate = (PreparedStatement) con.prepareStatement(insert_purchasesQ);

            /*insert*/
            qstate.execute();
            /* update inventory */
            this.update_inventory_after_purchases(tblarray,rc);
            success = true;
     
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
         
        return success;
    } 
    
    public ResultSet get_purchased_for_return(int inv_num){
    
        ResultSet purchased_res = null;
        
         
        String get_lastst_inv_num = "SELECT  `product_id` as `Product ID`, `purchase_quantity` as `Quantity`, `discount` as `Discount`, `net_amount` as `Net amount` FROM `purchase` WHERE `invoice_id` ="+inv_num+";";

         PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(get_lastst_inv_num);
            purchased_res = qstate.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return purchased_res;
    }
    
    public void add_to_returns(int invoice_id, int product_id, String return_date, int quantity , float loss_amount){
    
        String add_to_returnsQ = "INSERT INTO `returns`(`invoice_id`, `product_id`, `return_date`, `quantity`, `loss_amount`) VALUES ("+invoice_id+","+ product_id+",'"+ return_date+"',"+ quantity +"," +loss_amount+")";
        System.out.println(add_to_returnsQ);
        
        PreparedStatement qstate;

        try {
            qstate = (PreparedStatement) con.prepareStatement(add_to_returnsQ);

            /*Confirm and update one row*/
            qstate.execute();
            JOptionPane.showMessageDialog(null, "Successfully changed your password.");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
    public void update_inventory_after_purchases(Object tblarray[][], int rc){
    
     
        
        for(int i=0; i<rc; i++){
               
                String update_inventryQ = "UPDATE `inventory` SET `quantity`= `quantity` - " + tblarray[i][3] + "  WHERE `stock_id` = " + tblarray[i][0];

                 PreparedStatement qstate;

                try {
                    qstate = (PreparedStatement) con.prepareStatement(update_inventryQ);

                    /*insert*/
                    qstate.execute();
                    /* generate notifications*/
                    this.generate_notification(tblarray,rc);

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
        
        }
        
    }
    
    /*=========================================================================================================================================================*/
    
    
    /*============================================================== notificaions ========================================================================*/  
 
    
    public void generate_notification(Object tblarray[][], int rc){
    
        ResultSet stock_details = null;
        
        for(int i=0; i<rc; i++){
            
                String selectusersQ = "SELECT `stock_id` ,`quantity` FROM `inventory` WHERE `stock_id`= " + tblarray[i][0];

                PreparedStatement qstate;
                try {

                    qstate = (PreparedStatement) con.prepareStatement(selectusersQ);
                    stock_details = qstate.executeQuery();
                    
                        if(stock_details.next()){
                            
                            String description = "";
                            
                            if(stock_details.getInt("quantity")==0){
                                description = "All items are over in stock " + stock_details.getInt("stock_id") + ".";
                                this.insert_new_notification(description);
                                
                            }else if(stock_details.getInt("quantity")<=3){
                                description = "Quantity is lower than 3 in stock " + stock_details.getInt("stock_id") + ".";
                                this.insert_new_notification(description);
                            }
                        }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }               
                
        
        }
        
    }
    
    public void insert_new_notification(String description){
    
        String notification_instertQ = "INSERT INTO `notification`( `description`, `state`) VALUES ('"+description+"',0)";
        
         PreparedStatement qstate;

        try {
            qstate = (PreparedStatement) con.prepareStatement(notification_instertQ);

            /*insert*/
            qstate.execute();
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    /*=========================================================================================================================================================*/
    
}
