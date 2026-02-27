
package notificationsystem;


public class SMSNotificationFactory extends NotificationFactory
{

    @Override
    Notification createNotification() 
    {
        return new SMSNotification();
    }
    
}
