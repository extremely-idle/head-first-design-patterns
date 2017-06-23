package factory.abstractfactory.ingredient.pepperoni.impl;

import factory.abstractfactory.ingredient.pepperoni.Pepperoni;

/**
 * Created by ross.moug on 23/06/2017.
 */
public class SlicedPepperoni implements Pepperoni {
    @Override
    public String getName() {
        return "Sliced Pepperoni";
    }

    @Override
    public String toString() {
        return getName();
    }
}
