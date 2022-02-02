package VNazarov.Lab04;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task5 {
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

        int countVowel = 0;
        int countConsonant = 0;

        Pattern pattern = Pattern.compile("[a-zA-z]+");

        if (a.matches(pattern.pattern())){
            System.out.println("Word A has only symbols of the English Alphabet.");
            for (int index = 0; index < chA.length; index++) {

                if (chA[index] == 'a' || chA[index] == 'A' || chA[index] == 'e' || chA[index] == 'E' || chA[index] == 'i'
                || chA[index] == 'I' || chA[index] == 'o' || chA[index] == 'O' || chA[index] == 'u' || chA[index] == 'U'
                        || chA[index] == 'y' || chA[index] == 'Y'){
                    countVowel++;
                } else countConsonant++;
            }

            if (countConsonant == countVowel) System.out.println("This word contains the same number of consonants and vowels.");
            countVowel = countConsonant = 0;
            System.out.println();

        }

        if (b.matches(pattern.pattern())){
            System.out.println("Word B has only symbols of the English Alphabet.");
            for (int index = 0; index < chB.length; index++) {

                if (chB[index] == 'a' || chB[index] == 'A' || chB[index] == 'e' || chB[index] == 'E' || chB[index] == 'i'
                        || chB[index] == 'I' || chB[index] == 'o' || chB[index] == 'O' || chB[index] == 'u' || chB[index] == 'U'
                        || chB[index] == 'y' || chB[index] == 'Y') {
                    countVowel++;
                } else countConsonant++;
            }

            if (countConsonant == countVowel) System.out.println("This word contains the same number of consonants and vowels.");
            countVowel = countConsonant = 0;
            System.out.println();

        }

        if (c.matches(pattern.pattern())){
            System.out.println("Word C has only symbols of the English Alphabet.");
            for (int index = 0; index < chC.length; index++) {

                if (chC[index] == 'a' || chC[index] == 'A' || chC[index] == 'e' || chC[index] == 'E' || chC[index] == 'i'
                        || chC[index] == 'I' || chC[index] == 'o' || chC[index] == 'O' || chC[index] == 'u' || chC[index] == 'U'
                        || chC[index] == 'y' || chC[index] == 'Y') {
                    countVowel++;
                } else countConsonant++;
            }

            if (countConsonant == countVowel) System.out.println("This word contains the same number of consonants and vowels.");
            countVowel = countConsonant = 0;
            System.out.println();

        }

        if (d.matches(pattern.pattern())){
            System.out.println("Word D has only symbols of the English Alphabet.");
            for (int index = 0; index < chD.length; index++) {

                if (chD[index] == 'a' || chD[index] == 'A' || chD[index] == 'e' || chD[index] == 'E' || chD[index] == 'i'
                        || chD[index] == 'I' || chD[index] == 'o' || chD[index] == 'O' || chD[index] == 'u' || chD[index] == 'U'
                        || chD[index] == 'y' || chD[index] == 'Y') {
                    countVowel++;
                } else countConsonant++;
            }

            if (countConsonant == countVowel) System.out.println("This word contains the same number of consonants and vowels.");
            countVowel = countConsonant = 0;
            System.out.println();

        }
    }
}
