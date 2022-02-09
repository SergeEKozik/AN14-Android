package kdavydenko.Lesson5.Human;

import kdavydenko.Lesson5.Human.Jacket.IJacket;
import kdavydenko.Lesson5.Human.Pants.IPants;
import kdavydenko.Lesson5.Human.Shoes.IShoes;

public class Human implements IHuman {
    private String humanName;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human(String humanName, IJacket jacket, IPants pants, IShoes shoes) {
        this.humanName = humanName;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public void getHumanName() {
        System.out.println(this.humanName);
    }

    @Override
    public void getDressed() {
        jacket.getDressed();
        pants.getDressed();
        shoes.getDressed();
    }

    @Override
    public void undress() {
        jacket.undress();
        pants.undress();
        shoes.undress();
    }
}
