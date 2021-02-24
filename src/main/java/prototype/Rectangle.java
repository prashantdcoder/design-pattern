package prototype;

public class Rectangle extends Shape {

    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    private int calculateArea() {
        return length * breadth;
    }

    public void getArea() {
        System.out.println("Area of rectangle[" + length + ", " + breadth + "]: " + calculateArea());
    }

}
