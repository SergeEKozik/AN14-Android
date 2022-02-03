package vadim.sazonenko.Lab3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = sc.nextInt();
        String[] mas = new String[n];
        int sum = 0;
        for (int index = 0; index < n; index++) {
            Scanner scan = new Scanner(System.in);
            mas[index] = scan.nextLine();
        }

        for (String array : mas) {
            sum = sum + array.length();
            }
        System.out.println("Средняя длина строки: " + sum/n);
        for (String str : mas){
            if (str.length() < sum/n){
                System.out.println("Выводимая строка: " + str);
            }
        }

        }




    }

