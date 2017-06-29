package objects;

/**
 * Created by ross.moug on 29/06/2017.
 */
public class Projector {
    public void on() {
        System.out.println(this.getClass().getName() + " on");
    }

    public void wideScreenMode() {
        System.out.println(this.getClass().getName() + " in widescreen mode (16x9 aspect ratio)");
    }
}
