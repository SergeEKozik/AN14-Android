package akutsenkou.Lesson5_7.TaskA1;
//Создать иерархию классов, описывающих бытовую технику. Создать
//несколько объектов описанных классов, часть из них включить в розетку.
//Иерархия должна иметь хотя бы три уровня.

public class Main {
    public static void main(String[] args){
        Oven oven = new Oven("Bosch", "AN0554");
        VacuumCleaner vc = new VacuumCleaner("LG", "JPLN4509");
        Stove stove = new Stove("Samsung", "SM34sd55");
        oven.displayInfo();
        vc.displayInfo();
        stove.displayInfo();
    }
}
