package command.impl.fan;

import command.Command;
import object.CeilingFan;
import object.Stereo;

/**
 * Created by ross.moug on 27/06/2017.
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }
}