package mvc;

import mvc.controller.Controller;
import mvc.controller.ControllerImpl;
import mvc.model.BeatModel;
import mvc.model.BeatModelImpl;

/**
 * Created by Ross on 12/06/2017.
 */
public class MVCTest {

    public static void main(String[] args){
        BeatModel model = new BeatModelImpl();
        Controller controller = new ControllerImpl(model);
    }
}
