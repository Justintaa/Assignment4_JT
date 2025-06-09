package command;

import matrix.Matrix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import strategy.BresenhamStrategy;
import turtle.Pen;
import turtle.Turtle;

import static org.junit.jupiter.api.Assertions.*;

public class UndoableMoveCommandTest {
    private Turtle turtle;

    @BeforeEach
    public void setUp() {
        Matrix matrix = new Matrix(40, 20);
        Pen pen = new Pen(new BresenhamStrategy());
        turtle = new Turtle(matrix, pen);
    }

    @Test
    public void testExecuteAndUndo() {
        UndoableMoveCommand move = new UndoableMoveCommand(turtle, 5);
        double startX = turtle.getX();
        double startY = turtle.getY();

        move.execute();
        assertNotEquals(startX, turtle.getX());
        assertEquals(startY, turtle.getY(), 0.01);

        move.undo();
        assertEquals(startX, turtle.getX(), 0.01);
        assertEquals(startY, turtle.getY(), 0.01);
    }
}
