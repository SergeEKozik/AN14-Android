package vadim.sazonenko.Lab5.Task1;

import java.util.Scanner;

public class KitchenStove extends LargeEquipment {
    void chooseApp() {
        Scanner sc = new Scanner(System.in);

        KitchenStove kitchenStove1 = new KitchenStove();
        KitchenStove kitchenStove2 = new KitchenStove();

        System.out.println(
                "1. BOSH" + '\n' +
                        "2. GEFEST");
        System.out.print("Выберите БРЕНД (введите цифру): ");

        int numberofbrand = sc.nextInt();

        switch (numberofbrand) {
            case 1:

                kitchenStove1.Info("BOSH", "HXA090I20R");
                kitchenStove1.ConectOn(true);
                kitchenStove2.Info("BOSH", "HGG120E21R");
                kitchenStove2.ConectOn(true);
                break;
            case 2:
                kitchenStove1.Info("GEFEST", "ХМ 4307-000");
                kitchenStove1.ConectOn(true);
                kitchenStove2.Info("GEFEST", "ХМ 4208-000");
                kitchenStove2.ConectOn(true);
                break;
        }
    }
}