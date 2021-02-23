package simpleFactory;

public class Admin extends User {

    @Override
    public void showDetails() {
        System.out.println("Hello! I am Admin");
    }
}
