package animals.geese.factory;

import behaviours.quacking.Quackable;

/**
 * Created by ross.moug on 02/06/2017.
 */
public abstract class AbstractGooseFactory {
    public abstract Quackable createGoose();
}
