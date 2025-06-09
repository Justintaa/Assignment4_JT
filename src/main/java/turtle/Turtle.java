//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package turtle;

import matrix.Matrix;

public class Turtle {
    private double x;
    private double y;
    private double angle;
    private final Matrix matrix;
    private final Pen pen;

    public Turtle(Matrix matrix, Pen pen) {
        this.matrix = matrix;
        this.pen = pen;
        this.x = 0;
        this.y = 0;
        this.angle = 0;
    }

    public void move(double distance) {
        double newX = x + distance * Math.cos(Math.toRadians(angle));
        double newY = y + distance * Math.sin(Math.toRadians(angle));

        pen.draw(matrix, x, y, newX, newY);

        x = newX;
        y = newY;
    }

    public void turn(double degrees) {
        angle = (angle + degrees) % 360;
        if (angle < 0) angle += 360;
    }

    public void penUp() {
        pen.penUp();
    }

    public void penDown() {
        pen.penDown();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Matrix getMatrix() {
        return matrix;
    }
    public double getAngle() {
        return angle;
    }
}
