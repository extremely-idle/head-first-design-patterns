package factory.method.factory;

import factory.method.pizza.NYStyleCheesePizza;
import factory.method.pizza.NYStyleClamPizza;
import factory.method.pizza.NYStylePepperoniPizza;
import factory.method.pizza.NYStyleVeggiePizza;
import factory.method.takeaway.PizzaStore;
import factory.simple.pizza.Pizza;

/**
 * Created by ross.moug on 22/06/2017.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
