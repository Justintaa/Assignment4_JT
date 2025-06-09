//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package command;

import turtle.Turtle;

public class RectangleCommand extends CompositeCommand {
    public RectangleCommand(Turtle turtle, double width, double height) {
        addCommand(new UndoableTraceCommand(turtle, width));
        addCommand(new UndoableTurnCommand(turtle, 90));
        addCommand(new UndoableTraceCommand(turtle, height));
        addCommand(new UndoableTurnCommand(turtle, 90));
        addCommand(new UndoableTraceCommand(turtle, width));
        addCommand(new UndoableTurnCommand(turtle, 90));
        addCommand(new UndoableTraceCommand(turtle, height));
        addCommand(new UndoableTurnCommand(turtle, 90));
    }
}
