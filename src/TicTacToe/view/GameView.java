package TicTacToe.view;

import TicTacToe.model.Board;

public class GameView {
    private Board board;

    public GameView(Board board) {
        this.board = board;
    }

    public void displayBoard() {
        char[][] currentBoard = board.getBoard();
        for (int i = 0; i < currentBoard.length; i++) {
            for (int j = 0; j < currentBoard[i].length; j++) {
                System.out.print(currentBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}