package VNazarov.Lab06.Robot;

import VNazarov.Lab06.Robot.hands.SamsungHand;
import VNazarov.Lab06.Robot.hands.SonyHand;
import VNazarov.Lab06.Robot.hands.ToshibaHand;
import VNazarov.Lab06.Robot.heads.SamsungHead;
import VNazarov.Lab06.Robot.heads.SonyHead;
import VNazarov.Lab06.Robot.heads.ToshibaHead;
import VNazarov.Lab06.Robot.legs.SamsungLeg;
import VNazarov.Lab06.Robot.legs.SonyLeg;
import VNazarov.Lab06.Robot.legs.ToshibaLeg;

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

        SonyLeg sonyLeg = new SonyLeg(2000);
        ToshibaLeg toshibaLeg = new ToshibaLeg(2500);
        SamsungLeg samsungLeg = new SamsungLeg(2250);

        SonyHand sonyHand = new SonyHand(1000);
        ToshibaHand toshibaHand = new ToshibaHand(1500);
        SamsungHand samsungHand = new SamsungHand(1250);

        SonyHead sonyHead = new SonyHead(5000);
        ToshibaHead toshibaHead = new ToshibaHead(10000);
        SamsungHead samsungHead = new SamsungHead(7500);

        Robot first = new Robot(samsungHead, toshibaHand, sonyLeg);
        Robot second = new Robot(sonyHead, samsungHand, toshibaLeg);
        Robot third = new Robot(toshibaHead, sonyHand, samsungLeg);

        System.out.println("First robot:");
        first.action();
        System.out.println("\n" + "Second robot:");
        second.action();
        System.out.println("\n" + "Third robot:");
        third.action();

        String tme = "";
        if (first.getPrice() > second.getPrice() && first.getPrice() > third.getPrice()) tme = "first";
        else if (second.getPrice() > first.getPrice() && second.getPrice() > third.getPrice()) tme = "second";
        else if (third.getPrice() > first.getPrice() && third.getPrice() > second.getPrice()) tme = "third";
        else if (first.getPrice() == second.getPrice() && first.getPrice() > third.getPrice()) tme = "first and second";
        else if (first.getPrice() == third.getPrice() && first.getPrice() > second.getPrice()) tme = "first and third";
        else if (third.getPrice() == second.getPrice() && third.getPrice() > first.getPrice()) tme = "second and third";
        else if (first.getPrice() == second.getPrice() && first.getPrice() == third.getPrice()) tme = "all are equal by cost";
        System.out.println("\n" + "The most expensive robot: " + tme);
    }
}
