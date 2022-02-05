/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.krestikinoliki.intelligence.victory;

import java.util.Arrays;
import java.util.List;

import skozik.krestikinoliki.intelligence.victory.symbol3condition2D.Symbol3Diagonal1;
import skozik.krestikinoliki.intelligence.victory.symbol3condition2D.Symbol3Diagonal2;
import skozik.krestikinoliki.intelligence.victory.symbol3condition2D.Symbol3HorizontalLine;
import skozik.krestikinoliki.intelligence.victory.symbol3condition2D.Symbol3VertialLine;

public final class VictoryConditionFactory {
    private static final List<VictoryCondition> victoryPatterns3Symbol2D = Arrays.asList(
        new Symbol3VertialLine(),
        new Symbol3HorizontalLine(),
        new Symbol3Diagonal1(),
        new Symbol3Diagonal2()
    );

    public static List<VictoryCondition> getVictoryConditions2DFor3Symbols() {
        return victoryPatterns3Symbol2D;
    }
}
