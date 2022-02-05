/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.krestikinoliki.intelligence.victory.symbol3condition2D;

import skozik.krestikinoliki.field.IField;
import skozik.krestikinoliki.intelligence.victory.VictoryCondition;

public class Symbol3Diagonal1 implements VictoryCondition {

    @Override
    public boolean apply(IField field, char symbol, int[] coordinates) {
        int[] size = field.getSize();
        int sizeX = size[0];
        int sizeY = size[1];
        if ((coordinates[0] <= 0)
            || (coordinates[0] >= sizeX - 1)
            || (coordinates[1] <= 0)
            || (coordinates[1] >= sizeY - 1)) {
            return false;
        }
        return ((field.getSymbol(coordinates) == symbol)
            && (field.getSymbol(new int[]{coordinates[0] - 1, coordinates[1] - 1}) == symbol)
            && (field.getSymbol(new int[]{coordinates[0] + 1, coordinates[1] + 1}) == symbol));
    }
}