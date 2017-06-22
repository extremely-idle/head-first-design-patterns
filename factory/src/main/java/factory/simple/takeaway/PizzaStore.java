package factory.simple.takeaway;

import factory.simple.pizza.Pizza;
import factory.simple.factory.SimplePizzaFactory;

/**
 * Created by ross.moug on 21/06/2017.
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
