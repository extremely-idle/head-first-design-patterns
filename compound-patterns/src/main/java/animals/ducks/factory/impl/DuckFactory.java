package animals.ducks.factory.impl;

import animals.ducks.DuckCall;
import animals.ducks.MallardDuck;
import animals.ducks.RedheadDuck;
import animals.ducks.RubberDuck;
import animals.ducks.factory.AbstractDuckFactory;
import behaviours.quacking.Quackable;

/**
 * Created by ross.moug on 02/06/2017.
 */
public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
