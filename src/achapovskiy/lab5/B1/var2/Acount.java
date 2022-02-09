package achapovskiy.lab5.B1.var2;

import java.util.Scanner;

public class Acount {

    private final long ruble;                   //поля
    private final char penny;
    long sumRub, sumPen;


    public Acount(long ruble, char penny) {
        this.ruble = ruble;
        this.penny = penny;
    }

    public void Operation() {
        System.out.println("Производимые операции cо счётом : ");
    }

    public String Sum(Acount acSecond) {
        long rubleSum = this.ruble + acSecond.ruble;
        long pennySum = Character.getNumericValue(this.penny) + Character.getNumericValue(acSecond.penny);
        if (pennySum > 9) {
            rubleSum += 1;
            pennySum -= 10;
        }
        sumRub = rubleSum;
        sumPen = pennySum;
        return "Сумма денег на двух счетах : " + rubleSum + "," + pennySum;
    }

    public String Dif(Acount acSecond) {
        long rubleDif = this.ruble - acSecond.ruble;
        long pennyDif = Character.getNumericValue(this.penny) - Character.getNumericValue(acSecond.penny);
        if (pennyDif < 0) {
            rubleDif -= 1;
            pennyDif += 10;
        }
        return "Разность денег на двух счетах : " + rubleDif + "," + pennyDif;
    }

    public String Div(Acount acSecond) {
        double ac1 = (double) this.ruble + Character.getNumericValue(this.penny) * 0.1;
        double ac2 = (double) acSecond.ruble + Character.getNumericValue(acSecond.penny) * 0.1;
        double div = ac1 / ac2;
        return String.format("Сумма первого счёта больше в %.2f раз(а).", div);
    }

    public String DivSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите делитель суммы : ");
        Double num = sc.nextDouble();
        double rubleDivSum = sumRub / num;
        double pennyDivSum = sumPen / num;
        return String.format("Деление суммы счетов на число %.2f примерно равно %.0f,%.0f.",num, rubleDivSum,pennyDivSum);
    }
    public String comparison(Acount acSecond) {
        if (this.ruble < acSecond.ruble) {
            return "На втором счёте сумма больше.";
        } else {
            return "На первом счёте сумма больше.";
        }
    }
}
