package command.impl.garage;

import command.Command;
import object.GarageDoor;

/**
 * Created by ross.moug on 27/06/2017.
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
