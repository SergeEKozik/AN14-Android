package vadim.sazonenko.Lab5.Robot.leg;

public class SamsungLeg implements Ileg{
    private int price;

   public SamsungLeg (int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public  void StepLeg(){
        System.out.println("Нога Samsung делает шаг");
    }
}
