package vadim.sazonenko.Lab5.Task1;

import java.util.Scanner;

public class Catalog {
    public static void main (String [] args){
        Appliances mainchoose = new Appliances();
        mainchoose.catalog();
        Scanner scan = new Scanner(System.in);
        int numberofcategory = scan.nextInt();

        Refrigerator refrigerator = new Refrigerator();
        WashingMachine washingMachine = new WashingMachine();
        KitchenStove kitchenStove = new KitchenStove();

        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        RobotVacuumCleaner robotVacuumCleaner = new RobotVacuumCleaner();

        Microwave microwave = new Microwave();
        Multicooker multicooker = new Multicooker();

        LargeEquipment category1 = new LargeEquipment();
        Cleaning category2 = new Cleaning();
        CookingFood category3 = new CookingFood();





        switch (numberofcategory) {
            case 1:
                category1.choose();
                int x = category1.choosebrand();
                if (x == 1){
                    refrigerator.chooseApp();
                }
                else if  (x == 2) {
                    washingMachine.chooseApp();
                }
                else if (x == 3) {
                    kitchenStove.chooseApp();
                }
                break;
            case 2:
                category2.choose();
                int y = category2.choosebrand();
                if (y == 1){
                    vacuumCleaner.chooseApp();
                }
                else if  (y == 2) {
                    robotVacuumCleaner.chooseApp();
                }
                break;
            case 3:
                category3.choose();
                int z = category3.choosebrand();
                if (z == 1){
                    microwave.chooseApp();
                }
                else if  (z == 2) {
                    multicooker.chooseApp();
                }
                break;

        }





    }
}
