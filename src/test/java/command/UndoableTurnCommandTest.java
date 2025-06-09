package command;

import matrix.Matrix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import strategy.BresenhamStrategy;
import turtle.Pen;
import turtle.Turtle;

import static org.junit.jupiter.api.Assertions.*;

public class UndoableTurnCommandTest {
    private Turtle turtle;

    @BeforeEach
    public void setUp() {
        turtle = new Turtle(new Matrix(40, 20), new Pen(new BresenhamStrategy()));
    }

    @Test
    public void testExecuteAndUndo() {
        double originalAngle = turtle.getAngle();
        UndoableTurnCommand cmd = new UndoableTurnCommand(turtle, 90);

        cmd.execute();
        assertNotEquals(originalAngle, turtle.getAngle());

        cmd.undo();
        assertEquals(originalAngle, turtle.getAngle(), 0.001);
    }
}
