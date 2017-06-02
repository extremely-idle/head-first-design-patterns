package animals.geese.factory.impl;

import animals.geese.Goose;
import animals.geese.GooseAdapter;
import animals.geese.factory.AbstractGooseFactory;
import behaviours.quacking.Quackable;

/**
 * Created by ross.moug on 02/06/2017.
 */
public class GooseFactory extends AbstractGooseFactory {
    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
