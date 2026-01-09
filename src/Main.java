import controller.GameEngine;
import controller.commands.MoveCommand;
import model.board.Board;
import model.pieces.PieceFactory;
import view.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        GameEngine engine = GameEngine.getInstance();
        Board board = new Board();
        ConsoleUI ui = new ConsoleUI();

        board.setPiece(0, 6, PieceFactory.createPiece("Pawn", "White"));

        System.out.println("--- Initial Board ---");
        ui.printBoard(board);

        int[] start = ui.parseCoordinates("a2");
        int[] end = ui.parseCoordinates("a3");

        MoveCommand move = new MoveCommand(board, start[0], start[1], end[0], end[1]);
        engine.executeMove(move);

        System.out.println("\nMove executed (a2 to a3)!");
        ui.printBoard(board);

        engine.undoMove();
        System.out.println("\nMove undone!");
        ui.printBoard(board);
    }
}