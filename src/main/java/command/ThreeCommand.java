//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package command;

import turtle.Turtle;

public class ThreeCommand extends CompositeCommand {
    public ThreeCommand(Turtle turtle) {
        addCommand(new UndoableTraceCommand(turtle, 2));
        addCommand(new UndoableTurnCommand(turtle, 90));
        addCommand(new UndoableTraceCommand(turtle, 2));
        addCommand(new UndoableTurnCommand(turtle, 90));
        addCommand(new UndoableTraceCommand(turtle, 3));
        addCommand(new UndoableTurnCommand(turtle, 180));
        addCommand(new UndoableTraceCommand(turtle, 3));
        addCommand(new UndoableTurnCommand(turtle, 90));
        addCommand(new UndoableTraceCommand(turtle, 2));
        addCommand(new UndoableTurnCommand(turtle, 90));
        addCommand(new UndoableTraceCommand(turtle, 3));
    }
}
