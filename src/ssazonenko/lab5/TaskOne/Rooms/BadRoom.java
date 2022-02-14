package ssazonenko.lab5.TaskOne.Rooms;

import ssazonenko.lab5.TaskOne.Devices.*;

import java.util.Scanner;

public class BadRoom extends Room {
public  void devices () {
    System.out.println("Выберите устройство:" + '\n' +
            "1.Теливизор" + '\n' +
            "2.Кондиционер" + '\n' +
            "3.Увлажнитель воздуха" + '\n' +
            "4.Розетка" +'\n' +
            "5.Свет");
    Scanner console = new Scanner(System.in);
    int numberOfDevice = console.nextInt();
    switch (numberOfDevice) {
        case 1:
            TV tv = new TV();
            tv.function();
            break;
        case 2:
            Conditioner conditioner = new Conditioner();
            conditioner.function();
            break;
        case 3:
            Humidifier humidifier = new Humidifier();
            humidifier.function();
            break;
        case 4:
            Socket socket = new Socket();
            socket.function();
            break;
        case 5:
            Light light = new Light();
            light.function();
            break;
    }
}

}
