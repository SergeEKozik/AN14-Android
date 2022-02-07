package vadim.sazonenko.Lab5.Task1;

import java.util.Scanner;

public class Microwave extends  CookingFood{

    void chooseApp () {
        Scanner sc = new Scanner(System.in);

        Microwave microwave1 = new Microwave();
        Microwave microwave2 = new Microwave();

        System.out.println(
                "1. LG" + '\n' +
                        "2. SAMSUNG");
        System.out.print("Выберите БРЕНД (введите цифру): " );

        int numberofbrand = sc.nextInt();

        switch (numberofbrand) {
            case 1:

                microwave1.Info("LG", "MS2042DB");
                microwave1.ConectOn(true);
                microwave2.Info("LG", "MS20R42D");
                microwave2.ConectOn(true);

                break;
            case 2:
                microwave1.Info("SAMSUNG", "MC28H5013AK");
                microwave1.ConectOn(true);
                microwave2.Info("SAMSUNG", "MS23K3513AK");
                microwave2.ConectOn(true);
                break;
        }
    }
}
