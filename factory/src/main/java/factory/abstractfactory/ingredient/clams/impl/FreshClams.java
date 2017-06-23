package factory.abstractfactory.ingredient.clams.impl;

import factory.abstractfactory.ingredient.clams.Clams;

/**
 * Created by ross.moug on 23/06/2017.
 */
public class FreshClams implements Clams {
    @Override
    public String getName() {
        return "Fresh Clams";
    }

    @Override
    public String toString() {
        return getName();
    }
}
