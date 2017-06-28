package command.impl.fan;

import command.Command;
import object.CeilingFan;

/**
 * Created by ross.moug on 28/06/2017.
 */
public class CeilingFanHighCommand implements Command {
    CeilingFan fan;

    public CeilingFanHighCommand(CeilingFan fan) {
        this.fan = fan;
    }

     @Override
     public void execute() {
        fan.high();
    }

    @Override
    public void undo() {
        fan.off();
    }
}
