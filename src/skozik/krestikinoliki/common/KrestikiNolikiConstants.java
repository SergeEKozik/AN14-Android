/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.krestikinoliki.common;

public interface KrestikiNolikiConstants {
    char DEFAULT_SYMBOL = '-';
    char PLAYER1_SYMBOL = 'X';
    char PLAYER2_SYMBOL = '0';
    int PLACES_PER_SYMBOL = 8;
    int MAX_FORECAST_LEVEL = 5;
    int SIZE_X = 3;
    int SIZE_Y = 3;
    String PLAYER_1_DEFAULT_NAME = "Player 1";
    String PLAYER_2_DEFAULT_NAME = "Player 2";
    String LOG_MESSAGE_AI_TURN_ERROR = "Ошибка искусственного интеллекта в точке (%d, %d)";
    String LOG_FIELD_CAST_ERROR = "Unsupported type of field.";
    String CONSOLE_MSG_GAME_HALTED = "Игра прервана";
    String CONSOLE_MSG_PLAYER_WON = "Игрок %s победил!%n";
    String CONSOLE_MSG_PLAYER_TURN = "Ходит игрок %s:%n";
    String CONSOLE_MSG_PLAYER_TURN_AGAIN = "Игрок %s вводит координаты заново:%n";
    String CONSOLE_MSG_POSITION_USED = "Клетка (%d, %d) уже занята.%n";
    String CONSOLE_MSG_NO_FREE_POSITIONS = "Всё поле заполнено.";
    String TOP_LEFT_CORNER = "\u250C";
    String HORIZONTAL_LINE = "\u2500";
    String TOP_RIGHT_CORNER = "\u2510";
    String BOTTOM_LEFT_CORNER = "\u2514";
    String BOTTOM_RIGHT_CORNER = "\u2519";
    String VERTICAL_LINE = "\u2502";
    String LOG_FIELD_COORDINATE_EXCEEDS_DIMENSIONS = "Coordinates are not equal to field dimensions";
    String LOG_FIELD_COORDINATE_EXCEEDS_SIZE = "Coordinates %d %d are out of field size";
}
