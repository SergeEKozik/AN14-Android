package ssazonenko.lab5.TaskOne.Devices;

import java.util.Scanner;

public class Toaster extends Device{
  public   void function (){
      System.out.println("Выберите функцию:" + '\n' +
                "1.Включение" + '\n' +
                "2.Отключение" + '\n' +
                "3.Разморозка" + '\n' +
                "4.Подогрев" );
      Scanner console = new Scanner(System.in);
      int numberOfFunction = console.nextInt();
      switch (numberOfFunction) {
          case 1:
              System.out.println("Вы включили тостер");
              break;
          case 2:
              System.out.println("Вы выключили тостер");
              break;
          case 3:
              System.out.println("Вы включили режим разморозки");
              break;
          case 4:
              System.out.println("Вы включилт режим подогрева");
              break;
      }
    }
}
