
package users;

/**
 *
 * @author Ruvindu
 */
public class Admin implements Users{

    private int user_id;
    private String user_name;
    private String user_email;
    
    
    @Override
    public void user_producer(int user_id,String user_name,String user_email) {
       this.user_id = user_id;
       this.user_name = user_name;
       this.user_email = user_email;
    }
    
    public void add_user(){
        System.out.println("Adding");
    }
    
}
