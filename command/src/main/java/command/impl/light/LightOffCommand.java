package command.impl.light;

import command.Command;
import object.Light;

/**
 * Created by ross.moug on 27/06/2017.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
