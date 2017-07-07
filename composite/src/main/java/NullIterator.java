import java.util.Iterator;

/**
 * Created by ross.moug on 07/07/2017.
 */
public class NullIterator<T> implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
