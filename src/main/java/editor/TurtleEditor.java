//------------------------------------------------------
// Assignment 4
// Written by: Justin Ta, 2148824
// For SOEN350 Section 610 – Spring 2025
//------------------------------------------------------

package editor;

import command.*;
import matrix.Matrix;
import strategy.BresenhamStrategy;
import turtle.Pen;
import turtle.Turtle;

import java.util.Scanner;

/**
 * REPL (Read-Eval-Print Loop) for the Turtle Graphics Editor.
 */
public class TurtleEditor {
    public static void main(String[] args) {
        System.out.println("Welcome to the Turtle Graphics Editor!");
        Scanner scanner = new Scanner(System.in);

        Matrix matrix = new Matrix(40, 20); // width x height
        Pen pen = new Pen(new BresenhamStrategy());
        Turtle turtle = new Turtle(matrix, pen);
        HistoryManager history = new HistoryManager();

        while (true) {
            try {
                System.out.print("> ");
                String input = scanner.nextLine().trim();
                String[] tokens = input.split("\\s+");

                if (tokens.length == 0 || tokens[0].isEmpty()) {
                    continue;
                }

                String command = tokens[0].toLowerCase();
                Command cmd;

                switch (command) {
                    case "quit":
                        cmd = new QuitCommand();
                        break;
                    case "show":
                        cmd = new ShowCommand(turtle);
                        break;
                    case "undo":
                        cmd = new UndoCommand(history);
                        break;
                    case "redo":
                        cmd = new RedoCommand(history);
                        break;
                    case "rect":
                        cmd = new RectangleCommand(turtle, 10, 5);
                        cmd.execute();
                        continue;
                    case "move":
                        cmd = new UndoableMoveCommand(turtle, Double.parseDouble(tokens[1]));
                        history.execute((UndoableCommand) cmd);
                        continue;
                    case "s":
                        cmd = new SCommand(turtle);
                        cmd.execute();
                        continue;
                    case "e":
                        cmd = new ECommand(turtle);
                        cmd.execute();
                        continue;
                    case "trace":
                        cmd = new UndoableTraceCommand(turtle, Double.parseDouble(tokens[1]));
                        history.execute((UndoableCommand) cmd);
                        continue;
                    case "turn":
                        cmd = new UndoableTurnCommand(turtle, Double.parseDouble(tokens[1]));
                        history.execute((UndoableCommand) cmd);
                        continue;
                    case "zero":
                        cmd = new Digit0Command(turtle);
                        cmd.execute();
                        continue;
                    default:
                        System.out.println("Unknown command.");
                        continue;
                }

                cmd.execute();

            } catch (QuitException qe) {
                System.out.println(qe.getMessage());
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Thanks for using the Turtle Graphics Editor. Goodbye!");
    }
}
