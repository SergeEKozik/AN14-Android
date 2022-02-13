package ksharlova.lab6.robot.hands;

public class SamsungHand implements IHand{
        private int price;
        public SamsungHand(int price){
            this.price = price;
        }
        public SamsungHand(){}

        public void upHand()  {
            System.out.println("Подняты руки Samsung");
        }

        public int getPrice() {
            return price;
        }
    }

