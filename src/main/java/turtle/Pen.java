//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package turtle;

import matrix.Matrix;
import strategy.DrawingStrategy;

/**
 * The Pen class acts as the context in the Strategy pattern.
 * It uses a DrawingStrategy to draw lines on a Matrix.
 */
public class Pen {
    private DrawingStrategy strategy;
    private boolean isDown;

    public Pen(DrawingStrategy strategy) {
        this.strategy = strategy;
        this.isDown = false;
    }

    public void setStrategy(DrawingStrategy strategy) {
        this.strategy = strategy;
    }

    public void penDown() {
        isDown = true;
    }

    public void penUp() {
        isDown = false;
    }

    public boolean isPenDown() {
        return isDown;
    }

    public void draw(Matrix m, double x0, double y0, double x1, double y1) {
        if (isDown && strategy != null) {
            strategy.drawLine(m, x0, y0, x1, y1);
        }
    }
}
