package kdavydenko.Lesson5.TaskB1;
/*
Класс Деньги для работы с денежными суммами. Число должно быть представлено двумя полями: типа long для рублей
и типа char - для копеек. Дробная часть (копейки) при выводе на экран должна быть отделена от целой части запятой.
Реализовать сложение, вычитание, деление сумм, деление суммы на дробное число, умножение на дробное число и операции сравнения.
В функции main проверить эти методы.
 */
public class Main {
    public static void main(String[] args) {
        Money moneyFirst = new Money(10, (char)15);
        Money moneySecond = new Money(5, (char)90);

        moneyFirst.printAccount();
        moneyFirst.sum(moneySecond);
        moneyFirst.difference(moneySecond);
        moneyFirst.divide(moneySecond);
        moneyFirst.divideByFraction(2.5);
        moneyFirst.multiplyByFractional(2.4);
        moneyFirst.compare(moneySecond);
    }
}
