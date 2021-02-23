package factoryMethod;

public class EmailNotificationCreator extends NotificationCreator {

    private String senderEmail;
    private String receiverEmail;

    public EmailNotificationCreator(String senderEmail, String receiverEmail) {
        this.senderEmail = senderEmail;
        this.receiverEmail = receiverEmail;
    }

    @Override
    public Notification createNotification() {
        return new EmailNotification(senderEmail, receiverEmail);
    }
}
