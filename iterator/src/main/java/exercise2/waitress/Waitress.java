package exercise2.waitress;

import exercise1.menu.MenuItem;
import exercise2.menu.Menu;

import java.util.Iterator;
import java.util.List;

/**
 * Created by ross.moug on 03/07/2017.
 */
public class Waitress {
    List<Menu> menuList;
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public void printMenu() {
        for (Menu menu : menuList) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            final MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + ",  £" + menuItem.getPrice() + " -- " + menuItem.getDescription());
        }
    }
}
