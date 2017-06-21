package simple;

import org.junit.Test;
import pizza.Pizza;
import takeaway.PizzaStore;

/**
 * Created by ross.moug on 21/06/2017.
 */
public class PizzaStoreTest {

    @Test
    public void simpleFactoryTests() {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);

        Pizza cheese = pizzaStore.orderPizza("cheese");
        System.out.println("A cheese pizza was just ordered!");

        Pizza clam = pizzaStore.orderPizza("clam");
        System.out.println("A clam pizza was just ordered!");
    }
}
