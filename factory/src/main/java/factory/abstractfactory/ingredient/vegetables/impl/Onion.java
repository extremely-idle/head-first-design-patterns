package factory.abstractfactory.ingredient.vegetables.impl;

import factory.abstractfactory.ingredient.vegetables.Vegetable;

/**
 * Created by ross.moug on 23/06/2017.
 */
public class Onion implements Vegetable {
    @Override
    public String getName() {
        return "Onion";
    }

    @Override
    public String toString() {
        return getName();
    }
}
