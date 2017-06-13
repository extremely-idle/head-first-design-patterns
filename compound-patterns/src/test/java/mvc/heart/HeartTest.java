package mvc.heart;

import mvc.controller.Controller;
import mvc.controller.heart.HeartControllerImpl;
import mvc.model.heart.HeartModelImpl;

/**
 * Created by ross.moug on 13/06/2017.
 */
public class HeartTest {

    public static void main(String[] args){
        HeartModelImpl model = new HeartModelImpl();
        Controller controller = new HeartControllerImpl(model);
    }
}
