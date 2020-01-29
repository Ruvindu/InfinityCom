package users;

/**
 *
 * @author Ruvindu
 */
public class UserProducer {
    
    public Users request_user(String user_type){
  
        if("ADMIN".equals(user_type)) return new Admin();
        else if("CASHIER".equals(user_type)) return new Cashier();
        
        return null;
    }
    
}
