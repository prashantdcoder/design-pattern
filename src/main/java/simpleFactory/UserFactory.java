package simpleFactory;

public class UserFactory {

    public static User getInstance(UserType userType) {
        switch (userType) {
            case ADMIN:
                return new Admin();
            case BUYER:
                return new Buyer();
            case CUSTOMER:
                return new Customer();
            default:
                throw new IllegalArgumentException("Invalid user type");
        }
    }
}
