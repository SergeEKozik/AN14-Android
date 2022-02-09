package achapovskiy.lab5.B1;

public class Main {


    public static void main(String[] args) {
        Money moneyFirst = new Money(45,9,13,4);
        System.out.println(moneyFirst.getSum());
        System.out.println(moneyFirst.getSum());
        System.out.println(moneyFirst.getDif());
        System.out.println(moneyFirst.getDiv());
        System.out.println(moneyFirst.getDivSum());
        System.out.println(moneyFirst.getMult());
        System.out.println(moneyFirst.comparison());


        //String resSum = money.getSum();
        //System.out.println(resSum);
        //String resDif = money.getDif();
        //System.out.println(resDif);

    }
}