import java.util.Iterator;

/**
 * Created by ross.moug on 03/07/2017.
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.print("\n  " + getName());

        if (isVegetarian()) {
            System.out.print(" (v)");
        }

        System.out.print(", £" + getPrice() + " -- " + getDescription() + "\n");
    }

    public Iterator<MenuComponent> createIterator() {
        return new NullIterator<MenuComponent>();
    }
}
