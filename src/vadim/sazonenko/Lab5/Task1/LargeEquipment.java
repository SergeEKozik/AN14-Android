package vadim.sazonenko.Lab5.Task1;

import java.util.Scanner;

public class LargeEquipment extends Appliances {

    void choose() {
        System.out.println(
                "1. Холодильник" + '\n' +
                        "2. Стиральная машина" + '\n' +
                        "3. Кухонная плита");
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
            case 3:
                 a = 3;
                 break;
        }
        return a;

    }




}
