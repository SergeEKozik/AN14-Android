package akalevich.Lesson_6.robot;

import akalevich.Lesson_6.robot.hands.SamsungHand;
import akalevich.Lesson_6.robot.hands.SonyHand;
import akalevich.Lesson_6.robot.hands.ToshibaHand;
import akalevich.Lesson_6.robot.heads.SamsungHead;
import akalevich.Lesson_6.robot.heads.SonyHead;
import akalevich.Lesson_6.robot.legs.SonyLeg;
import akalevich.Lesson_6.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args)
    {
         Robot theFirstRobot = new Robot(new SonyHead(1000), new ToshibaHand(500), new SonyLeg(1000));
         Robot theSecondRobot = new Robot(new SonyHead(1000), new SonyHand(1000), new SonyLeg(1000));
         Robot theThirdRobot = new Robot(new SamsungHead(2000), new SamsungHand(1500), new ToshibaLeg(500));
         theFirstRobot.action();
         theSecondRobot.action();
         theThirdRobot.action();
         findTheMostExpensiveRobot(theFirstRobot,theSecondRobot,theThirdRobot);
    }

    public static void findTheMostExpensiveRobot(Robot theFirstRobot, Robot theSecondRobot, Robot theThirdRobot)
    {
        int higherCost = theFirstRobot.getPrice();
        if (theSecondRobot.getPrice() > higherCost) higherCost = theSecondRobot.getPrice();
        if (theThirdRobot.getPrice() > higherCost) higherCost = theThirdRobot.getPrice();
        System.out.println("The higher price robot is " + higherCost);
    }
}
