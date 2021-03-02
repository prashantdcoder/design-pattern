package abstractFactory.chair;

public class VictorianChair implements Chair {
    @Override
    public void showDetails() {
        System.out.println("Hi i am victorian chair");
        System.out.println("Type:  Victorian");
        System.out.println("Color: Black");
        System.out.println("Size:  16");
    }
}
