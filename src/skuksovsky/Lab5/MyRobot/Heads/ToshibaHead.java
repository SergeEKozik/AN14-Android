package skuksovsky.Lab5.MyRobot.Heads;

public class ToshibaHead extends SonyHead {

    public ToshibaHead(int price) {
        super(price);
    }

    @Override
    public void speak(String text) {
        System.out.println("Говорит голова Тошиба: " + text);
    }
}
