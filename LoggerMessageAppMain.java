
package loggermessageapp;


public class LoggerMessageAppMain
{
    public static void main(String[] args) 
    {
        Thread t1 = new Thread(()->
        {
            MessageLogger ml = MessageLogger.getInstance();
            ml.logMessage("Thread 1 is logging");
        });
                
        Thread t2 = new Thread(()->
        {
            MessageLogger ml = MessageLogger.getInstance();
            ml.logMessage("Thread 2 is Logging");
        });
        
        t1.start();
        t2.start();
    }
    
}
