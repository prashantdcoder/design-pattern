package builder;

public class BuilderPattern {

    public static void execute() {
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
