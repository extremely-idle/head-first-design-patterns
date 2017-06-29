import adapters.TurkeyAdapter;
import ducks.Duck;
import ducks.MallardDuck;
import org.junit.Test;
import turkeys.Turkey;
import turkeys.WildTurkey;

/**
 * Created by ross.moug on 29/06/2017.
 */
public class DuckTest {

    @Test
    public void test() {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
