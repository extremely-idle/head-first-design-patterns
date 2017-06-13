package mvc.model.heart;

import mvc.model.beat.BeatModel;
import mvc.model.observer.BPMObserver;
import mvc.model.observer.BeatObserver;

/**
 * Created by ross.moug on 13/06/2017.
 */
public class HeartAdapter implements BeatModel {

    private final HeartModelImpl model;

    public HeartAdapter(HeartModelImpl model) {
        this.model = model;
    }

    @Override
    public void init() { }

    @Override
    public void on() { }

    @Override
    public void off() { }

    @Override
    public void setBPM(int bpm) { }

    @Override
    public int getBPM() {
        return model.getHeartRate();
    }

    @Override
    public void registerObserver(BeatObserver observer) {
        model.registerBeatObserver(observer);
    }

    @Override
    public void removeObserver(BeatObserver observer) {
        model.removeBeatObserver(observer);
    }

    @Override
    public void registerObserver(BPMObserver observer) {
        model.registerBPMObserver(observer);
    }

    @Override
    public void removeObserver(BPMObserver observer) {
        model.removeBPMObserver(observer);
    }
}
