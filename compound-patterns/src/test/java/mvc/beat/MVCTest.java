package mvc.beat;

import mvc.controller.Controller;
import mvc.controller.beat.ControllerImpl;
import mvc.model.beat.BeatModel;
import mvc.model.beat.BeatModelImpl;

/**
 * Created by Ross on 12/06/2017.
 */
public class MVCTest {

    public static void main(String[] args){
        BeatModel model = new BeatModelImpl();
        Controller controller = new ControllerImpl(model);
    }
}
