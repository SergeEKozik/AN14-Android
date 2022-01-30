package achapovskiy.lab3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        format(num);
    }

    public static void format(String num){
        char[] array = num.toCharArray();
        int kol =0;
        String  str = "";
        for (int i = array.length-1; i != -1; i--) {
            str = array[i];
            kol +=1;
            if (kol==3){
                str += " ";
                kol=0;
            }
        }
        for (int i = str.length()-1; i != -1; i--){
            System.out.print(str.charAt(i));
        }
    }
}
