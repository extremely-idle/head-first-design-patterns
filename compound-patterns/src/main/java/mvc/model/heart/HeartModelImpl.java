package mvc.model.heart;

import mvc.model.observer.BPMObserver;
import mvc.model.observer.BeatObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ross.moug on 13/06/2017.
 */
public class HeartModelImpl {
    List<BeatObserver> beatObserverList = new ArrayList<BeatObserver>();
    List<BPMObserver> bpmObserverList = new ArrayList<BPMObserver>();
    int heartRate = 68;

    public int getHeartRate() {
        return heartRate;
    }

    public void registerBeatObserver(BeatObserver observer) {
        beatObserverList.add(observer);
    }

    public void registerBPMObserver(BPMObserver observer) {
        bpmObserverList.add(observer);
    }

    public void removeBPMObserver(BPMObserver observer) {
        if (bpmObserverList.contains(observer)) {
            bpmObserverList.remove(observer);
        }
    }

    public void removeBeatObserver(BeatObserver observer) {
        if (beatObserverList.contains(observer)) {
            beatObserverList.remove(observer);
        }
    }
}
