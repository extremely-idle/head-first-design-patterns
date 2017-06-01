package behaviours.quacking;

/**
 * Created by Ross on 01/06/2017.
 */
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
