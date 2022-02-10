package achapovskiy.lab6.person;

import achapovskiy.lab6.person.jacket.Jacket;
import achapovskiy.lab6.person.pants.Pants;
import achapovskiy.lab6.person.shoes.Shoes;

public class Run {

    public static void main(String[] args) {
        Person men = new Person("Олег",new Jacket(),new Pants(),new Shoes());

        men.getDress();
        men.undress();
    }
}
