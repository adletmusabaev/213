package TicTacToe.model;

public class PlayerFactory {
    public Player createPlayer(String type, char symbol) {
        return switch (type) {
            case "HUMAN" -> new HumanPlayer(symbol);
            case "AI" -> new AIPlayer(symbol, new RandomAIStrategy());
            default -> throw new IllegalArgumentException("Unknown player type");
        };
    }
}