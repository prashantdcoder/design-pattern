import builder.User;
import factoryMethod.EmailNotificationCreator;
import factoryMethod.Notification;
import factoryMethod.NotificationCreator;
import factoryMethod.SmsNotificationCreator;
import simpleFactory.UserFactory;
import simpleFactory.UserType;

public class DesignPatternApplication {

    public static void main(String args[]) {
        factoryMethodPattern();
    }

    static void builderPattern() {
        User user = new User.UserBuilder()
                .withFirstName("Prashant")
                .witLastName("Singh")
                .withAge(27)
                .withEmail("builder@example.com")
                .withSalary(100000)
                .build();
        System.out.println(user);
    }

    static void simpleFactoryPattern() {
        simpleFactory.User customer = UserFactory.getInstance(UserType.CUSTOMER);
        customer.showDetails();

        simpleFactory.User admin = UserFactory.getInstance(UserType.ADMIN);
        admin.showDetails();

        simpleFactory.User buyer = UserFactory.getInstance(UserType.BUYER);
        buyer.showDetails();
    }

    static void factoryMethodPattern() {
        NotificationCreator emailCreator = new EmailNotificationCreator("abc@gmail.com", "abc@zoho.com");
        Notification emailNotification = emailCreator.getNotification();
        emailNotification.send("EMAIL WORLD");

        NotificationCreator smsCreator = new SmsNotificationCreator("999", "888");
        Notification smsNotification = smsCreator.getNotification();
        smsNotification.send("SMS WORLD");

    }

}
