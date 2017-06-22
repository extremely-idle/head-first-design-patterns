package factory.method.factory;

import factory.method.pizza.ChicagoStyleCheesePizza;
import factory.method.pizza.ChicagoStyleClamPizza;
import factory.method.pizza.ChicagoStylePepperoniPizza;
import factory.method.pizza.ChicagoStyleVeggiePizza;
import factory.method.takeaway.PizzaStore;
import factory.simple.pizza.Pizza;

/**
 * Created by ross.moug on 22/06/2017.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
