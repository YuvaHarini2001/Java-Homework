
package notificationsystem;


public abstract class NotificationFactory 
{
    abstract Notification createNotification();
    
    void send()
    {
        Notification notify = createNotification();
        notify.sendMessage();
        System.out.println("Notification Sended Successfully");
    }
}
