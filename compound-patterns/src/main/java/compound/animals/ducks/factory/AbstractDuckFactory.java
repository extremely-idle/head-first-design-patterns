package compound.animals.ducks.factory;

import compound.behaviours.quacking.Quackable;

/**
 * Created by ross.moug on 02/06/2017.
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
