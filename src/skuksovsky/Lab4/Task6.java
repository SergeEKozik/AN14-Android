package skuksovsky.Lab4;
import java.util.*;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder inputWords = new StringBuilder();
        System.out.println("Введите слова (end для выхода): ");
        while (sc.hasNext()) {
            String inputWord = sc.next();
            if (!inputWord.equals("end")) {
                inputWords.append(inputWord).append("SPLIT_HERE");
            } else {
                sc.close();
                break;
            }
        }

        String[] inputWordsArray = String.valueOf(inputWords).split("SPLIT_HERE");

        System.out.println("Слова, с символами, идущими строго по возрастанию: ");
        for (String word: inputWordsArray) {
            char symb = word.charAt(0);
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) > symb) {
                    if (i == word.length() - 1) {
                        System.out.print(word + " ");
                        break; } // чтобы вывести только первое (как в условии), если убрать, то будут выведены все слова с симв. по возрастанию
                } else {break; }
            }
        }
    }
}
