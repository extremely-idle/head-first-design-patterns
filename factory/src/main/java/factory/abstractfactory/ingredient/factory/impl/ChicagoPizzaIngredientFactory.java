package factory.abstractfactory.ingredient.factory.impl;

import factory.abstractfactory.ingredient.Vegetable;
import factory.abstractfactory.ingredient.cheese.Cheese;
import factory.abstractfactory.ingredient.cheese.impl.Mozzarella;
import factory.abstractfactory.ingredient.clams.Clams;
import factory.abstractfactory.ingredient.clams.impl.FrozenClams;
import factory.abstractfactory.ingredient.dough.Dough;
import factory.abstractfactory.ingredient.dough.impl.ThickCrust;
import factory.abstractfactory.ingredient.factory.PizzaIngredientFactory;
import factory.abstractfactory.ingredient.pepperoni.Pepperoni;
import factory.abstractfactory.ingredient.pepperoni.impl.SlicedPepperoni;
import factory.abstractfactory.ingredient.sauce.Sauce;
import factory.abstractfactory.ingredient.sauce.impl.PlumTomatoSauce;
import factory.abstractfactory.ingredient.vegetables.impl.BlackOlives;
import factory.abstractfactory.ingredient.vegetables.impl.Aubergine;
import factory.abstractfactory.ingredient.vegetables.impl.Spinach;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ross.moug on 23/06/2017.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrust();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public List<Vegetable> createVeggies() {
        List<Vegetable> vegetables = Arrays.asList(new BlackOlives(), new Spinach(), new Aubergine());
        return null;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
