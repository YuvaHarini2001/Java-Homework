
package usersession;

import java.util.Scanner;


public class UserSessionMain 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        UserSession us = UserSession.getInstance();
        
        System.out.println("Enter the user name:");
        String name = sc.nextLine();
        
        us.setName(name);
        
        UserSession us1 = UserSession.getInstance();
        
        us1.showName();
    }
    
}
