import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ross.moug on 07/07/2017.
 */
public class Menu extends MenuComponent {
    private List<MenuComponent> menuComponentList;
    private String name;
    private String description;
    private Iterator<MenuComponent> iterator;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        this.menuComponentList = new ArrayList<>();
    }

    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.print(", " + getDescription());
        System.out.print("\n-----------------------");

        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }

    public Iterator<MenuComponent> createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator<MenuComponent>(menuComponentList.iterator());
        }

        return iterator;
    }
}