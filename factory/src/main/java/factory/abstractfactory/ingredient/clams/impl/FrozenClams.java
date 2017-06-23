package factory.abstractfactory.ingredient.clams.impl;

import factory.abstractfactory.ingredient.clams.Clams;

/**
 * Created by ross.moug on 23/06/2017.
 */
public class FrozenClams implements Clams {
    @Override
    public String getName() {
        return "Frozen Clams";
    }

    @Override
    public String toString() {
        return getName();
    }
}
