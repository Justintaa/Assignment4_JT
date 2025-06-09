package command;

import matrix.Matrix;
import org.junit.jupiter.api.Test;
import strategy.BresenhamStrategy;
import turtle.Pen;
import turtle.Turtle;

import static org.junit.jupiter.api.Assertions.*;

public class SE350CommandTest {
    @Test
    public void testExecuteDoesNotThrow() {
        Turtle turtle = new Turtle(new Matrix(40, 20), new Pen(new BresenhamStrategy()));
        SE350Command command = new SE350Command(turtle);
        assertDoesNotThrow(command::execute);
    }
}
