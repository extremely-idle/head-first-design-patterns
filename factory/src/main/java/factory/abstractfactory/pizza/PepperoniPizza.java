package factory.abstractfactory.pizza;

import factory.abstractfactory.ingredient.factory.PizzaIngredientFactory;

/**
 * Created by ross.moug on 26/06/2017.
 */
public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory factory;

    public PepperoniPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        pepperoni = factory.createPepperoni();
    }
}
