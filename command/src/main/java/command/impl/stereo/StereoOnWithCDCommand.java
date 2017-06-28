package command.impl.stereo;

import command.Command;
import object.Stereo;

/**
 * Created by ross.moug on 27/06/2017.
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolumne(1);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
