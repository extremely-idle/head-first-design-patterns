package compound.animals.ducks;

import compound.behaviours.flying.FlyNoWay;
import compound.behaviours.quacking.Quack;

/**
 * Created by Ross on 01/06/2017.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
