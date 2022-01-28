package skozik.lesson3.game;

public interface Field {
    int[] getSize();
    char getSymbol(Integer... coordinates);
    void setSymbol(char symbol, Integer... coordinates);
    void draw();
    boolean hasEmptyCells();
}
