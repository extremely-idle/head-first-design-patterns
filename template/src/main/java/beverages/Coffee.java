package beverages;

import beverages.templates.CaffeineBeverage;

/**
 * Created by ross.moug on 30/06/2017.
 */
public class Coffee extends CaffeineBeverage {
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
