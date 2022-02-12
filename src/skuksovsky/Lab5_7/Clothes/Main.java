package skuksovsky.Lab5_7.Clothes;

import skuksovsky.Lab5_7.Clothes.Jacket.AdidasJacket;
import skuksovsky.Lab5_7.Clothes.Jacket.ZaraJacket;
import skuksovsky.Lab5_7.Clothes.Pants.LeePants;
import skuksovsky.Lab5_7.Clothes.Pants.LevisPants;
import skuksovsky.Lab5_7.Clothes.Shoes.ReebokShoes;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Витя", new AdidasJacket(), new LeePants(), new ReebokShoes());
        Human human1 = new Human("Стас", new ZaraJacket(), new LevisPants(), new ReebokShoes());

        human.putOn();
        human.putOn();
        human.takeOff();

        human1.takeOff();
        human1.putOn();
    }
}
