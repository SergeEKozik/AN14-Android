package skuksovsky.Lab5.MyRobot;

import skuksovsky.Lab5.MyRobot.Hands.SamsungHand;
import skuksovsky.Lab5.MyRobot.Heads.SonyHead;
import skuksovsky.Lab5.MyRobot.Legs.SamsungLeg;


public class Robot {
    SonyHead head;
    SamsungHand[] hands;
    SamsungLeg[] legs;
    private int price;
    String name;

    public Robot(SonyHead head, SamsungHand[] hands, SamsungLeg[] legs, String name) {
        this.head = head;
        this.hands = hands;
        this.legs = legs;
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
        System.out.println("\n" + "Говорит " + this.name);
        this.head.speak(text);
    }


}
