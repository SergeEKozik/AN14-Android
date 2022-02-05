package akutsenkou.Lesson5_7.TaskB1;

public class Main {
    public static void main(String[] args) {

        Money mn1 = new Money(12, '3');
        Money mn2 = new Money(8, '7');
        Money mn = new Money();

        mn.sum(mn1, mn2);
        mn.difference(mn1, mn2);
        mn.division(mn1, mn2);
        mn.multiplication(mn1, mn2);
        mn.comparison(mn1, mn2);

    }

}
