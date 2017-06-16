package cafe.beverages;

/**
 * Created by ross.moug on 16/06/2017.
 */
public abstract class Beverage {
    String description = "Unknown cafe.beverages.Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
