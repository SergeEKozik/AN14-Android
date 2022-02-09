package vkorzykov.Lab6.human;

import vkorzykov.Lab6.human.jaсket.IJaсket;
import vkorzykov.Lab6.human.shoes.IShoes;
import vkorzykov.Lab6.human.trousers.ITrousers;

public class Human {
    private String name;
    private IShoes shoes;
    private IShoes recShoes;
    private ITrousers trousers;
    private ITrousers recTrousers;
    private IJaсket jacket;
    private IJaсket recJacket;

    public Human(String name, IJaсket jacket, ITrousers trousers, IShoes shoes) {
        this.name = name;
        this.shoes = shoes;
        this.trousers = trousers;
        this.jacket = jacket;
        this.recJacket = this.jacket;
        this.recShoes = this.shoes;
        this.recTrousers = this.trousers;
    }


    public void putOn() {
        this.jacket = this.recJacket;
        jacket.putOn();
        this.trousers = this.recTrousers;
        trousers.putOn();
        this.shoes = this.recShoes;
        shoes.putOn();
    }

    public void takeOff() {
        jacket.takeOff();
        jacket = null;
        trousers.takeOff();
        trousers = null;
        shoes.takeOff();
        shoes = null;
    }

    public IJaсket getJacket() {
        return jacket;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", shoes=" + shoes +
                ", trousers=" + trousers +
                ", jacket=" + jacket +
                '}';
    }
}
