package prototype;

public class Square extends Shape {

    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public Square clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Square is not allowed to have clone objects");
    }

    private int calculateArea() {
        return side * side;
    }

    public void getArea() {
        System.out.println("Area of square[" + side + "]:" + calculateArea());
    }
}
