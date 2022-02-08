package vadim.sazonenko.Lab5.Robot.head;

public class SamsungHead implements Ihead {

    private int price;

   public SamsungHead (int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public  void speek(){
        System.out.println("Голова Samsung говорит");
    }
}

