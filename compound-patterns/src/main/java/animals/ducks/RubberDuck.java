package animals.ducks;

import behaviours.quacking.Quackable;

/**
 * Created by ross.moug on 02/06/2017.
 */
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
