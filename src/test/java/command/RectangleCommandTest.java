package command;

import matrix.Matrix;
import org.junit.jupiter.api.Test;
import strategy.BresenhamStrategy;
import turtle.Pen;
import turtle.Turtle;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleCommandTest {
    @Test
    public void testRectangleCommandRuns() {
        Matrix matrix = new Matrix(40, 20);
        Turtle turtle = new Turtle(matrix, new Pen(new BresenhamStrategy()));

        RectangleCommand cmd = new RectangleCommand(turtle, 5, 3);
        assertDoesNotThrow(cmd::execute);
    }
}
