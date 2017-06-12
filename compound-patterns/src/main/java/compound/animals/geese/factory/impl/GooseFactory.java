package compound.animals.geese.factory.impl;

import compound.animals.geese.Goose;
import compound.animals.geese.GooseAdapter;
import compound.animals.geese.factory.AbstractGooseFactory;
import compound.behaviours.quacking.Quackable;

/**
 * Created by ross.moug on 02/06/2017.
 */
public class GooseFactory extends AbstractGooseFactory {
    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
