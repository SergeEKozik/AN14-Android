package vadim.sazonenko.Lab5.Task1;

import java.util.Scanner;

public class CookingFood extends Appliances {

    void choose() {
        System.out.println(
                "1. Микроволновая печь" + '\n' +
                        "2. Мультиварка");
        System.out.print("Выберите категорию (введите цифру): ");
    }

    int choosebrand() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                a = 1;
                break;
            case 2:
                a = 2;
                break;
        }
        return a;
    }
}
