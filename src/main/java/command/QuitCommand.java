//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package command;

public class QuitCommand implements Command {
    @Override
    public void execute() {
        throw new QuitException("Exiting turtle editor...");
    }
}
