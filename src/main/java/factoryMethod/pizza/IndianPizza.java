package factoryMethod.pizza;

public class IndianPizza extends Pizza {

    public IndianPizza(String type) {
        this.setName("Farmhouse");
        this.setSize(10);
        this.setType(type);
    }
}
