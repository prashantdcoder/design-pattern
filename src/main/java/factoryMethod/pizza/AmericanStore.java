package factoryMethod.pizza;

public class AmericanStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return new AmericanPizza(type);
    }
}
