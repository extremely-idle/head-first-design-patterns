package factory.simple;

import factory.simple.factory.SimplePizzaFactory;
import org.junit.Test;
import factory.simple.pizza.Pizza;
import factory.simple.takeaway.PizzaStore;

/**
 * Created by ross.moug on 21/06/2017.
 */
public class PizzaStoreTests {

    @Test
    public void simpleFactoryTests() {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);

        Pizza cheese = pizzaStore.orderPizza("cheese");
        System.out.println("A cheese factory.simple.pizza was just ordered!");

        Pizza clam = pizzaStore.orderPizza("clam");
        System.out.println("A clam factory.simple.pizza was just ordered!");
    }
}
