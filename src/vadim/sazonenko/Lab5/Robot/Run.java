package vadim.sazonenko.Lab5.Robot;

import vadim.sazonenko.Lab5.Robot.hand.ToshibaHand;
import vadim.sazonenko.Lab5.Robot.hand.SonyHand;
import vadim.sazonenko.Lab5.Robot.hand.SamsungHand;
import vadim.sazonenko.Lab5.Robot.head.SamsungHead;
import vadim.sazonenko.Lab5.Robot.head.SonyHead;
import vadim.sazonenko.Lab5.Robot.head.ToshibaHead;
import vadim.sazonenko.Lab5.Robot.leg.SamsungLeg;
import vadim.sazonenko.Lab5.Robot.leg.SonyLeg;
import vadim.sazonenko.Lab5.Robot.leg.ToshibaLeg;


public class Run {

    public static void main (String [] args) {
        int expensive;
        String expensiveRobot;
        Robot robotFirst = new Robot( new SamsungHead(100), new ToshibaHand(80), new SonyLeg(70));
        robotFirst.action();
        System.out.println("Цена первого робота: " + robotFirst.getPrice() + '\n');
        Robot robotSecond = new Robot( new ToshibaHead(150), new SonyHand(70), new SamsungLeg(90));
        robotSecond.action();
        System.out.println("Цена второго робота: " + robotSecond.getPrice()+ '\n');
        Robot robotThird = new Robot( new SonyHead(90), new SamsungHand(100), new ToshibaLeg(50));
        robotThird.action();
        System.out.println("Цена третьего робота: " + robotThird.getPrice() + '\n');

        if (robotFirst.getPrice() > robotSecond.getPrice()) {
            expensive = robotFirst.getPrice();
            expensiveRobot = "первый ";
        }
        else { expensive = robotSecond.getPrice();
               expensiveRobot = "второй ";
         }

        if (expensive < robotThird.getPrice()) {
            expensive = robotThird.getPrice();
            expensiveRobot = "третий ";
        }
        System.out.println("Самый дорогой робот: " + expensiveRobot + ", стоимость которого " + expensive + "$");


    }
}
