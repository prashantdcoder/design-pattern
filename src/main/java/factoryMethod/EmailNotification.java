package factoryMethod;

public class EmailNotification extends Notification {

    private String senderEmail;
    private String receiveEmail;

    public EmailNotification(String senderEmail, String receiveEmail) {
        this.senderEmail = senderEmail;
        this.receiveEmail = receiveEmail;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending email notification");
        System.out.println(message + " has been sent from " + senderEmail + " to " + receiveEmail);
    }
}
