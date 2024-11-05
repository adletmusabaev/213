package TicTacToe.model;


public class AIPlayer extends Player {
    private final AIStrategy strategy;

    public AIPlayer(char symbol, AIStrategy strategy) {
        super(symbol);
        this.strategy = strategy;
    }

    @Override
    public void makeMove(Board board) {
        strategy.executeMove(board, symbol);
    }
}