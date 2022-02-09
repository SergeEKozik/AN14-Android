/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.krestikinoliki.gamer;

public class Gamer implements IGamer {
    private char symbol;
    private String name;

    public Gamer(char symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public String getName() {
        return name;
    }
}
