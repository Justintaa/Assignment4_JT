package command;

import turtle.Turtle;

public class UndoableTraceCommand implements UndoableCommand {
    private final Turtle turtle;
    private final double distance;

    public UndoableTraceCommand(Turtle turtle, double distance) {
        this.turtle = turtle;
        this.distance = distance;
    }

    @Override
    public void execute() {
        turtle.penDown();
        turtle.move(distance);
    }

    @Override
    public void undo() {
        turtle.penUp();
        turtle.move(-distance);
    }
}
