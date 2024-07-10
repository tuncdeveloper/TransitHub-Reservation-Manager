

/**
 *
 * @author Lenovo
 */
public class Admin extends User {
    
    
    
    private final String adminUsername="admin";
    private final String adminPassword="123456";

    public Admin(String username, String password) {
        super(username, password);
    }

   

   
  

    

    
    
    public Boolean login(String username , String password) {
        
        Boolean isCorrect=adminUsername.equals(username)&&adminPassword.equals(password);
        return isCorrect;
        
}
    
}
