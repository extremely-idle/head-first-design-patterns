package threaded.single;

/**
 * Created by ross.moug on 26/06/2017.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler boiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getBoiler(){
        if (boiler == null) {
            boiler = new ChocolateBoiler();
        }

        return boiler;
    }
}
