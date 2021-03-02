package abstractFactory.chair;

public class ModernChair implements Chair {


    @Override
    public void showDetails() {
        System.out.println("Hi i am modern chair");
        System.out.println("Type:  Modern");
        System.out.println("Color: Black");
        System.out.println("Size:  16");
    }
}
