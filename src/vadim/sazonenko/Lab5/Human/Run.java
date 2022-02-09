package vadim.sazonenko.Lab5.Human;

import vadim.sazonenko.Lab5.Human.jacket.BossJacket;
import vadim.sazonenko.Lab5.Human.pants.GucciPants;
import vadim.sazonenko.Lab5.Human.shoes.PradaShoes;

public class Run {
    public static void main ( String[] args) {
        Human firstHuman = new Human("Игорь", new BossJacket(), new GucciPants(), new PradaShoes());
        firstHuman.name();
        firstHuman.putOnAll();
        firstHuman.takeOffAll();
    }
}
