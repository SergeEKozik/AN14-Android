package VNazarov.Lab06.Human;

import VNazarov.Lab06.Human.Pants.Jeans;
import VNazarov.Lab06.Human.Pants.Sweatpants;
import VNazarov.Lab06.Human.Pants.Trousers;
import VNazarov.Lab06.Human.Shoes.Berets;
import VNazarov.Lab06.Human.Shoes.Boots;
import VNazarov.Lab06.Human.Shoes.Sneakers;
import VNazarov.Lab06.Human.Top.Coat;
import VNazarov.Lab06.Human.Top.Jacket;
import VNazarov.Lab06.Human.Top.WindBreaker;

public class Run {
    public static void main(String[] args) {

        Jacket jacket = new Jacket("Nike");
        Coat coat = new Coat("Ralph Laurens");
        WindBreaker windBreaker = new WindBreaker("Adidas");

        Jeans jeans = new Jeans("Collins");
        Sweatpants sweatpants = new Sweatpants("Puma");
        Trousers trousers = new Trousers("Gucci");

        Berets berets = new Berets("Dr.Martens");
        Boots boots = new Boots("Timberland");
        Sneakers sneakers = new Sneakers("Vans");

        Human Dave = new Human("Dave",  coat, trousers, berets);
        Human Carl = new Human("Carl", jacket, jeans, sneakers);
        Human Caroline = new Human("Caroline", windBreaker, sweatpants, boots);

        Dave.getClothesOn();
        Carl.getClothesOn();
        Caroline.getClothesOn();

        Carl.getClothesOff();
    }
}
