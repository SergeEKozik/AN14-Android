package achapovskiy.lab7.Komp;

import java.util.Scanner;

public class Random implements ITurnON {
    public boolean guessTheNumber() {
        int randomNum = (int) (Math.random() * 2);
        System.out.println("Рандом выбрал число : " + randomNum);
        boolean rezRandom = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 0 или 1: ");
        int ourNum = sc.nextInt();
        if (ourNum != randomNum) {
            rezRandom = false;
        }
        return rezRandom;
    }

    public void pcSwitchOf(){
        System.out.println("PC выключен");
    }
    public void pcBurnedDown(){
        System.out.println("PC cгорел )=");
    }





}
