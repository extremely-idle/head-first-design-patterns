package factory.abstractfactory.ingredient.dough.impl;

import factory.abstractfactory.ingredient.dough.Dough;

/**
 * Created by ross.moug on 23/06/2017.
 */
public class ThickCrust implements Dough {
    @Override
    public String getName() {
        return "Thick Crust";
    }

    @Override
    public String toString() {
        return getName();
    }
}
