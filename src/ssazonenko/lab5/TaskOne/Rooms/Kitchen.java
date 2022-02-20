package ssazonenko.lab5.TaskOne.Rooms;

import ssazonenko.lab5.TaskOne.Devices.*;

import java.util.Scanner;

public class Kitchen extends Room {
   public void devices () {
        System.out.println("Выберите устройство:" + '\n' +
                "1.Чайник" + '\n' +
                "2.Холодильник" + '\n' +
                "3.Свет" + '\n' +
                "4.Розетка" + '\n' +
                "5.Тостер");
       Scanner console = new Scanner(System.in);
       int numberOfDevice = console.nextInt();
       switch (numberOfDevice) {
           case 1:
               Teapot teapot = new Teapot();
               teapot.function();
               break;
           case 2:
               Refrigerator refrigerator = new Refrigerator();
               refrigerator.function();
               break;
           case 3:
               Light light = new Light();
               light.function();
               break;
           case 4:
               Socket socket = new Socket();
               socket.function();
               break;
           case 5:
               Toaster toaster = new Toaster();
               toaster.function();
       }
    }
}
