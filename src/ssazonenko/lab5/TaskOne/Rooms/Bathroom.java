package ssazonenko.lab5.TaskOne.Rooms;

import ssazonenko.lab5.TaskOne.Devices.*;

import java.util.Scanner;

public class Bathroom extends Room {
  public   void devices () {
        System.out.println("Выберите устройство:" + '\n' +
                "1.Свет" + '\n' +
                "2.Душ" + '\n' +
                "3.Стиральная машина" + '\n' +
                "4.Розетка");
      Scanner console = new Scanner(System.in);
      int numberOfDevice = console.nextInt();
      switch (numberOfDevice) {
          case 1:
              Light light = new Light();
              light.function();
              break;
          case 2:
              Shower shower = new Shower();
              shower.function();
              break;
          case 3:
              WashingMachine washingmachine = new WashingMachine();
              washingmachine.function();
              break;
          case 4:
              Socket socket = new Socket();
              socket.function();
              break;
      }
    }
}
