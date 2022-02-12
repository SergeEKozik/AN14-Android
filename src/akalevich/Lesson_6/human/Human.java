package akalevich.Lesson_6.human;

import akalevich.Lesson_6.human.jacket.IJacket;
import akalevich.Lesson_6.human.pants.IPants;
import akalevich.Lesson_6.human.shoes.IShoes;

public class Human implements IHuman {

    String humanName;
    private IJacket jacket;
    private IShoes shoes;
    private IPants pants;

    public Human(String humanName) {
        this.humanName = humanName;
        System.out.println("Naked " + humanName + " is here.");
    }

    public void getDressed(IJacket jacket, IShoes shoes, IPants pants) {
        this.jacket = jacket;
        this.shoes = shoes;
        this.pants = pants;
        pants.putOnPants();
        jacket.putOnJacket();
        shoes.putOnShoes();
    }

    public void undressed() {
        shoes.takeOffShoes();
        jacket.takeOffJacket();
        pants.takeOffPants();
        this.jacket = null;
        this.shoes = null;
        this.pants = null;
    }
}
