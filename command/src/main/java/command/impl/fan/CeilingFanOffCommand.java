package command.impl.fan;

import command.Command;
import object.CeilingFan;

/**
 * Created by ross.moug on 27/06/2017.
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan fan;

    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
    }
}
