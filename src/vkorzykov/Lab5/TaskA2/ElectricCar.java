package vkorzykov.Lab5.TaskA2;

public class ElectricCar extends PassengerCar {
    private String typeOfEngine = "Electric";
    private int batteryCharge;
    private boolean readyToDrive;
    private int distance = 0;
    private double chargingTime = 0;
    private boolean charge;

    public ElectricCar(String modelName, int earOfProduction, String color, String bodyType, int batteryCharge) {
        super(modelName, earOfProduction, color, bodyType);
        this.batteryCharge = batteryCharge;
        readyToDrive = false;

    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public boolean isReadyToDrive() {
        return readyToDrive;
    }

public void check() {
        if (distance == 0 || distance == 200 || distance == 450 || distance == 700 || distance == 750 || distance == 900 || distance == 1000) {
            System.out.println("На этом километре есть зарядная станция");
        }
        else {
            System.out.println("Здесь нет зарядной станции");}
}
    public void toCharge(int value) {
        if (distance == 0 || distance == 200 || distance == 450 || distance == 700 || distance == 750 || distance == 900 || distance == 1000) {
            charge = true;
        } else {
            System.out.println("Поблизости нет зарядной станции, ВЫ СЕРЬЁЗНО ВСТРЯЛИ, ПЕРЕПЕШИТЕ КОД");
            System.out.println("");
        }
        if (charge == true) {
            if (value >= 20 && value <= 40) {
                batteryCharge = value;
                double time = 1;
                chargingTime += time;
                readyToDrive = true;
                charge = false;
                System.out.println("Аккамулятор заряжен до " + value + " %");
                System.out.println("");
            } else if (value >= 41 && value <= 60) {
                batteryCharge = value;
                double time = 2;
                chargingTime += time;
                readyToDrive = true;
                charge = false;
                System.out.println("Аккамулятор заряжен до " + value + " %");
                System.out.println("");
            } else if (value >= 61 && value <= 80) {
                batteryCharge = value;
                double time = 3.5;
                chargingTime += time;
                readyToDrive = true;
                charge = false;
                System.out.println("Аккамулятор заряжен до " + value + " %");
                System.out.println("");
            }
            else if (value >= 81 && value <= 100) {
                batteryCharge = value;
                double time = 5;
                chargingTime += time;
                readyToDrive = true;
                charge = false;
                System.out.println("Аккамулятор заряжен до " + value + " %");
                System.out.println("");
            }
        }

    }

    public void drive(int addDistance) {
        if (readyToDrive == false) {
            System.out.println("Машина не может начать движение - критический заряд аккамулятора");
            System.out.println("");
        } else if (addDistance > 500) {
            System.out.println("Машина не может проехать больше 500 км на одном аккамуляторе");
            System.out.println("");
        } else if (addDistance <= 500 && addDistance > 350 && batteryCharge > 80) {
            System.out.println("Вы начали движение ");
            distance += addDistance;
            batteryCharge = 0;
            readyToDrive = false;
            System.out.println("Машина проехала: " + addDistance + " км, " + "Вы стоите на: " + (distance) + " километре, " + " Осталось заряда аккамулятора: " + batteryCharge + " %");
            System.out.println("");
        } else if (addDistance <= 350 && addDistance > 200 && batteryCharge > 60 && batteryCharge <= 80) {
            System.out.println("Вы начали движение ");
            distance += addDistance;
            batteryCharge = 0;
            readyToDrive = false;
            System.out.println("Машина проехала: " + addDistance + " км, " + "Вы стоите на: " + (distance) + " километре, " + " Осталось заряда аккамулятора: " + batteryCharge + " %");
            System.out.println("");
        } else if (addDistance <= 200 && addDistance > 100 && batteryCharge > 40 && batteryCharge <= 60) {
            System.out.println("Вы начали движение ");
            distance += addDistance;
            batteryCharge = 0;
            readyToDrive = false;
            System.out.println("Машина проехала: " + addDistance + " км, " + "Вы стоите на: " + (distance) + " километре, " + " Осталось заряда аккамулятора: " + batteryCharge + " %");
            System.out.println("");
        } else if (addDistance <= 100 && addDistance > 50 && batteryCharge > 20 && batteryCharge <= 40) {
            System.out.println("Вы начали движение ");
            distance += addDistance;
            batteryCharge = 0;
            readyToDrive = false;
            System.out.println("Машина проехала: " + addDistance + " км, " + "Вы стоите на: " + (distance) + " километре, " + " Осталось заряда аккамулятора: " + batteryCharge + " %");
            System.out.println("");
        } else if (addDistance <= 50 && addDistance > 0 && batteryCharge > 9 && batteryCharge <= 20) {
            System.out.println("Вы начали движение ");
            distance += addDistance;
            batteryCharge = 0;
            readyToDrive = false;
            System.out.println("Машина проехала: " + addDistance + " км, " + "Вы стоите на: " + (distance) + " километре, " + " Осталось заряда аккамулятора: " + batteryCharge + " %");
            System.out.println("");
        } else if (addDistance <= 350 && batteryCharge > 80 && batteryCharge <= 100) {
            System.out.println("Вы начали движение ");
            distance += addDistance;
            batteryCharge = 40;
            readyToDrive = true;
            System.out.println("Машина проехала: " + addDistance + " км, " + "Вы стоите на: " + (distance) + " километре, " + " Осталось заряда аккамулятора: " + batteryCharge + " %");
            System.out.println("");
        } else if (addDistance <= 200 && batteryCharge > 60 && batteryCharge <= 80) {
            System.out.println("Вы начали движение ");
            distance += addDistance;
            batteryCharge = 40;
            readyToDrive = true;
            System.out.println("Машина проехала: " + addDistance + " км, " + "Вы стоите на: " + (distance) + " километре, " + " Осталось заряда аккамулятора: " + batteryCharge + " %");
            System.out.println("");
        } else if (addDistance <= 100 && batteryCharge > 40 && batteryCharge <= 60) {
            System.out.println("Вы начали движение ");
            distance += addDistance;
            batteryCharge = 20;
            readyToDrive = true;
            System.out.println("Машина проехала: " + addDistance + " км, " + "Вы стоите на: " + (distance) + " километре, " + " Осталось заряда аккамулятора: " + batteryCharge + " %");
            System.out.println("");
        } else {
            System.out.println("Машине не хватит данного заряда аккамулятора: " + batteryCharge + ", чтобы столько проехать, введите меньшее количество км или подзарядите аккамулятор");
            System.out.println("");
        }
    }

    public void changeColor(String color) {
        if (distance == 1300) {
            this.color = color;
            System.out.println("YOU ARE WIN!!!");
        } else if (distance > 1300) {
            System.out.println("Вы проехали пункт покраски, на " + (distance - 1300) + " км, ПЕРЕПИШИТЕ ВАШ КОД");
        } else {
            System.out.println("Вы не доехали до пункта покраски:" + (1300 - distance)+ " км, ПЕРЕПИШИТЕ ВАШ КОД");
        }
    }


    @Override
    public String toString() {
        return "СТАТУС ТЕСЛЫ: " +
                "Цвет = " + color +
                ", Заряд аккамулятора= " + batteryCharge + " %" +
                ", Готова продолжать движение= " + readyToDrive +
                ", Пройденный путь= " + distance + " km" +
                ", Количество затраченного времени на зарядку: " + chargingTime + " часов" +
                '}';
    }
}


