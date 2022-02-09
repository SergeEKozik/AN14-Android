package achapovskiy.lab6.robot;

import achapovskiy.lab6.robot.hands.SamsungHand;
import achapovskiy.lab6.robot.hands.SonyHand;
import achapovskiy.lab6.robot.hands.ToshibaHand;
import achapovskiy.lab6.robot.heads.SamsungHead;
import achapovskiy.lab6.robot.heads.SonyHead;
import achapovskiy.lab6.robot.heads.ToshibaHead;
import achapovskiy.lab6.robot.legs.SamsungLeg;
import achapovskiy.lab6.robot.legs.SonyLeg;
import achapovskiy.lab6.robot.legs.ToshibaLeg;

/*
       Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
       Класс SonyHead является примером реализацией головы от Sony.
       Создайте 3 робота с разными комплектующими.
       Например у робота голова и нога от Sony а, рука от Samsung.
       У всех роботов вызовите метод action.
       Среди 3-х роботов найдите самого дорогого.
       */
public class Run {

   public static void main(String[] args) {

       Robot RobotOne = new Robot(new SonyHead(200),new ToshibaHand(4), new SamsungLeg(3));
       Robot RobotTwo = new Robot(new SamsungHead(2),new SonyHand(7), new ToshibaLeg(4));
       Robot RobotThree = new Robot(new ToshibaHead(100), new SamsungHand(4), new SonyLeg(5));

       System.out.println("Первый робот :");
       RobotOne.action();
       System.out.println();

       System.out.println("Второй робот :");
       RobotTwo.action();
       System.out.println();

       System.out.println("Третий робот :");
       RobotThree.action();
       System.out.println();

       RobotOne.maxCoint(RobotOne.getPrice(), RobotTwo.getPrice(), RobotThree.getPrice());









}
}
