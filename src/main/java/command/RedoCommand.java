//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package command;

public class RedoCommand implements Command {
    private final HistoryManager history;

    public RedoCommand(HistoryManager history) {
        this.history = history;
    }

    @Override
    public void execute() {
        history.redo();
    }
}
