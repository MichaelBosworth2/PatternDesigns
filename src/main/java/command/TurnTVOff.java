package command;

// Concrete Command
public class TurnTVOff implements Command {

    // Select which device to perform this command on
    ElectronicDevice theDevice;

    public TurnTVOff(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.off();
    }

    @Override
    public void undo() {
        theDevice.on();
    }
}
