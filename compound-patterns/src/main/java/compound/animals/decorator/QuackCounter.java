package compound.animals.decorator;

import compound.behaviours.quacking.Quackable;

/**
 * Created by ross.moug on 02/06/2017.
 */
public class QuackCounter implements Quackable {
    private Quackable duck;
    private static int numberOfQuacks = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
