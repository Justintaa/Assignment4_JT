package command;

import turtle.Turtle;

public class ECommand extends CompositeCommand {
    public ECommand(Turtle turtle) {
        // Step 1: trace 2 (→)
        addCommand(new UndoableTraceCommand(turtle, 2));

        // Step 2: turn 180
        addCommand(new UndoableTurnCommand(turtle, 180));

        // Step 3-4: trace 2 (←)
        addCommand(new UndoableTraceCommand(turtle, 2));

        // Step 5: turn -90 (↑)
        addCommand(new UndoableTurnCommand(turtle, -90));

        // Step 6-7: trace 2 (↑)
        addCommand(new UndoableTraceCommand(turtle, 2));

        // Step 8: turn -90 (←)
        addCommand(new UndoableTurnCommand(turtle, -90));

        // Step 9: trace 2 (←)
        addCommand(new UndoableTraceCommand(turtle, 2));

        // Step 10: turn 180 (→)
        addCommand(new UndoableTurnCommand(turtle, 180));

        // Step 11: trace 2 (→)
        addCommand(new UndoableTraceCommand(turtle, 2));

        // Step 12: turn -90 (↑)
        addCommand(new UndoableTurnCommand(turtle, -90));

        // Step 13: trace 2 (↑)
        addCommand(new UndoableTraceCommand(turtle, 2));

        // Step 14: turn -90 (←)
        addCommand(new UndoableTurnCommand(turtle, -90));

        // Step 15: trace 2 (←)
        addCommand(new UndoableTraceCommand(turtle, 3));
    }
}