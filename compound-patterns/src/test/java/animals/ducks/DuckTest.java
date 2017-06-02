package animals.ducks;

import animals.decorator.QuackCounter;
import animals.ducks.composite.Flock;
import animals.ducks.factory.AbstractDuckFactory;
import animals.ducks.factory.impl.CountingDuckFactory;
import animals.geese.Goose;
import animals.geese.GooseAdapter;
import animals.geese.factory.AbstractGooseFactory;
import animals.geese.factory.impl.GooseFactory;
import behaviours.quacking.Quackable;
import org.junit.Test;

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

        System.out.println("\nDuck Simulator: With Composite - Flocks");

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

        System.out.println("\nDuck Simulator: Whole Flock Simulator");
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulator");
        simulate(flockOfMallards);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
