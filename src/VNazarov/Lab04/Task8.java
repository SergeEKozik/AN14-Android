package VNazarov.Lab04;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task8 {
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

        Pattern pattern = Pattern.compile("[0-9]+");
        String word = "";
        int index2 = chA.length - 1;
        String finalWord = "";

        if (a.matches(pattern.pattern())){
            System.out.println("The word A contains only numbers.");
            for (int index1 = 0; index1 < chA.length; index1++) {
                    if (chA[index1] == chA[index2]){
                        word = a;
                    } else word = "";
                    index2--;
            }

            if (word == a) {
                System.out.println("This word is palindrome. ");
                finalWord = a;
                System.out.println();
            }
        }
        index2 = chB.length - 1;

        if (b.matches(pattern.pattern())){
            System.out.println("The word B contains only numbers.");
            for (int index1 = 0; index1 < chB.length; index1++) {
                if (chB[index1] == chB[index2]){
                    word = b;
                } else word = "";
                index2--;
            }

            if (word == b) {
                System.out.println("This word is palindrome. ");
                if (finalWord != a) finalWord = b;
                System.out.println();
            }
        }
        index2 = chC.length - 1;

        if (c.matches(pattern.pattern())){
            System.out.println("The word C contains only numbers.");
            for (int index1 = 0; index1 < chC.length; index1++) {
                if (chC[index1] == chC[index2]){
                    word = c;
                } else word = "";
                index2--;
            }

            if (word == c) {
                System.out.println("This word is palindrome. ");
                if(finalWord != a && finalWord != b) finalWord = c;
                System.out.println();
            }
        }
        index2 = chD.length - 1;

        if (d.matches(pattern.pattern())){
            System.out.println("The word D contains only numbers.");
            for (int index1 = 0; index1 < chD.length; index1++) {
                if (chD[index1] == chD[index2]){
                    word = d;
                } else word = "";
                index2--;
            }

            if (word == d) {
                System.out.println("This word is palindrome. ");
                if(finalWord != a && finalWord != b && finalWord != c) finalWord = d;
                System.out.println();
            }
        }

        System.out.println();
        if(finalWord != "") System.out.println("First one was word " + finalWord);
    }
}
