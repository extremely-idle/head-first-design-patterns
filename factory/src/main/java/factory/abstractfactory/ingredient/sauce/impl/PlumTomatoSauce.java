package factory.abstractfactory.ingredient.sauce.impl;

import factory.abstractfactory.ingredient.sauce.Sauce;

/**
 * Created by ross.moug on 23/06/2017.
 */
public class PlumTomatoSauce implements Sauce {
    @Override
    public String getName() {
        return "Plum Tomato Sauce";
    }

    @Override
    public String toString() {
        return getName();
    }
}
