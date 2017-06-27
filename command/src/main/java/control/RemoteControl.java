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
        onCommandList.set(slot, onCommand);
        offCommandList.set(slot, offCommand);
    }

    public void onButtonWasPushed(int slot) {
        onCommandList.get(slot).execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommandList.get(slot).execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----- Remote Control -----\n");
        for (int i = 0; i < onCommandList.size(); i++) {
            stringBuffer.append(("[slot " + i + "] " + onCommandList.get(i).getClass().getName())
                + "   " + offCommandList.get(i).getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}