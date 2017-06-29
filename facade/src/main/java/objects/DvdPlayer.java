package objects;

/**
 * Created by ross.moug on 29/06/2017.
 */
public class DvdPlayer {
    public void on() {
        System.out.println(this.getClass().getName() + " on");
    }

    public void play(String movie) {
        System.out.println(this.getClass().getName() + " playing \"" + movie + "\"");
    }
}
