package controller;

import controller.commands.Command;
import java.util.Stack;

public class GameEngine {
    private static GameEngine instance;
    private Stack<Command> history = new Stack<>();
    private String currentTurn = "White";

    private GameEngine() {}

    public static GameEngine getInstance() {
        if (instance == null) {
            instance = new GameEngine();
        }
        return instance;
    }

    public void executeMove(Command command) {
        command.execute();
        history.push(command);
        currentTurn = currentTurn.equals("White") ? "Black" : "White";
    }

    public void undoMove() {
        if (!history.isEmpty()) {
            Command lastMove = history.pop();
            lastMove.undo();
            currentTurn = currentTurn.equals("White") ? "Black" : "White";
        } else {
            System.out.println("Nothing to undo!");
        }
    }

    public String getCurrentTurn() { return currentTurn; }
}