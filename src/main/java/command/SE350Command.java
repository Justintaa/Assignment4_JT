//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package command;

import turtle.Turtle;

public class SE350Command extends CompositeCommand {
    public SE350Command(Turtle turtle) {
        // Draw S
        addCommand(new SCommand(turtle));

        // Move to draw E
        addCommand(new UndoablePenUpCommand(turtle));
        addCommand(new UndoableTurnCommand(turtle, 270));
        addCommand(new UndoableMoveCommand(turtle, 4));
        addCommand(new UndoableTurnCommand(turtle, 90));
        addCommand(new UndoableMoveCommand(turtle, 2));
        addCommand(new UndoablePenDownCommand(turtle));
        addCommand(new ECommand(turtle));

        // Move to draw 3
        addCommand(new UndoablePenUpCommand(turtle));
        addCommand(new UndoableTurnCommand(turtle, 270));
        addCommand(new UndoableMoveCommand(turtle, 4));
        addCommand(new UndoableTurnCommand(turtle, 90));
        addCommand(new UndoableMoveCommand(turtle, 2));
        addCommand(new UndoablePenDownCommand(turtle));
        addCommand(new ThreeCommand(turtle));

        // Move to draw 5 (SCommand reused)
        addCommand(new UndoablePenUpCommand(turtle));
        addCommand(new UndoableTurnCommand(turtle, 90));
        addCommand(new UndoableMoveCommand(turtle, 4));
        addCommand(new UndoableTurnCommand(turtle, 90));
        addCommand(new UndoableMoveCommand(turtle, 5));
        addCommand(new UndoablePenDownCommand(turtle));
        addCommand(new SCommand(turtle));

        // Move to draw 0
        addCommand(new UndoablePenUpCommand(turtle));
        addCommand(new UndoableTurnCommand(turtle, 270));
        addCommand(new UndoableMoveCommand(turtle, 4));
        addCommand(new UndoableTurnCommand(turtle, 90));
        addCommand(new UndoableMoveCommand(turtle, 1));
        addCommand(new UndoablePenDownCommand(turtle));
        addCommand(new Digit0Command(turtle));
    }
}
