package animals.ducks;

import behaviours.flying.FlyRocketPowered;
import org.junit.Test;

/**
 * Created by Ross on 01/06/2017.
 */
public class DuckTest {

    @Test
    public void testStrategy() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();

        model.performFly();

        model.setFlyBehaviour(new FlyRocketPowered());

        model.performFly();
    }
}
