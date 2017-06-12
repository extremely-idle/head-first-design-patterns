package compound.animals.ducks.composite;

import compound.behaviours.quacking.Quackable;
import compound.behaviours.quacking.observer.Observable;
import compound.behaviours.quacking.observer.Observer;

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
