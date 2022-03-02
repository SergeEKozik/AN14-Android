package akutsenkou.Lesson10.Lab2;

import akutsenkou.Lesson10.Lab2.UniqueNumbers;

public class Main {
    public static void main(String[] args) {
        UniqueNumbers uc = new UniqueNumbers();
        uc.setNumber(1112223335);
        uc.calculate();
        System.out.println(uc.toString());
    }
}
