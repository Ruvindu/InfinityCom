package users;

import com.mysql.jdbc.Connection;
import infinitycom.DBConnection;
import infinitycom.Update_stock;
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
}
