package view;

import model.board.Board;
import model.pieces.Piece;

public class ConsoleUI {

    public int[] parseCoordinates(String input) {
        if (input.length() != 2) return null;
        int x = input.toLowerCase().charAt(0) - 'a'; 
        int y = 8 - Character.getNumericValue(input.charAt(1)); 
        return new int[]{x, y};
    }

    public void printBoard(Board board) {
        System.out.println("\n   a b c d e f g h");
        System.out.println("  -----------------");
        for (int y = 0; y < 8; y++) {
            System.out.print((8 - y) + "| ");
            for (int x = 0; x < 8; x++) {
                Piece p = board.getPiece(x, y);
                if (p == null) {
                    System.out.print(". ");
                } else {
                    String symbol = p.getName().substring(0, 1);
                    System.out.print(symbol + " ");
                }
            }
            System.out.println("|" + (8 - y));
        }
        System.out.println("  -----------------");
        System.out.println("   a b c d e f g h");
    }
}