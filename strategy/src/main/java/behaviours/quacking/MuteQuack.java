package behaviours.quacking;

/**
 * Created by Ross on 01/06/2017.
 */
public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
