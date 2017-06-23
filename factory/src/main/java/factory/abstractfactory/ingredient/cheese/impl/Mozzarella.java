package factory.abstractfactory.ingredient.cheese.impl;

import factory.abstractfactory.ingredient.cheese.Cheese;

/**
 * Created by ross.moug on 23/06/2017.
 */
public class Mozzarella implements Cheese {
    @Override
    public String getName() {
        return "Mozzarella Cheese";
    }

    @Override
    public String toString() {
        return getName();
    }
}
