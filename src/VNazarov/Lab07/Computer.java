package VNazarov.Lab07;
import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String name;
    private String cpu;
    private String ram;
    private String hdd;
    private int resourceOfFullCycle = 10;
    private boolean on;
    private String onOrOffStr;

    Random rd = new Random();
    Scanner sc = new Scanner(System.in);

    public Computer(String name, String cpu, String ram, String hdd){
        boolToStrConnect();
        this.name = name;
        System.out.println("Computer " + name + " is created. \n");
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    private void boolToStrConnect(){
        if (on) onOrOffStr = "ON";
        else onOrOffStr = "OFF";
    }

    public void description(){
        System.out.println("Computer " + name + " is " + onOrOffStr + ". \n"
                            + "CPU: " + cpu + ". \n"
                            + "RAM: " + ram + ". \n"
                            + "HDD: " + hdd + ".");
    }

    public void turnOnOrOff(){
        if (resourceOfFullCycle > 0) {
            int oneOrNull = rd.nextInt(2);
            int userEnter = sc.nextInt();
                if (userEnter == oneOrNull) {
                    on = !on;
                    boolToStrConnect();
                    System.out.println("Computer " + onOrOffStr + "\n");
                    resourceOfFullCycle--;
                } else {
                    System.out.println("Error. Computer burned out. (1) \n");
                    resourceOfFullCycle = 0;
                    onOrOffStr = "Broken";
                }
        } else System.out.println("Error. Computer burned out. (2) \n");
    }
}
