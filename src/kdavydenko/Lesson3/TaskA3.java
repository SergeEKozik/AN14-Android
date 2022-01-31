package kdavydenko.Lesson3;

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String newFormatNumber = "";
        int i = 0;

        while (number > 0){
            i++;
            newFormatNumber += Integer.toString(number % 10);
            if (i % 3 == 0 && number > 9)
                newFormatNumber += ' ';
            number /= 10;
        }
        StringBuilder newString = new StringBuilder(newFormatNumber);
        newString.reverse();
        System.out.println(newString.toString());
    }
}
