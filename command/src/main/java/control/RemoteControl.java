package control;

import command.Command;
import command.impl.NoCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ross.moug on 26/06/2017.
 */
public class RemoteControl {
    List<Command> onCommandList;
    List<Command> offCommandList;

    public RemoteControl() {
        onCommandList = new ArrayList<>(7);
        offCommandList = new ArrayList<>(7);

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommandList.add(noCommand);
            offCommandList.add(noCommand);
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        // TODO - STUB
    }

    public void onButtonWasPushed(int slot) {
        // TODO - STUB
    }

    public void offButtonWasPushed(int slot) {
        // TODO - STUB
    }

    @Override
    public String toString() {
        // TODO - STUB
        return "";
    }
}