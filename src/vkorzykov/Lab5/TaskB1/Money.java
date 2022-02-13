package vkorzykov.Lab5.TaskB1;

// Класс Деньги для работы с денежными суммами. ЕС
// Число должно быть представлено двумя полями: типа long для рублей и типа char - для копеек.
// Дробная часть (копейки) при выводе на экран должна быть отделена от целой части запятой.
// Реализовать сложение, вычитание, деление сумм, деление суммы на дробное число, умножение на дробное число и операции сравнения.
// В функции main проверить эти методы.
public class Money {
    private long rub;
    private char penny;


    public Money(long rub, char penny) {
        if ((int) penny > 99) {
            int penny2 = (int) penny % 100;
            this.penny = (char) penny2;
            this.rub = rub + (int) penny / 100;
        } else {
            this.penny = penny;
            this.rub = rub;
        }
    }

    public double sum() {
        return (double) this.penny / 100 + this.rub;
    }

    public double divNumber(double doubleNumber) {
        return ((double) this.penny / 100 + this.rub) / doubleNumber;
    }

    public double multNumber(double doubleNumber) {
        return ((double) this.penny / 100 + this.rub) * doubleNumber;
    }

    public void equal(double doubleNumber) {
        System.out.println((double) this.penny / 100 + this.rub == doubleNumber ? true : false);
    }


    @Override
    public String toString() {
        return "Деньги = " + rub + "," + (int) penny;
    }
}
