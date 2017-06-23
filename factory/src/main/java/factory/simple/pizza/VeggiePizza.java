package factory.simple.pizza;

/**
 * Created by ross.moug on 21/06/2017.
 */
public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        name = "Beggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Vegetable");
    }
}
