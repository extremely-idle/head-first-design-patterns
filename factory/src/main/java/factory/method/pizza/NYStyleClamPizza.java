package factory.method.pizza;

import factory.simple.pizza.Pizza;

/**
 * Created by ross.moug on 22/06/2017.
 */
public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Clams");
    }
}
