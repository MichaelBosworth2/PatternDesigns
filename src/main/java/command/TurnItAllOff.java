package command;

import java.util.List;

// Concrete Command
public class TurnItAllOff implements Command {

    // Select which list of devices to perform this command on
    List<ElectronicDevice> theDevices;

    public TurnItAllOff(List<ElectronicDevice> newDevices) {
        theDevices = newDevices;
    }

    @Override
    public void execute() {
        for(ElectronicDevice device : theDevices) {
            device.off();
        }
    }

    @Override
    public void undo() {
        for(ElectronicDevice device : theDevices) {
            device.on();
        }
    }
}
