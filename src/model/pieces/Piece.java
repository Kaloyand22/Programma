package model.pieces;
import model.strategies.MoveStrategy;

public class Piece {
    private final String color;
    private final String name;
    private MoveStrategy moveStrategy;

    public Piece(String name, String color, MoveStrategy strategy) {
        this.name = name;
        this.color = color;
        this.moveStrategy = strategy;
    }

    public String getName() { return name; }
    public String getColor() { return color; }
    public MoveStrategy getMoveStrategy() { return moveStrategy; }
}