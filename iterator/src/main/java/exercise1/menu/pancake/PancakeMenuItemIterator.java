package exercise1.menu.pancake;

import exercise1.iterator.Iterator;

import java.util.List;

/**
 * Created by ross.moug on 03/07/2017.
 */
public class PancakeMenuItemIterator<MenuItem> implements Iterator {
    private List<MenuItem> menuItemList;
    private int position;

    public PancakeMenuItemIterator(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < menuItemList.size();
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItemList.get(position);
        position++;
        return menuItem;
    }
}
