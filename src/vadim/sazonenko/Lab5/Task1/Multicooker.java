package vadim.sazonenko.Lab5.Task1;

import java.util.Scanner;

public class Multicooker extends  CookingFood{

    void chooseApp () {
        Scanner sc = new Scanner(System.in);

        Multicooker multicooker1 = new Multicooker();
        Multicooker multicooker2 = new Multicooker();

        System.out.println(
                "1. POLARIS" + '\n' +
                        "2. REDMOND");
        System.out.print("Выберите БРЕНД (введите цифру): " );

        int numberofbrand = sc.nextInt();

        switch (numberofbrand) {
            case 1:

                multicooker1.Info("POLARIS", "PMC 0586AD");
                multicooker1.ConectOn(true);
                multicooker2.Info("POLARIS", "PMC 0366AD");
                multicooker2.ConectOn(true);

                break;
            case 2:
                multicooker1.Info("REDMOND", " RMC-M90");
                multicooker1.ConectOn(true);
                multicooker2.Info("REDMOND", "RMC-03");
                multicooker2.ConectOn(true);
                break;
        }
    }
}
