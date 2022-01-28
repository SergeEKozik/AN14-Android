package skozik.lesson3.game;

import java.util.Arrays;
import java.util.List;

public class Intelligence2D implements Intelligence {

    private List<VictoryCondition> victoryPatterns = Arrays.asList(
        //vertical line
        (field, symbol, coordinates) -> {
            int sizeY = field.getSize()[1];
            if ((coordinates[1] <= 0) || (coordinates[1] >= sizeY - 1)) {
                return false;
            }
            return ((field.getSymbol(coordinates[0], coordinates[1]) == symbol)
                && (field.getSymbol(coordinates[0], coordinates[1] - 1) == symbol)
                && (field.getSymbol(coordinates[0], coordinates[1] + 1) == symbol));
        },
        //horizontal line
        (field, symbol, coordinates) -> {
            int sizeX = field.getSize()[0];
            if ((coordinates[0] <= 0) || (coordinates[0] >= sizeX - 1)) {
                return false;
            }
            return ((field.getSymbol(coordinates[0], coordinates[1]) == symbol)
                && (field.getSymbol(coordinates[0] - 1, coordinates[1]) == symbol)
                && (field.getSymbol(coordinates[0] + 1, coordinates[1]) == symbol));
        },
        //diagonal line 1
        (field, symbol, coordinates) -> {
            int[] size = field.getSize();
            int sizeX = size[0];
            int sizeY = size[1];
            if ((coordinates[0] <= 0)
                || (coordinates[0] >= sizeX - 1)
                || (coordinates[1] <= 0)
                || (coordinates[1] >= sizeY - 1)) {
                return false;
            }
            return ((field.getSymbol(coordinates[0], coordinates[1]) == symbol)
                && (field.getSymbol(coordinates[0] - 1, coordinates[1] - 1) == symbol)
                && (field.getSymbol(coordinates[0] + 1, coordinates[1] + 1) == symbol));
        },
        //diagonal line 2
        (field, symbol, coordinates) -> {
            int[] size = field.getSize();
            int sizeX = size[0];
            int sizeY = size[1];
            if ((coordinates[0] <= 0)
                || (coordinates[0] >= sizeX - 1)
                || (coordinates[1] <= 0)
                || (coordinates[1] >= sizeY - 1)) {
                return false;
            }
            return ((field.getSymbol(coordinates[0], coordinates[1]) == symbol)
                && (field.getSymbol(coordinates[0] - 1, coordinates[1] + 1) == symbol)
                && (field.getSymbol(coordinates[0] + 1, coordinates[1] - 1) == symbol));
        }
    );

    @Override
    public boolean hasVictoryCondition(char symbol, Field field) {
        int[] size = field.getSize();
        for (int i = 0; i < size[0]; i++) {
            for (int j = 0; j < size[1]; j++) {
                final int[] coordinates = new int[]{i, j};
                if (victoryPatterns.stream()
                    .anyMatch(condition -> condition.apply(field, symbol, coordinates))) {
                    return true;
                }
            }
        }
        return false;
    }
}
