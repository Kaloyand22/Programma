package model.strategies;
import model.board.Board;

public class PawnMoveStrategy implements MoveStrategy {
    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, Board board) {
        return startX == endX && Math.abs(startY - endY) == 1;
    }
}