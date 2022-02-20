package ssazonenko.lab5.robot;

import ssazonenko.lab5.robot.Robot;
import ssazonenko.lab5.robot.hands.SamsungHand;
import ssazonenko.lab5.robot.hands.SonyHand;
import ssazonenko.lab5.robot.hands.ToshibaHand;
import ssazonenko.lab5.robot.heads.SamsungHead;
import ssazonenko.lab5.robot.heads.SonyHead;
import ssazonenko.lab5.robot.heads.ToshibaHeads;
import ssazonenko.lab5.robot.legs.SamsungLeg;
import ssazonenko.lab5.robot.legs.SonyLeg;
import  ssazonenko.lab5.robot.legs.Toshiba;

public class Run {
        public static void main (String [] args) {
            int expensive;
            String expensiveRobot;
             ssazonenko.lab5.robot.Robot robotFirst = new ssazonenko.lab5.robot.Robot( new SamsungHead(110), new ToshibaHand(90), new SonyLeg(60));
            robotFirst.action();
            System.out.println("Цена первого робота: " + robotFirst.getPrice() + '\n');
            ssazonenko.lab5.robot.Robot robotSecond = new ssazonenko.lab5.robot.Robot( new ToshibaHeads(155), new SamsungHand(70), new SonyLeg(80));
            robotSecond.action();
            System.out.println("Цена второго робота: " + robotSecond.getPrice()+ '\n');
            ssazonenko.lab5.robot.Robot robotThird = new Robot( new SonyHead(100), new SamsungHand(110), new Toshiba(60));
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

