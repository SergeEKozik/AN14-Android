package VNazarov.Lab06.Human;

import VNazarov.Lab06.Human.Pants.IPants;
import VNazarov.Lab06.Human.Top.ITop;
import VNazarov.Lab06.Human.Shoes.IShoes;

public class Human implements IHuman{
    private String humanName;
    private ITop top;
    private IShoes shoes;
    private IPants pants;

    Human(){}
    Human(String name, ITop top, IPants pants, IShoes shoes){
        this.humanName = name;
        System.out.println("Human " + name + " is created.");
        this.top = top;
        this.pants = pants;
        this.shoes = shoes;
        System.out.println(name + " has " + top + " top, " + pants + " pants and a  " + shoes + " shoes.");
    }

    @Override
    public void getClothesOff() {
        top.getOff();
        pants.getOff();
        shoes.getOff();
    }

    @Override
    public void getClothesOn() {
        top.getOn();
        pants.getOn();
        shoes.getOn();
    }
}
