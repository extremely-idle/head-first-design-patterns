package command.impl.fan;

import command.Command;
import object.CeilingFan;

/**
 * Created by ross.moug on 27/06/2017.
 */
public class CeilingFanMediumCommand implements Command {
    CeilingFan fan;

    public CeilingFanMediumCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.medium();
    }

    @Override
    public void undo() {
        fan.off();
    }
}