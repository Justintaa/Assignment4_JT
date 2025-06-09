//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package matrix;

/**
 * Matrix class for storing characters in a 2D grid.
 * Used for drawing in the Turtle Graphics Editor.
 */
public class Matrix {
    private final int width;
    private final int height;
    private final char[][] grid;

    public Matrix(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new char[height][width];
        clear();
    }

    public void setCell(int x, int y, char c) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            grid[height - y - 1][x] = c;
        }
    }

    public char getCell(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            return grid[height - y - 1][x];
        }
        return ' ';
    }

    public void clear() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char[] row : grid) {
            for (char c : row) {
                sb.append(c);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
