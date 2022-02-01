package achapovskiy.lab4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк");
        int num = Integer.parseInt(sc.nextLine()); // без этого сканер не даёт ввести последнюю строчку
        int lMaxIndex = 0, lMinIndex = 0;
        String str[] = new String[num];
        System.out.println("Введите строки");
        for (int i = 0; i < num; i++) {
            String stroka = sc.nextLine();
            str[i] = stroka;
            if (str[i].length()<=str[lMaxIndex].length()){
                lMaxIndex = i;
            }
            if (str[i].length()>=str[lMinIndex].length()){
                lMinIndex = i;
            }
        }
        System.out.println("Max длина - " + str[lMaxIndex].length() + ", строка " + str[lMaxIndex]);
        System.out.println("Min длина - " + str[lMinIndex].length() + ", строка " + str[lMinIndex]);


    }
}
