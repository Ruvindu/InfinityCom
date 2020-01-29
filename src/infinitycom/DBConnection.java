
package infinitycom;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBConnection {
    
    private static final DBConnection obj=new DBConnection();
    
    private DBConnection(){}
    
    public static DBConnection getConnction(){
        return obj;
    }
    
    public Connection createConnection() throws SQLException, ClassNotFoundException{
        
        Connection con = null;
        
        //try{
            Class.forName("com.mysql.jdbc.Driver");  
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/infinitycom","root","");
        //}
        //catch(Exception e){
            //JOptionPane.showMessageDialog(null, e.getMessage(), "Error" , JOptionPane.ERROR_MESSAGE);
        //}
        
        return con;
    }
    
}
 