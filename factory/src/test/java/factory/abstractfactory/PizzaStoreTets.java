package factory.abstractfactory;

import factory.abstractfactory.pizza.Pizza;
import factory.abstractfactory.takeaway.ChicagoPizzaStore;
import factory.abstractfactory.takeaway.NYPizzaStore;
import factory.abstractfactory.takeaway.PizzaStore;
import org.junit.Test;

/**
 * Created by ross.moug on 26/06/2017.
 */
public class PizzaStoreTets {

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
