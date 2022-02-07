package vadim.sazonenko.Lab5.Task1;

import java.util.Scanner;

public class Refrigerator extends LargeEquipment{
     void chooseApp () {
     Scanner sc = new Scanner(System.in);

     Refrigerator refrigerator1 = new Refrigerator();
     Refrigerator refrigerator2 = new Refrigerator();
     Refrigerator refrigerator3 = new Refrigerator();

     System.out.println(
                             "1. LG" + '\n' +
                             "2. ATLANT");
     System.out.print("Выберите БРЕНД (введите цифру): " );

     int numberofbrand = sc.nextInt();

     switch (numberofbrand) {
         case 1:

             refrigerator1.Info("LG", "DoorCooling+ GA-B509SVUM");
             refrigerator1.ConectOn(true);
             refrigerator2.Info("LG", "GA-B459MQUM");
             refrigerator2.ConectOn(true);
             refrigerator3.Info("LG", "GC-Q247CADC");
             refrigerator3.ConectOn(true);
             break;
         case 2:
             refrigerator1.Info("ATLANT", "ХМ 4307-000");
             refrigerator1.ConectOn(true);
             refrigerator2.Info("ATLANT", "ХМ 4208-000");
             refrigerator2.ConectOn(true);
             refrigerator3.Info("ATLANT", "МХМ 2835-90");
             refrigerator3.ConectOn(true);
             break;
     }
 }


}
