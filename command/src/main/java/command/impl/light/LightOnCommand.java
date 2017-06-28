package command.impl.light;

import command.Command;
import object.Light;

/**
 * Created by ross.moug on 27/06/2017.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
