package kvizhunou.Robot;


import kvizhunou.Robot.hands.SamsungHand;
import kvizhunou.Robot.hands.SonyHand;
import kvizhunou.Robot.hands.ToshibaHand;
import kvizhunou.Robot.heads.SamsungHead;
import kvizhunou.Robot.heads.SonyHead;
import kvizhunou.Robot.heads.ToshibaHead;
import kvizhunou.Robot.legs.SamsungLeg;
import kvizhunou.Robot.legs.SonyLeg;
import kvizhunou.Robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {

        Robot rbt = new Robot(new SonyHand(200), new ToshibaLeg(300), new SamsungHead(250));
        Robot rbt2 = new Robot(new SamsungHand(200), new SonyLeg(200), new ToshibaHead(100));
        Robot rbt3 = new Robot(new ToshibaHand(100), new SamsungLeg(200), new SonyHead(150));
        int[] robo = new int[]{rbt.getPrice(), rbt2.getPrice(), rbt3.getPrice()};
        int max = 0;

        for (int i = 0; i < robo.length; i++) {
            if (max < robo[i]) {
                max = robo[i];
            }

        } System.out.println("Самый дорогой робот: " +max);

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
