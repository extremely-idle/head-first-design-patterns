package behaviours.flying;

/**
 * Created by Ross on 01/06/2017.
 */
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
