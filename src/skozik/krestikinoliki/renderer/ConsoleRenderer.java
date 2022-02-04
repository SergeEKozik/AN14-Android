/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.krestikinoliki.renderer;

import java.util.Scanner;

import skozik.krestikinoliki.gamer.IGamer;
import skozik.krestikinoliki.field.Field2D;
import skozik.krestikinoliki.field.IField;

public class ConsoleRenderer implements IRenderer {

    private static Scanner scanner = new Scanner(System.in);

    private int placesPerSymbol = 0;
    private String digitsPerSymbolFormat; //example: "%7d";
    private String symbolPerSymbolFormat; //example: "%7s";

    public ConsoleRenderer(int placesPerSymbol) {
        this.placesPerSymbol = placesPerSymbol;
        this.digitsPerSymbolFormat = "%" + this.placesPerSymbol + "d";
        this.symbolPerSymbolFormat = "%" + this.placesPerSymbol + "s";
    }


    @Override
    public void draw(IField field) {
        if (field instanceof Field2D) {
            this.draw2D((Field2D) field);
        } else {
            throw new RuntimeException("Unsupported type of field.");
        }
    }

    @Override
    public void warnGameHalt() {
        System.out.println("Игра прервана");
    }

    @Override
    public void warnGamerWon(IGamer gamer) {
        System.out.printf("Игрок %s победил!%n", gamer.getName());
    }

    @Override
    public void warnGamerTurn(IGamer gamer) {
        System.out.printf("Ходит игрок %s:%n", gamer.getName());
    }

    @Override
    public void warnGamerTurnAgain(IGamer gamer) {
        System.out.printf("Игрок %s вводит координаты заново:%n", gamer.getName());
    }

    @Override
    public void warnPositionUsed(int[] coordinates) {
        System.out.printf("Клетка (%d, %d) уже занята.%n", coordinates[0], coordinates[1]);
    }

    @Override
    public void warnNoTurnsLeft() {
        System.out.println("Всё поле заполнено.");
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

    private void draw2D(Field2D field) {
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
            System.out.print(" ");
        }
        System.out.println();
        System.out.print(" \u250C");
        for (int i = 0; i < sizeY; i++) {
            for (int k = 0; k < placesPerSymbol; k++) {
                System.out.print("\u2500");
            }
        }
        System.out.println("\u2510");
    }

    private void drawBottomLine(int sizeY) {
        System.out.print(" \u2514");
        for (int i = 0; i < sizeY; i++) {
            for (int k = 0; k < placesPerSymbol; k++) {
                System.out.print("\u2500");
            }
        }
        System.out.println("\u2519");
    }

    private void drawMiddleLine(int lineNumber, int sizeY, Field2D field) {
        System.out.print(lineNumber);
        System.out.print("\u2502");
        for (int j = 0; j < sizeY; j++) {
            System.out.printf(symbolPerSymbolFormat, field.getSymbol(new int[]{lineNumber, j}));
        }
        System.out.println("\u2502");
    }
}