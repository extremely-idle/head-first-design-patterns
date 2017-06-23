package factory.abstractfactory.pizza;

import factory.abstractfactory.ingredient.Vegetable;
import factory.abstractfactory.ingredient.cheese.Cheese;
import factory.abstractfactory.ingredient.clams.Clams;
import factory.abstractfactory.ingredient.dough.Dough;
import factory.abstractfactory.ingredient.pepperoni.Pepperoni;
import factory.abstractfactory.ingredient.sauce.Sauce;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ross.moug on 23/06/2017.
 */
public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public List<Vegetable> vegetables;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;

    abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the factory.simple.pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place factory.simple.pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", vegetables=" + vegetables +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
