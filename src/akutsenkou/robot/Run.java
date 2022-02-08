package akutsenkou.robot;


import akutsenkou.robot.hands.SamsungHand;
import akutsenkou.robot.hands.SonyHand;
import akutsenkou.robot.heads.SamsungHead;
import akutsenkou.robot.heads.SonyHead;
import akutsenkou.robot.heads.ToshibaHead;
import akutsenkou.robot.legs.SamsungLeg;
import akutsenkou.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot BumbleBee = new Robot(new SamsungHead(2300), new SonyHand(100), new ToshibaLeg(50));
        Robot Megatron = new Robot(new SonyHead (400), new SamsungHand (125), new ToshibaLeg(120));
        Robot OptimusPrime = new Robot(new ToshibaHead(450), new SonyHand(180), new SamsungLeg(165));

        Robot r = new Robot();

        System.out.println("Robot BumbleBee:");
        System.out.println();
        BumbleBee.action();
        System.out.println("BumbleBee cost: " + BumbleBee.getPrice());
        System.out.println();
        System.out.println("Robot Megatron:");
        System.out.println();
        Megatron.action();
        System.out.println("Megatron cost: " + Megatron.getPrice());
        System.out.println();
        System.out.println("Robot OptimusPrime:");
        System.out.println();
        OptimusPrime.action();
        System.out.println("OptimusPrime cost: " + OptimusPrime.getPrice());
        System.out.println();

        r.mostExpensiveRobot(BumbleBee, Megatron, OptimusPrime);

    }
}
