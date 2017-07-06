package exercise2.menu.cafe;

import exercise1.menu.MenuItem;
import exercise2.menu.Menu;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by ross.moug on 06/07/2017.
 */
public class CafeMenu implements Menu {
    private Hashtable<String, MenuItem> menuItemTable;

    public CafeMenu() {
        this.menuItemTable = new Hashtable<>();

        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);

        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);

        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        final MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItemTable.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItemTable.values().iterator();
    }
}
