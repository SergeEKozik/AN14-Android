package ksharlova.lab6.human;

import ksharlova.lab6.human.jacket.IJacket;
import ksharlova.lab6.human.trousers.ITrousers;
import ksharlova.lab6.human.shoes.IShoes;

public class Human implements IHuman{

    private String name;
    private IShoes shoes;
    private ITrousers trousers;
    private IJacket jacket;

    public Human(String name, ITrousers trousers, IJacket jacket, IShoes shoes){
        this.name = name;
        this.trousers = trousers;
        this.jacket = jacket;
        this.shoes = shoes;
    }

    public  Human(){}

    public String getName() { return name; }

    public IJacket getJacket() { return jacket; }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public ITrousers getTrousers() { return trousers; }

    public void setTrousers(ITrousers trousers) {
        this.trousers = trousers;
    }

    public IShoes getShoes() { return shoes; }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public void putOnClothes() {
        jacket.putOn();
        trousers.putOn();
        shoes.putOn();
    }

    @Override
    public void takeOffClothes() {
        jacket.takeOff();
        trousers.takeOff();
        shoes.takeOff();
    }

    @Override
    public void getSize() {
        System.out.println("Размер верхней одежды: " + jacket.getSize() + "\nРазмер нижней одежды: " + trousers.getSize() + "\nРазмер обуви: " + shoes.getSize());
    }
}
