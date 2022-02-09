package eveshtard.Lab6.robot;

import eveshtard.Lab6.robot.hands.SamsungHand;
import eveshtard.Lab6.robot.hands.ToshibaHand;
import eveshtard.Lab6.robot.heads.SamsungHead;
import eveshtard.Lab6.robot.heads.SonyHead;
import eveshtard.Lab6.robot.heads.ToshibaHead;
import eveshtard.Lab6.robot.legs.SonyLeg;
import eveshtard.Lab6.robot.legs.ToshibaLeg;

/*
       Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
       Класс SonyHead является примером реализацией головы от Sony.
       Создайте 3 робота с разными комплектующими.
       Например, у робота голова и нога от Sony а, рука от Samsung.
       У всех роботов вызовите метод action.
       Среди 3-х роботов найдите самого дорогого.
*/
public class Run {

    public static void main(String[] args) {

        Robot firstRobot = new Robot(new SonyHead(100), new SamsungHand(50), new SonyLeg(70));
        firstRobot.action();
        System.out.println("стоимость робота " + firstRobot.getPrice() + " $\n");
        Robot secondRobot = new Robot(new SamsungHead(150), new ToshibaHand(80), new SonyLeg(70));
        secondRobot.action();
        System.out.println("стоимость робота " + secondRobot.getPrice() + " $\n");
        Robot thirdRobot = new Robot(new ToshibaHead(120), new SamsungHand(50), new ToshibaLeg(80));
        thirdRobot.action();
        System.out.println("стоимость робота " + thirdRobot.getPrice() + " $\n");


        System.out.println("самый дорогой робот стоит " + (moreExpensive(firstRobot, secondRobot, thirdRobot).getPrice()) + " $");
    }

    public static Robot moreExpensive(Robot robot1, Robot robot2, Robot robot3) {
        Robot expRobotOfTwo = expRobot(robot1, robot2);
        return expRobot(expRobotOfTwo, robot3);
    }

    private static Robot expRobot(Robot robot1, Robot robot2) {
        return robot1.getPrice() > robot2.getPrice() ? robot1 : robot2;
    }
}
