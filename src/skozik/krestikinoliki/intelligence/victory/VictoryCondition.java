
/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.krestikinoliki.intelligence.victory;

import skozik.krestikinoliki.field.IField;

@FunctionalInterface
public interface VictoryCondition {
    boolean apply(IField field, char symbol, int[] coordinates);
}