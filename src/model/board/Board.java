package model.board;

import model.pieces.Piece;

public class Board {
    private Piece[][] grid;

    public Board() {
        this.grid = new Piece[8][8];
    }

    public void setPiece(int x, int y, Piece piece) {
        grid[x][y] = piece;
    }

    public Piece getPiece(int x, int y) {
        return grid[x][y];
    }

    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }
}