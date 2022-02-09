/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.krestikinoliki.renderer;

import skozik.krestikinoliki.exception.KrestikinolikiException;
import skozik.krestikinoliki.gamer.IGamer;
import skozik.krestikinoliki.field.IField;

public interface IRenderer {
    void draw(IField field) throws KrestikinolikiException;
    void warnGameHalt();
    void warnGamerWon(IGamer gamer);
    void warnGamerTurn(IGamer gamer);
    void warnGamerTurnAgain(IGamer gamer);
    void warnPositionUsed(int[] coordinates);
    void warnNoTurnsLeft();
    int[] askGamerForCoordinates();
    void logErrorMessage(String message);

}
