package objects;

/**
 * Created by ross.moug on 29/06/2017.
 */
public class DvdPlayer {
    private String movie;

    public void on() {
        System.out.println(this.getClass().getName() + " on");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println(this.getClass().getName() + " playing \"" + movie + "\"");
    }

    public void stop() {
        System.out.println(this.getClass().getName() + " stopped \"" + movie + "\"");
    }

    public void eject() {
        System.out.println(this.getClass().getName() + " eject");
    }

    public void off() {
        System.out.println(this.getClass().getName() + " off");
    }
}
