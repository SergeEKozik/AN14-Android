package skuksovsky.Lab4;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова (end для завершения ввода): ");
        StringBuilder latinWords = new StringBuilder();
        while (sc.hasNext()) {
            String inputWord = sc.next();
            if (!inputWord.equals("end")) {
                String template = "[a-zA-Z]+";
                if (inputWord.matches(template)) {
                    latinWords.append(inputWord).append("SPLIT_HERE");
                }
            } else {
                sc.close();
                break;
            }
        }

        String[] latinWordsArray = String.valueOf(latinWords).split("SPLIT_HERE");
        System.out.println("Слова, состоящие только из латинских символов: ");
        for (String word: latinWordsArray) {
            System.out.print(word + " ");
        }

        System.out.println("\n\nИз них слова с одинаковым количеством гласных и согласных: ");
        for (String word: latinWordsArray) {
            Pattern vowels = Pattern.compile("(?iu)[aeiouy]");
            Pattern consonants = Pattern.compile("(?iu)[bcdfghjklmnpqrstvwxyz]");
            Matcher v = vowels.matcher(word);
            Matcher c = consonants.matcher(word);
            int vowelsCount = 0;
            int consonantsCount = 0;
            while (v.find()) {
                vowelsCount++;
            }
            while (c.find()) {
                consonantsCount++;
            }

            if (vowelsCount == consonantsCount) {
                System.out.print(word + " ");
            }

        }
    }
}
