package ssazonenko.lab6.human;

import ssazonenko.lab6.human.Interfaces.IHuman;
import ssazonenko.lab6.human.Interfaces.IJacket;
import ssazonenko.lab6.human.Interfaces.IShoes;
import ssazonenko.lab6.human.Interfaces.ITrousers;

import java.util.Scanner;

public class Human implements IHuman {
    private IJacket jacket;
    private IShoes shoes;
    private ITrousers trousers;

    public Human(IJacket jacket, IShoes shoes, ITrousers trousers) {
        this.jacket = jacket;
        this.shoes = shoes;
        this.trousers = trousers;
    }

    @Override
    public void action() {
        Scanner console = new Scanner(System.in);
        String action = console.nextLine();
        switch (action) {
            case "снять штаны":
                trousers.takeoff();
                break;
            case "надеть штаны" :
                trousers.puton();
                break;
            case "снять обувь":
                shoes.takeoff();
                break;
            case "надеть обувь" :
                shoes.puton();
                break;
            case "снять куртку":
                jacket.takeoff();
                break;
            case "надеть куртку" :
                jacket.puton();
                break;
        }
    }
}
