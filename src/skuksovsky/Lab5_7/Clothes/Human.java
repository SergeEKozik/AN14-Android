package skuksovsky.Lab5_7.Clothes;

import skuksovsky.Lab5_7.Clothes.Jacket.Jackets;
import skuksovsky.Lab5_7.Clothes.Pants.AllPants;
import skuksovsky.Lab5_7.Clothes.Shoes.AllShoes;

public class Human {
    private final String name;
    private Jackets jacket;
    private AllPants pants;
    private AllShoes shoes;

    public Human(String name, Jackets jacket, AllPants pants, AllShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public void putOn() {
        System.out.println("Меня зовут " + this.name + " и я: " );
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
        System.out.println("");
    }

    public void takeOff() {
        System.out.println("Меня зовут " + this.name + " и я: " );
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
        System.out.println("");
    }

}
