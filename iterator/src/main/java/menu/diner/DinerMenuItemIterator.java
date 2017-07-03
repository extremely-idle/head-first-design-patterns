package menu.diner;

import iterator.Iterator;
import menu.MenuItem;

/**
 * Created by ross.moug on 03/07/2017.
 */
public class DinerMenuItemIterator<MenuItem> implements Iterator {
    private MenuItem[] menuItems;
    private int position;

    public DinerMenuItemIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
