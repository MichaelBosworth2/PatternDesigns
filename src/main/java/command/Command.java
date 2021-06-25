package command;

// Every single command will implement this interface
public interface Command {

    void execute();

    void undo();

}