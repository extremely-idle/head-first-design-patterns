package mvc.controller.beat;

import mvc.controller.Controller;
import mvc.model.beat.BeatModel;
import mvc.view.ui.DJView;

/**
 * Created by Ross on 12/06/2017.
 */
public class ControllerImpl implements Controller {
    BeatModel model;
    DJView view;

    public ControllerImpl(BeatModel model) {
        this.model = model;
        view = new DJView(this, model);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.init();
    }

    @Override
    public void start() {
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    @Override
    public void stop() {
        model.off();
        view.enableStartMenuItem();
        view.disableStopMenuItem();
    }

    @Override
    public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(++bpm);
    }

    @Override
    public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(--bpm);
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }
}