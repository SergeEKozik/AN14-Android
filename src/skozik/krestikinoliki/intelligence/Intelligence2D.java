
/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.krestikinoliki.intelligence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import skozik.krestikinoliki.field.Field2D;
import skozik.krestikinoliki.field.IField;
import skozik.krestikinoliki.gamer.IGamer;
import skozik.krestikinoliki.intelligence.victory.VictoryConditionFactory;

public class Intelligence2D implements IIntelligence {
    private static final Random RANDOM = new Random();

    private final int maxForecastedLevel;

    public Intelligence2D(int maxForecastedLevel) {
        this.maxForecastedLevel = maxForecastedLevel;
    }

    @Override
    public boolean hasVictoryCondition(IGamer gamer, IField field) {
        return hasVictoryCondition(gamer.getSymbol(), field);
    }

    private boolean hasVictoryCondition(char symbol, IField field) {
        int[] size = field.getSize();
        for (int i = 0; i < size[0]; i++) {
            for (int j = 0; j < size[1]; j++) {
                final int[] coordinates = new int[]{i, j};
                if (VictoryConditionFactory.getVictoryConditions2DFor3Symbols().stream()
                    .anyMatch(condition -> condition.apply(field, symbol, coordinates))) {
                    return true;
                }
            }
        }
        return false;
    }

    private void calculateVictoryValues(IField field, int[] coordinates, char symbolFriend, char symbolEnemy,
                                        Map<Character, Map<Integer, Integer>> victories,
                                        int forecastedLevel) {
        if (forecastedLevel >= this.maxForecastedLevel) {
            return;
        }
        char existingSymbol = field.getSymbol(coordinates);
        if (existingSymbol != field.getDefaultSymbol()) {
            return;
        }
        IField thisTestTurn = new Field2D(field);
        thisTestTurn.setSymbol(symbolFriend, coordinates);
        if (hasVictoryCondition(symbolFriend, thisTestTurn)) {
            Map<Integer, Integer> victPerTurn = victories.get(symbolFriend);
            if (victPerTurn == null) {
                victPerTurn = new HashMap<>();
            }
            Integer wins = victPerTurn.get(forecastedLevel);
            if (wins == null) {
                wins = 1;
            } else {
                wins++;
            }
            victPerTurn.put(forecastedLevel, wins);
            victories.put(symbolFriend, victPerTurn);
            return;
        }
        int[][] emptyCoordinates = thisTestTurn.getEmptyCoordinates();
        if (emptyCoordinates.length <= 1) {
            return;
        }
        for (int i = 0; i < emptyCoordinates.length; i++) {
            calculateVictoryValues(
                thisTestTurn,
                emptyCoordinates[i],
                symbolEnemy,
                symbolFriend,
                victories,
                forecastedLevel + 1);
        }
    }

    @Override
    public int[] forecastNextStep(IField field, IGamer friend, IGamer enemy) {
        char symbolFriend = friend.getSymbol();
        char symbolEnemy = enemy.getSymbol();
        int[] fieldSize = field.getSize();

        VictoriesTurns[][] victPerTurnFriend = new VictoriesTurns[fieldSize[0]][fieldSize[1]];
        VictoriesTurns[][] victPerTurnEnemy = new VictoriesTurns[fieldSize[0]][fieldSize[1]];
        for (int i = 0; i < fieldSize[0]; i++) {
            for (int j = 0; j < fieldSize[1]; j++) {
                int[] coordinates = new int[]{i, j};
                Map<Character, Map<Integer, Integer>> victoriesFriend = new HashMap<>();
                calculateVictoryValues(field, coordinates, symbolFriend, symbolEnemy, victoriesFriend, 0);
                Map<Character, Map<Integer, Integer>> victoriesEnemy = new HashMap<>();
                calculateVictoryValues(field, coordinates, symbolEnemy, symbolFriend, victoriesEnemy, 0);
                victPerTurnFriend[i][j] = calculateVictories(victoriesFriend, symbolFriend, i, j);
                victPerTurnEnemy[i][j] = calculateVictories(victoriesEnemy, symbolEnemy, i, j);
            }
        }
        VictoriesTurns enemyTurn = chooseClosestWin(field, fieldSize[0], fieldSize[1], victPerTurnEnemy);
        VictoriesTurns friendTurn = chooseClosestWin(field, fieldSize[0], fieldSize[1], victPerTurnFriend);
        if (friendTurn.turn == 0) {
            return new int[]{friendTurn.x, friendTurn.y};
        }
        if (enemyTurn.turn == 0) {
            return new int[]{enemyTurn.x, enemyTurn.y};
        }
        if ((friendTurn.turn <= enemyTurn.turn)
            || (victPerTurnFriend[friendTurn.x][friendTurn.y].victories > victPerTurnFriend[enemyTurn.x][enemyTurn.y].victories)) {
            return new int[]{friendTurn.x, friendTurn.y};
        }
        return new int[]{enemyTurn.x, enemyTurn.y};
    }

    /**
     *
     * @param field is object containing array of that represents game field
     * @param sizeX is 1st dimension of field array
     * @param sizeY is 2nd dimension of field array
     * @param victoriesTurns array of VictoriesTurns objects for each point of field
     * @return VictoriesTurns object which represents current player move with maximum variants of wins at the closest turn.
     */
    private VictoriesTurns chooseClosestWin(IField field, int sizeX, int sizeY, VictoriesTurns[][] victoriesTurns) {
        List<VictoriesTurns> closestWinTurns = new ArrayList<>();
        int nearestTurn = this.maxForecastedLevel;
        int maxWin = 0;
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                if ((victoriesTurns[i][j].turn >= 0) && (victoriesTurns[i][j].turn < nearestTurn)) {
                    nearestTurn = victoriesTurns[i][j].turn;
                    maxWin = victoriesTurns[i][j].victories;
                } else if ((victoriesTurns[i][j].turn == nearestTurn) && (victoriesTurns[i][j].victories > maxWin)) {
                    maxWin = victoriesTurns[i][j].victories;
                }
            }
        }
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                if ((victoriesTurns[i][j].turn == nearestTurn) && (victoriesTurns[i][j].victories == maxWin)) {
                    closestWinTurns.add(victoriesTurns[i][j]);
                }
            }
        }
        if (closestWinTurns.isEmpty()) {
            int[][] emptyCoordinates = field.getEmptyCoordinates();
            if (emptyCoordinates.length <= 0) {
                throw new RuntimeException("No available space for AI turn!");
            }
            int[] coor = emptyCoordinates[RANDOM.nextInt(emptyCoordinates.length)];
            return new VictoriesTurns(this.maxForecastedLevel, 0, coor[0], coor[1]);
        }
        return closestWinTurns.get(RANDOM.nextInt(closestWinTurns.size()));
    }

    private VictoriesTurns calculateVictories(Map<Character, Map<Integer, Integer>> victories, Character symbol, int x, int y) {
        Map<Integer, Integer> winsPerTurn = victories.get(symbol);
        if (winsPerTurn != null) {
            for (int turn = 0; turn < this.maxForecastedLevel; turn++) {
                if (winsPerTurn.get(turn) != null) {
                    return new VictoriesTurns(turn, winsPerTurn.get(turn), x, y);
                }
            }
        }
        return new VictoriesTurns(-1, 0);
    }

    private static class VictoriesTurns {
        protected int turn;
        protected int victories;
        int x;
        int y;

        public VictoriesTurns(int turn, int victories) {
            this.turn = turn;
            this.victories = victories;
        }

        public VictoriesTurns(int turn, int victories, int x, int y) {
            this.turn = turn;
            this.victories = victories;
            this.x = x;
            this.y = y;
        }
    }
}