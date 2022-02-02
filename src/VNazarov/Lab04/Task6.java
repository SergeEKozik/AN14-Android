package VNazarov.Lab04;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a, b, c, d;
        do {
            System.out.print("Word A is: ");
            a = sc.nextLine();
            if (a.matches("(.*) +(.*)")) {
                System.out.println("Word has no splits! Enter a word again: ");
            }
        } while (a.matches("(.*) +(.*)")); //Check A for splits
        do {
            System.out.print("Word B is: ");
            b = sc.nextLine();
            if (b.matches("(.*) +(.*)")) {
                System.out.println("Word has no splits! Enter a word again: ");
            }
        } while (b.matches("(.*) +(.*)")); //Check B for splits
        do {
            System.out.print("Word C is: ");
            c = sc.nextLine();
            if (c.matches("(.*) +(.*)")) {
                System.out.println("Word has no splits! Enter a word again: ");
            }
        } while (c.matches("(.*) +(.*)")); //Check C for splits
        do {
            System.out.print("Word D is: ");
            d = sc.nextLine();
            if (d.matches("(.*) +(.*)")) {
                System.out.println("Word has no splits! Enter a word again: ");
            }
        } while (d.matches("(.*) +(.*)")); //Check D for splits

        System.out.println();

        char[] chA = new char[a.length()];
        char[] chB = new char[b.length()];
        char[] chC = new char[c.length()];
        char[] chD = new char[d.length()];
        a.getChars(0, a.length(), chA, 0); //Word A to char
        b.getChars(0, b.length(), chB, 0); //Word B to char
        c.getChars(0, c.length(), chC, 0); //Word C to char
        d.getChars(0, d.length(), chD, 0); //Word D to char

        int counter = 1;
        String word = "";

        for (int index = 1; index < chA.length; index++) {
            if (chA[index - 1] < chA[index]) counter++;
            else break;
        }
        if (counter == a.length()){
            System.out.println("Word A' characters are in ascending order.");
            word = a;
        }
        counter = 1;

        for (int index = 1; index < chB.length; index++) {
            if (chB[index - 1] < chB[index]) counter++;
            else break;
        }
        if (counter == b.length()){
            System.out.println("Word B' characters are in ascending order.");
            if (word != a) word = b;
        }
        counter = 1;

        for (int index = 1; index < chC.length; index++) {
            if (chC[index - 1] < chC[index]) counter++;
            else break;
        }
        if (counter == c.length()){
            System.out.println("Word C' characters are in ascending order.");
            if (word != a && word != b) word = c;
        }
        counter = 1;

        for (int index = 1; index < chD.length; index++) {
            if (chD[index - 1] < chD[index]) counter++;
            else break;
        }
        if (counter == d.length()){
            System.out.println("Word D' characters are in ascending order.");
            if (word != a && word != b && word != c) word = d;
        }
        counter = 1;

        System.out.println("The main word is " + word);
    }
}
