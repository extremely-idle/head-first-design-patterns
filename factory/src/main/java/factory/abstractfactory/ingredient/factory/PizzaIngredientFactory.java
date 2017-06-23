package factory.abstractfactory.ingredient.factory;

import factory.abstractfactory.ingredient.*;
import factory.abstractfactory.ingredient.cheese.Cheese;
import factory.abstractfactory.ingredient.clams.Clams;
import factory.abstractfactory.ingredient.dough.Dough;
import factory.abstractfactory.ingredient.pepperoni.Pepperoni;
import factory.abstractfactory.ingredient.sauce.Sauce;

import java.util.List;

/**
 * Created by ross.moug on 23/06/2017.
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    List<Vegetable> createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
