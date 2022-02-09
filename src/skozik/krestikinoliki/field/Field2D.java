
/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.krestikinoliki.field;

import static skozik.krestikinoliki.common.KrestikiNolikiConstants.LOG_FIELD_COORDINATE_EXCEEDS_DIMENSIONS;
import static skozik.krestikinoliki.common.KrestikiNolikiConstants.LOG_FIELD_COORDINATE_EXCEEDS_SIZE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import skozik.krestikinoliki.exception.KrestikinolikiException;

public class Field2D implements IField {

    protected char defaultSymbol = ' ';
    protected char[][] field;
    private int sizeX = 0;
    private int sizeY = 0;

    public Field2D() {
    }

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

    public Field2D(IField otherField) {
        this();
        if (otherField instanceof Field2D) {
            Field2D field2D = (Field2D) otherField;
            this.defaultSymbol = field2D.defaultSymbol;
            this.sizeX = field2D.sizeX;
            this.sizeY = field2D.sizeY;
            field = new char[sizeX][sizeY];
            for (int i = 0; i < sizeX; i++) {
                field[i] = Arrays.copyOf(field2D.field[i], field2D.field[i].length);
            }
        }
    }

    @Override
    public int[] getSize() {
        return new int[]{sizeX, sizeY};
    }

    @Override
    public char getSymbol(int[] coordinates) throws KrestikinolikiException {
        validateCoordinates(coordinates);
        return field[coordinates[0]][coordinates[1]];
    }

    @Override
    public boolean setSymbol(char symbol, int[] coordinates) throws KrestikinolikiException {
        validateCoordinates(coordinates);
        if (defaultSymbol == field[coordinates[0]][coordinates[1]]) {
            field[coordinates[0]][coordinates[1]] = symbol;
            return true;
        }
        return false;
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
    public int[][] getEmptyCoordinates() {
        List<int[]> resultList = new ArrayList<>();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (defaultSymbol == field[i][j]) {
                    resultList.add(new int[]{i, j});
                }
            }
        }
        int[][] result = new int[resultList.size()][];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    @Override
    public char getDefaultSymbol() {
        return defaultSymbol;
    }

    protected void validateCoordinates(int[] coordinates)  throws KrestikinolikiException {
        if ((coordinates == null) || (coordinates.length != 2)) {
            throw new KrestikinolikiException(LOG_FIELD_COORDINATE_EXCEEDS_DIMENSIONS, coordinates);
        }
        if ((coordinates[0] < 0)
            || (coordinates[0] > sizeX - 1)
            || (coordinates[1] < 0)
            || (coordinates[1] > sizeY - 1)) {
            throw new KrestikinolikiException(LOG_FIELD_COORDINATE_EXCEEDS_SIZE, coordinates);
        }
    }
}