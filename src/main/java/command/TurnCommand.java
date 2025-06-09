//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package command;

import turtle.Turtle;

public class TurnCommand implements Command {
    private final Turtle turtle;
    private final double angle;

    public TurnCommand(Turtle turtle, double angle) {
        this.turtle = turtle;
        this.angle = angle;
    }

    @Override
    public void execute() {
        turtle.turn(angle);
    }
}
