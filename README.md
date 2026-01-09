# Programma

Software Design - Part 2

## Kaloyan Dimitrov and Marcell Nemes

First part:
Creational Design Patterns

Factory Method

Chess pieces are created through a PieceFactory class instead of using direct constructors like new Pawn().
The factory method createPiece(type, color) is responsible for deciding which concrete piece object to create.
This approach centralizes object creation and makes the code easier to extend when adding new piece types.

Singleton

The GameEngine class is implemented using the Singleton pattern.
It has a private constructor and a public getInstance() method, ensuring that only one instance of the game engine exists.
This is appropriate because there should only be one component controlling the game rules and state at any time.

Second part:
Structural patterns

Flyweight

The Flyweight pattern is used to reduce duplication of identical chess piece data.
Instead of creating separate objects for pieces with the same intrinsic properties (such as type, symbol, color, and move logic), these shared properties are stored in a single Flyweight object.
Only the extrinsic state (board position) is stored separately by the board.
This reduces unnecessary object creation and keeps the design efficient and well-structured.
