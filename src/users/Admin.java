package users;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import infinitycom.DBConnection;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

/**
 *
 * @author Ruvindu
 */
public class Admin implements Users {

    private int user_id;
    private String user_name;
    private String user_email;

    // instans
    private int selected_user = 0;
    private int selected_category = 0;
    private int selected_stock = 0;

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

    public void setSelected_category(int selected_category) {
        this.selected_category = selected_category;
    }

    public void setSelected_stock(int selected_stock) {
        this.selected_stock = selected_stock;
    }
    
    

    /*==============================================User management and configurations===========================================================================*/
    public void user_redirector(String UType, String UName, String UEmail, String UPwd) {

        if (this.selected_user == 0) {
            this.add_user(UType, UName, UEmail, UPwd);
        } else {
            this.update_user(UType, UName, UEmail, UPwd);
        }
    }

    private void add_user(String UType, String UName, String UEmail, String UPwd) {

        String addQ = "INSERT INTO `user`(`user_name`, `user_email`, `user_password`, `role`) VALUES ('" + UName + "','" + UEmail + "','" + UPwd + "','" + UType + "')";

        PreparedStatement qstate;

        try {
            qstate = (PreparedStatement) con.prepareStatement(addQ);

            /*Confirm and added one row*/
            qstate.execute();
            JOptionPane.showMessageDialog(null, "Successfully added one user.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void update_user(String UType, String UName, String UEmail, String UPwd) {

        String updateQ = "UPDATE `user` SET `user_name`='" + UName + "',`user_email`='" + UEmail + "',`role`='" + UType + "' WHERE `user_id` = " + this.selected_user + "";

        if (!"cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e".equals(UPwd)) {
            updateQ = "UPDATE `user` SET `user_name`='" + UName + "',`user_email`='" + UEmail + "',`user_password`='" + UPwd + "',`role`='" + UType + "' WHERE `user_id` = " + this.selected_user + "";
        }

        PreparedStatement qstate;

        try {
            qstate = (PreparedStatement) con.prepareStatement(updateQ);

            /*Confirm and update one row*/
            qstate.execute();
            JOptionPane.showMessageDialog(null, "Successfully updated the user.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void delete_user() {

        String deleteQ = "DELETE FROM `user` WHERE `user_id` = " + this.selected_user + "";

        PreparedStatement qstate;

        try {
            qstate = (PreparedStatement) con.prepareStatement(deleteQ);

            /*Confirm and delete one row*/
            qstate.execute();
            JOptionPane.showMessageDialog(null, "Successfully deleted the user.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public ResultSet get_all_users() {

        ResultSet res = null;
        String selectusersQ = "SELECT `user_id` as `ID`, `user_name` as `User name` , `user_email` as `Email` , `role` as `Role`  FROM `user` WHERE `user_id`!= " + this.user_id + "";

        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(selectusersQ);
            res = qstate.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return res;
    }

    public ResultSet get_selected_user() {

        ResultSet selected_user_res = null;

        String selectusersQ = "SELECT `user_id`, `user_name`, `user_email`, `role`, `user_password`  FROM `user` WHERE `user_id`= " + this.selected_user + "";

        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(selectusersQ);
            selected_user_res = qstate.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return selected_user_res;
    }

    /*======================================================================================================================================================*/
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
 /*======================================================================= Category ========================================================================*/
    public ResultSet get_all_categories() {

        ResultSet res = null;
        String selectcatQ = "SELECT `cat_id` as 'Category ID' , `cat_name` as 'Category name' FROM `category`";

        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(selectcatQ);
            res = qstate.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return res;
    }

    public ResultSet get_selected_category() {

        ResultSet res = null;
        String selectcatQ = "SELECT `cat_id`, `cat_name` FROM `category` WHERE `cat_id`=" + this.selected_category + "";

        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(selectcatQ);
            res = qstate.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return res;
    }

    public void category_redirector(String category_name) {

        if (selected_category == 0) {
            this.add_category(category_name);
        } else {
            this.update_category(category_name);
        }
    }

    private void add_category(String category_name) {

        String addCatQ = "INSERT INTO `category`(`cat_name`) VALUES ('" + category_name + "')";

        PreparedStatement qstate;

        try {
            qstate = (PreparedStatement) con.prepareStatement(addCatQ);

            /*Confirm and added one row*/
            qstate.execute();
            JOptionPane.showMessageDialog(null, "Successfully added one category.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void update_category(String category_name) {

        String updateCatQ = "UPDATE `category` SET `cat_name`='" + category_name + "' WHERE `cat_id` = " + this.selected_category + "";

        PreparedStatement qstate;

        try {
            qstate = (PreparedStatement) con.prepareStatement(updateCatQ);

            /*Confirm and added one row*/
            qstate.execute();
            JOptionPane.showMessageDialog(null, "Successfully updated the category.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void delete_category() {

        String deleteCatQ = "DELETE FROM `category` WHERE `cat_id` = " + this.selected_category + "";

        PreparedStatement qstate;

        try {
            qstate = (PreparedStatement) con.prepareStatement(deleteCatQ);

            /*Confirm and added one row*/
            qstate.execute();
            JOptionPane.showMessageDialog(null, "Successfully deleted the category.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

 /*====================================================================================================================================================*/
 /*=================================================== Inventory =====================================================================================*/
    public void add_inventory(int stock_id, String product_category, String product_name, int qty, float purchasing_price, float selling_price, String date, String barcode_location) {

        ResultSet res = null;
        String get_product_catIDQ = "SELECT `cat_id` FROM `category` WHERE `cat_name` = '" + product_category + "'";
        System.out.println(get_product_catIDQ);

        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(get_product_catIDQ);
            res = qstate.executeQuery();

            if (res.next()) {

                String add_invQ = "INSERT INTO `inventory`(`stock_id`, `product_category`, `product_name`, `quantity`, `purchasing_price`, `selling_price`, `date`) VALUES ( " + stock_id + ", " + res.getString("cat_id") + ", '" + product_name + "', " + qty + ", " + purchasing_price + ", " + selling_price + ", '" + date + "')";

                try {
                    qstate = (PreparedStatement) con.prepareStatement(add_invQ);

                    /*Confirm and added one row*/
                    qstate.execute();
                    JOptionPane.showMessageDialog(null, "Successfully added stock.");
                    
                    /*Genatere barcode*/
                     barcode_generate(String.valueOf(stock_id).toString(),barcode_location);

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

                System.out.println(add_invQ);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void update_inventory(int stock_id, String product_name, int quantitiy, float purchasing_price, float selling_price) {

       System.out.println(stock_id);
       String updateinventoryQ = "UPDATE `inventory` SET `product_name`= '"+product_name+"',`quantity`="+quantitiy+",`purchasing_price`= "+ String.format("%.02f", purchasing_price)+" ,`selling_price`= "+ String.format("%.02f", selling_price)+" WHERE `stock_id` = " + stock_id;

        System.out.println(updateinventoryQ);
       
        PreparedStatement qstate;

        try {
            qstate = (PreparedStatement) con.prepareStatement(updateinventoryQ);

           
            qstate.execute();
            JOptionPane.showMessageDialog(null, "Successfully updated the stock.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void delete_inventory() {

       
       String updateinventoryQ = "DELETE FROM `inventory` WHERE `stock_id` = " + this.selected_stock;
    
        PreparedStatement qstate;

        try {
            qstate = (PreparedStatement) con.prepareStatement(updateinventoryQ);
           
            qstate.execute();
            JOptionPane.showMessageDialog(null, "Successfully deleted the stock.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    public ResultSet get_all_stocks() {

        ResultSet res = null;
        String selectusersQ = "SELECT i.`stock_id` as `Stock ID`, c.`cat_name` as `Product category` , i.`product_name` as `Product name`, i.`quantity` as `Quantity`, i.`purchasing_price` as `purchasing price`, i.`selling_price` as `Selling price`, i.`date` as `Date` FROM `inventory` i, `category` c WHERE i.`product_category`=c.`cat_id`";

        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(selectusersQ);
            res = qstate.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return res;
    }

    public ResultSet get_selected_stock(){
        
        ResultSet stock_res = null;
        
        String get_selected_stockQ = "SELECT * FROM `inventory` WHERE `stock_id` = "+this.selected_stock+"";
        
        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(get_selected_stockQ);
            stock_res = qstate.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        return stock_res;
    }
    

    /*====================================================================================================================================================*/
    
    
    /*=================================================== report =====================================================================================*/
    
    public Date[] get_available_date_duration(){
    
        Date[] date_range = new Date[2];  
        
        ResultSet date_range_res = null;
        
        String start_q = "SELECT `purchase_date` FROM `purchase` ORDER BY `purchase_date` DESC LIMIT 1";
        String end_q = "SELECT `purchase_date` FROM `purchase` ORDER BY `purchase_date` ASC LIMIT 1";

        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(start_q);
            date_range_res = qstate.executeQuery();
            
            if(date_range_res.next()){
                date_range[0] = date_range_res.getDate("purchase_date");
            }
            
            
            qstate = (PreparedStatement) con.prepareStatement(end_q);
            date_range_res = qstate.executeQuery();
            
            if(date_range_res.next()){
                date_range[1] = date_range_res.getDate("purchase_date");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


        return date_range;
    }
    
    public ResultSet get_categories(){
    
        ResultSet cat_res = null;
        
        String selectusersQ = "SELECT * FROM `category`";

        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(selectusersQ);
            cat_res = qstate.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    
        return cat_res;
    }
    
    public ResultSet get_purchased_qty_by_category_wise(String []selected_duration,int cat_id){
    
        ResultSet qty_res = null;
        
        String purchased_qtyQ = "SELECT sum( p.`purchase_quantity` ) as `purchased_quantity` FROM `purchase` as p , `inventory` as i WHERE p.`product_id` = i.`stock_id` and `purchase_date` >= '"+selected_duration[0]+"' and `purchase_date` <= '"+selected_duration[1]+"' and i.`product_category` = " + cat_id;

             
        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(purchased_qtyQ);
            qty_res = qstate.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    
        return qty_res;
    }
             
    public ResultSet get_summray_by_category_wise(String []selected_duration,int cat_id){
    
        ResultSet summray_res = null;
        
        String purchased_qtyQ = "SELECT sum( p.`purchase_quantity` ) as `purchased_quantity`, sum(i.`purchasing_price`) as `cost`, sum(p.`net_amount`) as `revenue`   FROM `purchase` as p , `inventory` as i WHERE p.`product_id` = i.`stock_id` and `purchase_date` >= '"+selected_duration[0]+"' and `purchase_date` <= '"+selected_duration[1]+"' and i.`product_category` = " + cat_id;

             
        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(purchased_qtyQ);
            summray_res = qstate.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    
        return summray_res;
    }
      
    public ResultSet get_return_by_category_wise(String []selected_duration,int cat_id){
    
        ResultSet returns_res = null;
    
        String returnsQ = "SELECT r.`quantity`as `return_quantitiy` , r.`loss_amount` FROM `returns` as r , `inventory` as i  WHERE  r.`product_id` = i.`stock_id`  and r.`return_date` >= '"+selected_duration[0]+"' and r.`return_date` <= '"+selected_duration[1]+"'  and i.`product_category` =" + cat_id;
       
        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(returnsQ);
            returns_res = qstate.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }       
    
        return returns_res;
    }
    
    
    public String report_demo(String []selected_duration){
    
        /*preper for string*/
        
        ResultSet categories = this.get_categories();
        
        
        String str_categories = "";
        
        try {
            if(categories.next()){
                str_categories = str_categories.concat("'"+categories.getString("cat_name")+"'");
            }
            while (categories.next()) {
                 str_categories = str_categories.concat(",'"+categories.getString("cat_name")+"'"); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        String str_purchased_qty = "";
        
        try {
            ResultSet purchased_qty;
            categories.first();
            //if(categories.next()){
                 purchased_qty = this.get_purchased_qty_by_category_wise(selected_duration , Integer.parseInt(categories.getString("cat_id")) );
                
                if(purchased_qty.next()){
                    if(purchased_qty.getString("purchased_quantity")!=null){
                        str_purchased_qty = str_purchased_qty.concat(purchased_qty.getString("purchased_quantity"));
                    }else{
                        str_purchased_qty = str_purchased_qty.concat("0");
                    }
                }
                
            //}
            while (categories.next()) {
                 purchased_qty = this.get_purchased_qty_by_category_wise(selected_duration , Integer.parseInt(categories.getString("cat_id")) );
                
                if(purchased_qty.next()){
                    if(purchased_qty.getString("purchased_quantity")!=null){
                        str_purchased_qty = str_purchased_qty.concat(","+purchased_qty.getString("purchased_quantity"));
                    }else{
                        str_purchased_qty = str_purchased_qty.concat(",0");
                    }
                }
            }
    
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        String selling_summary = "";
        
        float total_revenue = 0.0f;
        float total_cost = 0.0f;
        int total_qty = 0;
        
        try {
            ResultSet selling_summary_res;
            categories.beforeFirst();
            
            while (categories.next()) {
                selling_summary_res = this.get_summray_by_category_wise(selected_duration , Integer.parseInt(categories.getString("cat_id")) );
                
                if(selling_summary_res.next()){
                    if(selling_summary_res.getString("purchased_quantity")!=null){
                        
                        total_qty += Integer.parseInt(selling_summary_res.getString("purchased_quantity"));
                        total_cost += Float.parseFloat(selling_summary_res.getString("cost"));
                        total_revenue += Float.parseFloat(selling_summary_res.getString("revenue"));
                      
                        
                        selling_summary = selling_summary.concat("<tr> <th scope=\"row\">"+categories.getString("cat_name")+"</th>");
                        selling_summary = selling_summary.concat("<td>"+selling_summary_res.getString("purchased_quantity")+"</td>");
                        selling_summary = selling_summary.concat("<td>"+selling_summary_res.getString("cost")+"</td>");
                        selling_summary = selling_summary.concat("<td>"+selling_summary_res.getString("revenue")+"</td>");
                        selling_summary = selling_summary.concat("</tr>");
                    }else{
                        selling_summary = selling_summary.concat("<tr> <th scope=\"row\">"+categories.getString("cat_name")+"</th>");
                        selling_summary = selling_summary.concat("<td>0</td>");
                        selling_summary = selling_summary.concat("<td>0.00</td>");
                        selling_summary = selling_summary.concat("<td>0.00</td>");
                        selling_summary = selling_summary.concat("</tr>");
                    }
                }
                
            }
            
            selling_summary = selling_summary.concat("<tr> <th scope=\"row\">Total</th>");
            selling_summary = selling_summary.concat("<th>"+total_qty+"</th>");
            selling_summary = selling_summary.concat("<th>"+String.format("%.02f", total_cost)+"</th>");
            selling_summary = selling_summary.concat("<th>"+String.format("%.02f", total_revenue)+"</th>");
            selling_summary = selling_summary.concat("</tr>");
            
    
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        String str_returns = ""; 
        
        float total_loss_of_returns = 0.0f ;
        total_qty = 0;
        
        try {
            
            categories.beforeFirst();
            
            while(categories.next()){
                ResultSet returns_res = this.get_return_by_category_wise(selected_duration, Integer.parseInt(categories.getString("cat_id")));
                
                if(returns_res.next()){
                    if(returns_res.getString("return_quantitiy")!=null){
                        
                        total_qty = Integer.parseInt(returns_res.getString("return_quantitiy"));
                        total_loss_of_returns += Float.parseFloat(returns_res.getString("loss_amount"));
                    
                        str_returns = str_returns.concat("<tr> <th scope=\"row\">"+categories.getString("cat_name")+"</th>");
                        str_returns = str_returns.concat("<td>"+returns_res.getString("return_quantitiy")+"</td>");
                        str_returns = str_returns.concat("<td>"+returns_res.getString("loss_amount")+"</td>");
                        str_returns = str_returns.concat("</tr>");
                    }
                    
                }
            }
            
            str_returns = str_returns.concat("<tr> <th scope=\"row\">Total</th>");
            str_returns = str_returns.concat("<th>"+total_qty+"</th>");
            str_returns = str_returns.concat("<th>"+String.format("%.02f", total_loss_of_returns)+"</th>");
            str_returns = str_returns.concat("</tr>");
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        String str_calclulation = String.format("%.02f", total_revenue) + " - " + String.format("%.02f", total_cost) + " - " + String.format("%.02f", total_loss_of_returns);
        float float_profit_or_loss = total_revenue-total_cost-total_loss_of_returns;
        
       

        
        
        /**/
        
        String demo = "<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"  <title>Bootstrap Example</title>\n" +
"  <meta charset=\"utf-8\">\n" +
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n" +
"  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
"  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n" +
"  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n" +
"  \n" +
"  \n" +
"    <style>\n" +
"  \n"
                + "caption{\n" +
"		color:#000;\n" +
"		caption-side: top;\n" +
"		} "+
"       #chart {\n" +
"      max-width: 650px;\n" +
"      margin: 35px auto;\n" +
"    }\n" +
"    </style>\n" +
"\n" +
"    <script>\n" +
"      window.Promise ||\n" +
"        document.write(\n" +
"          '<script src=\"https://cdn.jsdelivr.net/npm/promise-polyfill@8/dist/polyfill.min.js\"><\\/script>'\n" +
"        )\n" +
"      window.Promise ||\n" +
"        document.write(\n" +
"          '<script src=\"https://cdn.jsdelivr.net/npm/eligrey-classlist-js-polyfill@1.2.20171210/classList.min.js\"><\\/script>'\n" +
"        )\n" +
"      window.Promise ||\n" +
"        document.write(\n" +
"          '<script src=\"https://cdn.jsdelivr.net/npm/findindex_polyfill_mdn\"><\\/script>'\n" +
"        )\n" +
"    </script>\n" +
"\n" +
"    \n" +
"    <script src=\"https://cdn.jsdelivr.net/npm/apexcharts\"></script>\n" +
"  \n" +
"  \n" +
"  \n" +
"</head>\n" +
"<body>\n" +
"\n" +
"<div class=\"jumbotron text-center\">\n" +
"  <h1>Infinitycom monthly profit and loss report</h1>\n" +
"  <p>"+  selected_duration[0] +" to "+ selected_duration[1] +"</p> \n" +
                
                
"</div><div class=\"container\">\n" +
"\n" +
"	<div class=\"row\">\n" +
"		<div class=\"col-md-12\">\n" +
"		  \n" +
"		  <div id=\"chart\"><b>Sales of this month</b></div>\n" +
"	\n" +
"			<script>\n" +
"			  \n" +
"				var options = {\n" +
"				  series: [{\n" +
"				  data: ["+str_purchased_qty+"]\n" +
"				}],\n" +
"				  chart: {\n" +
"				  type: 'bar',\n" +
"				  height: 350\n" +
"				},\n" +
"				plotOptions: {\n" +
"				  bar: {\n" +
"					horizontal: true,\n" +
"				  }\n" +
"				},\n" +
"				dataLabels: {\n" +
"				  enabled: true\n" +
"				},\n" +
"				xaxis: {\n" +
"				  categories: [" + str_categories + "],\n" +
"				}\n" +
"				};\n" +
"\n" +
"				var chart = new ApexCharts(document.querySelector(\"#chart\"), options);\n" +
"				chart.render();\n" +
"			  \n" +
"			  \n" +
"			</script>\n" +
"	\n" +
"		</div>\n" +
"	</div>"
                + " <div class=\"row\">\n" +
"		<div class=\"col-md-12\">\n" +
"		 \n" +
"		 \n" +
"		 <table class=\"table mt-3 mb-3\">\n" +
"		 <caption>Sales of this month</caption>\n" +               
"		  <thead class=\"thead-light\">\n" +
"			<tr>\n" +
"			  <th scope=\"col\">Category</th>\n" +
"			  <th scope=\"col\">Quantity</th>\n" +
"			  <th scope=\"col\">Cost</th>\n" +
"			  <th scope=\"col\">Revenue</th>\n" +
"			</tr>\n" +
"		  </thead>\n" +
"		  <tbody>\n" + selling_summary + "</tbody>\n" +
"		</table>\n" +
"\n" +
"\n" +
"		</div>\n" +
"	</div>" +
                
                " <div class=\"row\">\n" +
"		<div class=\"col-md-12\">\n" +
"		 \n" +
"		 \n" +
"		 <table class=\"table mt-3 mb-3\">\n" +
"		 <caption>Returns of this month</caption>\n" +               
"		  <thead class=\"thead-light\">\n" +
"			<tr>\n" +
"			  <th scope=\"col\">Category</th>\n" +
"			  <th scope=\"col\">Quantity</th>\n" +
"			  <th scope=\"col\">Loss amount</th>\n" +
"			</tr>\n" +
"		  </thead>\n" +
"		  <tbody>\n" + str_returns + "</tbody>\n" +
"		</table>\n" +
"\n" +
"\n" +
"		</div>\n" +
"	</div>" +                
                

                               
                " <div class=\"row\">\n" +
"		<div class=\"col-md-12\">\n" +
"		 \n" +
"		 \n" +
"		 <table class=\"table mt-3 mb-3\">\n" +
	              
"		  <thead class=\"thead-light\">\n" +
"			<tr>\n" +
"			  <th scope=\"col\">Profit or loss this month : </th>\n" +
"			  <th scope=\"col\">"+str_calclulation+"</th>\n" +
"			  <th scope=\"col\">"+String.format("%.02f", float_profit_or_loss)+"</th>\n" +
"			</tr>\n" +
"		  </thead>\n" +
		 
"		</table>\n" +
"\n" +
"\n" +
"		</div>\n" +
"	</div>" +                
                
                
                
"</div>\n" +
"</body>\n" +
"</html>";
        
        
        return demo;
    }
    
    
    /*=================================================================================================================================================*/
    
    
    /*============================================================== notificaions ========================================================================*/  
    
    public ResultSet get_notifications(){
        
        ResultSet notifi_res = null;
        
        String notificaionsQ = "SELECT `notifi_id`as `Notification ID`, `description` as `Description` FROM `notification`";

        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(notificaionsQ);
            notifi_res = qstate.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return  notifi_res;
    }
    
    public void change_notification_state(int notifi_id){
        
        String notification_updateQ = "UPDATE `notification` SET `state`= 1  WHERE `notifi_id` = " + notifi_id;
        
        PreparedStatement qstate;
        try {
            qstate = (PreparedStatement) con.prepareStatement(notification_updateQ);

            /*insert*/
            qstate.execute();
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void delete_notification(String notifi_id){
     
        String notificaionsQ = "DELETE FROM `notification` WHERE `notifi_id` = " + notifi_id;
        
        System.out.println(notificaionsQ);

        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(notificaionsQ);
            qstate.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
 
    }
    
    /*=========================================================================================================================================================*/
    
    
    
    
    /*================================================================= Generate barcode =======================================================================*/
    
     public void barcode_generate(String stock_id,String barcode_location) throws FileNotFoundException, IOException, BadElementException, DocumentException{
        Code128Bean code128 = new Code128Bean();
        code128.setHeight(15f);
        code128.setModuleWidth(0.3);
        code128.setQuietZone(10);
        code128.doQuietZone(true);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BitmapCanvasProvider canvas = new BitmapCanvasProvider(baos, "image/x-png", 400, BufferedImage.TYPE_BYTE_BINARY, false, 0);
        code128.generateBarcode(canvas, stock_id);
        canvas.finish();

//write to png file
        /*FileOutputStream fos = new FileOutputStream("barcode.png");
        fos.write(baos.toByteArray());
        fos.flush();
        fos.close();*/

//write to pdf
        Image png = Image.getInstance(baos.toByteArray());
        png.setAbsolutePosition(0, 705);
        png.scalePercent(25);

        Document document;
        document = new Document();
        PdfPTable table = new PdfPTable(3);
        table.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
        for (int aw = 0; aw < 27; aw++) {
            Paragraph p = new Paragraph("");
            p.add("");
//            p.add(createImageCell(png));
            PdfPTable intable = new PdfPTable(1);
            intable.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            intable.addCell(p);
            intable.addCell(png);
            intable.getDefaultCell().setBorder(0);
            
            table.addCell(intable);
        }
//        table.setBorder(Border.NO_BORDER);
        Paragraph p = new Paragraph("");
        p.add("");
        p.add(png);
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(barcode_location + "\\" + stock_id+ ".pdf"));
        document.open();
//        document.add();
        document.add(table);
        document.close();

        writer.close();
     
     
     }
    
    
    
     /*=========================================================================================================================================================*/
    
    
}
