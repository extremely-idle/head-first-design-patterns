package objects;

/**
 * Created by ross.moug on 29/06/2017.
 */
public class TheatreLights {
    private int lightLevel;

    public TheatreLights() {
        this.lightLevel = 0;
    }

    public void dim(int percent) {
        this.lightLevel = percent;
        System.out.println(this.getClass().getName() + " dimming lights to " + lightLevel + "%");
    }

    public void on() {
        this.lightLevel = 100;
        System.out.println(this.getClass().getName() + " on");
    }
}
