package vkorzykov.ROBOT.robot;

import vkorzykov.ROBOT.robot.hands.SamsungHand;
import vkorzykov.ROBOT.robot.hands.SonyHand;
import vkorzykov.ROBOT.robot.hands.ToshibaHand;
import vkorzykov.ROBOT.robot.heads.SonyHead;
import vkorzykov.ROBOT.robot.heads.ToshibaHead;
import vkorzykov.ROBOT.robot.legs.SamsungLeg;
import vkorzykov.ROBOT.robot.legs.SonyLeg;
import vkorzykov.ROBOT.robot.legs.ToshibaLeg;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {

        Robot robotTest1 = new Robot(new SonyHead(100), new ToshibaHand(100), new SamsungLeg(600));
        Robot robotTest2 = new Robot(new SonyHead(100), new SamsungHand(300), new ToshibaLeg(200));
        Robot robotTest3 = new Robot(new ToshibaHead(50), new SonyHand(200), new SonyLeg(300));
        String nameRobotTest1 = "robotTest1";
        String nameRobotTest2 = "robotTest2";
        String nameRobotTest3 = "robotTest3";
        System.out.println(robotTest1.getPrice());
        System.out.println(robotTest2.getPrice());
        System.out.println(robotTest3.getPrice());
        int[] allRobots = new int[]{robotTest1.getPrice(), robotTest2.getPrice(), robotTest3.getPrice()};

        int maxExpensiveRobot = 0;
        for (int i = 0; i < allRobots.length; i++) {
            if (maxExpensiveRobot < allRobots[i]) {
                maxExpensiveRobot = allRobots[i];
            }
        }

        System.out.println("Самый дорогой робот стоит: " + maxExpensiveRobot);
        if (maxExpensiveRobot == robotTest1.getPrice()) {
            System.out.println("Название самого дорого робота: " + nameRobotTest1);
        }
        if (maxExpensiveRobot == robotTest2.getPrice()) {
            System.out.println("Название самого дорого робота: " + nameRobotTest2);
        }
        if (maxExpensiveRobot == robotTest3.getPrice()) {
            System.out.println("Название самого дорого робота: " + nameRobotTest3);
        }


        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg) (yes)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


    }
}
