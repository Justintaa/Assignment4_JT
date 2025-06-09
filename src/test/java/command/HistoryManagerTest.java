package command;

import matrix.Matrix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import strategy.BresenhamStrategy;
import turtle.Pen;
import turtle.Turtle;

import static org.junit.jupiter.api.Assertions.*;

public class HistoryManagerTest {
    private HistoryManager history;
    private Turtle turtle;

    @BeforeEach
    public void setUp() {
        history = new HistoryManager();
        turtle = new Turtle(new Matrix(40, 20), new Pen(new BresenhamStrategy()));
    }

    @Test
    public void testUndoRedo() {
        UndoableCommand move = new UndoableMoveCommand(turtle, 5);
        double startX = turtle.getX();

        history.execute(move);
        assertNotEquals(startX, turtle.getX());

        history.undo();
        assertEquals(startX, turtle.getX());

        history.redo();
        assertNotEquals(startX, turtle.getX());
    }
}
