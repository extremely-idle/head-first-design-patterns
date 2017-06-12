package compound.animals.geese;

import compound.behaviours.quacking.Quackable;
import compound.behaviours.quacking.observer.Observable;
import compound.behaviours.quacking.observer.Observer;

/**
 * Created by ross.moug on 02/06/2017.
 */
public class GooseAdapter implements Quackable {

    private final Goose goose;
    private final Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return goose.toString();
    }
}