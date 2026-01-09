package controller.commands;
import model.board.Board;
import model.pieces.Piece;

public class MoveCommand implements Command {
    private Board board;
    private int x1, y1, x2, y2;
    private Piece movedPiece;
    private Piece capturedPiece;

    public MoveCommand(Board board, int x1, int y1, int x2, int y2) {
        this.board = board;
        this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;
    }

    @Override
    public void execute() {
        movedPiece = board.getPiece(x1, y1);
        capturedPiece = board.getPiece(x2, y2);
        board.setPiece(x2, y2, movedPiece);
        board.setPiece(x1, y1, null);
    }

    @Override
    public void undo() {
        board.setPiece(x1, y1, movedPiece);
        board.setPiece(x2, y2, capturedPiece);
    }
}