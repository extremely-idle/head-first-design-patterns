package animals.ducks.factory.impl;

import animals.decorator.QuackCounter;
import animals.ducks.DuckCall;
import animals.ducks.MallardDuck;
import animals.ducks.RedheadDuck;
import animals.ducks.RubberDuck;
import animals.ducks.factory.AbstractDuckFactory;
import behaviours.quacking.Quackable;

/**
 * Created by ross.moug on 02/06/2017.
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
