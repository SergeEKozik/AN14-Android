package kvizhunou.Lab7.Komp;

import java.util.Scanner;

public class MacBook {
    Scanner scanner = new Scanner(System.in);
    public String proccesor;
    public int ram;
    public int hd;
    public int resursOfCicle;

    public MacBook(String proccesor, int ram, int hd, int resursOfCicle) {
        this.proccesor = proccesor;
        this.ram = ram;
        this.hd = hd;
        this.resursOfCicle = resursOfCicle;
    }

    void allInformaition() {
        System.out.println("Процессор:" + this.proccesor + '\n' + "Оперативка :" + this.ram + '\n' + "Жесткий Диск: " + this.hd + '\n' + "Ресурс циклов:" + this.resursOfCicle);
    }

    public void scanOn() {
        int checkReset=0;

        int number =(int) (Math.random()*2);
         {
            System.out.println("Угадай число:");
            int input_number = scanner.nextInt();
            if (input_number == number && checkReset==0) {
                System.out.println("Угадали,я выключаюсь");
            } else if (input_number == 1) {
                checkReset=1;
                System.out.println("Не угадали, я сгорел");
            } else{
                System.out.println("Мне конец");
                checkReset=0;


            }

        }
    }
}




