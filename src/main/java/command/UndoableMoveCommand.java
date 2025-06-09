//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package command;

import turtle.Turtle;

public class UndoableMoveCommand implements UndoableCommand {
    private final Turtle turtle;
    private final double distance;
    private double startX, startY;

    public UndoableMoveCommand(Turtle turtle, double distance) {
        this.turtle = turtle;
        this.distance = distance;
    }

    @Override
    public void execute() {
        startX = turtle.getX();
        startY = turtle.getY();
        turtle.penUp();
        turtle.move(distance);
    }

    @Override
    public void undo() {
        turtle.penUp();
        turtle.move(-distance);
    }
}
