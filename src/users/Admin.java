package users;

import com.mysql.jdbc.Connection;
import infinitycom.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

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

    /*=========================================================================================================================================================*/
 /*=================================================== Inventory =====================================================================================*/
    public void add_inventory(int stock_id, String product_category, String product_name, int qty, float stock_price, float selling_price, String date) {

        ResultSet res = null;
        String get_product_catIDQ = "SELECT `cat_id` FROM `category` WHERE `cat_name` = '" + product_category + "'";
        System.out.println(get_product_catIDQ);

        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(get_product_catIDQ);
            res = qstate.executeQuery();

            if (res.next()) {

                String add_invQ = "INSERT INTO `inventory`(`stock_id`, `product_category`, `product_name`, `quantity`, `stock_price`, `selling_price`, `date`) VALUES ( " + stock_id + ", " + res.getString("cat_id") + ", '" + product_name + "', " + qty + ", " + stock_price + ", " + selling_price + ", '" + date + "')";

                try {
                    qstate = (PreparedStatement) con.prepareStatement(add_invQ);

                    /*Confirm and added one row*/
                    qstate.execute();
                    JOptionPane.showMessageDialog(null, "Successfully added stock.");

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

                System.out.println(add_invQ);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void update_inventory(int stock_id, String product_category, String product_name, int qty, float stock_price, float selling_price, String date) {

       /* ResultSet res = null;
        String get_product_catIDQ = "SELECT `cat_id` FROM `category` WHERE `cat_name` = '" + product_category + "'";
        System.out.println(get_product_catIDQ);

        PreparedStatement qstate;
        try {

            qstate = (PreparedStatement) con.prepareStatement(get_product_catIDQ);
            res = qstate.executeQuery();

            if (res.next()) {

                String add_invQ = "INSERT INTO `inventory`(`stock_id`, `product_category`, `product_name`, `quantity`, `stock_price`, `selling_price`, `date`) VALUES ( " + stock_id + ", " + res.getString("cat_id") + ", '" + product_name + "', " + qty + ", " + stock_price + ", " + selling_price + ", '" + date + "')";

                try {
                    qstate = (PreparedStatement) con.prepareStatement(add_invQ);

                    *//*Confirm and added one row*//*
                    qstate.execute();
                    JOptionPane.showMessageDialog(null, "Successfully added stock.");

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

                System.out.println(add_invQ);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }*/

    }

    public ResultSet get_all_stocks() {

        ResultSet res = null;
        String selectusersQ = "SELECT i.`stock_id` as `Stock ID`, c.`cat_name` as `Product category` , i.`product_name` as `Product name`, i.`quantity` as `Quantity`, i.`stock_price` as `Stock price`, i.`selling_price` as `Selling price`, i.`date` as `Date` FROM `inventory` i, `category` c WHERE i.`product_category`=c.`cat_id`";

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
}
