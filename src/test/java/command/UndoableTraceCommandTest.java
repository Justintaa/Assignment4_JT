package command;

import matrix.Matrix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import strategy.BresenhamStrategy;
import turtle.Pen;
import turtle.Turtle;

import static org.junit.jupiter.api.Assertions.*;

public class UndoableTraceCommandTest {
    private Turtle turtle;
    private Matrix matrix;

    @BeforeEach
    public void setUp() {
        matrix = new Matrix(40, 20);
        turtle = new Turtle(matrix, new Pen(new BresenhamStrategy()));
    }

    @Test
    public void testExecuteDraws() {
        UndoableTraceCommand cmd = new UndoableTraceCommand(turtle, 5);
        cmd.execute();

        boolean drawn = false;
        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 40; x++) {
                if (matrix.getCell(x, y) == '#') {
                    drawn = true;
                }
            }
        }
        assertTrue(drawn);
    }
}
