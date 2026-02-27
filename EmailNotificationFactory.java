
package notificationsystem;


public class EmailNotificationFactory extends NotificationFactory
{

    @Override
    Notification createNotification() 
    {
        return new EmailNotification();
    }
    
}
