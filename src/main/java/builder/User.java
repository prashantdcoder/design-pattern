package builder;

/*
* User class does not have setter methods.
* Once object is created its value cannot be changed later
* This is called immutability
* */
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private long salary;

    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.age = builder.age;
        this.salary = builder.salary;
    }

    @Override
    public String toString() {
        return "User: " + this.firstName + ", " + this.lastName + ", " + this.email + ", " + this.age + ", " + this.salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private int age;
        private long salary;


        public User build() {
            return new User(this);
        }

        public UserBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder witLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder withSalary(long salary) {
            this.salary = salary;
            return this;
        }
    }
}
