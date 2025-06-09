//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package command;

import java.util.Stack;

/**
 * Manages undo/redo stacks for command history.
 */
public class HistoryManager {
    private final Stack<UndoableCommand> undoStack = new Stack<>();
    private final Stack<UndoableCommand> redoStack = new Stack<>();

    public void execute(UndoableCommand command) {
        command.execute();
        undoStack.push(command);
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            UndoableCommand cmd = undoStack.pop();
            cmd.undo();
            redoStack.push(cmd);
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            UndoableCommand cmd = redoStack.pop();
            cmd.execute();
            undoStack.push(cmd);
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    public void clear() {
        undoStack.clear();
        redoStack.clear();
    }
}
