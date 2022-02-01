package VNazarov.Lab04;
import java.util.Scanner;
public class Task4 {
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

        char[] chA = new char[a.length()];
        char[] chB = new char[b.length()];
        char[] chC = new char[c.length()];
        char[] chD = new char[d.length()];
        a.getChars(1, a.length(), chA, 0); //Word A to char
        b.getChars(1, b.length(), chB, 0); //Word B to char
        c.getChars(1, c.length(), chC, 0); //Word C to char
        d.getChars(1, d.length(), chD, 0); //Word D to char

        int countUniA = 1; //count unique symbols in word A
        for (int counter = 0; counter < chA.length; counter++) {
            for (int index = 1; index < chA.length; index++) {
                if (chA[index - 1] != chA[index]) countUniA++;
            }
        }

        int countUniB = 1; //count unique symbols in word B
        for (int counter = 0; counter < chB.length; counter++) {
            for (int index = 1; index < chB.length; index++) {
                if (chB[index - 1] != chB[index]) countUniB++;
            }
        }

        int countUniC = 1; //count unique symbols in word C
        for (int counter = 0; counter < chC.length; counter++) {
            for (int index = 1; index < chC.length; index++) {
                if (chC[index - 1] != chC[index]) countUniC++;
            }
        }

        int countUniD = 1; //count unique symbols in word A
        for (int counter = 0; counter < chD.length; counter++) {
            for (int index = 1; index < chD.length; index++) {
                if (chD[index - 1] != chD[index]) countUniD++;
            }
        }

        if (countUniA < countUniB && countUniA < countUniC && countUniA < countUniD){
            System.out.print("Word A has the lowest number of unique symbols: " + a);
            System.out.println();
        } else if (countUniB < countUniA && countUniB < countUniC && countUniB < countUniD){
            System.out.print("Word B has the lowest number of unique symbols: " + b);
            System.out.println();
        } else if (countUniC < countUniA && countUniC < countUniB && countUniC < countUniD){
            System.out.print("Word C has the lowest number of unique symbols: " + c);
            System.out.println();
        } else if (countUniD < countUniA && countUniD < countUniC && countUniD < countUniB){
            System.out.print("Word D has the lowest number of unique symbols: " + d);
            System.out.println();
        }

        if (countUniA == countUniB && countUniA < countUniC && countUniA < countUniD){
            System.out.print("Words A and B has the lowest number of unique symbols, but A was first: " + a);
            System.out.println();
        } else if (countUniA == countUniC && countUniA < countUniB && countUniA < countUniD){
            System.out.print("Words A and C has the lowest number of unique symbols, but A was first: " + a);
            System.out.println();
        } else if (countUniA == countUniD && countUniA < countUniB && countUniA < countUniC){
            System.out.print("Words A and D has the lowest number of unique symbols, but A was first: " + a);
            System.out.println();
        } else if (countUniB == countUniC && countUniB < countUniA && countUniB < countUniD){
            System.out.print("Words B and C has the lowest number of unique symbols, but B was first: " + b);
            System.out.println();
        } else if (countUniB == countUniD && countUniB < countUniA && countUniB < countUniC){
            System.out.print("Words B and D has the lowest number of unique symbols, but B was first: " + b);
            System.out.println();
        } else if (countUniC == countUniD && countUniC < countUniA && countUniC < countUniB){
            System.out.print("Words C and D has the lowest number of unique symbols, but C was first: " + c);
            System.out.println();
        }

        if (countUniA == countUniB && countUniA == countUniC && countUniA < countUniD){
            System.out.print("Words A, B and C has the lowest number of unique symbols, but A was first: " + a);
            System.out.println();
        } else if (countUniA == countUniB && countUniA == countUniD && countUniA < countUniC) {
            System.out.print("Words A, B and D has the lowest number of unique symbols, but A was first: " + a);
            System.out.println();
        } else if (countUniB == countUniC && countUniB == countUniD && countUniB < countUniA) {
            System.out.print("Words B, C and D has the lowest number of unique symbols, but B was first: " + b);
            System.out.println();
        }
    }
}
