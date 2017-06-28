package object;

/**
 * Created by ross.moug on 27/06/2017.
 */
public class CeilingFan {
    private String location;
    private CeilingFanSpeed ceilingFanSpeed;

    public CeilingFan(String location) {
        this.location = location;
        this.ceilingFanSpeed = CeilingFanSpeed.OFF;
    }

    public void high() {
        ceilingFanSpeed = CeilingFanSpeed.HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium() {
        ceilingFanSpeed = CeilingFanSpeed.MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        ceilingFanSpeed = CeilingFanSpeed.LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void off() {
        System.out.println(location + " ceiling fan is off");
    }

    public CeilingFanSpeed getSpeed() {
        return ceilingFanSpeed;
    }
}
