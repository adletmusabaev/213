package TicTacToe.model;

import java.util.Random;

public class AIPlayer extends Player {
    public AIPlayer(char symbol) {
        super(symbol);
    }

    public int[] makeMove(char[][] board) {
        Random rand = new Random();
        int row, col;

        do {
            row = rand.nextInt(3);
            col = rand.nextInt(3);
        } while (board[row][col] != '-');

        return new int[]{row, col};
    }
}