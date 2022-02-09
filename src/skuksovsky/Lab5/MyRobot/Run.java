package skuksovsky.Lab5.MyRobot;

import skuksovsky.Lab5.MyRobot.Hands.SamsungHand;
import skuksovsky.Lab5.MyRobot.Hands.SonyHand;
import skuksovsky.Lab5.MyRobot.Hands.ToshibaHand;
import skuksovsky.Lab5.MyRobot.Heads.SamsungHead;
import skuksovsky.Lab5.MyRobot.Heads.SonyHead;
import skuksovsky.Lab5.MyRobot.Heads.ToshibaHead;
import skuksovsky.Lab5.MyRobot.Legs.SamsungLeg;
import skuksovsky.Lab5.MyRobot.Legs.SonyLeg;
import skuksovsky.Lab5.MyRobot.Legs.ToshibaLeg;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Robot robot = new Robot(new SamsungHead(232), new SamsungHand[]{new SonyHand(53), new ToshibaHand(95)}, new SamsungLeg[]{new SamsungLeg(232), new SonyLeg(431)}, "Робот Паша");
        robot.action("Привет, я " + robot.name);
        robot.say("Моя цена составляет " + robot.calculatePrice());

        Robot robot2 = new Robot(new ToshibaHead(675), new SamsungHand[]{new SamsungHand(12), new SonyHand(22)}, new SamsungLeg[]{new ToshibaLeg(233), new SonyLeg(988)}, "Робот Игорь");
        robot2.action("Привет, я " + robot2.name);
        robot2.say("Моя цена составляет " + robot2.calculatePrice());

        Robot robot3 = new Robot(new SonyHead(756), new SamsungHand[]{new SonyHand(543), new ToshibaHand(333)}, new SamsungLeg[]{new SonyLeg(987), new SamsungLeg(123)}, "Робот Святослав");
        robot3.action("Привет, я " + robot3.name);
        robot3.say("Моя цена составляет " + robot3.calculatePrice());

        int robotPrices[] = {robot.calculatePrice(), robot2.calculatePrice(), robot3.calculatePrice()};
        Arrays.sort(robotPrices);
        System.out.println("Самая большая цена среди роботов - " + robotPrices[2]);


        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


    }
}
