package ssazonenko.lab5.TaskOne.Devices;

import java.util.Scanner;

public class Light extends Device {
   public void function (){
        System.out.println("Выберите функцию:" + '\n' +
                "1.Включение" + '\n' +
                "2.Отключение" + '\n' +
                "3.Установка теплого света" + '\n' +
                "4.Установка холодного света");
       Scanner console = new Scanner(System.in);
       int numberOfFunction = console.nextInt();
       switch (numberOfFunction) {
           case 1:
               System.out.println("Вы включили свет");
               break;
           case 2:
               System.out.println("Вы выключили свет");
               break;
           case 3:
               System.out.println("Вы включили теплый свет");
               break;
           case 4:
               System.out.println("Вы включили холодный свет");
               break;
       }
    }
}
