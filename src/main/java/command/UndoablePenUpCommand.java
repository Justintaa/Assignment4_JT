package command;

import turtle.Turtle;

public class UndoablePenUpCommand implements UndoableCommand {
    private final Turtle turtle;

    public UndoablePenUpCommand(Turtle turtle) {
        this.turtle = turtle;
    }

    @Override
    public void execute() {
        turtle.penUp();
    }

    @Override
    public void undo() {
        turtle.penDown();
    }
}
