package prototype;

public abstract class Shape implements Cloneable {

    @Override
    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }
}
