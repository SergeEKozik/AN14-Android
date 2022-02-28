package akalevich.Lesson_10.Lab_Rabota.Lab_1;

import akalevich.Lesson_10.Lab_Rabota.Lab_1.Services.UniqueChars;

public class MainApp {
    public static void main(String[] args) {
        String string = "Asd Fgh Jkl 12 fF";
        UniqueChars uniqueChars = new UniqueChars(string);
        showUniqueSymbols(uniqueChars);
        showUniqueNumbers(uniqueChars);
        showUniqueUpperLetters(uniqueChars);
        showUniqueLowerLetters(uniqueChars);
    }

    private static void showUniqueUpperLetters(UniqueChars uniqueChars) {
        System.out.println("Upper Register: ");
        uniqueChars.calculateSymbolsInUppRegister();
        System.out.println(uniqueChars);
    }

    private static void showUniqueLowerLetters(UniqueChars uniqueChars) {
        System.out.println("Lower Register: ");
        uniqueChars.calculateSymbolsInLowRegister();
        System.out.println(uniqueChars);
    }

    private static void showUniqueNumbers(UniqueChars uniqueChars) {
        System.out.println("Numbers: ");
        uniqueChars.calculateNumbers();
        System.out.println(uniqueChars);
    }

    private static void showUniqueSymbols(UniqueChars uniqueChars) {
        System.out.println("All Symbols: ");
        uniqueChars.calculateSymbols();
        System.out.println(uniqueChars);
    }
}
