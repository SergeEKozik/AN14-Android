package ssazonenko.lab5.TaskOne.Rooms;

import ssazonenko.lab5.TaskOne.Devices.*;

import java.util.Scanner;

public class LivingRoom extends Room {
  public   void devices () {
        System.out.println("Выберите устройство:" + '\n' +
                "1.Теливизор" + '\n' +
                "2.Свет" + '\n' +
                "3.Розетка" + '\n' +
                "5.Увлажнитель воздуха");
      Scanner console = new Scanner(System.in);
      int numberOfDevice = console.nextInt();
      switch (numberOfDevice) {
          case 1:
              TV tv = new TV();
              tv.function();
              break;
          case 2:
              Light light = new Light();
              light.function();
              break;
          case 3:
              Socket socket = new Socket();
              socket.function();
              break;
          case 4:
              Humidifier humidifier = new Humidifier();
              humidifier.function();
              break;
      }
    }
}
