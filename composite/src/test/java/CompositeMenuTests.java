import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by ross.moug on 07/07/2017.
 */
public class CompositeMenuTests {

    private static Waitress waitress;
    private static Menu allMenus;

    @BeforeClass
    public static void setup() {
        final MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        final MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        final MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        final MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        allMenus = new Menu("ALL MENUS", "All the menus");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));

        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));

        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));

        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59));

        dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));

        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));

        dinerMenu.add(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad", true, 3.29));

        dinerMenu.add(new MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flaky crust, topped with vanilla ice cream", true, 1.59));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));

        cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69));

        cafeMenu.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29));

        waitress = new Waitress(allMenus);

    }

    @Test
    public void test() {
        waitress.print();
    }

    @Test
    public void compositeIteratorTest() {
        final CompositeIterator<MenuComponent> iterator = new CompositeIterator<>(allMenus.createIterator());

        while(iterator.hasNext()) {
            final MenuComponent menuComponent = iterator.next();
            System.out.print("\n" + menuComponent.getName());
            System.out.print("  " + menuComponent.getDescription());
        }
    }

    @Test
    public void vegetarianTest() {
        waitress.printVegetarianMenu();
    }
}
