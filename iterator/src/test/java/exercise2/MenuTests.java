package exercise2;

import exercise2.menu.Menu;
import exercise2.menu.diner.DinerMenu;
import exercise2.menu.pancake.PancakeHouseMenu;
import exercise2.waitress.Waitress;
import org.junit.Test;

/**
 * Created by ross.moug on 05/07/2017.
 */
public class MenuTests {

    @Test
    public void javaUtilIteratorTest() {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
