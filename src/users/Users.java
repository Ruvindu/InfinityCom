
package users;


public interface Users {
    
    public void user_producer(int user_id,String user_name,String user_email);

    public void update_inventory(int stock_id, String product_name, int quantitiy, float purchasing_price, float selling_price);
    
}
