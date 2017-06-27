package object;

/**
 * Created by ross.moug on 27/06/2017.
 */
public class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void off() {
        System.out.println(location + " light is off");
    }

    public void on() {
        System.out.println(location + " light is on");
    }
}
