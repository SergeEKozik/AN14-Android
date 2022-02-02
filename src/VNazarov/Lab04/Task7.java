package VNazarov.Lab04;
import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
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

        char[] wordA = new char[a.length()];
        char[] wordB = new char[b.length()];
        char[] wordC = new char[c.length()];
        char[] wordD = new char[d.length()];
        wordA[a.length() - 1] = chA[a.length() - 1];
        wordB[b.length() - 1] = chB[b.length() - 1];
        wordC[c.length() - 1] = chC[c.length() - 1];
        wordD[d.length() - 1] = chD[d.length() - 1];

        String finalWord = "";

        for (int index1 = 0; index1 < chA.length - 1; index1++) {
            for (int index2 = 1; index2 < chA.length; index2++) {
                if (chA[index1] != chA[index2]){
                    wordA[index1] = chA[index1];
                } else if (chA[index1] == chA[index2]){
                    wordA[index1] = ' ';
                }
            }
        }
        if (Arrays.equals(wordA, chA)){
            System.out.println("The word A has only unique symbols.");
            finalWord = a;
        }

        for (int index1 = 0; index1 < chB.length - 1; index1++) {
            for (int index2 = 1; index2 < chB.length; index2++) {
                if (chB[index1] != chB[index2]){
                    wordB[index1] = chB[index1];
                } else if (chB[index1] == chB[index2]){
                    wordB[index1] = ' ';
                }
            }
        }
        if (Arrays.equals(wordB, chB)){
            System.out.println("The word B has only unique symbols.");
            if (finalWord != a) finalWord = b;
        }

        for (int index1 = 0; index1 < chC.length - 1; index1++) {
            for (int index2 = 1; index2 < chC.length; index2++) {
                if (chC[index1] != chC[index2]){
                    wordC[index1] = chC[index1];
                } else if (chC[index1] == chC[index2]){
                    wordC[index1] = ' ';
                }
            }
        }
        if (Arrays.equals(wordC, chC)){
            System.out.println("The word C has only unique symbols.");
            if (finalWord != a && finalWord != b) finalWord = c;
        }

        for (int index1 = 0; index1 < chD.length - 1; index1++) {
            for (int index2 = 1; index2 < chD.length; index2++) {
                if (chD[index1] != chD[index2]){
                    wordD[index1] = chD[index1];
                } else if (chD[index1] == chD[index2]){
                    wordD[index1] = ' ';
                }
            }
        }
        if (Arrays.equals(wordD, chD)){
            System.out.println("The word D has only unique symbols.");
            if (finalWord != a && finalWord != b && finalWord != c) finalWord = d;
        }

        System.out.println();
        if (finalWord != "") System.out.println("The first one was " + finalWord);
    }
}
