/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.krestikinoliki.intelligence.victory.symbol3condition2D;

import skozik.krestikinoliki.field.IField;
import skozik.krestikinoliki.intelligence.victory.VictoryCondition;

public class Symbol3VertialLine implements VictoryCondition {
    @Override
    public boolean apply(IField field, char symbol, int[] coordinates) {
        int sizeY = field.getSize()[1];
        if ((coordinates[1] <= 0) || (coordinates[1] >= sizeY - 1)) {
            return false;
        }
        return ((field.getSymbol(coordinates) == symbol)
            && (field.getSymbol(new int[]{coordinates[0], coordinates[1] - 1}) == symbol)
            && (field.getSymbol(new int[]{coordinates[0], coordinates[1] + 1}) == symbol));
    }
}
