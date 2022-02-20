package ssazonenko.lab5.TaskTwo.Type;


import ssazonenko.lab5.TaskTwo.Model.Middle.KC55717;
import ssazonenko.lab5.TaskTwo.Model.Middle.KC55717A;
import ssazonenko.lab5.TaskTwo.Model.Middle.KC59711;
import ssazonenko.lab5.TaskTwo.Type.Autocrane;

import java.util.Scanner;

public class MiddleClass  extends Autocrane {
  public   void catalog () {
        System.out.println("Данный класс представлен следующими моделями:" + '\n' +
                "1.Клинцы КС-55717" + '\n' +
                "2.Клинцы КС-55717A" + '\n' +
                "3.Клинцы КС-59711");
      System.out.println("Выберите модель");
      Scanner console = new Scanner(System.in);
      int model = console.nextInt();
      switch (model) {
          case 1:
              KC55717 kc5571717 = new KC55717();
              kc5571717.model();
              break;
          case 2:
              KC55717A kc5571717a = new KC55717A();
              kc5571717a.model();
              break;
          case 3:
              KC59711 kc59711 = new KC59711();
              kc59711.model();
              break;
      }
    }
}
