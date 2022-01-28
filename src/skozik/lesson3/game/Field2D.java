package skozik.lesson3.game;

public class Field2D implements Field {

    private char defaultSymbol;
    private char[][] field;
    private int sizeX;
    private int sizeY;

    public Field2D(char defaultSymbol, int sizeX, int sizeY) {
        this.defaultSymbol = defaultSymbol;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        field = new char[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                field[i][j] = defaultSymbol;
            }
        }
    }

    @Override
    public int[] getSize() {
        return new int[] {sizeX, sizeY};
    }

    @Override
    public char getSymbol(Integer... coordinates) {
        validateCoordinates(coordinates);
        return field[coordinates[0]][coordinates[1]];
    }

    @Override
    public void setSymbol(char symbol, Integer... coordinates) {
        validateCoordinates(coordinates);
        field[coordinates[0]][coordinates[1]] = symbol;
    }

    @Override
    public boolean hasEmptyCells() {
        boolean hasEmptyCell = false;
        for (char[] row : field) {
            for (char cellSymbol : row) {
                if (defaultSymbol == cellSymbol) {
                    hasEmptyCell = true;
                    break;
                }
            }
        }
        return hasEmptyCell;
    }

    @Override
    public void draw() {
        int size = field.length;
        drawTopLine(size);
        for (int i = 0; i < size; i++) {
            drawMiddleLine(i, field);
        }
        drawBottomLine(size);
    }

    private void drawTopLine(int size) {
        System.out.println("  012");
        System.out.print(" \u250C");
        for (int i = 0; i < size; i++) {
            System.out.print("\u2500");
        }
        System.out.println("\u2510");
    }

    private void drawBottomLine(int size) {
        System.out.print(" \u2514");
        for (int i = 0; i < size; i++) {
            System.out.print("\u2500");
        }
        System.out.println("\u2519");
    }

    private void drawMiddleLine(int lineNumber, char[][] field) {
        System.out.print(lineNumber);
        System.out.print("\u2502");
        for (char symbol : field[lineNumber]) {
            System.out.print(symbol);
        }
        System.out.println("\u2502");
    }

    private void validateCoordinates(Integer... coordinates) {
        if ((coordinates == null) || (coordinates.length != 2)) {
            throw new RuntimeException("Coordinates are not equal to field dimensions");
        }
        if ((coordinates[0] < 0)
            || (coordinates[0] > sizeX - 1)
            || (coordinates[1] < 0)
            || (coordinates[1] > sizeY - 1)) {
            throw new RuntimeException("Coordinates are out of field size");
        }
    }
}
