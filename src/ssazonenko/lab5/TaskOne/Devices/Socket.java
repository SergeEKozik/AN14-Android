package ssazonenko.lab5.TaskOne.Devices;

import java.util.Scanner;

public class Socket extends Device {
    public void function() {
        System.out.println("Выберите функцию:" + '\n' +
                "1.Включение" + '\n' +
                "2.Отключение");
        Scanner console = new Scanner(System.in);
        int numberOfFunction = console.nextInt();
        switch (numberOfFunction) {
            case 1:
                System.out.println("Вы включили розетку");
                break;
            case 2:
                System.out.println("Вы выключили розетку");
                break;
        }
    }
}
