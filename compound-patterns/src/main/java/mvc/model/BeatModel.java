package mvc.model;

import mvc.model.observer.BPMObserver;
import mvc.model.observer.BeatObserver;

/**
 * Created by ross.moug on 12/06/2017.
 */
public interface BeatModel {
    void init();

    void on();

    void off();

    void setBPM(int bpm);

    int getBPM();

    void registerOberserver(BeatObserver observer);

    void removeObserver(BeatObserver observer);

    void registerObserver(BPMObserver observer);

    void removeObserver(BPMObserver observer);
}
