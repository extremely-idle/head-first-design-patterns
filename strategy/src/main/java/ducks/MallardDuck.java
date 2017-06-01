package ducks;

import behaviours.flying.FlyWithWings;
import behaviours.quacking.Quack;

/**
 * Created by Ross on 01/06/2017.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Mallard ducks");
    }
}
