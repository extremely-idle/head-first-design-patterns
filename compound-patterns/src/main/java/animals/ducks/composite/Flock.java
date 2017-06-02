package animals.ducks.composite;

import behaviours.quacking.Quackable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ross.moug on 02/06/2017.
 */
public class Flock implements Quackable {
    List<Quackable> quackableList = new ArrayList<Quackable>();

    public void add(Quackable quackable) {
        quackableList.add(quackable);
    }

    @Override
    public void quack() {
        for (Quackable quackable : quackableList) {
            quackable.quack();
        }
    }
}
