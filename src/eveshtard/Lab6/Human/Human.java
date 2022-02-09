package eveshtard.Lab6.Human;

import eveshtard.Lab6.Human.Jacket.IJacket;
import eveshtard.Lab6.Human.Shoes.IShoes;
import eveshtard.Lab6.Human.Trousers.ITrousers;

public class Human implements IHuman {
    private String name;
    private IJacket jacket;
    private IShoes shoes;
    private ITrousers trousers;

    public Human(String name, IJacket jacket, IShoes shoes, ITrousers trousers) {
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.trousers = trousers;
    }

    public Human() {
    }

    @Override
    public void putOn() {
        System.out.println(getName() + ":");
        jacket.putOn();
        shoes.putOn();
        trousers.putOn();
    }

    @Override
    public void takeOff() {
        System.out.println(getName() + ":");
        jacket.takeOff();
        shoes.takeOff();
        trousers.takeOff();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    public ITrousers getTrousers() {
        return trousers;
    }

    public void setTrousers(ITrousers trousers) {
        this.trousers = trousers;
    }
}
