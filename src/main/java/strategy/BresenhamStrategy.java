//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package strategy;

import matrix.Matrix;

/**
 * Implements the Bresenham line drawing algorithm.
 */
public class BresenhamStrategy implements DrawingStrategy {
    @Override
    public void drawLine(Matrix m, double x0, double y0, double x1, double y1) {
        double dx = Math.abs(x1 - x0);
        int sx = x0 < x1 ? 1 : -1;
        double dy = -Math.abs(y1 - y0);
        int sy = y0 < y1 ? 1 : -1;
        double error = dx + dy;

        double x = x0;
        double y = y0;

        while ((int) x != (int) x1 || (int) y != (int) y1) {
            m.setCell((int)Math.round(x), (int)Math.round(y), '#');
            double e2 = 2 * error;
            if (e2 >= dy) {
                if ((int) x == (int) x1) break;
                error += dy;
                x += sx;
            }
            if (e2 <= dx) {
                if ((int) y == (int) y1) break;
                error += dx;
                y += sy;
            }
        }
    }
}
