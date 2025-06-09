package command;

import turtle.Turtle;

public class UndoablePenDownCommand implements UndoableCommand {
    private final Turtle turtle;

    public UndoablePenDownCommand(Turtle turtle) {
        this.turtle = turtle;
    }

    @Override
    public void execute() {
        turtle.penDown();
    }

    @Override
    public void undo() {
        turtle.penUp();
    }
}
