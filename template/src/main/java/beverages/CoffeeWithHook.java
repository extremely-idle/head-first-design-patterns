package beverages;

import beverages.templates.CaffeineBeverageWithHook;

import java.util.Random;

/**
 * Created by ross.moug on 30/06/2017.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public boolean customerWantsCondiments() {
        final boolean wantCondiemnts = getUserInput();

        if (wantCondiemnts) {
            System.out.println("Yes please");
        } else {
            System.out.println("No thanks");
        }

        return wantCondiemnts;
    }

    private boolean getUserInput() {
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");

        final Random random = new Random();
        final int choice = random.nextInt(2);

        return choice == 1;
    }
}
