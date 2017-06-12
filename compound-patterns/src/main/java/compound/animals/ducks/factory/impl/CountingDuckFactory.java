package compound.animals.ducks.factory.impl;

import compound.animals.decorator.QuackCounter;
import compound.animals.ducks.DuckCall;
import compound.animals.ducks.MallardDuck;
import compound.animals.ducks.RedheadDuck;
import compound.animals.ducks.RubberDuck;
import compound.animals.ducks.factory.AbstractDuckFactory;
import compound.behaviours.quacking.Quackable;

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
