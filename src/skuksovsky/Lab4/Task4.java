package skuksovsky.Lab4;
import java.util.*;
public class Task4 {
    public static int symbolCount(String word) {
        String[] arr = word.split("");
        int symbolCounter = 0;
        String symbol = "";
        for (String letter: arr) {
            if (!letter.equals(symbol)) {
                symbol = letter;
                symbolCounter++;
            }
        }
        return symbolCounter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова (end для завершения ввода): ");
        String wordWithSmallestSymbCount = "";
        int iterationsCount = 0;
        while (sc.hasNext()) {
            String inputWord = sc.next();
            if (!inputWord.equals("end")) {
                wordWithSmallestSymbCount = (iterationsCount == 0) ? inputWord : wordWithSmallestSymbCount; // для первой итерации введенное слово принимаем как слово с меньшим кол=вом символов
                if (symbolCount(inputWord) < symbolCount(wordWithSmallestSymbCount)) {
                    wordWithSmallestSymbCount = inputWord;
                }
                iterationsCount++;
            } else {
                sc.close();
                break;
            }
        }
        System.out.println("Слово, состоящее из меньшего количества символов (либо первое с минимальным количеством) - " + wordWithSmallestSymbCount);
    }
}
