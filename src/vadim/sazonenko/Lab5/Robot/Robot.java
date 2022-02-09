package vadim.sazonenko.Lab5.Robot;


import vadim.sazonenko.Lab5.Robot.hand.Ihand;
import vadim.sazonenko.Lab5.Robot.head.Ihead;
import vadim.sazonenko.Lab5.Robot.leg.Ileg;

public class Robot implements IRobot {
    private Ihead head;
    private Ihand hand;
    private Ileg leg;


    public Robot(Ihead head, Ihand hand, Ileg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot() {
    }

    public Ihead getHead() {
        return head;
    }

    public void setHead(Ihead head) {
        this.head = head;
    }

    public Ihand getHand() {
        return hand;
    }

    public void setHand(Ihand hand) {
        this.hand = hand;
    }

    public Ileg getLeg() {
        return leg;
    }

    public void setLeg(Ileg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speek();
        hand.UpHand();
        leg.StepLeg();
    }

    /**
     * Get the cost of a robot
     *
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }


}
