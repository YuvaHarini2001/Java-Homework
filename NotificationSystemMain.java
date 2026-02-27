
package notificationsystem;

public class NotificationSystemMain
{
    public static void main(String[] args) 
    {
        NotificationFactory email = new EmailNotificationFactory();
        email.send();
        
        NotificationFactory sms = new SMSNotificationFactory();
        sms.send();
        
        NotificationFactory push = new PushNotificationFactory();
        push.send();
    }
    
}
