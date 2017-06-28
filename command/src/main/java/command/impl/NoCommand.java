package command.impl;

import command.Command;

/**
 * Created by ross.moug on 26/06/2017.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {}

    @Override
    public void undo() {}
}
