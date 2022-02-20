package ssazonenko.lab5.TaskOne.Devices;

import java.util.Scanner;

public class Humidifier extends Device {
   public void function (){
        System.out.println("Выберите функцию:" + '\n' +
                "1.Включение" + '\n' +
                "2.Отключение" + '\n' +
                "3.Установка таймера"  );
       Scanner console = new Scanner(System.in);
       int numberOfFunction = console.nextInt();
       switch (numberOfFunction) {
           case 1:
               System.out.println("Вы включили увлажнитель");
               break;
           case 2:
               System.out.println("Вы выключили отключили увлажнитель");
               break;
           case 3:
               System.out.println("Пожалуйста, установите время");
               int time = console.nextInt();
               System.out.println("Время работы увлажниетеля" + " " + time + " " + "часов(а)");
               break;
       }
    }
}
