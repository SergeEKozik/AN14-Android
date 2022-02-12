package skuksovsky.Lab5_7.MyRobot;

import skuksovsky.Lab5_7.MyRobot.Hands.Hand;
import skuksovsky.Lab5_7.MyRobot.Heads.Head;
import skuksovsky.Lab5_7.MyRobot.Legs.Leg;


public class Robot <T1 extends Head, T2 extends Hand, T3 extends Leg> {
    T1 head;
    T2[] hands;
    T3[] legs;
    private int price;
    String name;

    public Robot(Head head, Hand[] hands, Leg[] legs, String name) {
        this.head = (T1) head;
        this.hands = (T2[]) hands;
        this.legs = (T3[]) legs;
        this.name = name;
    }

    void action(String text) {
        this.head.speak(text);
        for (int i = 0; i < this.hands.length; i++) {
            this.hands[i].upHand();
        }
        for (int i = 0; i < this.legs.length; i++) {
            this.legs[i].step();
        }
    }

    int calculatePrice() {
        this.price = this.head.getPrice();
        for (int i = 0; i < this.hands.length; i++) {
            this.price += this.hands[i].getPrice();
        }
        for (int i = 0; i < this.legs.length; i++) {
            this.price += this.legs[i].getPrice();
        }

        return this.price;

    }

    void say(String text) {
        System.out.println("\n" + this.name + ": ");
        this.head.speak(text);
    }


}
