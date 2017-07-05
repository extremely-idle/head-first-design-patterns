package exercise1;

import exercise1.menu.diner.DinerMenu;
import exercise1.menu.pancake.PancakeHouseMenu;
import org.junit.Test;
import exercise1.waitress.Waitress;

/**
 * Created by ross.moug on 05/07/2017.
 */
public class MenuTests {

    @Test
    public void ownIteratorTest() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
