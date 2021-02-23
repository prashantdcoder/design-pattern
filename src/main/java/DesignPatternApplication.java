import builder.User;
import simpleFactory.UserFactory;
import simpleFactory.UserType;

public class DesignPatternApplication {

    public static void main(String args[]) {
        simpleFactoryPattern();
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
}
