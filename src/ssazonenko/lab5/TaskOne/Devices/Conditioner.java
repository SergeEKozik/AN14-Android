package ssazonenko.lab5.TaskOne.Devices;

import java.net.ServerSocket;
import java.util.Scanner;

public class Conditioner extends Device {
    public void function() {
        System.out.println("Выберите функцию:" + '\n' +
                "1.Включение" + '\n' +
                "2.Отключение" + '\n' +
                "3.Установка таймера" + '\n' +
                "4.Установка температуры");
        Scanner console = new Scanner(System.in);
        int numberOfFunction = console.nextInt();
        switch (numberOfFunction) {
            case 1:
                System.out.println("Вы включили кондиционер");
                break;
            case 2:
                System.out.println("Вы выключили кондиционер");
                break;
            case 3:
                System.out.println("Пожалуйста, установите время");
                int time = console.nextInt();
                System.out.println("Время работы кондициоера " + " " + time + " " + "часов(а)");
                break;
            case 4:
            System.out.println("Пожалуйста, установите температуру");
            int temperature = console.nextInt();
            System.out.println("Вы установили  температуру" + " " + temperature + " " + " градус(ов)");
            break;
        }
    }
}
