//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package command;

import turtle.Turtle;

public class Digit0Command extends CompositeCommand {
    public Digit0Command(Turtle turtle) {
        // Draw rectangle for outer 0
        addCommand(new RectangleCommand(turtle, 2, 4));
    }
}
