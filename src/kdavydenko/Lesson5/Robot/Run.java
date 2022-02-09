package kdavydenko.Lesson5.Robot;

import kdavydenko.Lesson5.Robot.heads.SonyHead;
import kdavydenko.Lesson5.Robot.heads.SamsungHead;
import kdavydenko.Lesson5.Robot.heads.ToshibaHead;

import kdavydenko.Lesson5.Robot.legs.ToshibaLegs;
import kdavydenko.Lesson5.Robot.legs.SonyLegs;
import kdavydenko.Lesson5.Robot.legs.SamsungLegs;

import kdavydenko.Lesson5.Robot.hands.SamsungHand;
import kdavydenko.Lesson5.Robot.hands.SonyHand;
import kdavydenko.Lesson5.Robot.hands.ToshibaHand;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например, у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot firstRobot = new Robot(new SonyHead(10), new SamsungHand(30), new ToshibaLegs(20));
        firstRobot.action();
        System.out.println(firstRobot.getPrice());
        Robot secondRobot = new Robot(new SamsungHead(50), new SonyHand(25), new SonyLegs(15));
        secondRobot.action();
        System.out.println(secondRobot.getPrice());
        Robot thirdRobot = new Robot(new ToshibaHead(4), new ToshibaHand(30), new SamsungLegs(20));
        thirdRobot.action();
        System.out.println(thirdRobot.getPrice());

        System.out.println("Максимальная стоимость робота: " + findMaxPriceRobot(firstRobot, secondRobot, thirdRobot).getPrice());
    }

    public static Robot findMaxPriceRobot(Robot... robots) {
        Robot maxPriceRobot = null;
        int maxPrice = 0;
        for (Robot robot : robots)
            if (Math.max(robot.getPrice(), maxPrice) == robot.getPrice()) {
                maxPriceRobot = robot;
                maxPrice = robot.getPrice();
            }

        return maxPriceRobot;
    }
}
