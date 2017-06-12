package compound.behaviours.quacking;

import compound.behaviours.quacking.observer.QuackObservable;

/**
 * Created by ross.moug on 02/06/2017.
 */
public interface Quackable extends QuackObservable {
    void quack();
}
