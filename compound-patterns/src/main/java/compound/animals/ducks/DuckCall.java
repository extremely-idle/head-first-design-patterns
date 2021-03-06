package compound.animals.ducks;

import compound.behaviours.quacking.Quackable;
import compound.behaviours.quacking.observer.Observable;
import compound.behaviours.quacking.observer.Observer;

/**
 * Created by ross.moug on 02/06/2017.
 */
public class DuckCall implements Quackable {

    private final Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
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
        return "Duck Call";
    }
}