import java.util.Iterator;
import java.util.Stack;

/**
 * Created by ross.moug on 07/07/2017.
 */
public class CompositeIterator<T> implements Iterator<MenuComponent> {
    private Stack<Iterator<T>> stack;

    public CompositeIterator(Iterator<T> iterator) {
        stack = new Stack<Iterator<T>>();
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } else {
            final Iterator<T> iterator = (Iterator<T>) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            final Iterator<T> iterator = (Iterator<T>) stack.peek();
            final MenuComponent menuComponent = (MenuComponent) iterator.next();

            if (menuComponent instanceof Menu) {
                stack.push((Iterator<T>) menuComponent.createIterator());
            }

            return menuComponent;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
