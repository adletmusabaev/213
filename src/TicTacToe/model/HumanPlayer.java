package TicTacToe.model;


import java.util.Scanner;

public class HumanPlayer extends Player {
    private final Scanner scanner;

    public HumanPlayer(char symbol) {
        super(symbol);
        scanner = new Scanner(System.in);
    }

    @Override
    public void makeMove(Board board) {
        int row, col;
        boolean validMove = false;

        do {
            System.out.println("Enter your move (row and column from 1 to 3): ");
            row = scanner.nextInt() - 1; // Преобразуем в индексы от 0 до 2
            col = scanner.nextInt() - 1;

            if (row >= 0 && row < 3 && col >= 0 && col < 3) {
                validMove = board.makeMove(row, col, symbol);
                if (!validMove) {
                    System.out.println("Cell already occupied. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter row and column between 1 and 3.");
            }
        } while (!validMove);
    }
}