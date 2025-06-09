//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package command;

/**
 * Command that can be undone.
 */
public interface UndoableCommand extends Command {
    void undo();
}
