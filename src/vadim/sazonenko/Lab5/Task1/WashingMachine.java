package vadim.sazonenko.Lab5.Task1;

import java.util.Scanner;

public class WashingMachine extends LargeEquipment{
    void chooseApp () {
        Scanner sc = new Scanner(System.in);

        WashingMachine washingMachine1 = new WashingMachine();
        WashingMachine washingMachine2 = new WashingMachine();

        System.out.println(
                                "1. LG" + '\n' +
                                "2. INDESIT");
        System.out.print("Выберите бренд (введите цифру): " );

        int numberofbrand = sc.nextInt();

        switch (numberofbrand) {
            case 1:

                washingMachine1.Info("LG", "F2V9GW9P");
                washingMachine1.ConectOn(true);
                washingMachine2.Info("LG", "F12M7NDS0");
                washingMachine2.ConectOn(true);
                break;
            case 2:
                washingMachine1.Info("INDESIT", "IWSB 51051 BY");
                washingMachine1.ConectOn(true);
                washingMachine2.Info("INDESIT", "IWUB 40851 BY");
                washingMachine2.ConectOn(true);
                break;

        }
    }
}
