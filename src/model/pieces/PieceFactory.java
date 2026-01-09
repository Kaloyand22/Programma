package model.pieces;
import model.strategies.*;
import java.util.HashMap;
import java.util.Map;

public class PieceFactory {
    private static final Map<String, Piece> pieceCache = new HashMap<>();

    public static Piece createPiece(String type, String color) {
        String key = type + color;
        if (!pieceCache.containsKey(key)) {
            MoveStrategy strategy = type.equalsIgnoreCase("Pawn") ? new PawnMoveStrategy() : null;
            pieceCache.put(key, new Piece(type, color, strategy));
        }
        return pieceCache.get(key);
    }
}