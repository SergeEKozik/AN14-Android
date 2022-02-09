
/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.krestikinoliki;

import static skozik.krestikinoliki.common.KrestikiNolikiConstants.*;

import skozik.krestikinoliki.field.Field2D;
import skozik.krestikinoliki.field.IField;
import skozik.krestikinoliki.gamer.Gamer;
import skozik.krestikinoliki.gamer.GamerAI;
import skozik.krestikinoliki.gamer.IGamer;
import skozik.krestikinoliki.intelligence.IIntelligence;
import skozik.krestikinoliki.intelligence.Intelligence2D;
import skozik.krestikinoliki.renderer.ConsoleRenderer;
import skozik.krestikinoliki.renderer.IRenderer;

public class Game {

    private static IRenderer renderer = new ConsoleRenderer(PLACES_PER_SYMBOL);
    private static IIntelligence intelligence = new Intelligence2D(MAX_FORECAST_LEVEL);

    public static void main(String[] args) {
        IField field = new Field2D(DEFAULT_SYMBOL, SIZE_X, SIZE_Y);
        IGamer gamer1 = new Gamer(PLAYER1_SYMBOL, PLAYER_1_DEFAULT_NAME);
        IGamer gamer2 = new GamerAI(PLAYER2_SYMBOL, PLAYER_2_DEFAULT_NAME);
        startGame(gamer1, gamer2, field);
    }

    private static void startGame(IGamer gamer1, IGamer gamer2, IField field) {
        IGamer currentGamer = gamer1;
        IGamer otherGamer = gamer2;
        while (makeTurn(field, currentGamer, otherGamer)) {
            if (currentGamer == gamer1) {
                currentGamer = gamer2;
                otherGamer = gamer1;
            } else {
                currentGamer = gamer1;
                otherGamer = gamer2;
            }
        }
    }

    private static boolean makeTurn(IField field, IGamer gamer, IGamer enemy) {
        renderer.draw(field);
        if (!askForTurn(gamer, field, enemy)) {
            renderer.warnGameHalt();
            return false;
        }
        return !isGameOver(gamer, field);
    }

    private static boolean askForTurn(IGamer gamer, IField field, IGamer enemy) {
        renderer.warnGamerTurn(gamer);
        return (gamer instanceof GamerAI) ?
            askForTurnAI(gamer, field, enemy)
            : askForTurnHuman(gamer, field, enemy);
    }

    private static boolean askForTurnAI(IGamer gamer, IField field, IGamer enemy) {
        int[] coordinates = intelligence.forecastNextStep(field, gamer, enemy);
        if (!field.setSymbol(gamer.getSymbol(), coordinates)) {
            throw new RuntimeException(
                String.format(LOG_MESSAGE_AI_TURN_ERROR, coordinates[0], coordinates[1]));
        }
        return true;
    }

    private static boolean askForTurnHuman(IGamer gamer, IField field, IGamer enemy) {
        int[] userInput = renderer.askGamerForCoordinates();
        while (userInput.length > 0) {
            if (field.setSymbol(gamer.getSymbol(), userInput)) {
                return true;
            }
            renderer.warnPositionUsed(userInput);
            renderer.warnGamerTurnAgain(gamer);
            userInput = renderer.askGamerForCoordinates();
        }
        return false;
    }

    private static boolean isGameOver(IGamer currentGamer, IField field) {
        if (!field.hasEmptyCells()) {
            renderer.draw(field);
            renderer.warnNoTurnsLeft();
            return true;
        }
        if (intelligence.hasVictoryCondition(currentGamer, field)) {
            renderer.draw(field);
            renderer.warnGamerWon(currentGamer);
            return true;
        }
        return false;
    }
}