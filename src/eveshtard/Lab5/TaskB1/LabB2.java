package eveshtard.Lab5.TaskB1;

//Класс Деньги для работы с денежными суммами. Число должно быть представлено двумя полями:
// типа long для рублей и типа char - для копеек.
// Дробная часть (копейки) при выводе на экран должна быть отделена от целой части запятой.
// Реализовать сложение, вычитание, деление сумм, деление суммы на дробное число, умножение на дробное число и операции сравнения.
// В функции main проверить эти методы.

public class LabB2 {
    public static void main(String[] args)  {


        Money lenasMoney = new Money(15, '8');
        Money vanyasMoney = new Money(1, '7');

       /* System.out.println(vanyasMoney.sum(lenasMoney));
        System.out.println(lenasMoney.subtraction(vanyasMoney));
        System.out.println(lenasMoney.division(vanyasMoney));
        System.out.println(lenasMoney.divisionByDouble(2.2));
        System.out.println(vanyasMoney.isOver(lenasMoney));
        System.out.println(vanyasMoney.multiplicationByDouble(2.5));
        System.out.println(vanyasMoney.sum(lenasMoney));*/

        System.out.println(Money.sum(vanyasMoney, lenasMoney));
        System.out.println(Money.subtraction(vanyasMoney, lenasMoney));
        System.out.println(Money.division(vanyasMoney, lenasMoney));
        System.out.println(Money.divisionByDouble(vanyasMoney, 2.2));
        System.out.println(Money.multiplicationByDouble(lenasMoney, 3.3));
        System.out.println(Money.isOver(vanyasMoney, lenasMoney));
    }
}
