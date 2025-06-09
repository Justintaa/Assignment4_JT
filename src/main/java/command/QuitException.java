//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package command;

public class QuitException extends RuntimeException {
    public QuitException(String message) {
        super(message);
    }
}
