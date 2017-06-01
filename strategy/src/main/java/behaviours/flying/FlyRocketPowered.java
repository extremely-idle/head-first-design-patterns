package behaviours.flying;

/**
 * Created by Ross on 01/06/2017.
 */
public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
