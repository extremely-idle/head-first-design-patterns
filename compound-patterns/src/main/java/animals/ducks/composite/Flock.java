package animals.ducks.composite;

import behaviours.quacking.Quackable;
import behaviours.quacking.observer.Observable;
import behaviours.quacking.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ross.moug on 02/06/2017.
 */
public class Flock implements Quackable {
    List<Quackable> quackableList = new ArrayList<Quackable>();

    public void add(Quackable quackable) {
        quackableList.add(quackable);
    }

    @Override
    public void quack() {
        for (Quackable quackable : quackableList) {
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quack : quackableList) {
            quack.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Quackable quackable : quackableList) {
            quackable.notifyObservers();
        }
    }
}
