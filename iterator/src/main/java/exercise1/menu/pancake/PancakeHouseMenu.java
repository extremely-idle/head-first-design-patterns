package exercise1.menu.pancake;

import exercise1.iterator.Iterator;
import exercise1.menu.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ross.moug on 03/07/2017.
 */
public class PancakeHouseMenu {
    private List<MenuItem> menuItemList;

    public PancakeHouseMenu() {
        menuItemList = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);

        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);

        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);

        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        final MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItemList.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return new PancakeMenuItemIterator<MenuItem>(menuItemList);
    }
}
