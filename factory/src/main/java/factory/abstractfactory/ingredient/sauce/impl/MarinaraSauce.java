package factory.abstractfactory.ingredient.sauce.impl;

import factory.abstractfactory.ingredient.sauce.Sauce;

/**
 * Created by ross.moug on 23/06/2017.
 */
public class MarinaraSauce implements Sauce {
    @Override
    public String getName() {
        return "Marinara Sauce";
    }

    @Override
    public String toString() {
        return getName();
    }
}
