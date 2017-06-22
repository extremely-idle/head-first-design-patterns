package factory.method;

import factory.method.factory.ChicagoPizzaStore;
import factory.method.factory.NYPizzaStore;
import factory.simple.pizza.Pizza;
import factory.method.takeaway.PizzaStore;
import org.junit.Test;

/**
 * Created by ross.moug on 22/06/2017.
 */
public class PizzaStoreTests {

    @Test
    public void factoryMethodTest() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("A " + pizza.getName() + " has been ordered");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("A " + pizza.getName() + " has been ordered");
    }
}
