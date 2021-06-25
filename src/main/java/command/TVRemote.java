package command;

// Return the type of electronic device we will be using
public class TVRemote {

    public static ElectronicDevice getDevice() {
        return new Television();
    }

}
