package prototype;

public class PrototypePattern {

    public static void execute() {
        try {
            Rectangle small = new Rectangle(10, 20);
            small.getArea();
            Rectangle large = (Rectangle) small.clone();
            large.getArea();

            Square one = new Square(7);
            one.getArea();
            Square two = one.clone();
            two.getArea();
        } catch (CloneNotSupportedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
