package threaded.multi.lock.multi;

/**
 * Created by ross.moug on 26/06/2017.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private volatile static ChocolateBoiler boiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getBoiler(){
        if (boiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (boiler == null) {
                    boiler = new ChocolateBoiler();
                }
            }
        }

        return boiler;
    }
}
