package mvc.model;

import mvc.model.observer.BPMObserver;
import mvc.model.observer.BeatObserver;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by ross.moug on 12/06/2017.
 */
public class BeatModelImpl implements BeatModel, MetaEventListener {
    Sequencer sequencer;
    List<BeatObserver> beatObserverList = new ArrayList<BeatObserver>();
    List<BPMObserver> bpmObserverList = new ArrayList<BPMObserver>();
    int bpm = 90;
    Sequence sequence;
    Track track;

    @Override
    public void init() {
        setupMidi();
        buildTrackAndStart();
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObservers();
    }

    private void notifyBPMObservers() {
        for (BPMObserver observer : bpmObserverList) {
            observer.update();
        }
    }

    private void notifyBeatObservers() {
        for (BeatObserver observer : beatObserverList) {
            observer.update();
        }
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    private void beatEvent() {
        notifyBeatObservers();
    }

    @Override
    public void registerOberserver(BeatObserver observer) {
        beatObserverList.add(observer);
    }

    @Override
    public void removeObserver(BeatObserver observer) {
        beatObserverList.remove(observer);
    }

    @Override
    public void registerObserver(BPMObserver observer) {
        bpmObserverList.add(observer);
    }

    @Override
    public void removeObserver(BPMObserver observer) {
        bpmObserverList.remove(observer);
    }

    @Override
    public void meta(MetaMessage message) {
        if (message.getType() == 47) {
            beatEvent();
            sequencer.start();
            setBPM(getBPM());
        }
    }

    private void setupMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void buildTrackAndStart() {
        List<Integer> trackList = asList(new Integer[]{35, 0, 46, 0});

        sequence.deleteTrack(null);
        track = sequence.createTrack();

        makeTracks(trackList);
        track.add(makeEvent(192, 9, 1, 0, 4));
        try {
            sequencer.setSequence(sequence);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void makeTracks(List<Integer> trackList) {
        // TODO - STUB
    }

    private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        // TODO - STUB
        return null;
    }
}
