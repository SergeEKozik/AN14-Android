
/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.krestikinoliki.field;

import skozik.krestikinoliki.exception.KrestikinolikiException;

public interface IField {
    int[] getSize();
    char getSymbol(int[] coordinates) throws KrestikinolikiException;
    boolean setSymbol(char symbol, int[] coordinates) throws KrestikinolikiException;
    boolean hasEmptyCells();
    int[][] getEmptyCoordinates();
    char getDefaultSymbol();
}
