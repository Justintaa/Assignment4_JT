//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package command;

import turtle.Turtle;

public class ShowCommand implements Command {
    private final Turtle turtle;

    public ShowCommand(Turtle turtle) {
        this.turtle = turtle;
    }

    @Override
    public void execute() {
        System.out.println(turtle.getMatrix());
    }
}
