//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package command;

import turtle.Turtle;

public class SCommand extends CompositeCommand {
    public SCommand(Turtle turtle) {
        addCommand(new UndoableTraceCommand(turtle, 2));   // Bottom bar
        addCommand(new UndoableTurnCommand(turtle, 90));
        addCommand(new UndoableTraceCommand(turtle, 2));   // Left stem
        addCommand(new UndoableTurnCommand(turtle, 90));
        addCommand(new UndoableTraceCommand(turtle, 2));   // Middle bar
        addCommand(new UndoableTurnCommand(turtle, -90));
        addCommand(new UndoableTraceCommand(turtle, 2));   // Right stem
        addCommand(new UndoableTurnCommand(turtle, -90));
        addCommand(new UndoableTraceCommand(turtle, 3));   // Top bar
    }
}
