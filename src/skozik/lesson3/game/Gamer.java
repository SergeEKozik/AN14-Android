package skozik.lesson3.game;

public class Gamer {
    private char symbol;
    private String name;

    public Gamer(char symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}
