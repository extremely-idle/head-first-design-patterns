package compound.animals.ducks;

import compound.animals.decorator.QuackCounter;
import compound.animals.ducks.composite.Flock;
import compound.animals.ducks.factory.AbstractDuckFactory;
import compound.animals.ducks.factory.impl.CountingDuckFactory;
import compound.animals.geese.factory.AbstractGooseFactory;
import compound.animals.geese.factory.impl.GooseFactory;
import compound.behaviours.quacking.Quackable;
import org.junit.Test;
import quackologists.Quackologist;

/**
 * Created by ross.moug on 02/06/2017.
 */
public class DuckTest {

    @Test
    public void testDucks() {
        final AbstractDuckFactory duckFactory = new CountingDuckFactory();
        final AbstractGooseFactory gooseFactory = new GooseFactory();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = gooseFactory.createGoose();

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);

        Flock flockOfMallards = new Flock();

        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardDuck1);
        flockOfMallards.add(mallardDuck2);
        flockOfMallards.add(mallardDuck3);
        flockOfMallards.add(mallardDuck4);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: With Observer");
        Quackologist quackologist = new Quackologist();

        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
