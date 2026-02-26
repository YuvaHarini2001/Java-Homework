
package usersession;


public class UserSession 
{
    private static UserSession instance;
    
    private String userName;
    
    private UserSession()
    {
        
    }
    
    public static UserSession getInstance()
    {
        if(instance==null)
        {
            instance = new UserSession();
        }
        return instance;
    }
    
    public void setName(String userName)
    {
        this.userName = userName;
    }
    
    public void showName()
    {
        System.out.println("Name:"+userName);
    }
}
