package strategy;

import matrix.Matrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BresenhamStrategyTest {
    @Test
    public void testDrawLine() {
        Matrix matrix = new Matrix(10, 10);
        DrawingStrategy strategy = new BresenhamStrategy();

        strategy.drawLine(matrix, 0, 0, 5, 5);

        boolean drawn = false;
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (matrix.getCell(x, y) == '#') {
                    drawn = true;
                }
            }
        }
        assertTrue(drawn);
    }
}
