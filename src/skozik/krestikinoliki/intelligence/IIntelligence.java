/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.krestikinoliki.intelligence;

import skozik.krestikinoliki.field.IField;
import skozik.krestikinoliki.gamer.IGamer;

public interface IIntelligence {
    boolean hasVictoryCondition(IGamer gamer, IField field);
    int[] forecastNextStep(IField field, IGamer gamer, IGamer enemy);
}
