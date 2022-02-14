package ssazonenko.lab5.TaskOne.Devices;

import java.util.Scanner;

public class WashingMachine extends Device {
  public  void function (){
        System.out.println("Выберите функцию:" + '\n' +
                "1.Включение" + '\n' +
                "2.Отключение" + '\n' +
                "3.Деликатная стирка" + '\n' +
                "4.Шерсть" + '\n' +
                "5.Хлопок" + '\n' +
                "6.Спортивная одежда" + '\n' +
                "7.Быстрая стирка");
      Scanner console = new Scanner(System.in);
      int numberOfFunction = console.nextInt();
      switch (numberOfFunction) {
          case 1:
              System.out.println("Вы включили стиральную машину");
              break;
          case 2:
              System.out.println("Вы выключили стиральную машину");
              break;
          case 3:
              System.out.println("Вы выбрали режим деликатная стирка");
              break;
          case 4:
              System.out.println("Вы выбрали режим шерсть");
              break;
          case 5:
              System.out.println("Вы выбрали режим хлопок");
              break;
          case 6:
              System.out.println("Вы выбрали режим спортивная одежда");
              break;
          case 7:
              System.out.println("Вы выбрали режим быстрая стирка");
              break;
      }
    }
}
