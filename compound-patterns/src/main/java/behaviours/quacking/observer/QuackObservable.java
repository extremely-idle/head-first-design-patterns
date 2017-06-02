package behaviours.quacking.observer;

/**
 * Created by Ross on 02/06/2017.
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
