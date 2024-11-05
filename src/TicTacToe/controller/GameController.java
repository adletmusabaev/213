package TicTacToe.controller;

import TicTacToe.model.Board;
import TicTacToe.view.GameView;
import java.util.Scanner;

public class GameController {
    private final Board board;
    private final GameView view;
    private final Scanner scanner;

    public GameController() {
        this.board = new Board();
        this.view = new GameView(board);
        this.scanner = new Scanner(System.in);
    }

    public void startGame() {
        char currentPlayer = 'X';
        boolean gameWon = false;

        view.displayBoard();

        while (!gameWon && !board.isFull()) {
            System.out.println("Player " + currentPlayer + "'s turn. Enter row and column (0, 1, or 2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (board.makeMove(row, col, currentPlayer)) {
                view.displayBoard();

                if (board.checkWin(currentPlayer)) {
                    view.displayMessage("Player " + currentPlayer + " wins!");
                    gameWon = true;
                } else {
                    // Switch player
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                view.displayMessage("Invalid move. Try again.");
            }
        }

        if (!gameWon) {
            view.displayMessage("It's a tie!");
        }
    }
}