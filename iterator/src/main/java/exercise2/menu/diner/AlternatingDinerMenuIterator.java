package exercise2.menu.diner;

import java.util.Calendar;
import java.util.Iterator;

/**
 * Created by ross.moug on 06/07/2017.
 */
public class AlternatingDinerMenuIterator<MenuItem> implements Iterator<MenuItem> {
    private MenuItem[] items;
    private int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        final Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        final MenuItem menuItem = items[position];
        position = position += 2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }
}
