package vkorzykov.Lab6.human;

import vkorzykov.Lab6.human.jaсket.DenimJacket;
import vkorzykov.Lab6.human.shoes.SandalsShoes;
import vkorzykov.Lab6.human.trousers.BananTrousers;

public class RUN {
    public static void main(String[] args) {
        Human pablo = new Human("Pablo", new DenimJacket(),new BananTrousers(),new SandalsShoes());
        System.out.println(pablo);
        pablo.takeOff();
        System.out.println(pablo);
        pablo.putOn();
        System.out.println(pablo);






    }
}
