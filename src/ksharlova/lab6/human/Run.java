package ksharlova.lab6.human;

import ksharlova.lab6.human.jacket.Blazer;
import ksharlova.lab6.human.jacket.Coat;
import ksharlova.lab6.human.jacket.Jacket;
import ksharlova.lab6.human.shoes.Boots;
import ksharlova.lab6.human.shoes.Sandals;
import ksharlova.lab6.human.shoes.Sneakers;
import ksharlova.lab6.human.trousers.Jeans;
import ksharlova.lab6.human.trousers.Skirt;
import ksharlova.lab6.human.trousers.Trousers;

public class Run {
    public static void main (String[] args){
        Human human1 = new Human("Jack", new Trousers("M"), new Jacket("M"), new Sneakers(42));
        System.out.println(human1.getName());
        human1.putOnClothes();
        human1.takeOffClothes();
        human1.getSize();
        System.out.println();
        Human human2 = new Human("Stella", new Skirt("S"), new Blazer("S"), new Sandals(38));
        System.out.println(human2.getName());
        human2.putOnClothes();
        human2.takeOffClothes();
        human2.getSize();
        System.out.println();
        Human human3 = new Human("Alex", new Jeans("M"), new Coat("S"), new Boots(40));
        System.out.println(human3.getName());
        human3.putOnClothes();
        human3.takeOffClothes();
        human3.getSize();
    }
}
