package kvizhunou.Man;

public class Human implements IHuman {
    private String name;
    private IJacket jacket;
    private ITrousers trousers;
    private IShoes shoes;

    public Human(IJacket jacket, ITrousers trousers, IShoes shoes) {
        this.jacket = jacket;
        this.trousers = trousers;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
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
}
