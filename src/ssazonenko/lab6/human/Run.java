package ssazonenko.lab6.human;

import ssazonenko.lab6.human.Father.FatherJacket;
import ssazonenko.lab6.human.Father.FatherShoes;
import ssazonenko.lab6.human.Father.FatherTrousers;
import ssazonenko.lab6.human.Human;
import ssazonenko.lab6.human.Mother.MotherJacket;
import ssazonenko.lab6.human.Mother.MotherShoes;
import ssazonenko.lab6.human.Mother.MotherTrousers;
import ssazonenko.lab6.human.Son.SonJacket;
import ssazonenko.lab6.human.Son.SonShoes;
import ssazonenko.lab6.human.Son.SonTrousers;

import java.util.Scanner;

public class Run {
    public static void main (String [] args) {
        System.out.println("Введите кого хотиете выбрать:мама, папа , сын");
        Scanner console = new Scanner(System.in);
        String man = console.nextLine();
        if (man.equalsIgnoreCase("Папа")) {
            Human father = new Human(new FatherJacket() , new FatherShoes() , new FatherTrousers());
            System.out.println("Введите действие");
            father.action();
        }
        if (man.equalsIgnoreCase("Мама")) {
            Human mother = new Human(new MotherJacket(), new MotherShoes(), new MotherTrousers());
            System.out.println("Введите действие");
            mother.action();
        }
        if (man.equalsIgnoreCase("Сын")) {
            Human son = new Human(new SonJacket(), new SonShoes(), new SonTrousers());
            System.out.println("Введите действие");
            son.action();
        }
    }
}
