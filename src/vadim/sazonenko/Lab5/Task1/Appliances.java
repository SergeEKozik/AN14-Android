package vadim.sazonenko.Lab5.Task1;

import java.util.Scanner;

public class Appliances {
    private String manufacturer;
    private String model;
    private boolean turningon;

    String getManufacturer() {
        return manufacturer;
    }
    void setManufacturer(String applManufacturer) {
        manufacturer = applManufacturer;
    }

    String getModel() {
        return model;
    }
    void setModel(String applModel) {
        model = applModel;
    }

    boolean getTurningon() {
        return turningon;
    }
    void setTurningon(boolean on) {
        turningon = on;
    }

    void ConectOn(boolean on) {
        if (on == true) {
            System.out.println("Работает от сети");
            System.out.println("");
        } else {
            System.out.println("Работает от батареии");
            System.out.println("");
        }

    }

    void choose() {

    }

    void catalog() {
        System.out.println("Каталог:" + '\n' +
                "1. Крупногабаритная техника" + '\n' +
                "2. Техника для уборки" + '\n' +
                "3. Техника для приготовления пищи");
        System.out.print("Выберите категорию (введите цифру): ");


    }

    void Info(String manufacturer, String model) {
        System.out.println("Бренд: " + manufacturer);
        System.out.println("Модель: " + model);
    }

    int choosebrand (){
        return 0;
    }



}


