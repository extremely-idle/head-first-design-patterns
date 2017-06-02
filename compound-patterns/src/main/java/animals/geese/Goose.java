package animals.geese;

import behaviours.quacking.Quackable;

/**
 * Created by ross.moug on 02/06/2017.
 */
public class Goose {

    public void honk() {
        System.out.println("Honk");
    }

    @Override
    public String toString() {
        return "Goose";
    }
}
