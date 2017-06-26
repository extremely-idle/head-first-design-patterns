package factory.abstractfactory.takeaway;

import factory.abstractfactory.pizza.Pizza;

/**
 * Created by ross.moug on 22/06/2017.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
       Pizza pizza;

       pizza = createPizza(type);

       pizza.prepare();
       pizza.bake();
       pizza.cut();
       pizza.box();

       return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
