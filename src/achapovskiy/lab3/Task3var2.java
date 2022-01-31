package achapovskiy.lab3;

import java.util.Scanner;

public class Task3var2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        format(num);
    }

    public static void format(String num){

        int kol =1;
        String  str = "";
        for (int i = num.length()-1; i >= 0; i--){
            str = num.charAt(i) + str ;
            kol +=1;
            if (kol==3){
                str = " " + num.charAt(i) + str;
                kol=1;
            }
        }

        System.out.print(str.trim());

    }
}
