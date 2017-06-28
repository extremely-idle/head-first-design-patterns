package command.impl.macro;

import command.Command;

import java.util.List;

/**
 * Created by ross.moug on 28/06/2017.
 */
public class MacroCommand implements Command {
    private List<Command> commandList;

    public MacroCommand(List<Command> onCommandList) {
        this.commandList = onCommandList;
    }

    @Override
    public void execute() {
        for (Command command : commandList) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commandList) {
            command.undo();
        }
    }
}
