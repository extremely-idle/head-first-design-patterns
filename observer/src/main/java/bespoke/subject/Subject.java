package bespoke.subject;

import bespoke.observer.Observer;

/**
 * Created by ross.moug on 15/06/2017.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
