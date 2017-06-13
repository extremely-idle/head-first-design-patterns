package mvc.controller.heart;

import mvc.controller.Controller;
import mvc.model.heart.HeartAdapter;
import mvc.model.heart.HeartModelImpl;
import mvc.view.ui.DJView;

/**
 * Created by ross.moug on 13/06/2017.
 */
public class HeartControllerImpl implements Controller {

    private final HeartModelImpl model;
    private final DJView view;

    public HeartControllerImpl(HeartModelImpl model) {
        this.model = model;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStartMenuItem();
        view.disableStopMenuItem();
    }

    @Override
    public void start() { }

    @Override
    public void stop() { }

    @Override
    public void increaseBPM() { }

    @Override
    public void decreaseBPM() { }

    @Override
    public void setBPM(int bpm) { }
}
