package objects;

/**
 * Created by ross.moug on 29/06/2017.
 */
public class PopcornPopper {
    public void on() {
        System.out.println(this.getClass().getName() + " on");
    }


    public void pop() {
        System.out.println(this.getClass().getName() + " popping popcorn!");
    }
}
