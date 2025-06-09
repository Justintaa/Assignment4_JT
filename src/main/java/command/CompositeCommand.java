//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package command;

import java.util.ArrayList;
import java.util.List;


/**
 * A command that contains a list of commands to execute in sequence.
 */
public class CompositeCommand implements Command {
    protected final List<Command> commands = new ArrayList<>();

    public void AddCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
