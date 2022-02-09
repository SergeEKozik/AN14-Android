
/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.krestikinoliki.field;

public interface IField {
    int[] getSize();
    char getSymbol(int[] coordinates);
    boolean setSymbol(char symbol, int[] coordinates);
    boolean hasEmptyCells();
    int[][] getEmptyCoordinates();
    char getDefaultSymbol();
}
