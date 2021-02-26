package factoryMethod.pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        return pizza;
    }

    public abstract Pizza createPizza(String type);

}
