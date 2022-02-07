package vadim.sazonenko.Lab5.Task2;

public class Main {
    public static void main (String [] args) {
        OverheadCrane overheadCrane = new OverheadCrane("Мостовой кран","РуСтальКран", 36, 20,10);
        GantryCrane gantryCrane = new GantryCrane("Козловой кран","MMKC 12", 16, 12, 60);
        TowerCrane towerCrane = new TowerCrane("Башенный кран","Liebherr 132 EC-H8", 168, 8, 55);
        TruckCrane truckCrane = new TruckCrane("Автомобильный кран","Liebherr LTM 1160", 93, 160, 70);
        CableCraneType cableCraneType = new CableCraneType("Кабельный кран","AMAROK", 70, 30);

        overheadCrane.Info();
        overheadCrane.speedInfo();
        gantryCrane.Info();
        gantryCrane.speedInfo();
        towerCrane.Info();
        towerCrane.boomReachInfo();
        truckCrane.Info();
        truckCrane.boomReachInfo();
        cableCraneType.Info();

    }
}
