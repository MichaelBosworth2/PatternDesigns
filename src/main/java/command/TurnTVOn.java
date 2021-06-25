package command;

// Concrete Command
public class TurnTVOn implements Command {

    // Select which device to perform this command on
    ElectronicDevice theDevice;

    public TurnTVOn(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.on();
    }

    @Override
    public void undo() {
        theDevice.off();
    }
}
