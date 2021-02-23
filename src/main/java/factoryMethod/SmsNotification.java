package factoryMethod;

public class SmsNotification extends Notification {

    private String senderMobile;
    private String receiverMobile;

    public SmsNotification(String senderMobile, String receiverMobile) {
        this.senderMobile = senderMobile;
        this.receiverMobile = receiverMobile;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending message notification");
        System.out.println(message + " has been sent from " + senderMobile + " to " + receiverMobile);
    }
}
