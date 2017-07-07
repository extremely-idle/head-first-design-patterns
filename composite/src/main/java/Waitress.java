import java.util.Iterator;

/**
 * Created by ross.moug on 07/07/2017.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void print() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        final Iterator<MenuComponent> iterator = allMenus.createIterator();

        System.out.println("\nVEGETARIAN MENU\n--------");

        while(iterator.hasNext()) {
            final MenuComponent menuComponent = iterator.next();

            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException uoe) {}
        }
    }
}
