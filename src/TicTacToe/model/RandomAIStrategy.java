package TicTacToe.model;

import java.util.Random;

public class RandomAIStrategy implements AIStrategy {
    private final Random random = new Random();

    @Override
    public void executeMove(Board board, char symbol) {
        int row, col;
        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (!board.makeMove(row, col, symbol));
    }
}