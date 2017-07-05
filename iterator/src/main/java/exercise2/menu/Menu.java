package exercise2.menu;

import exercise1.menu.MenuItem;

import java.util.Iterator;

/**
 * Created by ross.moug on 05/07/2017.
 */
public interface Menu {
    Iterator<MenuItem> createIterator();
}
