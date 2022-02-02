package kdavydenko.Lesson4.MainTasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char arrayChar[] = new char[1000];
        sc.nextLine();
        String array[] = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
        }
        String vowels = "aeiouyAEIOUY";
        for (int i = 0; i < n; i++){
            arrayChar = array[i].toCharArray();
            int consonant = 0, vowel = 0;
            for (int j = 0; j < array[i].length(); j++)
                if (arrayChar[j] < 65 || (arrayChar[j] > 90 && arrayChar[j] < 97) || arrayChar[j] > 122)
                    break;
                else {
                    if (vowels.indexOf(arrayChar[j])!=-1)
                        vowel++;
                    else
                        consonant++;
                }
            if (vowel == consonant)
                System.out.println(array[i]);
        }


    }
}
