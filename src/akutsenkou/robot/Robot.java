package akutsenkou.robot;

import akutsenkou.robot.hands.IHand;
import akutsenkou.robot.heads.IHead;
import akutsenkou.robot.legs.ILeg;

public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot(){}

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speek();
        hand.upHand();
        leg.step();
    }

    /**
     * Get the cost of a robot
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }

    public void mostExpensiveRobot (Robot BumbleBee, Robot Megatron, Robot OptimusPrime){
        if(BumbleBee.getPrice() > Megatron.getPrice() && BumbleBee.getPrice() > OptimusPrime.getPrice())
            System.out.println("BumbleBee most expensive robot");
        else if (Megatron.getPrice() > BumbleBee.getPrice() && Megatron.getPrice() > OptimusPrime.getPrice())
            System.out.println("Megatron most expensive robot");
        else System.out.println("Optimus Prime most expensive robot");
    }



}
