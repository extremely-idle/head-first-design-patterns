package object;

/**
 * Created by ross.moug on 27/06/2017.
 */
public class Stereo {

    private String location;
    private int volumne;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " stereo is on");
    }

    public void off() {
        System.out.println(location + " stereo is off");
    }

    public void setCD() {
        System.out.println(location + " stereo is set for CD input");
    }

    public void setVolumne(int volumne) {
        this.volumne = volumne;
        System.out.println(location + " stereo is volume set to " + volumne);
    }
}
