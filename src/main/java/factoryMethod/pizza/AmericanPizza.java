package factoryMethod.pizza;

public class AmericanPizza extends Pizza {

    public AmericanPizza(String type) {
        this.setName("Margherita");
        this.setSize(8);
        this.setType(type);
    }
}
