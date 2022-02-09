package vadim.sazonenko.Lab5.Human;

import vadim.sazonenko.Lab5.Human.jacket.Ijacket;
import vadim.sazonenko.Lab5.Human.pants.Ipants;
import vadim.sazonenko.Lab5.Human.shoes.Ishoes;

public class Human implements Ihuman {

    private String name;
    private Ijacket jacket;
    private Ipants pants;
    private Ishoes shoes;

    Human (String name, Ijacket jacket, Ipants pants, Ishoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Ijacket getJacket() {
        return jacket;
    }

    public void setJacket(Ijacket jacket) {
        this.jacket = jacket;
    }

    public Ipants getPants() {
        return pants;
    }

    public void setPants(Ipants pants) {
        this.pants = pants;
    }

    public Ishoes getShoes() {
        return shoes;
    }

    public void setShoes(Ishoes shoes) {
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void putOnAll() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void takeOffAll() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }

    @Override
    public void name() {
        System.out.println(name);

    }
}
