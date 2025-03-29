public class SMSNotificationFactory implements NotificationFactory {
    public Notification createNotification() {
        return new SMSNotification();
    }
}
