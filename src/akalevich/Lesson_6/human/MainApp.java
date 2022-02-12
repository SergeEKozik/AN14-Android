package akalevich.Lesson_6.human;

import akalevich.Lesson_6.human.jacket.SummerJacket;
import akalevich.Lesson_6.human.jacket.WinterJacket;
import akalevich.Lesson_6.human.pants.SummerPants;
import akalevich.Lesson_6.human.pants.WinterPants;
import akalevich.Lesson_6.human.shoes.SummerShoes;
import akalevich.Lesson_6.human.shoes.WinterShoes;

public class MainApp {

    public static void main(String[] args) {
        Human vasiliy = new Human("Vasya Summer");
        Human arni = new Human("Arni Winter");
        vasiliy.getDressed(new SummerJacket(), new SummerShoes(), new SummerPants());
        vasiliy.undressed();
        arni.getDressed(new WinterJacket(), new WinterShoes(), new WinterPants());
        arni.undressed();
    }
}
