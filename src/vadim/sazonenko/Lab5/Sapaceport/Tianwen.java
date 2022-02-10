package vadim.sazonenko.Lab5.Sapaceport;

import java.util.Scanner;

public class Tianwen implements IStart{
    public boolean prelaunchCheck() {

        System.out.println("Предстартовая проверка" );
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int numberCheck = scan.nextInt();
        return  numberCheck == 4;
    }
    public void startMotor() {
        System.out.println("Двигатели Tianwen запущены. Все системы в норме");
    }
    public void start() {
        System.out.println("Старт Tianwen");
        System.out.println(" ");
    }

}
