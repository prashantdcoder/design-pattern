package factoryMethod.pizza;

public class IndianStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        return new IndianPizza(type);
    }
}
