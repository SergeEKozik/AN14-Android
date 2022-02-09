package akutsenkou.Lesson5_7.person;

import akutsenkou.Lesson5_7.person.Jakcet.Coat;
import akutsenkou.Lesson5_7.person.Jakcet.FurCoat;
import akutsenkou.Lesson5_7.person.Pants.Jeans;
import akutsenkou.Lesson5_7.person.Shoes.Sneakers;

public class Run {
    public static void main (String[] args){
        IPerson per = new Person("Andrey", new Coat(), new Jeans(), new Sneakers());
        Person per2 = new Person("Ksenia", new FurCoat(), new Jeans(), new Sneakers());
        System.out.println(" Dress per: ");
        per.dress();
        System.out.println(" Undress per:");
        per.undress();
        System.out.println();
        System.out.println("Dress " + per2.getName());
        per2.dress();
        System.out.println("Undress " + per2.getName());
        per2.undress();

    }
}
