package objects;

/**
 * Created by ross.moug on 29/06/2017.
 */
public class Amplifier {
    private DvdPlayer dvd;
    private int volume;

    public void on() {
        System.out.println(this.getClass().getName() + " on");
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
        System.out.println(this.getClass().getName() + " setting DVD player to DVD Player");
    }

    public void setSurroundSound() {
        System.out.println(this.getClass().getName() + " surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(this.getClass().getName() + " setting volume to " + volume);
    }
}
