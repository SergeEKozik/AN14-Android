package vadim.sazonenko.Lab5.Robot.leg;

public class SonyLeg implements Ileg{
    private int price;

   public SonyLeg (int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public  void StepLeg(){
        System.out.println("Нога Sony делает шаг");
    }
}
