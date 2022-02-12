package akalevich.Lesson_6.human;

import akalevich.Lesson_6.human.jacket.IJacket;
import akalevich.Lesson_6.human.pants.IPants;
import akalevich.Lesson_6.human.shoes.IShoes;

public interface IHuman {
    void getDressed(IJacket jacket, IShoes shoes, IPants pants);
    void undressed();
}
