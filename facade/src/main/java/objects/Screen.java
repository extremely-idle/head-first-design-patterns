package objects;

/**
 * Created by ross.moug on 29/06/2017.
 */
public class Screen {
    public void down() {
        System.out.println(this.getClass().getName() + " going down");
    }

    public void up() {
        System.out.println(this.getClass().getName() + " going up");
    }
}
