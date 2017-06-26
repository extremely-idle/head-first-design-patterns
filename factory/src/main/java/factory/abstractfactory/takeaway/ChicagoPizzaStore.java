package factory.abstractfactory.takeaway;

import factory.abstractfactory.ingredient.factory.PizzaIngredientFactory;
import factory.abstractfactory.ingredient.factory.impl.ChicagoPizzaIngredientFactory;
import factory.abstractfactory.pizza.*;

/**
 * Created by ross.moug on 26/06/2017.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(factory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(factory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(factory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }

        return pizza;
    }
}

