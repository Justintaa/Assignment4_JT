package command;

import matrix.Matrix;
import org.junit.jupiter.api.Test;
import strategy.BresenhamStrategy;
import turtle.Pen;
import turtle.Turtle;

import static org.junit.jupiter.api.Assertions.*;

public class SCommandTest {
    @Test
    public void testSCommandRuns() {
        Matrix matrix = new Matrix(40, 20);
        Turtle turtle = new Turtle(matrix, new Pen(new BresenhamStrategy()));

        Command cmd = new SCommand(turtle);
        assertDoesNotThrow(cmd::execute);
    }
}
