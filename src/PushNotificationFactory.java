public class PushNotificationFactory implements NotificationFactory {
    public Notification createNotification() {
        return new PushNotification();
    }
}
