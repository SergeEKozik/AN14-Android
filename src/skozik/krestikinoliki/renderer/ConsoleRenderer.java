/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.krestikinoliki.renderer;

import static skozik.krestikinoliki.common.KrestikiNolikiConstants.*;

import java.util.Scanner;

import skozik.krestikinoliki.exception.KrestikinolikiException;
import skozik.krestikinoliki.gamer.IGamer;
import skozik.krestikinoliki.field.Field2D;
import skozik.krestikinoliki.field.IField;

public class ConsoleRenderer implements IRenderer {

    private static Scanner scanner = new Scanner(System.in);

    private int placesPerSymbol;
    private String digitsPerSymbolFormat;
    private String symbolPerSymbolFormat;

    public ConsoleRenderer() {
        this.placesPerSymbol = PLACES_PER_SYMBOL;
        this.digitsPerSymbolFormat = "%" + this.placesPerSymbol + "d";
        this.symbolPerSymbolFormat = "%" + this.placesPerSymbol + "s";
    }

    public ConsoleRenderer(int placesPerSymbol) {
        this.placesPerSymbol = placesPerSymbol;
        this.digitsPerSymbolFormat = "%" + this.placesPerSymbol + "d";
        this.symbolPerSymbolFormat = "%" + this.placesPerSymbol + "s";
    }

    @Override
    public void draw(IField field) throws KrestikinolikiException {
        if (field instanceof Field2D) {
            this.draw2D((Field2D) field);
        } else {
            throw new KrestikinolikiException(LOG_FIELD_CAST_ERROR);
        }
    }

    @Override
    public void warnGameHalt() {
        System.out.println(CONSOLE_MSG_GAME_HALTED);
    }

    @Override
    public void warnGamerWon(IGamer gamer) {
        System.out.printf(CONSOLE_MSG_PLAYER_WON, gamer.getName());
    }

    @Override
    public void warnGamerTurn(IGamer gamer) {
        System.out.printf(CONSOLE_MSG_PLAYER_TURN, gamer.getName());
    }

    @Override
    public void warnGamerTurnAgain(IGamer gamer) {
        System.out.printf(CONSOLE_MSG_PLAYER_TURN_AGAIN, gamer.getName());
    }

    @Override
    public void warnPositionUsed(int[] coordinates) {
        System.out.printf(CONSOLE_MSG_POSITION_USED, coordinates[0], coordinates[1]);
    }

    @Override
    public void warnNoTurnsLeft() {
        System.out.println(CONSOLE_MSG_NO_FREE_POSITIONS);
    }

    /**
     * Non thread-safe!
     */
    @Override
    public int[] askGamerForCoordinates() {
        if (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            return new int[]{x, y};
        }
        return new int[0];
    }

    @Override
    public void logErrorMessage(String message) {
        System.out.println(message);
    }

    private void draw2D(Field2D field) throws KrestikinolikiException {
        int sizeX = field.getSize()[0];
        int sizeY = field.getSize()[1];
        drawTopLine(sizeY);
        for (int i = 0; i < sizeX; i++) {
            drawMiddleLine(i, sizeY, field);
        }
        drawBottomLine(sizeY);
    }

    private void drawTopLine(int sizeY) {
        System.out.print("  ");
        for (int i = 0; i < sizeY; i++) {
            System.out.printf(digitsPerSymbolFormat, i);
        }
        System.out.println();
        System.out.print(" " + TOP_LEFT_CORNER);
        for (int i = 0; i < sizeY; i++) {
            for (int k = 0; k < placesPerSymbol; k++) {
                System.out.print(HORIZONTAL_LINE);
            }
        }
        System.out.println(TOP_RIGHT_CORNER);
    }

    private void drawBottomLine(int sizeY) {
        System.out.print(" " + BOTTOM_LEFT_CORNER);
        for (int i = 0; i < sizeY; i++) {
            for (int k = 0; k < placesPerSymbol; k++) {
                System.out.print(HORIZONTAL_LINE);
            }
        }
        System.out.println(BOTTOM_RIGHT_CORNER);
    }

    private void drawMiddleLine(int lineNumber, int sizeY, Field2D field) throws KrestikinolikiException {
        System.out.print(lineNumber);
        System.out.print(VERTICAL_LINE);
        for (int j = 0; j < sizeY; j++) {
            System.out.printf(symbolPerSymbolFormat, field.getSymbol(new int[]{lineNumber, j}));
        }
        System.out.println(VERTICAL_LINE);
    }
}