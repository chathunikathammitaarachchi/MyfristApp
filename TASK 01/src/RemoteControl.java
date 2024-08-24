public class RemoteControl {
    private Command[][] commands;
    private Command undoCommand;

    public RemoteControl(int slots) {
        commands = new Command[slots][2];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        commands[slot][0] = onCommand;
        commands[slot][1] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        if (commands[slot][0] != null) {
            commands[slot][0].execute();
            undoCommand = commands[slot][0];
        }
    }

    public void offButtonWasPressed(int slot) {
        if (commands[slot][1] != null) {
            commands[slot][1].execute();
            undoCommand = commands[slot][1];
        }
    }

    public void undoButtonWasPressed() {
        if (undoCommand != null) {
            undoCommand.undo();
        }
    }
}