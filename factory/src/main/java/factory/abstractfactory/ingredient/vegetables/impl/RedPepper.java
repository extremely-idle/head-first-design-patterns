package factory.abstractfactory.ingredient.vegetables.impl;

import factory.abstractfactory.ingredient.Vegetable;

/**
 * Created by ross.moug on 23/06/2017.
 */
public class RedPepper implements Vegetable {
    @Override
    public String getName() {
        return "Red Pepper";
    }

    @Override
    public String toString() {
        return getName();
    }
}
