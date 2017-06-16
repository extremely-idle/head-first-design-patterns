package cafe;

import cafe.beverages.Beverage;
import cafe.beverages.DarkRoast;
import cafe.beverages.Espresso;
import cafe.beverages.HouseBlend;
import cafe.condiments.Mocha;
import cafe.condiments.Soy;
import cafe.condiments.Whip;
import org.junit.Test;

/**
 * Created by ross.moug on 16/06/2017.
 */
public class CafeTest {

    @Test
    public void basicTest() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " £" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " £" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " £" + beverage3.cost());
    }
}
