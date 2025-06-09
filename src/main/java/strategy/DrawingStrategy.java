//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package strategy;

import matrix.Matrix;

/**
 * Strategy interface for line drawing algorithms.
 */
public interface DrawingStrategy {
    void drawLine(Matrix m, double x0, double y0, double x1, double y1);
}
