//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package command;

public class UndoCommand implements Command {
    private final HistoryManager history;

    public UndoCommand(HistoryManager history) {
        this.history = history;
    }

    @Override
    public void execute() {
        history.undo();
    }
}
