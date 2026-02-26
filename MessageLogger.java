
package loggermessageapp;


public class MessageLogger 
{
    private static MessageLogger instance;
    
    private MessageLogger()
    {
        
    }
    
    public static synchronized MessageLogger getInstance()
    {
        if(instance==null)
        {
            instance = new MessageLogger();
        }
        
        return instance;
    }
    
    public void logMessage(String msg)
    {
        System.out.println("Message:"+msg);
    }
}

