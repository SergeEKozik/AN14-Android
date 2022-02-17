package kvizhunou.Lab6.Man;

import kvizhunou.Lab6.Man.Jacket.IJacket;
import kvizhunou.Lab6.Man.Shoes.IShoes;
import kvizhunou.Lab6.Man.Trousers.ITrousers;

public class Human implements IHuman {
    private String humanName;
    private IJacket jacket;
    private ITrousers trousers;
    private IShoes shoes;


    public Human(String humanName,IJacket jacket, ITrousers trousers, IShoes shoes) {
        this.jacket = jacket;
        this.trousers = trousers;
        this.shoes = shoes;
    }

    public String getName() {
        return humanName;
    }

    public void putOn() {
        jacket.putOn();
        trousers.putOn();
        shoes.putOn();

    }

    @Override
    public void takeOff() {
        jacket.takeOff();
        trousers.takeOff();
        shoes.takeOff();
    }
    public void DisplayInfo(){
        System.out.println();
        System.out.println();
        System.out.println("");

    }
}
