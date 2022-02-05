package akutsenkou.Lesson4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrayStr = new String[5];
        System.out.println("Введите 5 слов: ");
        for(int i = 0; i < 5; i++){
            arrayStr[i] = sc.nextLine();
        }
    }
}
