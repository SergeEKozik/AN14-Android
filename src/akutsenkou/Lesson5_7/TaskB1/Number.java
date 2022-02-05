package akutsenkou.Lesson5_7.TaskB1;

public class Number extends Money {

    long rub;
    char cop;

    public Number(long rub, char cop) {
        super(rub, cop);
    }

    public long getRub() {
        return rub;
    }

    public int getCop() {
        return Character.getNumericValue(cop);
    }


}
