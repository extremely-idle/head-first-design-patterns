package exercise2.menu.diner;

import exercise1.menu.MenuItem;
import exercise2.menu.Menu;

import java.util.Iterator;

/**
 * Created by ross.moug on 03/07/2017.
 */
public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);

        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);

        addItem("Soup of the day", "Soup of the day, with a side of potato salad", true, 3.29);

        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, exercise1.menu is full! Can't add item to exercise1.menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuItemIterator<MenuItem>(menuItems);
    }
}
