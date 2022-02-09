package skuksovsky.Lab5.MyRobot.Heads;

public class SamsungHead extends SonyHead{

    public SamsungHead(int price) {
        super(price);
    }

    @Override
    public void speak(String text) {
        System.out.println("Говорит голова Самсунг: " + text);
    }
}
