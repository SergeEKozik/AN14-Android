package achapovskiy.lab5.B1;

import achapovskiy.lab5.A1.Transport;

import java.util.Scanner;

public class Money {

    private long rubleFirst, pennyFirst, rubleSecond, pennySecond;


    public Money(long rubleFirst, long pennyFirst, long rubleSecond, long pennySecond) {
        System.out.println("Производимые операции : ");
        Set(rubleFirst, pennyFirst, rubleSecond, pennySecond);
        /*System.out.println(getSum());
        System.out.println(getDif());
        System.out.println(getDiv());
        System.out.println(getDivSum());
        System.out.println(getMult());
        System.out.println(comparison());*/

    }

    public void Set(long rubleFirst, long pennyFirst, long rubleSecond, long pennySecond) {
        this.rubleFirst = rubleFirst;
        this.pennyFirst = pennyFirst;
        this.rubleSecond = rubleSecond;
        this.pennySecond = pennySecond;
    }

    public String getSum() {
        long rubleSum = rubleFirst + rubleSecond;
        long pennySum = pennyFirst + pennySecond;
        if (pennySum > 9) {
            rubleSum += 1;
            pennySum -= 10;
        }
        return "Сумма : " + rubleSum + "," + pennySum;
    }

    public String getDif() {
        long rubleDif = rubleFirst - rubleSecond;
        long pennyDif = pennyFirst - pennySecond;
        if (pennyDif < 0) {
            rubleDif -= 1;
            pennyDif += 10;
        }
        return "Вычитание : " + rubleDif + "," + pennyDif;
    }

    public String getDiv() {
        double firstSum = (double) rubleFirst + rubleSecond * 0.1;
        double secondSum = (double) pennyFirst + pennySecond * 0.1;
        double div = firstSum / secondSum;
        long rubleDiv = (long) div;
        long pennyDiv = (long) div % 10;
        return "Деление : " + rubleDiv + "," + pennyDiv;
    }

    public String getDivSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите делитель суммы : ");
        double num = sc.nextInt();
        double firstSum = (double) rubleFirst + rubleSecond * 0.1;
        double secondSum = (double) pennyFirst + pennySecond * 0.1;
        double div = (firstSum + secondSum) / num;
        long rubleDivSum = (long) div;
        long pennyDivSum = (long) div % 10;
        return "Деление на число : " + rubleDivSum + "," + pennyDivSum;
    }

    public String getMult() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите множитель суммы : ");
        double num = sc.nextInt();
        double firstSum = (double) rubleFirst + rubleSecond * 0.1;
        double secondSum = (double) pennyFirst + pennySecond * 0.1;
        double mult = (firstSum + secondSum) * num;
        long rubleMult = (long) mult;
        long pennyMult = (long) mult % 10;
        return "Умножение на число : " + rubleMult + "," + pennyMult;
    }

    public String comparison() {
        double firstSum = (double) rubleFirst + rubleSecond * 0.1;
        double secondSum = (double) pennyFirst + pennySecond * 0.1;
        if (firstSum < secondSum){
            return rubleFirst + ","+ rubleSecond + "<" + pennyFirst + ","+ pennySecond;
        }
        else{
            return rubleFirst + ","+ rubleSecond + ">" + pennyFirst + ","+ pennySecond;
        }
    }
}


