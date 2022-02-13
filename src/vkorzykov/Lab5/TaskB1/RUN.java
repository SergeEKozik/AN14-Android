package vkorzykov.Lab5.TaskB1;

public class RUN {
    public static void sum(Money i, Money y) {
        double sum = i.sum() + y.sum();
        System.out.println(sum);
    }

    public static void sub(Money i, Money y) {
        double sub = i.sum() - y.sum();
        System.out.println(sub);
    }
    public static void div(Money i, Money y) {
        double div = i.sum() / y.sum();
        System.out.println(div);
    }
    public static void equals (Money i, Money y) {
        double div = i.sum() / y.sum();
        System.out.println(div);
    }

        public static void main (String[]args){
            Money pocketMoney = new Money(101, (char) 110);
            Money pocketMoney2 = new Money(102, (char) 333);
            System.out.println(pocketMoney);
            System.out.println(pocketMoney2);

            sum(pocketMoney, pocketMoney2);
            sub(pocketMoney2,pocketMoney);
            div(pocketMoney,pocketMoney2);
            pocketMoney.divNumber(2.5);
            pocketMoney.multNumber(2.5);
            pocketMoney.equal(102.1);




        }
    }

