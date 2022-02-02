package skuksovsky.Lab4;
import java.util.*;
public class Task1Alternative { // Если не нужно хранить все введенные строки
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shortestString= "", longestString = "";
        int iterationsCounter = 0;
        System.out.println("Введите строки (end для завершения ввода): ");
        while (sc.hasNextLine()) {
            String inputString = sc.nextLine();
            if (!inputString.equals("end")) {
                if (inputString.length() > longestString.length()) {
                    longestString = inputString;
                    shortestString = (iterationsCounter != 0) ? shortestString : inputString;
                } else if (inputString.length() < shortestString.length()) {
                    shortestString = inputString;
                }
                iterationsCounter++;
            } else {
                sc.close();
                break;
            }
        }

        System.out.println("Самая короткая строка имеет длину " + shortestString.length() + " и выглядит так: " + shortestString);
        System.out.println("Самая длинная строка имеет длину " + longestString.length() + " и выглядит так: " + longestString);
    }
}
