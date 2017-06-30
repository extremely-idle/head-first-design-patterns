package beverages;

import beverages.templates.CaffeineBeverage;

/**
 * Created by ross.moug on 30/06/2017.
 */
public class Tea extends CaffeineBeverage {
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
