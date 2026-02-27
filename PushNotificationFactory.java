
package notificationsystem;

public class PushNotificationFactory extends NotificationFactory
{

    @Override
    Notification createNotification()
    {
        return new PushNotification();
    }
    
}
