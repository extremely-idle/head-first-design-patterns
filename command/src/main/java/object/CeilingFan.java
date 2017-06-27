package object;

/**
 * Created by ross.moug on 27/06/2017.
 */
public class CeilingFan {
    private String location;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " ceiling fan is on high");
    }

    public void off() {
        System.out.println(location + " ceiling fan is off");
    }
}
