package achapovskiy.lab4;

import java.util.Locale;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();                               //fda FAS Afg abc  HF aBC bcdf
        String[] words = str.toLowerCase().split(" ");
        for (int i = 0; i < words.length; i++) {
            char max = words[i].charAt(0);
            for (int j = 1; j < words[i].length(); j++){
                if (words[i].charAt(j) > max){
                    max = words[i].charAt(j);
                }
                else {
                    break;
                }
                System.out.println(words[i]);
                return;
            }
        }

    }
}
