package factoryMethod;

public abstract class NotificationCreator {

    public abstract Notification createNotification();

    public Notification getNotification() {
        Notification notification = createNotification();
        return notification;
    }
}
