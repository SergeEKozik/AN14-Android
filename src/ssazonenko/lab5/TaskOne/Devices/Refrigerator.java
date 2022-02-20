package ssazonenko.lab5.TaskOne.Devices;

import java.util.Scanner;

public class Refrigerator extends Device{
  public   void function (){
        System.out.println("Выберите функцию:" + '\n' +
                "1.Установка температуры" );
      Scanner console = new Scanner(System.in);
      int numberOfFunction = console.nextInt();
      switch (numberOfFunction) {
          case 1:
              System.out.println("Пожалуйста, установите температуру");
              int temperature = console.nextInt();
              System.out.println("Вы установили  температуру" + " " + temperature + " " + " градус(ов)");
              break;
      }
    }
}
