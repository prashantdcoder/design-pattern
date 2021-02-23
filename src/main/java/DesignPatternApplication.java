import builder.User;

public class DesignPatternApplication {

    public static void main(String args[]) {
        builderPattern();
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
}
