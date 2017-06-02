package animals.ducks;

import behaviours.quacking.Quackable;
import behaviours.quacking.observer.Observable;
import behaviours.quacking.observer.Observer;

/**
 * Created by ross.moug on 02/06/2017.
 */
public class RubberDuck implements Quackable {

    private final Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
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
        return "Rubber Duck";
    }
}
