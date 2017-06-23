package factory.abstractfactory.ingredient.factory.impl;

import factory.abstractfactory.ingredient.*;
import factory.abstractfactory.ingredient.cheese.Cheese;
import factory.abstractfactory.ingredient.cheese.impl.Reggiano;
import factory.abstractfactory.ingredient.clams.Clams;
import factory.abstractfactory.ingredient.clams.impl.FreshClams;
import factory.abstractfactory.ingredient.dough.Dough;
import factory.abstractfactory.ingredient.dough.impl.ThinCrust;
import factory.abstractfactory.ingredient.factory.PizzaIngredientFactory;
import factory.abstractfactory.ingredient.pepperoni.Pepperoni;
import factory.abstractfactory.ingredient.pepperoni.impl.SlicedPepperoni;
import factory.abstractfactory.ingredient.sauce.Sauce;
import factory.abstractfactory.ingredient.sauce.impl.MarinaraSauce;
import factory.abstractfactory.ingredient.vegetables.impl.Garlic;
import factory.abstractfactory.ingredient.vegetables.impl.Mushroom;
import factory.abstractfactory.ingredient.vegetables.impl.Onion;
import factory.abstractfactory.ingredient.vegetables.impl.RedPepper;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ross.moug on 23/06/2017.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrust();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Reggiano();
    }

    @Override
    public List<Vegetable> createVeggies() {
        List<Vegetable> vegetables = Arrays.asList(new Garlic(), new Onion(), new Mushroom(), new RedPepper());
        return vegetables;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
