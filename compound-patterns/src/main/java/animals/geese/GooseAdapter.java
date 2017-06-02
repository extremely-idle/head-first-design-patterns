package animals.geese;

import behaviours.quacking.Quackable;

/**
 * Created by ross.moug on 02/06/2017.
 */
public class GooseAdapter implements Quackable {

    private final Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
