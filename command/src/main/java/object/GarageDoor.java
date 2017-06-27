package object;

/**
 * Created by ross.moug on 27/06/2017.
 */
public class GarageDoor {

    private String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println("Garage Door is up");
    }

    public void down() {
        System.out.println("Garage Door is down");
    }
}
