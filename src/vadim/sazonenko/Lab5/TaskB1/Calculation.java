package vadim.sazonenko.Lab5.TaskB1;

public class Calculation {
    public static void main (String [] args) {
        double divisionFractional;
        double multiplicationFractional;
        Money money = new Money(51, 50, '2', '9');
        money.sum();
        money.difference();
        money.division();
        divisionFractional=  money.divisionSumFractional(2.3);
        System.out.println("Деление суммы на дробное число: " + divisionFractional);
        multiplicationFractional =  money.multiplicationSumFractional(2.3);
        System.out.println("Умножение суммы на дробное число: " + multiplicationFractional);
        money.comparison();

    }
}
