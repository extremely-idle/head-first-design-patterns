package command.impl.fan;

import command.Command;
import object.CeilingFan;
import object.CeilingFanSpeed;

import static object.CeilingFanSpeed.*;

/**
 * Created by ross.moug on 27/06/2017.
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan fan;
    CeilingFanSpeed previousSpeed;

    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.off();
    }

    @Override
    public void undo() {
        if (previousSpeed == HIGH) {
            fan.high();
        } else if (previousSpeed == MEDIUM) {
            fan.medium();
        } else if (previousSpeed == LOW) {
            fan.low();
        } else if (previousSpeed == OFF) {
            fan.off();
        }
    }
}
