package exercise2;

import exercise2.menu.Menu;
import exercise2.menu.cafe.CafeMenu;
import exercise2.menu.diner.DinerMenu;
import exercise2.menu.pancake.PancakeHouseMenu;
import exercise2.waitress.Waitress;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ross.moug on 05/07/2017.
 */
public class MenuTests {

    @Test
    public void javaUtilIteratorTest() {
        final Menu pancakeHouseMenu = new PancakeHouseMenu();
        final Menu dinerMenu = new DinerMenu();
        final Menu cafeMenu = new CafeMenu();

        final List<Menu> menuList = Arrays.asList(pancakeHouseMenu, dinerMenu, cafeMenu);

        Waitress waitress = new Waitress(menuList);

        waitress.printMenu();
    }
}
