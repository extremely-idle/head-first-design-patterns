package quackologists;

import animals.geese.GooseAdapter;
import behaviours.quacking.observer.Observer;
import behaviours.quacking.observer.QuackObservable;

/**
 * Created by Ross on 02/06/2017.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        if (duck instanceof GooseAdapter) {
            System.out.println("Quackologist: " + duck + " has honked.");
        } else {
            System.out.println("Quackologist: " + duck + " just quacked.");
        }
    }
}
