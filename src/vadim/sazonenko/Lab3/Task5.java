package vadim.sazonenko.Lab3;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int n = sc.nextInt();
        String[] mas = new String[n];
        int[] length = new int[n];
        int vowel = 0;
        int consonant = 0;
        int number = 0;
        int amount = 0;
        for (int index = 0; index < n; index++) {
            Scanner scan = new Scanner(System.in);
            mas[index] = scan.nextLine();
        }
        for (String word : mas) {
            if (Pattern.matches("^[a-zA-Z]+$", word))  {
                for (char letter : word.toLowerCase().toCharArray()) {
                        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'y') {
                            vowel++;
                        }
                        if (letter == 'b' || letter == 'c' || letter == 'd' || letter == 'f' || letter == 'g'
                                || letter == 'h' || letter == 'k' || letter == 'l' || letter == 'm' || letter == 'n'
                                || letter == 'p' || letter == 'r' || letter == 's' || letter == 't' || letter == 'v'
                                || letter == 'w' || letter == 'x' || letter == 'z' || letter == 'q') {
                            consonant++;
                        }

                    }
                if (consonant == vowel) {
                    number++;
                }
                consonant = 0;
                vowel = 0;
                amount++;

                }


            }
        System.out.println("Количество слов содержащие равное число гласных и согласных букв: " + number);
        System.out.println("Количество слов содержащие только латинские буквы: " + amount);
        }

    }
