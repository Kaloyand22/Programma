# Programma

Software Design - Part 2

## Kaloyan Dimitrov and Marcell Nemes

Kaloyan- I was responsible for implementing the core structure of the chess application.
This included setting up the main program flow (Main), creating the console-based user interfacea and implementing the board logic..

I also implemented the Piece abstraction and the PieceFactory, which handles the creation of chess pieces in a centralized way.
While working with Marcell, we helped each other and it was interesting to develop a program like that.

Marcell- I made the game engine, the commands and strategies. Basically, the core functionality of the application. I also helped 
Kaloyan a lot with how the foundations of the app should be put together, including the Board's functionality/logic.
Overall, I had a great time developing this fun little "game" with Kaloyan, he was reliable to work with.

First part:
### Creational Design Patterns

Factory Method

Chess pieces are created through a PieceFactory class instead of using direct constructors like new Pawn().
The factory method createPiece(type, color) is responsible for deciding which concrete piece object to create.
This approach centralizes object creation and makes the code easier to extend when adding new piece types.

Singleton

The GameEngine class is implemented using the Singleton pattern.
It has a private constructor and a public getInstance() method, ensuring that only one instance of the game engine exists.
This is appropriate because there should only be one component controlling the game rules and state at any time.

Second part:
### Structural patterns

Flyweight

The Flyweight pattern is used to reduce duplication of identical chess piece data.
Instead of creating separate objects for pieces with the same intrinsic properties (such as type, symbol, color, and move logic), these shared properties are stored in a single Flyweight object.
Only the extrinsic state (board position) is stored separately by the board.
This reduces unnecessary object creation and keeps the design efficient and well-structured.

Adapter

An Adapter is used to translate user input into a format usable by the game engine.
Players enter moves using standard algebraic notation (e.g. "e2 to e4"), while the engine operates on board indices.
The adapter converts user-friendly input into engine-friendly coordinates without changing the engine logic.

This cleanly separates input handling from core game logic.

Third part:
### Behavioral Design Patterns
Command

The Command pattern is used to encapsulate each chess move as a separate object.
Every move is represented by a MoveCommand that provides execute() and undo() methods.
This allows moves to be executed, undone, or redone without tightly coupling the game logic to the move history.

This design cleanly supports features such as undo/redo and improves control over game flow.

Strategy

The Strategy pattern is used to define movement rules for chess pieces.
Each piece delegates its movement logic to a MoveStrategy (for example, diagonal movement or L-shaped movement).
Different strategies can be swapped without modifying the piece classes themselves.

This avoids large conditional statements and keeps the design flexible and compliant with the Open–Closed Principle.
