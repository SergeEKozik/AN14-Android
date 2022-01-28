package skozik.lesson3.game;

import java.util.Scanner;

public class Game {

    private static final char DEFAULT_SYMBOL = '-';
    private static final char PLAYER1_SYMBOL = 'X';
    private static final char PLAYER2_SYMBOL = '0';

    private static Intelligence intelligence = new Intelligence2D();

    public static void main(String[] args) {
        Field field = new Field2D(DEFAULT_SYMBOL, 3, 3);
        Gamer gamer1 = new Gamer(PLAYER1_SYMBOL, "Gamer 1");
        Gamer gamer2 = new Gamer(PLAYER2_SYMBOL, "Gamer 2");
        Scanner sc = new Scanner(System.in);

        Gamer currentGamer = gamer1;
        while (makeTurn(field, currentGamer, sc)) {
            currentGamer = (currentGamer == gamer1) ? gamer2 : gamer1;
        }
    }

    private static boolean makeTurn(Field field, Gamer gamer, Scanner sc) {
        field.draw();
        if (!askForTurn(gamer, field, sc)) {
            System.out.println("Игра прервана");
            return false;
        }
        return !isGameOver(gamer, field);
    }

    private static boolean askForTurn(Gamer gamer, Field field, Scanner sc) {
        System.out.printf("Ходит игрок %s:%n", gamer.getName());
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (DEFAULT_SYMBOL == field.getSymbol(x, y)) {
                field.setSymbol(gamer.getSymbol(), x, y);
                return true;
            }
            System.out.printf("Клетка (%d, %d) уже занята.%n", x, y);
            System.out.printf("Игрок %s вводит координаты заново:%n", gamer.getName());
        }
        return false;
    }

    private static boolean isGameOver(Gamer currentGamer, Field field) {
        if (!field.hasEmptyCells()) {
            field.draw();
            System.out.println("Всё поле заполнено.");
            return true;
        }
        if (intelligence.hasVictoryCondition(currentGamer.getSymbol(), field)) {
            field.draw();
            System.out.printf("Игрок %s победил!%n", currentGamer.getName());
            return true;
        }
        return false;
    }
}