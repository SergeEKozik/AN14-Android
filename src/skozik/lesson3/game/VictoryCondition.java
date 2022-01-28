package skozik.lesson3.game;

@FunctionalInterface
public interface VictoryCondition {
    boolean apply(Field field, char symbol, int[] coordinates);
}