package factory.abstractfactory.ingredient.vegetables.impl;

import factory.abstractfactory.ingredient.vegetables.Vegetable;

/**
 * Created by ross.moug on 23/06/2017.
 */
public class Garlic implements Vegetable {
    @Override
    public String getName() {
        return "Garlic";
    }

    @Override
    public String toString() {
        return getName();
    }
}
