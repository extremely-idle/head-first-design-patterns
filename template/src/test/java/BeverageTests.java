import beverages.Coffee;
import beverages.CoffeeWithHook;
import beverages.Tea;
import beverages.TeaWithHook;
import org.junit.Test;

/**
 * Created by ross.moug on 30/06/2017.
 */
public class BeverageTests {

    @Test
    public void basicTest() {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee");
        coffee.prepareRecipe();
    }

    @Test
    public void hookTest() {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        TeaWithHook teaWithHook = new TeaWithHook();

        System.out.println("\nMaking tea...");
        teaWithHook.prepareRecipe();

        System.out.println("\nMaking coffee");
        coffeeWithHook.prepareRecipe();
    }
}
