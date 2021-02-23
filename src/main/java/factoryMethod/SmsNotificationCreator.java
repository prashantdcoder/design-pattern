package factoryMethod;

public class SmsNotificationCreator extends NotificationCreator {

    private String senderMobile;
    private String receiverMobile;

    public SmsNotificationCreator(String senderMobile, String receiverMobile) {
        this.senderMobile = senderMobile;
        this.receiverMobile = receiverMobile;
    }

    @Override
    public Notification createNotification() {
        return new SmsNotification(senderMobile, receiverMobile);
    }

}
